package com.tscp.mvno.sprint.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
import com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitBindingStub;
import com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitLocator;
import com.sprint.integration.eai.services.WholesaleSwapSplit.v1.WholesaleSwapSplit_wsdl.WholesaleSwapSplitPortType;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.ElectronicSerialNumber;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.MobileEquipmentIdentifier;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SerialNumber;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnReply;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SplitNpaMdnRequest;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnReply;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapEsnRequest;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnReply;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnRequest;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdReply;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMdnWithReserveIdRequest;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidReply;
import com.sprint.integration.interfaces.WholesaleSwapSplit.v1.SwapSplitEnvelope_xsd.SwapMsidRequest;
import com.tscp.mvno.exception.SubscriptionDetailException;
import com.tscp.mvno.exception.SwapSplitException;
import com.tscp.mvno.support.FieldValidation;
import com.tscp.mvno.support.MainHelper;
import com.tscp.mvno.support.ResponseMessage;
import com.tscp.mvno.support.SprintHeader;
import com.tscp.mvno.support.TSCPLogger;

public class SwapSplitClient {

	// [start] memebers
	
	public static final String CLASS_NAME = "SwapSplitClient";
	public static final String URL		  = "wholesale.swap.split.service.location.url";
	
	public static String inputPropertyFile = "client.properties";
	public static String proxyURL = "http://localhost:2222";  // WS End Point URL
	private static Properties props;
	
	private WholesaleSwapSplitLocator 		swapSplitLocator;
	private EngineConfiguration 			config;
	
	private WholesaleSwapSplitBindingStub	swapSplitBinding;
	private WholesaleSwapSplitPortType		swapSplitPort;
	
	private SplitNpaMdnRequest				splitNpaMdnRequest;
	private SwapEsnRequest					swapEsnRequest;
	private SwapMdnRequest					swapMdnRequest;
	private SwapMdnWithReserveIdRequest		swapMdnWithReserveIdRequest;
	private SwapMsidRequest					swapMsidRequest;
	
	private SprintHeader 					header;
	private String							userName;
	private String							orderId;
	
	// [end] members
	
	// [start] constructors
	
	public SwapSplitClient() throws SwapSplitException {
		this("tscp","0000");
	}
	
	public SwapSplitClient(String userName, String orderId) throws SwapSplitException {
		loadProps();
		//System.out.println("URL::"+System.getProperty("url"));
		//System.out.println("JAVA_HOME::"+System.getProperty("java_home"));
	    proxyURL = (props.getProperty(SwapSplitClient.URL) != null && props.getProperty(SwapSplitClient.URL).trim().length() > 0) ? props.getProperty(SwapSplitClient.URL) : System.getProperty("url");

	    config = null;

	    if (System.getProperty("client.deploy.file.location") != null) {
			config = new FileProvider(System.getProperty("client.deploy.file.location"));
		}
	    
	    swapSplitLocator = new WholesaleSwapSplitLocator(config);
	    try {
	    	swapSplitPort = swapSplitLocator.getWholesaleSwapSplitPort(new URL(proxyURL));
	    	if( swapSplitPort == null ) {
	    		throw new SwapSplitException("Port could not be located at URL: "+proxyURL);
	    	}
	    } catch( Exception e ) {
	    	throw new SwapSplitException(e);
	    }
	    setUserName(userName);
	    setOrderId(orderId);
	    header = new SprintHeader(getUserName(),getOrderId());
	    swapSplitBinding = (WholesaleSwapSplitBindingStub)swapSplitPort;
	    swapSplitBinding.setUsername(header.getBindingUserName());
	    swapSplitBinding.setPassword(header.getBindingPassword());
	    swapSplitBinding.setTimeout(header.getTimeOut());
	    swapSplitBinding.setHeader(header.getHeader());
	}
	
	// [end] constructors
	
	// [start] get methods	
	
	public String getOrderId() {
		return orderId;
	}

	public String getUserName() {
		return userName;
	}

	public SplitNpaMdnRequest getSplitNpaMdnRequest() {
		return splitNpaMdnRequest;
	}

	public SwapEsnRequest getSwapEsnRequest() {
		return swapEsnRequest;
	}

