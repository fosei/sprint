package com.tscp.mvno.sprint.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
import com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceBindingStub;
import com.sprint.integration.eai.services.WholesalePortMessageService.v1.WholesalePortMessageService_wsdl.WholesalePortMessageServiceLocator;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.BillingAddressInfoType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.BillingNameInfoType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.DateRangeInfoType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.ImplementationPartnerInfoType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageActivityCode;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.MessageStatusCodeType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.NetworkServiceProviderInfoType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortDueDateTimeInfoType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortMessageTypeCode;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortOutRespondedTypeCode;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.PortResponseTypeCode;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageListType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageRequestType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.QueryPortMessageResponseType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.ReplyPortOutRequestCode;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.ResellerPartnerIdInfoType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.SendAutoRejectTypeCode;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.SsnTaxIdChoiceTypeType;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.SupplementalMessageTypeIdentifier;
import com.sprint.integration.interfaces.queryPortMessage.v1.queryPortMessage_xsd.WholesalePortMessageTypeInfoType;
import com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.PortDelayCode;
import com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.ReplyPortOutRequestResponseType;
import com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.ReplyPortOutRequestType;
import com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageRequestType;
import com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd.ResendPortMessageResponseType;
import com.tscp.mvno.exception.PortMessageException;
import com.tscp.mvno.support.MainHelper;
import com.tscp.mvno.support.SprintHeader;
import com.tscp.mvno.support.TSCPLogger;

public class PortMessageClient {

	// [start] public members
	
	public static final String CLASS_NAME = "QueryCsaClient";
	public static final String URL		  = "wholesale.port.message.service.location.url";
	
	public static String inputPropertyFile = "client.properties";
	public static String proxyURL = "http://localhost:2222";  // WS End Point URL
	private static Properties props;
	
	private WholesalePortMessageServiceBindingStub 	portMessageBindingStub;
	private WholesalePortMessageServiceLocator		portMessageServiceLocator;		
	private EngineConfiguration 					config;
	
	private SprintHeader        header;
	private String				userName;
	private String				orderId;
	
	private String				className = "PortMessageClient";
	
	// [end] public members
	
	// [start] constructors
	
	public PortMessageClient() {
		this("tscp","000000");
	}
	
	public PortMessageClient(String iUserName, String iOrderID ) {
		loadProps();
		proxyURL = (props.getProperty(PortMessageClient.URL) != null && props.getProperty(PortMessageClient.URL).trim().length() > 0) ? props.getProperty(PortMessageClient.URL) : System.getProperty("url");

	    config = null;

	    if (System.getProperty("client.deploy.file.location") != null) {
			config = new FileProvider(System.getProperty("client.deploy.file.location"));
		}
	    
	    portMessageServiceLocator = new WholesalePortMessageServiceLocator(config);
	    try {
	    	portMessageBindingStub = (WholesalePortMessageServiceBindingStub) portMessageServiceLocator.getSendPortMessagePortType(new URL(proxyURL));
	    } catch( Exception e ) {
	    	TSCPLogger.logError(CLASS_NAME,e);
	    }
	    setUserName(iUserName);
	    setOrderId(iOrderID);
	    header = new SprintHeader(getUserName(),getOrderId());
	    portMessageBindingStub.setHeader(header.getHeader());
	    portMessageBindingStub.setTimeout(header.getTimeOut());
	    portMessageBindingStub.setUsername(header.getBindingUserName());
	    portMessageBindingStub.setPassword(header.getBindingPassword());
	    portMessageBindingStub.setMaintainSession(true);
	}
	
	// [end] constructors
	
	// [start] get methods
	
	public String getUserName() {
		return userName;
	}
	
	public String getOrderId() {
		return orderId;
	}
	
	// [end] get methods
	
	// [start] set methods
	
	public void setUserName(String iUserName) {
		userName = iUserName;
	}

	public void setOrderId(String iOrderID) {
		orderId = iOrderID;
	}
	
	// [end] set methods
	
	// [start] validation methods
	
	/**
	 * Simple Validation utility based on the rules established in Sprints Consolidated API Listing (CAL) file
	 * 
	 * @param portMessageRequest {@linkplain QueryPortMessageRequestType}
	 * @return boolean
	 * @throws PortMessageException
	 */
	private boolean validatePortMessageRequest( QueryPortMessageRequestType portMessageRequest ) throws PortMessageException {
		boolean valid = false;
		if( portMessageRequest.getQueryPortMessageInfo() == null ) {
			throw new PortMessageException("FAIL","queryPortMessageInfo object is null or is not set!!");
		} else {
			if( portMessageRequest.getQueryPortMessageInfo().getDateRangeInfo() != null ) {
				if( portMessageRequest.getQueryPortMessageInfo().getDateRangeInfo().getFromDate() == null ) {
					throw new PortMessageException("FAIL","queryPortMessageInfo.DateRangeInfo.FromDate is not set or is null!");
				} else if( portMessageRequest.getQueryPortMessageInfo().getDateRangeInfo().getToDate() == null ) {
					throw new PortMessageException("FAIL","queryPortMessageInfo.DateRangeInfo.ToDate is not set or is null!!");
				}
			}
			
			if( portMessageRequest.getQueryPortMessageInfo().getMdn() == null &&
					portMessageRequest.getQueryPortMessageInfo().getMessageId() == null &&
					portMessageRequest.getQueryPortMessageInfo().getMessageStatusCode() == null &&
					portMessageRequest.getQueryPortMessageInfo().getMessageTypeCode() == null &&
					portMessageRequest.getQueryPortMessageInfo().getReplyPortOutRequestStatus() == null &&
					portMessageRequest.getQueryPortMessageInfo().getLastSequenceNumber() == null &&
					portMessageRequest.getQueryPortMessageInfo().getAutoRejectStatus() == null &&
					portMessageRequest.getQueryPortMessageInfo().getRecentMessageActivityCode() == null &&
					portMessageRequest.getQueryPortMessageInfo().getDateRangeInfo() == null 					
			) {
				throw new PortMessageException("FAIL","queryPortMessageInfo request object is invalid....Please populate a query item.");
			}
			
			valid = true;
		}
		return valid;
	}
	
	/**
	 * Simple Validation utility based on the rules established in Sprints Consolidated API Listing (CAL) file
	 * @param replyPortOutRequest {@linkplain ReplyPortOutRequestType}
	 * @return boolean value representing whether the reply object is valid
	 * @throws PortMessageException
	 */
	private boolean validateReplyPortOutRequest( ReplyPortOutRequestType replyPortOutRequest ) throws PortMessageException {
		boolean isValid = false;
		if( replyPortOutRequest == null ) {
			throw new PortMessageException("FAIL","replyPortOutRequest object is null!! Please set the reply object before continuing.");
		} else {
//			if( replyPortOutRequest.getMdn() == null ) {
//				throw new PortMessageException("FAIL","replyPortOutRequest.MDN is null!! Please set this field");
//			} 
//			else {
//				if( replyPortOutRequest.getMdn().length() != 10 ) {
//					throw new PortMessageException("FAIL","replyPortOutRequest.MDN.length required is 10...Length provided was "+replyPortOutRequest.getMdn().length());
//				}
//			}
			
			if( replyPortOutRequest.getMessageId() == null ) {
				throw new PortMessageException("FAIL","replyPortOutRequest.MessageID is null!!");
			}
			
//			if( replyPortOutRequest.getPortId() == null ) {
//				throw new PortMessageException("FAIL","replyPortOutRequest.PortID is null!");
//			}
			
			if( replyPortOutRequest.getResponseType() == null ) {
				throw new PortMessageException("FAIL","replyPortOutRequest.ResponseType is null!");
			} else {
				if( replyPortOutRequest.getResponseType().getValue().equals("R") ) {
					if( replyPortOutRequest.getReasonCode() == null ) {
						throw new PortMessageException("FAIL","replyPortOutRequest.ReasonCode required when ResponseType = "+replyPortOutRequest.getResponseType().getValue());
					}
					if( replyPortOutRequest.getReasonDesc() == null ) {
						throw new PortMessageException("FAIL","replyPortOutRequest.ReasonDesc required when ResponseType = "+replyPortOutRequest.getResponseType().getValue());
					}
				}
				
				if( replyPortOutRequest.getResponseType().getValue().equals("D") ) {
					if( replyPortOutRequest.getDelayCode() == null ) {
						throw new PortMessageException("FAIL","replyPortOutRequest.DelayCode must be set when ResponseType = "+replyPortOutRequest.getResponseType().getValue());
					}
					if( replyPortOutRequest.getDueDateTime() == null ) {
						throw new PortMessageException("FAIL","replyPortOutRequest.DueDateTyime must be set when ResponseType = "+replyPortOutRequest.getResponseType().getValue());
					}
				}
			}
			isValid = true;
		}
		return isValid;
	}
	
	// [end] validation methods
	
	// [start] accessor methods
	
	/**
	 * Direct access to Sprint's queryPortMessage API. 
	 * <p>This method requires a valid instance of QueryPortMessageRequestType and will be validated prior to sending 
	 * the API request.
	 * @param {@linkplain QueryPortMessageRequestType}
	 * @return {@link QueryPortMessageResponseType}
	 * @throws PortMessageException
	 */
	public QueryPortMessageResponseType queryPortMessage( QueryPortMessageRequestType portMessageRequest ) throws PortMessageException {
		QueryPortMessageResponseType portMessageResponse = new QueryPortMessageResponseType();
		if( validatePortMessageRequest(portMessageRequest) ) {
			try {
				portMessageResponse = portMessageBindingStub.queryPortMessage(portMessageRequest);
				if( portMessageResponse == null ) {
					throw new PortMessageException("FAIL","queryPortMessage API returned a null response object!");
				} 
			} catch( ErrorDetailsType ws_ex ) {
				throw new PortMessageException(className,"queryPortMessage",ws_ex);
			} catch( com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType ws_ex2 ) {
				if( ws_ex2 != null ) {
					System.out.println("Provider Fault Actor  :: "+ws_ex2.getFaultActor());
					System.out.println("Provider ProviderError:: "+ws_ex2.getProviderError());
					for( int i = 0; i < ws_ex2.getProviderError().length; ++i ) {
						System.out.println("Provider Error["+i+"] Code   :: "+ws_ex2.getProviderError(i).getProviderErrorCode());
						System.out.println("Provider Error["+i+"] Text   :: "+ws_ex2.getProviderError(i).getProviderErrorText());
						System.out.println("FaultActor                         :: "+ws_ex2.getFaultActor());
						System.out.println("FaultNode                          :: "+ws_ex2.getFaultNode());
						System.out.println("FaultReason                        :: "+ws_ex2.getFaultReason());
						System.out.println("FaultString                        :: "+ws_ex2.getFaultString());
						System.out.println("Message                            :: "+ws_ex2.getMessage());
						System.out.println("ProviderError[0].ErrorProgramId    :: "+ws_ex2.getProviderError(i).getErrorProgramId());
						System.out.println("ProviderError[0].ErrorSystem       :: "+ws_ex2.getProviderError(i).getErrorSystem());
						System.out.println("ProviderError[0].ErrorTransactionId:: "+ws_ex2.getProviderError(i).getErrorTransactionId());
						System.out.println("ProviderError[0].FieldInError      :: "+ws_ex2.getProviderError(i).getFieldInError());
						System.out.println("ProviderError[0].ProviderErrorCode :: "+ws_ex2.getProviderError(i).getProviderErrorCode());
						System.out.println("ProviderError[0].ProviderErrorText :: "+ws_ex2.getProviderError(i).getProviderErrorText());
					}
				}
				throw new PortMessageException(className,"queryPortMessage",ws_ex2);
			} catch( RemoteException remote_ex ) {
				throw new PortMessageException(remote_ex);
			} 
		} else {
			throw new PortMessageException("FAIL","ValidatePortMessageRequest failed to validate inbound portMessageRequest object");
		}
		
		return portMessageResponse;
	}
	