	public SwapMdnRequest getSwapMdnRequest() {
		return swapMdnRequest;
	}

	public SwapMdnWithReserveIdRequest getSwapMdnWithReserveIdRequest() {
		return swapMdnWithReserveIdRequest;
	}

	public SwapMsidRequest getSwapMsidRequest() {
		return swapMsidRequest;
	}
	
	// [end] get methods
	
	// [start] set methods

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setSplitNpaMdnRequest(SplitNpaMdnRequest splitNpaMdnRequest) {
		this.splitNpaMdnRequest = splitNpaMdnRequest;
	}

	public void setSwapEsnRequest(SwapEsnRequest swapEsnRequest) {
		this.swapEsnRequest = swapEsnRequest;
	}

	public void setSwapMdnRequest(SwapMdnRequest swapMdnRequest) {
		this.swapMdnRequest = swapMdnRequest;
	}

	public void setSwapMdnWithReserveIdRequest(
			SwapMdnWithReserveIdRequest swapMdnWithReserveIdRequest) {
		this.swapMdnWithReserveIdRequest = swapMdnWithReserveIdRequest;
	}

	public void setSwapMsidRequest(SwapMsidRequest swapMsidRequest) {
		this.swapMsidRequest = swapMsidRequest;
	}

	// [end] set methods
	
	// [start] validation methods
	
	/**
	 * Using the rules established in the Sprint Consolidated API Listing (CAL), we must verify that the 
	 * outgoing request is valid.  
	 * 
	 * <p>
	 * <table border=true>
	 * 	<tr><th>FieldName</th><th>Required/Optional</th><th>Length</th><th>Field Datatype</th><th>Field Description</th></tr>
	 * 	<tr><td>oldMdn</td><td align=center>R</td><td align=center>10</td><td align=center>String</td><td align=center>The Mobile access number currently assigned to the subscriber</td></tr>
	 * </table>
	 * </p>
	 * @throws SwapSplitException
	 * @return boolean value representing valid splitNpaMdnRequest object.
	 */
	public boolean validateSplitNpaMdnRequest() throws SwapSplitException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		message = FieldValidation.validateNullObject("SplitNpaMdnRequest", getSplitNpaMdnRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please bind the SplitNpaMdnRequest object");
		} else {
			message = FieldValidation.validateMDNField(getSplitNpaMdnRequest().getOldMdn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please check SplitNpaMdnRequest.OLD_MDN field");
			}
			retValue = true;
		}
		