	/**
	 * Direct access to Sprint's API replyPortOutRequest
	 * <p>
	 * Input variable of {@linkplain ReplyPortOutRequestType} will be validated locally prior to invoking remote 
	 * remote web service. 
	 * @param replyPortOutRequest
	 * @return
	 * @throws PortMessageException
	 */
	public ReplyPortOutRequestResponseType replyPortOutRequest( ReplyPortOutRequestType replyPortOutRequest ) throws PortMessageException {
		ReplyPortOutRequestResponseType replyPortOutResponse = new ReplyPortOutRequestResponseType();
		if( validateReplyPortOutRequest(replyPortOutRequest) ) {
			try {
				if( replyPortOutRequest != null ) {
					System.out.println("ReplyPortOutRequest.MDN            :: "+replyPortOutRequest.getMdn());
					System.out.println("ReplyPortOutRequest.PORTID         :: "+replyPortOutRequest.getPortId());
					System.out.println("ReplyPortOutRequest.MessageId      :: "+replyPortOutRequest.getMessageId());
					System.out.println("ReplyPortOutRequest.ResponseType   :: "+replyPortOutRequest.getResponseType());
					if( replyPortOutRequest.getReasonCode() != null ) {
					System.out.println("ReplyPortOutRequest.ReasonCode     :: "+replyPortOutRequest.getReasonCode());
					}
					if( replyPortOutRequest.getReasonDesc() != null ) { 
					System.out.println("ReplyPortOutRequest.ReasonDesc     :: "+replyPortOutRequest.getReasonDesc());
					}
//					System.out.println("ReplyPortOutRequest.MDN            :: "+replyPortOutRequest.get+"....");
				}
				replyPortOutResponse = portMessageBindingStub.replyPortOutRequest(replyPortOutRequest);
				if( replyPortOutResponse == null ) {
					throw new PortMessageException("FAIL","replyPortOutRequest API returned a null response object" );
				}
			} catch( com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType ws_ex ) {
				ws_ex.printStackTrace();
				if( ws_ex != null ) {
					System.out.println("Provider Fault Actor  :: "+ws_ex.getFaultActor());
					System.out.println("Provider ProviderError:: "+ws_ex.getProviderError());
					for( int i = 0; i < ws_ex.getProviderError().length; ++i ) {
						System.out.println("Provider Error["+i+"] Code   :: "+ws_ex.getProviderError(i).getProviderErrorCode());
						System.out.println("Provider Error["+i+"] Text   :: "+ws_ex.getProviderError(i).getProviderErrorText());
						System.out.println("FaultActor                         :: "+ws_ex.getFaultActor());
						System.out.println("FaultNode                          :: "+ws_ex.getFaultNode());
						System.out.println("FaultReason                        :: "+ws_ex.getFaultReason());
						System.out.println("FaultString                        :: "+ws_ex.getFaultString());
						System.out.println("Message                            :: "+ws_ex.getMessage());
						System.out.println("ProviderError[0].ErrorProgramId    :: "+ws_ex.getProviderError(i).getErrorProgramId());
						System.out.println("ProviderError[0].ErrorSystem       :: "+ws_ex.getProviderError(i).getErrorSystem());
						System.out.println("ProviderError[0].ErrorTransactionId:: "+ws_ex.getProviderError(i).getErrorTransactionId());
						System.out.println("ProviderError[0].FieldInError      :: "+ws_ex.getProviderError(i).getFieldInError());
						System.out.println("ProviderError[0].ProviderErrorCode :: "+ws_ex.getProviderError(i).getProviderErrorCode());
						System.out.println("ProviderError[0].ProviderErrorText :: "+ws_ex.getProviderError(i).getProviderErrorText());
					}
				}
				throw new PortMessageException(className,"replyPortOutRequest",ws_ex);
			} catch( ErrorDetailsType ws_ex ) {
				ws_ex.printStackTrace();
				if( ws_ex != null ) {
					System.out.println("Provider Fault Actor  :: "+ws_ex.getFaultActor());
					System.out.println("Provider ProviderError:: "+ws_ex.getProviderError());
					System.out.println("Provider Error Code   :: "+ws_ex.getProviderError().getProviderErrorCode());
					System.out.println("Provider Error Text   :: "+ws_ex.getProviderError().getProviderErrorText());
				}
				throw new PortMessageException(className,"replyPortOutRequest",ws_ex);
			} catch( RemoteException remote_ex ) {
				System.out.println("Remote Exception thrown");
				remote_ex.printStackTrace();
				throw new PortMessageException(remote_ex);
			}
		}
		return replyPortOutResponse;
	}
	
	public ResendPortMessageResponseType resendPortMessage( ResendPortMessageRequestType resendPortMessageRequestType ) throws PortMessageException {
		ResendPortMessageResponseType resendPortMessageResponseType = new ResendPortMessageResponseType();
		try {
			portMessageBindingStub.resendPortMessage(resendPortMessageRequestType);
		} catch( ErrorDetailsType ws_ex ) {
			throw new PortMessageException(className,"resendPortMessage",ws_ex);
		} catch( RemoteException remote_ex ) {
			throw new PortMessageException(remote_ex);
		}
		return resendPortMessageResponseType;
	}
	
	// [end] accessor methods
	
	// [start] main

	public static void main(String[] args) {
		System.out.println("Starting PortMessageClient main...");
		try {
			boolean running = true;
			String input = "";
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
			while( running ) {
				try {
					genMenu();
					if( args != null && args.length > 0 ) {
						input = args[0];
					} else {
						input = br.readLine();
					}
					if( input.equals("000") ) {
						running = false;
					} else if( input.equals("100") || input.equals("101") || input.equals("102") || input.equals("103") ) {
						System.out.println("Testing queryPortMessage API");
						PortMessageClient portMessageClient = new PortMessageClient(MainHelper.populateRequiredField("UserName", br, ""),MainHelper.populateRequiredField("OrderID", br, ""));
						QueryPortMessageRequestType portMessageRequest = new QueryPortMessageRequestType();
						QueryPortMessageListType queryPortMessageInfo = new QueryPortMessageListType();	
						populatePortMessageRequestObject(br, input, queryPortMessageInfo);
						portMessageRequest.setQueryPortMessageInfo(queryPortMessageInfo );
						QueryPortMessageResponseType queryPortMessageResponse = portMessageClient.queryPortMessage(portMessageRequest);
						printPortMessageResponseType(queryPortMessageResponse);
					} else if( input.equals("200") ) {
						System.out.println("Testing replyPortOutMessage API");
						PortMessageClient portMessageClient = new PortMessageClient(MainHelper.populateRequiredField("UserName", br, ""),MainHelper.populateRequiredField("OrderId", br, ""));
						ReplyPortOutRequestType portOutRequestReply = new ReplyPortOutRequestType();
						ReplyPortOutRequestResponseType portOutReplyResponse = new ReplyPortOutRequestResponseType();
						populateReplyPortOutRequest(br,input,portOutRequestReply);
						portOutReplyResponse = portMessageClient.replyPortOutRequest(portOutRequestReply);
						if( portOutReplyResponse == null ) {
//							throw new PortMessageException("FAIL","ReplyPortOutRequestResponseType is null!!");
							System.out.println("PortOutReplyResponse is null...Atleast no exception");
						} else {
							System.out.println("PortOutReplyResponse :: "+portOutReplyResponse.toString());
						}
//						portOutReplyResponse.
					} else if( input.equals("201") ) {
						System.out.println("Testing reply with reject message");
						PortMessageClient portMessageClient = new PortMessageClient(MainHelper.populateRequiredField("UserName", br, ""),MainHelper.populateRequiredField("OrderId", br, ""));
						ReplyPortOutRequestType portOutRequestReply = new ReplyPortOutRequestType();
						ReplyPortOutRequestResponseType portOutReplyResponse = new ReplyPortOutRequestResponseType();
//						populateReplyPortOutRequest(br,input,portOutRequestReply);
						portOutRequestReply.setMessageId("100000000000000000000000000000000000000001497193");
						portOutRequestReply.setPortId("315459");
						portOutRequestReply.setMdn("7606121555");
						portOutRequestReply.setResponseType(com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.PortResponseTypeCode.fromValue("R"));
						portOutRequestReply.setReasonCode("8C");
						portOutRequestReply.setReasonDesc("Password/Pin required or incorrect");
						portOutRequestReply.setRemarks("Customer Password does not match Password on file");
						portOutRequestReply.setDelayCode(null);
						portOutReplyResponse = portMessageClient.replyPortOutRequest(portOutRequestReply);
						if( portOutReplyResponse == null ) {
							throw new PortMessageException("FAIL","ReplyPortOutRequestResponseType is null!!");
						}
					} else if( input.equals("998") ) {
						System.out.println("Testing Auto queryPortMessage API -- By MDN");
						PortMessageClient portMessageClient = new PortMessageClient(args[1],args[2]);
						QueryPortMessageRequestType portMessageRequest = new QueryPortMessageRequestType();
						QueryPortMessageListType queryPortMessageInfo = new QueryPortMessageListType();
						DateRangeInfoType dateRangeInfo = new DateRangeInfoType();
						Calendar fromDate = Calendar.getInstance();
						fromDate.setTime(convertStringToDate(args[3]));
						dateRangeInfo.setFromDate(fromDate );
						Calendar toDate = Calendar.getInstance();
						toDate.setTime(convertStringToDate(args[4]));
						dateRangeInfo.setToDate(toDate );
						queryPortMessageInfo.setDateRangeInfo(dateRangeInfo );
						queryPortMessageInfo.setMdn(args[6]);
						portMessageRequest.setQueryPortMessageInfo(queryPortMessageInfo );
						QueryPortMessageResponseType queryPortMessageResponse = portMessageClient.queryPortMessage(portMessageRequest);
						printPortMessageResponseType(queryPortMessageResponse);
						running = false;
					} else if( input.equals("999") ) {
						System.out.println("Testing Auto queryPortMessage API");
						PortMessageClient portMessageClient = new PortMessageClient(args[1],args[2]);
						QueryPortMessageRequestType portMessageRequest = new QueryPortMessageRequestType();
						QueryPortMessageListType queryPortMessageInfo = new QueryPortMessageListType();
						DateRangeInfoType dateRangeInfo = new DateRangeInfoType();
						Calendar fromDate = Calendar.getInstance();
						fromDate.setTime(convertStringToDate(args[3]));
						dateRangeInfo.setFromDate(fromDate );
						Calendar toDate = Calendar.getInstance();
						toDate.setTime(convertStringToDate(args[4]));
						dateRangeInfo.setToDate(toDate );
						queryPortMessageInfo.setDateRangeInfo(dateRangeInfo );
	//					PortMessageTypeCode messageTypeCode = new PortMessageTypeCode();
	//					messageTypeCode.
						if( args[5].equals("DDT") ) {
							queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.DDT);
						} else if( args[5].equals("POR") ) {
							queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.POR);
						} else if( args[5].equals("PIR") ) {
							queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.PIR);
						} else if( args[5].equals("PTS") ) {
							queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.PTS);
						} else if( args[5].equals("PTA") ) {
							queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.PTA);
						} else if( args[5].equals("PTN") ) {
							queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.PTN);
						} else if( args[5].equals("PTC") ) {
							queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.PTC);
						} else if( args[5].equals("RPR") ) {
							queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.RPR);
						} else {
							throw new PortMessageException("FAIL","Unknown message request :: " + args[5]);
						}
						portMessageRequest.setQueryPortMessageInfo(queryPortMessageInfo );
						QueryPortMessageResponseType queryPortMessageResponse = portMessageClient.queryPortMessage(portMessageRequest);
						printPortMessageResponseType(queryPortMessageResponse);
						running = false;
					} else {
						System.out.println("Unknown command...Please review menu for valid requests!");
					}
				} catch( PortMessageException pm_ex ) {
					System.out.println("PortMessageException caught with the following information : "+pm_ex.getMessage());
					if( pm_ex.getWsError() != null ) {
						System.out.println("WSError is not null!");
						throw pm_ex;
					}
				}
			}
		} catch( PortMessageException pm_ex ) {
			if( pm_ex.getWsError() != null ) {
				System.out.println("Provider Fault Actor  :: "+pm_ex.getWsError().getFaultActor());
				System.out.println("Provider ProviderError:: "+pm_ex.getWsError().getProviderError());
				System.out.println("Provider Error Code   :: "+pm_ex.getWsError().getProviderError().getProviderErrorCode());
				System.out.println("Provider Error Text   :: "+pm_ex.getWsError().getProviderError().getProviderErrorText());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		} catch( Exception gen_ex ) {
//			System.out.println(gen_ex.getMessage());
//			gen_ex.printStackTrace();
//		} 
		System.out.println("Terminating PortMessageClient main...");
		System.exit(0);
	}
	
	private static void genMenu() {
		System.out.println("**** **** Exit                              :: 000 **** ****");
		System.out.println("**** **** queryPortMessage                  :: 100 **** ****");
		System.out.println("**** **** queryPortMessageByTN              :: 101 **** ****");
		System.out.println("**** **** queryPortMessageByPortID          :: 102 **** ****");
		System.out.println("**** **** queryPortMessageByMessageCode     :: 103 **** ****");
		System.out.println("**** **** replyPortOutRequest               :: 200 **** ****");
	}
	
	private static Date convertStringToDate( String iStringDate ) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			return sdf.parse(iStringDate);
		} catch( ParseException parse_ex ) {
			return null;
		}
	}
	
	private static void populatePortMessageRequestObject(BufferedReader br, String input, QueryPortMessageListType queryPortMessageInfo) throws PortMessageException {
	    System.out.println("Generating Port Message Request Object...");
		if( input.equals("100") ) {
	    	System.out.println("Please enter query fields where appropriate...");
	    	String userInput = "";
	    	String field = "MDN";
	    	userInput = MainHelper.populateField(field, br, "");
	    	if( userInput != null && userInput.length() == 10 ) {
	    		queryPortMessageInfo.setMdn(userInput);
	    	} else {
	    		System.out.println(field+" will be skipped...");
	    	}
	    	field = "MessageId";
	    	userInput = MainHelper.populateField(field, br, "");
	    	if( userInput != null && userInput.length() > 0 ) {
	    		queryPortMessageInfo.setMessageId(userInput);
	    	} else {
	    		System.out.println(field+" field skipped.");
	    	}
	    	field = "MessageTypeCode:[null|POR|DDT|PIR|PTS|PTA|PTN|PTC|RPR]";
	    	do {
		    	userInput = MainHelper.populateField(field, br, "");
		    	if( userInput != null && !userInput.equals("null") ) {
		    		try { 
		    			queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.fromString(userInput));
			    		field = "";
		    		} catch( IllegalArgumentException ia_ex ) {
		    			System.out.println("Unknown Message Type "+userInput+"...Please try again or leave empty...");
		    		}
		    	} else {
		    		System.out.println(field+" field skipped.");
		    		field = "";
		    	}
	    	} while (field.equals("MessageTypeCode:[null|POR|DDT|PIR|PTS|PTA|PTN|PTC|RPR]") );
	    	field = "MessageStatusCode:[null|M|F|S]";
	    	do {
		    	userInput = MainHelper.populateField(field, br, "");
		    	if( userInput != null && !userInput.equals("null") ) {
		    		try {
		    			queryPortMessageInfo.setMessageStatusCode(MessageStatusCodeType.fromString(userInput));
			    		field = "";
		    		} catch( IllegalArgumentException ia_ex ) {
		    			System.out.println("Unknown "+ field +" "+userInput+"...Please try again or leave empty...");
		    		}
		    	} else {
		    		System.out.println(field+" field skipped.");
		    		field = "";
		    	}
	    	} while (field.equals("MessageStatusCode:[null|M|F|S]") );
	    	field = "MessageActivityCode:[null|M|F|S|Q]";
	    	do {
		    	userInput = MainHelper.populateField(field, br, "");
		    	if( userInput != null && !userInput.equals("null") ) {
		    		try { 
		    			queryPortMessageInfo.setRecentMessageActivityCode(MessageActivityCode.fromString(userInput));
			    		field = "";
		    		} catch ( IllegalArgumentException ia_ex ) {
		    			System.out.println("Unknown "+ field +" "+userInput+"...Please try again or leave empty...");
		    		}
		    	} else {
		    		System.out.println(field+" field skipped.");
		    		field = "";
		    	}
	    	} while (field.equals("MessageActivityCode:[null|M|F|S|Q]") );
	    	System.out.println("Specify a Date Range?");
	    	try {
	    		userInput = br.readLine();
	    		if( userInput.trim().equalsIgnoreCase("Y") ) {		
	    			DateRangeInfoType dateRangeInfo = new DateRangeInfoType();
	    			Calendar fromDate = Calendar.getInstance();
	    			fromDate.setTime(convertStringToDate(MainHelper.populateRequiredField("From Date", br, "20090101")));
	    			dateRangeInfo.setFromDate(fromDate );
	    			Calendar toDate = Calendar.getInstance();
	    			toDate.setTime(convertStringToDate(MainHelper.populateRequiredField("To Date", br, "20090701")));
	    			dateRangeInfo.setToDate(toDate );
	    			queryPortMessageInfo.setDateRangeInfo(dateRangeInfo );	    			
	    		}
	    	} catch( IOException io_ex ) {
	    		System.out.println("Skipping Date Range section...");
	    		queryPortMessageInfo.setDateRangeInfo(null);
	    	}
	    	field = "AutoRejectStatus:[null||Y|N]";
	    	do {
		    	userInput = MainHelper.populateField(field, br, "");
		    	if( userInput != null && !userInput.equals("null") ) {
		    		try {
		    			queryPortMessageInfo.setAutoRejectStatus(SendAutoRejectTypeCode.fromString(userInput));
			    		field = "";
		    		} catch( IllegalArgumentException ia_ex ) {
		    			System.out.println("Unknown "+ field +" "+userInput+"...Please try again or leave empty...");
		    		}
		    	} else {
		    		System.out.println(field+" field skipped.");
		    		field = "";
		    	}
	    	} while( field.equals("AutoRejectStatus:[null||Y|N]") );
	    	field = "ReplyPortOutRequestStatus:[null||Y|N]";
	    	do {
		    	userInput = MainHelper.populateField(field, br, "");
		    	if( userInput != null && !userInput.equals("null") ) {
		    		try {
		    			queryPortMessageInfo.setReplyPortOutRequestStatus(PortOutRespondedTypeCode.fromString(userInput));
			    		field = "";
		    		} catch( IllegalArgumentException ia_ex ) {
		    			System.out.println("Unknown "+ field +" "+userInput+"...Please try again or leave empty...");
		    		}
		    	} else {
		    		System.out.println(field+" field skipped.");
		    		field = "";
		    	}
	    	} while( field.equals("ReplyPortOutRequestStatus:[null||Y|N]") );
	    	field = "LastSequenceNumber:[null|String]";
	    	userInput = MainHelper.populateField(field, br, null);
	    	if( userInput != null && !userInput.equals("null") ) {
	    		queryPortMessageInfo.setLastSequenceNumber(userInput);
	    	} else {
	    		System.out.println("Skipping field "+field);
	    	}
	    	if( ( queryPortMessageInfo.getMdn() != null || queryPortMessageInfo.getMessageId() != null ) && queryPortMessageInfo.getDateRangeInfo() != null ) {
	    		field = "ActivityListIndicator:[null|Boolean]";
	    		queryPortMessageInfo.setActivityListInd(Boolean.valueOf(userInput));
	    	} else { 
	    		System.out.println(field+" field skipped");
	    	}
	    	
		} else if( input.equals("101") ) {
			queryPortMessageInfo.setMdn(MainHelper.populateRequiredField("MDN", br, ""));
		} else if( input.equals("102") ) {
			queryPortMessageInfo.setMessageId(MainHelper.populateRequiredField("MessageID", br, ""));
		} else if(input.equals("103") ) {
			String commmand = MainHelper.populateRequiredField("PortMessageTypeCode", br, "PTC");
			if( commmand.equals("DDT") ) {
				queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.DDT);
			} else if( commmand.equals("POR") ) {
				queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.POR);
			} else if( commmand.equals("PIR") ) {
				queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.PIR);
			} else if( commmand.equals("PTS") ) {
				queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.PTS);
			} else if( commmand.equals("PTA") ) {
				queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.PTA);
			} else if( commmand.equals("PTN") ) {
				queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.PTN);
			} else if( commmand.equals("PTC") ) {
				queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.PTC);
			} else if( commmand.equals("RPR") ) {
				queryPortMessageInfo.setMessageTypeCode(PortMessageTypeCode.RPR);
			} else {
				throw new PortMessageException("FAIL","Unknown message request :: " + commmand);
			}
		}			
	}
	
	private static void printPortMessageResponseType( QueryPortMessageResponseType queryPortMessageResponse ) {
		if( queryPortMessageResponse != null ) {
			System.out.println("**** Begin PortMessageResponse ****");
			if( queryPortMessageResponse.getWholesalePortMessageList() != null ) {
				System.out.println("**** **** PortMessageList is not null ");
				System.out.println("Last Sequence Number :: "+queryPortMessageResponse.getWholesalePortMessageList().getLastSequenceNumber());
				
				//queryPortMessageResponse.getWholesalePortMessageList().
				if( queryPortMessageResponse.getWholesalePortMessageList().getWholesalePortMessageTypeList() != null ) {
//					System.out.println("**** **** PortMessageListType is not null");
//					System.out.println("**** **** PortMessageListType is not null and has "+queryPortMessageResponse.getWholesalePortMessageList().getWholesalePortMessageTypeList().length+" elements ");
					WholesalePortMessageTypeInfoType[] portMessageList = queryPortMessageResponse.getWholesalePortMessageList().getWholesalePortMessageTypeList().getWholesalePortMessageTypeInfo();
					if( queryPortMessageResponse.getWholesalePortMessageList().getWholesalePortMessageTypeList().getWholesalePortMessageTypeInfo() != null ) {
//						System.out.println("**** **** PortMessageList has "+queryPortMessageResponse.getWholesalePortMessageList().getWholesalePortMessageTypeList().getWholesalePortMessageTypeInfo().length+" elements");
						System.out.println("**** **** PortMessageList has "+portMessageList.length+" elements");
						for( int i = 0; i < portMessageList.length; ++i ) {
							queryPortMessageResponse.getWholesalePortMessageList().getWholesalePortMessageTypeList().getWholesalePortMessageTypeInfo();
							System.out.println("********************************************************************************************************");
							System.out.println("**** **** **** PortMessageList["+i+"].MDN                  :: "+portMessageList[i].getMdn());
							System.out.println("**** **** **** PortMessageList["+i+"].MessageCode          :: "+portMessageList[i].getMessageCode());
							System.out.println("**** **** **** PortMessageList["+i+"].MessageId            :: "+portMessageList[i].getMessageId());
							System.out.println("**** **** **** PortMessageList["+i+"].MessageText          :: "+portMessageList[i].getMessageText());
							System.out.println("**** **** **** PortMessageList["+i+"].OspBan               :: "+portMessageList[i].getOspBan());
							System.out.println("**** **** **** PortMessageList["+i+"].PasswordPin          :: "+portMessageList[i].getPasswordPin());
							System.out.println("**** **** **** PortMessageList["+i+"].PortId               :: "+portMessageList[i].getPortId());
							System.out.println("**** **** **** PortMessageList["+i+"].PortRequestNumber    :: "+portMessageList[i].getPortRequestNumber());
							System.out.println("**** **** **** PortMessageList["+i+"].ReasonCode           :: "+portMessageList[i].getReasonCode());
							System.out.println("**** **** **** PortMessageList["+i+"].ReasonText           :: "+portMessageList[i].getReasonText());
							System.out.println("**** **** **** PortMessageList["+i+"].Remarks              :: "+portMessageList[i].getRemarks());
							if( portMessageList[i].getActionCode() != null ) {
							System.out.println("**** **** **** PortMessageList["+i+"].ActionCode           :: "+portMessageList[i].getActionCode().getValue());
							}
							if( portMessageList[i].getActivityRecordList() != null ) {
								for( int j = 0; j < portMessageList[i].getActivityRecordList().getActivityRecordInfo().length; ++j ) {
									System.out.println("**** **** **** PortMessageList["+i+"].ActivityRecord["+j+"].ApplId                 :: "+portMessageList[i].getActivityRecordList().getActivityRecordInfo(j).getApplId());
									System.out.println("**** **** **** PortMessageList["+i+"].ActivityRecord["+j+"].DateStamp              :: "+portMessageList[i].getActivityRecordList().getActivityRecordInfo(j).getDateStamp());
									if( portMessageList[i].getActivityRecordList().getActivityRecordInfo(j).getMessageActivityDesc() != null ) {
										System.out.println("**** **** **** PortMessageList["+i+"].ActivityRecord["+j+"].MessageActivityDesc    :: "+portMessageList[i].getActivityRecordList().getActivityRecordInfo(j).getMessageActivityDesc().getValue());
									}
								}
							}
							if( portMessageList[i].getBillingNameInfo() != null ) {
								BillingNameInfoType billingName = portMessageList[i].getBillingNameInfo();
								System.out.println("**** **** **** PortMessageList["+i+"].NameInfo.BillPrefixName                  :: "+billingName.getBillPrefixName());
								if( billingName.getNameInfo() != null ) {
									if( billingName.getNameInfo().getBusinessNameInfo() != null ) {
										System.out.println("**** **** **** PortMessageList["+i+"].NameInfo.BusinessNameInfo.BusinessName   :: "+billingName.getNameInfo().getBusinessNameInfo().getBusinessName());
									}
									if( billingName.getNameInfo().getCustomerNameInfo() != null ) {
										System.out.println("**** **** **** PortMessageList["+i+"].NameInfo.CustomerNameInfo.FirstName      :: "+billingName.getNameInfo().getCustomerNameInfo().getFirstName());
										System.out.println("**** **** **** PortMessageList["+i+"].NameInfo.CustomerNameInfo.MiddleInitial  :: "+billingName.getNameInfo().getCustomerNameInfo().getMiddleInitial());
										System.out.println("**** **** **** PortMessageList["+i+"].NameInfo.CustomerNameInfo.BillLastName   :: "+billingName.getNameInfo().getCustomerNameInfo().getBillLastName());
									}
								}
							}
							if( portMessageList[i].getBillAddressInfo() != null ) {
								BillingAddressInfoType billingAddress = portMessageList[i].getBillAddressInfo();
								System.out.println("**** **** **** PortMessageList["+i+"].BillingAddressInfo.StreetNumber       :: "+billingAddress.getStreetNumber());
								System.out.println("**** **** **** PortMessageList["+i+"].BillingAddressInfo.StreetDirectionInd :: "+billingAddress.getStreetDirectionInd());
								System.out.println("**** **** **** PortMessageList["+i+"].BillingAddressInfo.StreetName         :: "+billingAddress.getStreetName());
								System.out.println("**** **** **** PortMessageList["+i+"].BillingAddressInfo.City               :: "+billingAddress.getCity());
								System.out.println("**** **** **** PortMessageList["+i+"].BillingAddressInfo.State              :: "+billingAddress.getState());
								System.out.println("**** **** **** PortMessageList["+i+"].BillingAddressInfo.ZipCode            :: "+billingAddress.getZipCode());
								System.out.println("**** **** **** PortMessageList["+i+"].BillingAddressInfo.Country            :: "+billingAddress.getCountry());											
							}
							if( portMessageList[i].getDelayCode() != null ) {
								System.out.println("**** **** **** PortMessageList["+i+"].DelayCode            :: "+portMessageList[i].getDelayCode().getValue());
							}
							if( portMessageList[i].getImplementationPartnerInfo() != null ) {
								ImplementationPartnerInfoType implementationPartnerInfo = portMessageList[i].getImplementationPartnerInfo();
								System.out.println("**** **** **** PortMessageList["+i+"].ImplementationPartnerInfo.ContactName :: "+implementationPartnerInfo.getContactName());
								System.out.println("**** **** **** PortMessageList["+i+"].ImplementationPartnerInfo.ContactPhone:: "+implementationPartnerInfo.getContactPhone());
							}
							if( portMessageList[i].getMessageCreationTime() != null ) {
								System.out.println("**** **** **** PortMessageList["+i+"].MessageCreationTime  :: "+portMessageList[i].getMessageCreationTime().getTime());
							}
							if( portMessageList[i].getMessageStatusCode() != null ) {
								System.out.println("**** **** **** PortMessageList["+i+"].MessageStatusCode    :: "+portMessageList[i].getMessageStatusCode().getValue());
							}
							if( portMessageList[i].getMessageStatusDesc() != null ) {
								System.out.println("**** **** **** PortMessageList["+i+"].MessageStatusDesc    :: "+portMessageList[i].getMessageStatusDesc().getValue());
							}
							if( portMessageList[i].getMessageTypeCode() != null ) {
								System.out.println("**** **** **** PortMessageList["+i+"].MessageTypeCode      :: "+portMessageList[i].getMessageTypeCode().getValue());
							}
							if( portMessageList[i].getMessageTypeDesc() != null ) { 
								System.out.println("**** **** **** PortMessageList["+i+"].MessageTypeDesc      :: "+portMessageList[i].getMessageTypeDesc().getValue());
							}
							if( portMessageList[i].getNewNetWorkServiceProviderInfo() != null ) {
								NetworkServiceProviderInfoType networkServiceProviderInfo = portMessageList[i].getNewNetWorkServiceProviderInfo();
								System.out.println("**** **** **** PortMessageList["+i+"].NewNetworkServiceProviderInfo.LocalServiceProviderId   :: "+networkServiceProviderInfo.getLocalServiceProviderId());
								System.out.println("**** **** **** PortMessageList["+i+"].NewNetworkServiceProviderInfo.NetworkServiceProviderId :: "+networkServiceProviderInfo.getNetworkServiceProviderId());
								System.out.println("**** **** **** PortMessageList["+i+"].NewNetworkServiceProviderInfo.ServiceProviderName      :: "+networkServiceProviderInfo.getServiceProviderName());
							}
							if( portMessageList[i].getOldNetWorkServiceProviderInfo() != null ) {
								NetworkServiceProviderInfoType networkServiceProviderInfo = portMessageList[i].getOldNetWorkServiceProviderInfo();
								System.out.println("**** **** **** PortMessageList["+i+"].OldNetworkServiceProviderInfo.LocalServiceProviderId   :: "+networkServiceProviderInfo.getLocalServiceProviderId());
								System.out.println("**** **** **** PortMessageList["+i+"].OldNetworkServiceProviderInfo.NetworkServiceProviderId :: "+networkServiceProviderInfo.getNetworkServiceProviderId());
								System.out.println("**** **** **** PortMessageList["+i+"].OldNetworkServiceProviderInfo.ServiceProviderName      :: "+networkServiceProviderInfo.getServiceProviderName());
								
							}
							if( portMessageList[i].getPortDueDateTimeInfo() != null ) {
								PortDueDateTimeInfoType portDueDateTimeInfo = portMessageList[i].getPortDueDateTimeInfo();
								System.out.println("**** **** **** PortMessageList["+i+"].DueDateTimeInfo                      :: "+portDueDateTimeInfo.getDueDateTime().getTime());
								if( portDueDateTimeInfo.getDueDateTimeChangesInfo() != null ) {
									System.out.println("**** **** **** PortMessageList["+i+"].DueDateTimeInfo.OriginalDueDateTime  :: "+portDueDateTimeInfo.getDueDateTimeChangesInfo().getOriginalDueDateTime().toString());
									System.out.println("**** **** **** PortMessageList["+i+"].DueDateTimeInfo.RevisedDueDateTime   :: "+portDueDateTimeInfo.getDueDateTimeChangesInfo().getRevisedDueDateTime().toString());
								}
							}
							if( portMessageList[i].getReplyPortOutRequestStatus() != null ) {
								ReplyPortOutRequestCode replyPortOutRequestCode = portMessageList[i].getReplyPortOutRequestStatus();
								System.out.println("**** **** **** PortMessageList["+i+"].ReplyPortOutRequestCode  :: "+replyPortOutRequestCode.getValue());
							}
							if( portMessageList[i].getResellerPartnerIdInfo() != null ) {
								ResellerPartnerIdInfoType resellerPartnerIdInfo = portMessageList[i].getResellerPartnerIdInfo();
								System.out.println("**** **** **** PortMessageList["+i+"].ResellerPartnerIdInfo.ResellerPartnerId                                :: "+resellerPartnerIdInfo.getResellerPartnerId());
								if( resellerPartnerIdInfo.getPortResellerPartnerInfo() != null ) {
									System.out.println("**** **** **** PortMessageList["+i+"].ResellerPartnerIdInfo.PortResellerPartnerInfo.PortInResellerPartnerId  :: "+resellerPartnerIdInfo.getPortResellerPartnerInfo().getPortInResellerPartnerId());
									System.out.println("**** **** **** PortMessageList["+i+"].ResellerPartnerIdInfo.PortResellerPartnerInfo.PortOutResellerPartnerId :: "+resellerPartnerIdInfo.getPortResellerPartnerInfo().getPortOutResellerPartnerId());
								}
							}
							if( portMessageList[i].getResponseType() != null ) {
								PortResponseTypeCode responseType = portMessageList[i].getResponseType();
								System.out.println("**** **** **** PortMessageList["+i+"].ResponseType         :: "+responseType.getValue());
							}
							if( portMessageList[i].getSsnTaxIdInfo() != null ) {
								SsnTaxIdChoiceTypeType ssnTaxId = portMessageList[i].getSsnTaxIdInfo();
								System.out.println("**** **** **** PortMessageList["+i+"].SsnTaxIdInfo.Ssn     :: "+ssnTaxId.getSsn());
								System.out.println("**** **** **** PortMessageList["+i+"].SsnTaxIdInfo.TaxId   :: "+ssnTaxId.getTaxId());
							}
							if( portMessageList[i].getSupplementalCode() != null ) {
								SupplementalMessageTypeIdentifier sup = portMessageList[i].getSupplementalCode();
								System.out.println("**** **** **** PortMessageList["+i+"].SupplementalCode     :: "+sup.getValue());
							}
						}
					} else {
						System.out.println("queryPortMessageResponse.getWholesalePortMessageList().getWholesalePortMessageTypeList() is null");
					}
				} else {
					System.out.println("getWholesalePortMessageTypeList is an empty array");
				}
			}
			System.out.println("**** End PortMessage Response ****");
		} else {
			System.out.println("queryPortMessageResponse object is null");
		}
	}
	
	private static void populateReplyPortOutRequest(BufferedReader br, String input, ReplyPortOutRequestType portOutReply ) {
		String command = "";
		portOutReply.setMessageId(MainHelper.populateField("MessageId", br, portOutReply.getMessageId()));
		portOutReply.setPortId(MainHelper.populateField("PortId", br, portOutReply.getPortId()));
		System.out.println("Port ID has been set to "+portOutReply.getPortId());
		portOutReply.setMdn(MainHelper.populateField("MDN", br, portOutReply.getMdn()));
		do {
			try { 
//				portOutReply.setResponseType(com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.PortResponseTypeCode.fromString(MainHelper.populateRequiredField("ResponseTypeCode", br, "")));
				String portResponseType = MainHelper.populateRequiredField("ResponseTypeCode", br, "");
				if( portResponseType.equalsIgnoreCase("C") ) {
					portOutReply.setResponseType(com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.PortResponseTypeCode.C);
				} else if( portResponseType.equalsIgnoreCase("R") ) {
					portOutReply.setResponseType(com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.PortResponseTypeCode.R);
				} else if( portResponseType.equalsIgnoreCase("D") ) {
					portOutReply.setResponseType(com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.PortResponseTypeCode.D);
				}
			} catch( IllegalArgumentException ia_ex ) {
				System.out.println("Invalid value for ResponseType...Please try again");
				portOutReply.setResponseType(null);
			}
		} while( portOutReply.getResponseType() == null );
		if( portOutReply.getResponseType().getValue().equals("R") ) {
//			command = MainHelper.populateField("Set Reason Code?[Y|N]", br, null);
//			if( command != null && command.equalsIgnoreCase("Y") ) {
			portOutReply.setReasonCode(MainHelper.populateField("ReasonCode", br, null));
//			}
//			command = MainHelper.populateField("Set Reason Desc?[Y|N]", br, null);
//			if( command != null && command.equalsIgnoreCase("Y") ) {
			portOutReply.setReasonDesc(MainHelper.populateField("ReasonDesc", br, null));
//			}
		} else {
			portOutReply.setReasonCode(null);
			portOutReply.setReasonDesc(null);
		}
		if( portOutReply.getResponseType().getValue().equals("D") ) {
			command = MainHelper.populateField("Set DueDate Time Field?[Y|N]", br, null);
			if( command != null && command.equalsIgnoreCase("Y") ) {
				Calendar myDueDateTime = Calendar.getInstance();
				myDueDateTime.setTime(convertStringToDate(MainHelper.populateField("DueDateTime", br, "")));
				portOutReply.setDueDateTime(myDueDateTime);
			}
//			command = MainHelper.populateField("Set Delay Code?[Y|N]", br, null);
//			if( command != null && command.equalsIgnoreCase("Y") ) {
			do {
				try {
					portOutReply.setDelayCode(PortDelayCode.fromString(MainHelper.populateField("DelayCode", br, null)));
				} catch( IllegalArgumentException ia_ex ) {
					System.out.println("Invalid value for delay code...please try again");
					portOutReply.setDelayCode(null);
				}
			} while ( portOutReply.getDelayCode() == null );
//			}
		} else {
			portOutReply.setDelayCode(null);
			portOutReply.setDueDateTime(null);
		}
//		do {
		command = MainHelper.populateField("Set Sup Code Field?[null|Y|N]", br, null);
		if( command != null && command.equalsIgnoreCase("Y") ) {
			try {
//				portOutReply.setSupplementalCode(com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.SupplementalMessageTypeIdentifier.fromString(MainHelper.populateField("Supplemental Code", br, "")));
				String supCode = MainHelper.populateField("Supplemental Code", br, "");
				if( supCode.equalsIgnoreCase("0") ) {
					portOutReply.setSupplementalCode(com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.SupplementalMessageTypeIdentifier.value1);
				} else if( supCode.equalsIgnoreCase("3") ) {
					portOutReply.setSupplementalCode(com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.SupplementalMessageTypeIdentifier.value2);
				}
			} catch( IllegalArgumentException ia_ex ) {
				System.out.println("Invalid Value for Supplemental Code...Please try again.");
				portOutReply.setSupplementalCode(null);
			}
			if( portOutReply.getSupplementalCode() != null && portOutReply.getSupplementalCode().getValue().equals("3") ) {
//				if( portOutReply.getResponseType().getValue().equals("R") || portOutReply.getResponseType().getValue().equals("D") ) {
//					command = MainHelper.populateField("Set Remarks?[Y|N]", br, null);
//					if( command != null && command.equalsIgnoreCase("Y") ) {
					portOutReply.setRemarks(MainHelper.populateField("Remarks", br, null));
//					}
				} else {
					portOutReply.setRemarks(null);
				}
		} else {
			portOutReply.setSupplementalCode(null);
		}
//		} while( portOutReply.getSupplementalCode() == null );
		command = MainHelper.populateField("Set Implementation Partner Info?[null|Y|N]", br, null);
		if( command != null && command.equalsIgnoreCase("Y") ) {
			do {
				com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.ImplementationPartnerInfoType implementationPartnerInfo = new com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.ImplementationPartnerInfoType();
				implementationPartnerInfo.setContactName(MainHelper.populateField("OSP Contact Name", br, ""));
				implementationPartnerInfo.setContactPhone(MainHelper.populateField("OSP Contact Phone", br, ""));
				portOutReply.setImplementationPartnerInfo(implementationPartnerInfo);
//				portOutReply.setImplementationPartnerInfo(new com.sprint.integration.interfaces.replyPortOutRequest.v1.replyPortOutRequest_xsd.ImplementationPartnerInfoType(MainHelper.populateField("OSP Contact Name", br, ""),MainHelper.populateField("OSP Contact Phone", br, "")));
			} while( portOutReply.getImplementationPartnerInfo() == null );
		}
		command = MainHelper.populateField("Set Remarks Field", br, portOutReply.getRemarks());
		if( command != null && command.equalsIgnoreCase("Y") ) {
			portOutReply.setRemarks(MainHelper.populateField("Remarks", br, portOutReply.getRemarks()));
		}
		portOutReply = new ReplyPortOutRequestType(portOutReply.getMessageId(), portOutReply.getPortId(), portOutReply.getMdn(), portOutReply.getResponseType(), portOutReply.getSupplementalCode(), portOutReply.getImplementationPartnerInfo(), portOutReply.getDueDateTime(), portOutReply.getReasonCode(), portOutReply.getReasonDesc(), portOutReply.getRemarks(), portOutReply.getDelayCode());
//		Calendar dueDateTime = Calendar.getInstance();
//		portOutReply.setDueDateTime(dueDateTime );
	}
	
	/**
	 * 	 Utility method to load properties
	 */
	private static void loadProps()	{
		try
		{
	    	    ClassLoader cl = QueryCsaClient.class.getClassLoader();
           	    InputStream in = cl.getResourceAsStream(inputPropertyFile);
		    props = new Properties();
		    props.load(in);

		    System.out.println("Using properties file...testing");

		    proxyURL = props.getProperty("URL", "http://localhost:2222");

		}
		catch (Exception e)
		{
		    System.out.println("Cannot locate properties file, please ensure it is in the CLASSPATH.");
		    System.out.println(e.toString());
		    System.exit(0);
		}
	}
	
	// [end] main methods
	
}