		return retValue;
	}
	
	/**
	 * The swapEsnRequest must have an MDN, and an ESN present.  The MSID is optional.
	 * 
	 * <p>
	 * <table border=true>
	 * 	<tr><th>FieldName</th><th>Required/Optional</th><th>Length</th><th>Field Datatype</th><th width=320>Field Description</th></tr>
	 * 	<tr><td>mdn</td><td align=center>R</td><td align=center>10</td><td align=center>String</td><td align=center width=320>The Mobile access number currently assigned to the subscriber</td></tr>
	 * 	<tr><td>esn</td><td align=center>R</td><td align=center>&nbsp;</td><td align=center>{@link SerialNumber}</td><td align=center width=320>The “new” Valid ESN or MEID in either decimal or hex format is required for this structure.</td></tr>
	 * 	<tr><td>msid</td><td align=center>O</td><td align=center>15</td><td align=center>String</td><td align=center width=320>The Mobile station ID assigned to the MDN</td></tr>
	 * </table>
	 * </p>
	 * 
	 * @return boolean value representing whether or not the request is valid
	 * @throws SwapSplitException
	 */
	public boolean validateSwapEsnRequest() throws SwapSplitException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		message = FieldValidation.validateNullObject("SwapEsnRequest", getSwapEsnRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please bind the SwapEsnRequest object");
		} else {
			//Validate the MDN field
			message = FieldValidation.validateMDNField(getSwapEsnRequest().getMdn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please check the SwapEsnRequest.MDN field");
			} 		
			
			//Validate the ESN field
			message = FieldValidation.validateNullObject("SwapMdnRequest Esn", getSwapEsnRequest().getEsn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please check the SwapEsnRequest.ESN object");
			} else {
				SerialNumber sn = new SerialNumber();
				sn = getSwapEsnRequest().getEsn();
				message = FieldValidation.validateNullObject("SwapEsnRequest ESN", sn.getElectronicSerialNumber());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					message = FieldValidation.validateNullObject("SwapEsnRequest MEID", sn.getMobileEquipmentIdentifier());
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new SwapSplitException(message.getStatus(),"Either ESN or MEID must be populated...");
					} else {
						if( sn.getMobileEquipmentIdentifier().getMobileEquipmentIdentifierDec() == null && sn.getMobileEquipmentIdentifier().getMobileEquipmentIdentifierHex() == null ) {
							throw new SwapSplitException(FieldValidation.STATUS_FAILED,"MEID Dec and Hex are null...");
						}
					}
				} else {
					if( sn.getElectronicSerialNumber().getElectronicSerialNumberDec() == null && sn.getElectronicSerialNumber().getElectronicSerialNumberHex() == null ) {
						throw new SwapSplitException("SwapEsnRequest ESN ERROR!! Either decimal or hexidecimal value must be provided");
					}
				}
			}
			retValue = true;
		}
		return retValue;
	}
	
	public boolean validateSwapMdnRequest() throws SwapSplitException {
		boolean retValue = false; 
		ResponseMessage message = new ResponseMessage();
		message = FieldValidation.validateNullObject("SwapMdnRequest", getSwapMdnRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please bind the SwapMdnRequest object");
		} else {
			//Validate the MDN field
			message = FieldValidation.validateMDNField(getSwapMdnRequest().getMdn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please check the SwapEsnRequest.MDN field");
			} 
			retValue = true;
		}
		return retValue;
	}
	
	public boolean validateSwapMdnWithReserveIdRequest() throws SwapSplitException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		message = FieldValidation.validateNullObject("SwapMdnWithReserveIdRequest", getSwapMdnWithReserveIdRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please bind the SwapMdnWithReserveIdRequest object");
		} else {
			//Validate the MDN field
			message = FieldValidation.validateMDNField(getSwapMdnWithReserveIdRequest().getOldMdn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please check the SwapMdnWithReserveIdRequest.MDN field");
			} 
			
			//Validate the ReservationId Field
			message = FieldValidation.validateNullObject("SwapMdnWithReserveIdRequest ReserveId", getSwapMdnWithReserveIdRequest().getReserveMdnId());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please check the SwapMdnWithReserveIdRequest.ReserveMdnID field");
			}
			
			retValue = true;
		}
		return retValue;
	}
	
	public boolean validateSwapMsidRequest() throws SwapSplitException {
		boolean retValue = false;
		ResponseMessage message = FieldValidation.validateNullObject("SwapMsidRequest", getSwapMsidRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please bind the SwapMsidRequest object");
		} else {
			message = FieldValidation.validateNullObject("SwapMsidRequest MSID", getSwapMsidRequest().getOldMsid());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new SwapSplitException(message.getStatus(),message.getMessage()+" Please verify the MSID associated with SwapMsidRequest object");
			}
			
			retValue = true;
		}
		return retValue;
	}
	
	// [end] validation methods
	
	// [start] accessor methods
	
	/**
	 * This API provides the ability to swap the access number on an existing MVNO subscription when an
	 * NPA split occurs.
	 * <p>Wsdl name: WholesaleSwapSplit.wsdl</p>
	 * <p>Imported Schemas: SwapSplitEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: SplitNpaMdn</p>
	 * 
	 * @throws SwapSplitExcpetion
	 * @return SplitNpaMdnReply
	 */
	public SplitNpaMdnReply splitNpaMdn() throws SwapSplitException {
		String methodName = "splitNpaMdn";
		SplitNpaMdnReply npaMdnReply = new SplitNpaMdnReply();
		if( validateSplitNpaMdnRequest() ) {
			try {
				npaMdnReply = swapSplitBinding.splitNpaMdn(getSplitNpaMdnRequest());
			} catch ( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME,methodName,ws_err);
			} catch ( Exception e ) {
				throw new SwapSplitException(e);
			}
		} else {
			throw new SwapSplitException("SplitNpaMdnRequest is invalid!!");
		}
		return npaMdnReply;
	}
	
	/**
	 * This API provides the ability to swap the Device ID used as access equipment for an existing MVNO
	 * subscription.
	 * <p>Wsdl name: WholesaleSwapSplit.wsdl</p>
	 * <p>Imported Schemas: SwapSplitEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: SwapEsn</p>
	 * 
	 * @return
	 * @throws SwapSplitException
	 */
	public SwapEsnReply swapEsn() throws SwapSplitException {
		String methodName = "swapEsn";
		SwapEsnReply swapReply = new SwapEsnReply();
		if( validateSwapEsnRequest() ) {
			try {
				swapReply = swapSplitBinding.swapEsn(getSwapEsnRequest());
			} catch( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
			} catch( Exception e ) {
				throw new SwapSplitException(e);
			}
		}
		return swapReply;
	}
	
	/**
	 * This API provides the ability to perform an access number swap for an existing MVNO subscription.
	 * <p>Wsdl name: WholesaleSwapSplit.wsdl</p>
	 * <p>Imported Schemas: SwapSplitEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: SwapMdn</p>
	 * 
	 * @return
	 * @throws SwapSplitException
	 */
	public SwapMdnReply swapMdn() throws SwapSplitException {
		String methodName = "swapMdn";
		SwapMdnReply swapReply = new SwapMdnReply();
		if( validateSwapMdnRequest() ) {
			try { 
				swapReply = swapSplitBinding.swapMdn(getSwapMdnRequest());
			} catch( ErrorDetailsType error ) {
				TSCPLogger.logError(CLASS_NAME, methodName, error);
				throw new SwapSplitException(CLASS_NAME,methodName,error);
			} catch( Exception e ) {
				throw new SwapSplitException(e);
			}
		}
		return swapReply;
	}
	
	/**
	 * The swapMDN API provides the ability to perform an access number swap to a non-ported access
	 * number with required reservationId for an existing MVNO subscription through an external system.
	 * <p>Wsdl name: WholesaleSwapSplit.wsdl</p>
	 * <p>Imported Schemas: SwapSplitEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: SwapMdnWithReserveId</p>
	 * 
	 * @return
	 * @throws SwapSplitException
	 */
	public SwapMdnWithReserveIdReply swapMdnWithReserveIdReply() throws SwapSplitException {
		String methodName = "swapMdnWithReserveIdReply";
		SwapMdnWithReserveIdReply swapReply = new SwapMdnWithReserveIdReply();
		if( validateSwapMdnWithReserveIdRequest() ) {
			try {
				swapReply = swapSplitBinding.swapMdnWithReserveId(getSwapMdnWithReserveIdRequest());
			} catch( ErrorDetailsType error ) {
				TSCPLogger.logError(CLASS_NAME,methodName,error);
			} catch( Exception e ) {
				throw new SwapSplitException(e);
			}
		}
		return swapReply;
	}
	
	/**
	 * This API is used to swap MSID associated with a subscription.
	 * <p>Wsdl name: WholesaleSwapSplit.wsdl</p>
	 * <p>Imported Schemas: SwapSplitEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: SwapMsid</p>
	 * 
	 * @return
	 * @throws SwapSplitException
	 */
	public SwapMsidReply swapMsid() throws SwapSplitException {
		String methodName = "swapMsid";
		SwapMsidReply swapReply = new SwapMsidReply();
		if( validateSwapMsidRequest() ) {
			try {
				swapReply = swapSplitBinding.swapMsid(getSwapMsidRequest());
			} catch( ErrorDetailsType error ) {
				TSCPLogger.logError(CLASS_NAME, methodName, error);
			} catch( Exception e ) {
				throw new SwapSplitException(e);
			}
		}
		return swapReply;
	}
	
	// [end] accessor methods	
	
	// [start] main method
	
	public static void main(String[] args) throws Exception {
		System.out.println("Testing SwapSplitClient class");
		boolean running = true;
		String input = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(running) {
			if( args.length > 0 ) {
				System.out.println("args[] is not empty");
				for( int i = 0; i < args.length; i++ ) {
					System.out.println("args["+i+"]::"+args[i]);
				}
				input = args[0];
			} else {
				System.out.println("**** No arguments found...Please set set one of the following as arg[0]");
				genMenu();
				input = br.readLine();
			}
			if( input.equals("001") ) {
				System.out.println("Calling SwapEsn API");
				System.out.println("");
				SwapSplitClient swapClient = new SwapSplitClient();
				swapClient.setUserName(MainHelper.populateRequiredField("UserName",br,swapClient.getUserName()));
				swapClient.setOrderId(MainHelper.populateRequiredField("OrderId",br,swapClient.getOrderId()));
				SwapEsnRequest swapRequest = new SwapEsnRequest();				
				SwapEsnReply swapReply = new SwapEsnReply();
				swapRequest.setMdn(MainHelper.populateRequiredField("MDN", br, swapRequest.getMdn()));
				swapRequest.setEsn(populateSerialNumber(br));
				swapClient.setSwapEsnRequest(swapRequest);
				try {
					swapReply = swapClient.swapEsn();
					if( swapReply == null ) {
						throw new SwapSplitException("swapReply is null!!");
					}
					System.out.println("SwapReply.Msid     :: "+swapReply.getMsid());
				} catch ( SwapSplitException swap_ex ) {
					handleLocalException(swap_ex);
				}
			} else if( input.equals("002") ) {
				System.out.println("Testing Swap MDN");
				try {
					SwapSplitClient swapClient = new SwapSplitClient();
					swapClient.setUserName(MainHelper.populateRequiredField("UserName",br,swapClient.getUserName()));
					swapClient.setOrderId(MainHelper.populateRequiredField("OrderId",br,swapClient.getOrderId()));
					SwapMdnRequest swapRequest = new SwapMdnRequest();
					swapRequest.setMdn(MainHelper.populateField("MDN", br, swapRequest.getMdn()));
					swapClient.setSwapMdnRequest(swapRequest);
					SwapMdnReply swapReply = new SwapMdnReply();
					swapReply = swapClient.swapMdn();
					if( swapReply == null ) {
						throw new SwapSplitException(" Swap reply is null !!");
					}
					System.out.println("SwapReply.NewMdn   :: "+swapReply.getNewMdn());
					System.out.println("SwapReply.Msid     :: "+swapReply.getMsid());
				} catch( SwapSplitException swap_ex ) {
					MainHelper.handleException(swap_ex);
				}
			} else if( input.equals("003") ) {
				System.out.println("Testing Swap MDN with ReserveId");
				try {
					SwapSplitClient swapClient = new SwapSplitClient();
					swapClient.setUserName(MainHelper.populateRequiredField("UserName",br,swapClient.getUserName()));
					swapClient.setOrderId(MainHelper.populateRequiredField("OrderId",br,swapClient.getOrderId()));
					SwapMdnWithReserveIdRequest swapRequest = new SwapMdnWithReserveIdRequest();
					swapRequest.setOldMdn(MainHelper.populateField("Old MDN", br, swapRequest.getOldMdn()));
					swapRequest.setReserveMdnId(MainHelper.populateField("Reserve Id",br,swapRequest.getReserveMdnId()));
					swapClient.setSwapMdnWithReserveIdRequest(swapRequest);
					SwapMdnWithReserveIdReply swapReply = new SwapMdnWithReserveIdReply();
					swapReply = swapClient.swapMdnWithReserveIdReply();
					if( swapReply == null ) {
						throw new SwapSplitException(" Swap reply is null !!");
					}
					System.out.println("SwapReply.NewMdn   :: "+swapReply.getNewMdn());
					System.out.println("SwapReply.Msid     :: "+swapReply.getMsid());
				} catch( SwapSplitException swap_ex ) {
					MainHelper.handleException(swap_ex);
				}
			} else if( input.equals("004") ) {
				System.out.println("Testing Swap Msid");
				try {
					SwapSplitClient swapClient = new SwapSplitClient();
					swapClient.setUserName(MainHelper.populateRequiredField("UserName",br,swapClient.getUserName()));
					swapClient.setOrderId(MainHelper.populateRequiredField("OrderId",br,swapClient.getOrderId()));
					SwapMsidRequest swapRequest = new SwapMsidRequest();
					swapRequest.setOldMsid(MainHelper.populateField("MSID", br, swapRequest.getOldMsid()));
					swapClient.setSwapMsidRequest(swapRequest);
					SwapMsidReply swapReply = new SwapMsidReply();
					swapReply = swapClient.swapMsid();
					if( swapReply == null ) {
						throw new SwapSplitException(" Swap reply is null !!");
					}
					System.out.println("SwapReply.Mdn      :: "+swapReply.getMdn());
					System.out.println("SwapReply.NewMsid  :: "+swapReply.getNewMsid());
				} catch( SwapSplitException swap_ex ) {
					MainHelper.handleException(swap_ex);
				}
			} else if( input.equals("000") ) {
				running = false;
			} else {
				System.out.println("!!Unknown command...Please try again(? for help)");
			}
		}
		/*loadProps();
		System.out.println("URL::"+System.getProperty("url"));
		System.out.println("JAVA_HOME::"+System.getProperty("java_home"));
	    proxyURL = (props.getProperty("URL") != null && props.getProperty("URL").trim().length() > 0) ? props.getProperty("URL") : System.getProperty("url");

	    EngineConfiguration config = null;

	    if (System.getProperty("client.deploy.file.location") != null) {
			config = new FileProvider(System.getProperty("client.deploy.file.location"));
		}
	    WholesaleSwapSplitLocator swapSplitLocator = new WholesaleSwapSplitLocator(config);
	    try {
	    	WholesaleSwapSplitPortType swapSplitPort = swapSplitLocator.getWholesaleSwapSplitPort(new URL(proxyURL));
	    	swapSplitPort.splitNpaMdn(new SplitNpaMdnRequest());
	    	swapSplitPort.swapEsn(new SwapEsnRequest());
	    	swapSplitPort.swapMdn(new SwapMdnRequest());
	    	swapSplitPort.swapMdnWithReserveId(new SwapMdnWithReserveIdRequest());
	    	swapSplitPort.swapMsid(new SwapMsidRequest());
	    	
	    } catch( Exception e ) {
	    	e.printStackTrace();
	    	System.exit(0);
	    }
	    */
	    System.out.println("Done Testing Swap Split");
	}

//	 Utility method to load properties
	private static void loadProps()
	{
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
	
	private static void genMenu() {
		System.out.println("**** **** Swap Esn          :: 001 **** ****");
		System.out.println("**** **** Swap Mdn          :: 002 **** ****");
		System.out.println("**** **** SwapMdnWithRsvId  :: 003 **** ****");
		System.out.println("**** **** SwapMsid          :: 004 **** ****");
		System.out.println("**** **** SplitNpaMdn       :: 005 **** ****");
	}

	private static void handleLocalException( SwapSplitException swap_ex ) {
		System.out.println("SwapSplit Exception!!");
		System.out.println("SwapSplitException.Status   :: "+swap_ex.getStatus());
		System.out.println("SwapSplitException.Message  :: "+swap_ex.getMessage());
	}
	
	private static SerialNumber populateSerialNumber(BufferedReader br) {
		SerialNumber serialNumber = new SerialNumber();
		try {
			boolean invalidInput = true;
			String tempInput = "";
			while( invalidInput ) {
				tempInput = MainHelper.populateRequiredField("ESN or MEID in Decimal", br, "");
				if( tempInput != null ) {
					if( tempInput.length() == 11 ) {
						ElectronicSerialNumber electronicSerialNumber = new ElectronicSerialNumber();
						electronicSerialNumber.setElectronicSerialNumberDec(tempInput);
						
						serialNumber.setElectronicSerialNumber(electronicSerialNumber);
						invalidInput = false;
					} else if( tempInput.length() == 18 ) {
						MobileEquipmentIdentifier meid = new MobileEquipmentIdentifier();
						meid.setMobileEquipmentIdentifierDec(tempInput);
						
						serialNumber.setMobileEquipmentIdentifier(meid);
						invalidInput = false;
					} else {
						System.out.println("Invalid format for ESN/MEID...ESN/MEID must be 11 or 18 digits");
					}
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return serialNumber;
	}
	
	// [end] main method
}
