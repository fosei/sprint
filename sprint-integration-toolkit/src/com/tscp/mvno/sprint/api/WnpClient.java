package com.tscp.mvno.sprint.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Vector;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
import com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpBindingStub;
import com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpPortType;
import com.sprint.integration.eai.services.WholesaleWnp.v1.WholesaleWnp_wsdl.WholesaleWnpServiceLocator;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ActivateSubscriptionWithPortInReply;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ActivateSubscriptionWithPortInRequest;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.CancelPortReply;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.CancelPortRequest;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ChangePortInDueDateTimeReply;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ChangePortInDueDateTimeRequest;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ElectronicSerialNumber;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ModifyPortInReply;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ModifyPortInRequest;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PendingPortInResult;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInSwapMdnReply;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInSwapMdnRequest;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortInformation;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PortResult;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PostalCode;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PreValidatePortReply;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.PreValidatePortRequest;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.ProductDeployment;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.QueryPendingResellerPortInsReply;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.QueryPendingResellerPortInsRequest;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.SerialNumber;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.SubscriptionRequest;
import com.sprint.integration.interfaces.WholesaleWnp.v1.PortEnvelope_xsd.TimeZoneCode;
import com.tscp.mvno.exception.WnpException;
import com.tscp.mvno.support.FieldValidation;
import com.tscp.mvno.support.MainHelper;
import com.tscp.mvno.support.ResponseMessage;
import com.tscp.mvno.support.SprintHeader;
import com.tscp.mvno.support.TSCPLogger;

public class WnpClient {

	// [start] memebers
	public static final String CLASS_NAME  = "WnpClient";
	public static final String URL = "wholesale.wnp.service.location.url";
	public static String inputPropertyFile = "client.properties";
	public static String proxyURL = "http://localhost:2222";  // WS End Point URL
	private static Properties props;
	
	private WholesaleWnpBindingStub		wnpBinding;
	private WholesaleWnpServiceLocator 	wnpService;
	private WholesaleWnpPortType		wnpPort;
	private EngineConfiguration 		config;
	
	private ActivateSubscriptionWithPortInRequest	activateSubscriptionWithPortInRequest;
	private CancelPortRequest						cancelPortRequest;
	private ChangePortInDueDateTimeRequest			changePortInDueDateTimeRequest;
	private ModifyPortInRequest						modifyPortInRequest;
	private PortInSwapMdnRequest					portInSwapMdnRequest;
	private PreValidatePortRequest					preValidatePortRequest;
	private QueryPendingResellerPortInsRequest		queryPendingResellerPortInsRequest;
	
	private String			userName;
	private String  		orderId;
	private SprintHeader 	header;
	
	// [end] members
	
	// [start] get methods
	
	public String getOrderId() {
		return orderId;
	}

	public String getUserName() {
		return userName;
	}

	public ActivateSubscriptionWithPortInRequest getActivateSubscriptionWithPortInRequest() {
		return activateSubscriptionWithPortInRequest;
	}

	public CancelPortRequest getCancelPortRequest() {
		return cancelPortRequest;
	}

	public ChangePortInDueDateTimeRequest getChangePortInDueDateTimeRequest() {
		return changePortInDueDateTimeRequest;
	}

	public ModifyPortInRequest getModifyPortInRequest() {
		return modifyPortInRequest;
	}

	public PortInSwapMdnRequest getPortInSwapMdnRequest() {
		return portInSwapMdnRequest;
	}

	public PreValidatePortRequest getPreValidatePortRequest() {
		return preValidatePortRequest;
	}

	public QueryPendingResellerPortInsRequest getQueryPendingResellerPortInsRequest() {
		return queryPendingResellerPortInsRequest;
	}
	
	// [end] get methods
	
	// [start] set methods

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setActivateSubscriptionWithPortInRequest(
			ActivateSubscriptionWithPortInRequest activateSubscriptionWithPortInRequest) {
		this.activateSubscriptionWithPortInRequest = activateSubscriptionWithPortInRequest;
	}

	public void setCancelPortRequest(CancelPortRequest cancelPortRequest) {
		this.cancelPortRequest = cancelPortRequest;
	}

	public void setChangePortInDueDateTimeRequest(
			ChangePortInDueDateTimeRequest changePortInDueDateTimeRequest) {
		this.changePortInDueDateTimeRequest = changePortInDueDateTimeRequest;
	}

	public void setModifyPortInRequest(ModifyPortInRequest modifyPortInRequest) {
		this.modifyPortInRequest = modifyPortInRequest;
	}

	public void setPortInSwapMdnRequest(PortInSwapMdnRequest portInSwapMdnRequest) {
		this.portInSwapMdnRequest = portInSwapMdnRequest;
	}

	public void setPreValidatePortRequest(
			PreValidatePortRequest preValidatePortRequest) {
		this.preValidatePortRequest = preValidatePortRequest;
	}

	public void setQueryPendingResellerPortInsRequest(
			QueryPendingResellerPortInsRequest queryPendingResellerPortInsRequest) {
		this.queryPendingResellerPortInsRequest = queryPendingResellerPortInsRequest;
	}
	
	// [end] set methods

	// [start] constructors
	
	public WnpClient() throws WnpException {
		this("tscp","0000");
	}
	
	public WnpClient(String userName, String orderId) throws WnpException {
		loadProps();
		proxyURL = (props.getProperty(WnpClient.URL) != null && props.getProperty(WnpClient.URL).trim().length() > 0) ? props.getProperty(WnpClient.URL) : System.getProperty("url");
		
		config = null;
		
		if (System.getProperty("client.deploy.file.location") != null) {
			config = new FileProvider(System.getProperty("client.deploy.file.location"));
		}
		
		wnpService = new WholesaleWnpServiceLocator(config);
		try {
			wnpPort = wnpService.getWholesaleWnpPort(new URL(proxyURL));
		} catch ( Exception e ) {
			throw new WnpException(e);
		}
		wnpBinding = (WholesaleWnpBindingStub)wnpPort;
		setUserName(userName);
		setOrderId(orderId);
		header = new SprintHeader(getUserName(),getOrderId());
		wnpBinding.setUsername(header.getBindingUserName());
		wnpBinding.setPassword(header.getBindingPassword());
		wnpBinding.setTimeout(header.getTimeOut());
		wnpBinding.setHeader(header.getHeader());
	}
	
	// [end] constructors
	
	// [start] validation methods
	
	public boolean validatePortObject(PortInformation iPortInfo) throws WnpException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		
		//Validate the portInfo object
		message = FieldValidation.validateNullObject("PortInfo", iPortInfo);
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new WnpException(message.getStatus(),message.getMessage()+" Please bind the PortInfo object");
		} else {
			//Validate the timezone field
			message = FieldValidation.validateNullObject("PortInfo.TimeZoneCode",iPortInfo.getTimeZone());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the timezone object");
			} else {
				message = FieldValidation.validateTimeZoneField(iPortInfo.getTimeZone().getValue());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new WnpException(message.getStatus(),message.getMessage()+" Please check the value field for TimeZoneCode in PortInfo object");
				}
			}
			
			//Validate the authorized by field
			message = FieldValidation.validateNullObject("PortInfo.AuthorizedBy", iPortInfo.getAuthorizedBy());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the AuthorizedBy field in PortInfo Object");
			}
			
			//Validate the billStreetName field
			message = FieldValidation.validateNullObject("PortInfo.billStreetName", iPortInfo.getBillStreetName());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the billStreetName field in PortInfo Object");
			}
			
			//Validate the billCityName field
			message = FieldValidation.validateNullObject("PortInfo.billCityName", iPortInfo.getBillCityName());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the billCityName field in PortInfo Object");
			}			
			
			//Validate the billStateCode field
			message = FieldValidation.validateNullObject("PortInfo.billStateCode", iPortInfo.getBillStateCode());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the billStateCode field in PortInfo Object");
			}			
			
			//Validate the zip field
			message = FieldValidation.validateNullObject("PortInfo.PostalCode", iPortInfo.getZip());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the PostalCode field in PortInfo Object");
			} else {
				message = FieldValidation.validateNullObject("PortInfo.PostalCode.UspsPostalCd", iPortInfo.getZip().getUspsPostalCd());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new WnpException(message.getStatus(),message.getMessage()+" Please check the Postalcode.UspsPostalCd field in the PortInfo Object");
				}
			}
			
			//Validate the SSN
			message = FieldValidation.validateSSNField(iPortInfo.getSsn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the SSN Field in PortInfo.SSN");
			}
			
			//Validate the Account Number
			message = FieldValidation.validateNullObject("PortInfo.AccountNumber", iPortInfo.getAccountNumber());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the AccountNumber field in PortInfo Object");
			}			
			
			
			//After all other validations, the final should be a good portInfo object
			retValue = true;
		}
		return retValue;
	}
	
	public boolean validateSubObject(SubscriptionRequest sub) throws WnpException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		message = FieldValidation.validateNullObject("SubscriptionRequest", sub);
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new WnpException(message.getStatus(),message.getMessage()+" Please bind the SubscriptionRequest object");
		} else {
			
			//Validate Mdn field
			message = FieldValidation.validateMDNField(sub.getMdn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the MDN field in SubscriptionRequest");
			}
			
			//Validate the CSA field
			message = FieldValidation.validateCsaField(sub.getCsa());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the CSA field in SubscriptionRequest");
			}
			
			//Validate the Price Plan
			message = FieldValidation.validateNullObject("SubscriptionRequest.PricePlan", sub.getPricePlan());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the PricePlan object in SubscriptionRequest");
			} else { 
				ProductDeployment pricePlan = sub.getPricePlan();
				message = FieldValidation.validateNullObject("SubscriptionRequest.PricePlan.soccode", pricePlan.getServiceCode());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new WnpException(message.getStatus(),message.getMessage()+" Please check the SubscriptionRequest.PricePlan.SocCode field");
				}				
			}
			
			//Validate the Service List
			if( sub.getServiceList() != null ) {
				ProductDeployment[] serviceList = sub.getServiceList();
				for( int i = 0; i < serviceList.length; i++ ) {
					message = FieldValidation.validateNullObject("SubscriptionRequest.ServiceList["+i+"].SocCode", serviceList[i].getServiceCode());
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new WnpException(message.getStatus(),message.getMessage()+" Please check SOC_CODE at index["+i+"]");
					}
				}				
			}
			retValue = true;
		}
		
		return retValue;
	}
	
	public boolean validateActivateSubscriptionWithPortInRequest() throws WnpException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		
//		// Validate the request exists
//		message = FieldValidation.validateNullObject("ActivateSubscriptionWithPortInRequest",getActivateSubscriptionWithPortInRequest());
//		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
//			throw new WnpException(message.getStatus(),message.getMessage()+" Please bind the ActivateSubscriptionWithPortInRequest.");
//		} else {
//			//Validate the PortInfo structure
//			message = FieldValidation.validateNullObject("ActivateSubscriptionWithPortInRequest.PortInfo", getActivateSubscriptionWithPortInRequest().getPortInfo());
//			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
//				throw new WnpException(message.getStatus(),message.getMessage()+" Please bind the PortInfo object in ActivateSubscriptionWithPortInRequest");
//			} else {
//				if( !validatePortObject(getActivateSubscriptionWithPortInRequest().getPortInfo()) ) {
//					throw new WnpException("PortInformation object in ActivateSubscriptionWithPortInRequest is invalid!!");
//				}
//			}
//			
//			//Validate the Sub Object
//			message = FieldValidation.validateNullObject("ActivateSubscriptionWithPortInRequest.Sub", getActivateSubscriptionWithPortInRequest().getSub());
//			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED)  ) {
//				throw new WnpException(message.getStatus(),message.getMessage()+" Please bind the SubscriptionRequest object in the ActivateSubscriptionWithPortInRequest");
//			} else {
//				if( !validateSubObject(getActivateSubscriptionWithPortInRequest().getSub()) ) {
//					throw new WnpException("ActivateSubscriptionWithPortInRequest.SubscriptionRequest object is invalid!!");
//				}
//			}
//			
			retValue = true;
//		}
		return retValue;
	}
	
	public boolean validateCancelPortRequest() throws WnpException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		
		//Validate that the request object exists
		message = FieldValidation.validateNullObject("CancelPortRequest", getCancelPortRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new WnpException(message.getStatus(),message.getMessage()+" Please bind the CancelPortRequest");
		} else {
			//Validate the MDN field
			message = FieldValidation.validateMDNField(getCancelPortRequest().getMdn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the CancelPortRequest.MDN field");
			}
			
			//Validate the remark field
			message = FieldValidation.validateNullObject("CancelPortRequest.REMARK",getCancelPortRequest().getRemark());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the CancelPortRequest.REMARK field");
			}
			retValue = true;
		}
			
		return retValue;
	}
	
	public boolean validateChangePortInDueDateTimeRequest() throws WnpException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		
		//Validate the request object
		message = FieldValidation.validateNullObject("ChangePortInDueDateTimeRequest", getChangePortInDueDateTimeRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new WnpException(message.getStatus(),message.getMessage()+" Please bind the ChangePortInDueDateTimeRequest object");
		} else {
			//Validate the desired due date field
			message = FieldValidation.validateDueDateTime(getChangePortInDueDateTimeRequest().getDesiredDueDateTime());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the desired due date field");
			}
			
			//Validate the Timezone field
			message = FieldValidation.validateNullObject("ChangePortInDueDateTimeRequest.TimeZone", getChangePortInDueDateTimeRequest().getTimeZone());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(), message.getMessage()+" Please check the timezone object");
			} else {
				message = FieldValidation.validateTimeZoneField(getChangePortInDueDateTimeRequest().getTimeZone().getValue());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new WnpException(message.getStatus(),message.getMessage()+" Please check the desired due date field");
				}
			}
			
			//Validate the Remark field
			message = FieldValidation.validateNullObject("ChangePortInDueDateTimeRequest.Remark", getChangePortInDueDateTimeRequest().getRemark());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(), message.getMessage()+" Please check the remark field");
			}
			
			//Valid request object
			retValue = true;
		}
		
		return retValue;
	}
	
	public boolean validateModifyPortInRequest() throws WnpException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		
		//Validate the request object
		message = FieldValidation.validateNullObject("ModifiyPortInRequest", getModifyPortInRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new WnpException(message.getStatus(),message.getMessage()+" Please bind the ModifyPortInRequest object");
		} else {
			//Validate the presence of the PortID and/or MDN
			if( getModifyPortInRequest().getMdn() == null && getModifyPortInRequest().getPortId() == null ) {
				throw new WnpException("Either MDN or Port ID must be present in ModifiyPortInRequest");
			} else {
				if( getModifyPortInRequest().getMdn() != null ) {
					message = FieldValidation.validateMDNField(getModifyPortInRequest().getMdn());
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new WnpException(message.getStatus(),message.getMessage()+" Please check ModifyPortInRequest.MDN");
					}
				}
				
				//Validate the timezone field
				message = FieldValidation.validateNullObject("ModifiyPortInRequest.TimeZone", getModifyPortInRequest().getTimeZone());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new WnpException(message.getStatus(),message.getMessage()+" Please check ModifyPortInRequest.TimeZone object");
				} else {
					message = FieldValidation.validateTimeZoneField(getModifyPortInRequest().getTimeZone().getValue());
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new WnpException(message.getStatus(),message.getMessage()+" Please check the ModifyPortInRequest.TimeZone.Value field");
					}
				}
				
				//Validate Postal Code
				message = FieldValidation.validateNullObject("ModifyPortInRequest.PostalCode", getModifyPortInRequest().getZip());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new WnpException(message.getStatus(),message.getMessage()+" Please check ModifyPortInRequest.Zip object");
				} else {
					message = FieldValidation.validateNullObject("ModifiyPortInRequest.PostalCode.Zip", getModifyPortInRequest().getZip().getUspsPostalCd());
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new WnpException(message.getStatus(), message.getMessage()+" Please check ModifyPortInRequest.Zip.UspsPostalCd");
					}
				}
				
				//Validate Remark
				message = FieldValidation.validateNullObject("ModifiyPortInRequest.Remarks", getModifyPortInRequest().getRemark());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new WnpException(message.getStatus(),message.getMessage()+" Please check ModifyPortInRequest.Remark field");
				}
				
				//Else we have a good request
				retValue = true;
			}
			
			
		}
		return retValue;
	}
	
	public boolean validatePortInSwapMdnRequest() throws WnpException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		String parent = "PortInSwapMdnRequest";
		
		message = FieldValidation.validateNullObject(parent, getPortInSwapMdnRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new WnpException(message.getStatus(),message.getMessage()+ " Please bind the "+parent+" object ");
		} else {
			//Validate the PortInfo object
			if( !validatePortObject(getPortInSwapMdnRequest().getPortInfo()) ) {
				throw new WnpException(parent+".PortInfo object failed PortInfo validation!!");			
			}
		
			//Validate the Old Mdn field
			message = FieldValidation.validateMDNField(getPortInSwapMdnRequest().getOldMdn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the "+parent+".OldMdn field");
			}
			
			//Validate the New Mdn Field
			message = FieldValidation.validateMDNField(getPortInSwapMdnRequest().getNewMdn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check the "+parent+".NewMdn field");
			}
			
			//We are left here with a valid request
			retValue = true;
		}
		
		return retValue;
	}
	
	public boolean validatePreValidatePortRequest() throws WnpException {
		boolean retValue = false; 
		ResponseMessage message = new ResponseMessage();
		String parent = "PreValidatePortRequest";
		//Validate the request object
		message = FieldValidation.validateNullObject(parent, getPreValidatePortRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new WnpException(message.getStatus(),message.getMessage()+" Please bind the "+parent+" object.");
		} else {
			//Validate the Mdn Field
			message = FieldValidation.validateMDNField(getPreValidatePortRequest().getMdn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check "+parent+".MDN field.");
			}
			
			//Validate the TimeZone object
			message = FieldValidation.validateNullObject(parent+".TimeZone", getPreValidatePortRequest().getTimeZone());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new WnpException(message.getStatus(),message.getMessage()+" Please check "+parent+".TimeZone object");
			} else {
				message = FieldValidation.validateTimeZoneField(getPreValidatePortRequest().getTimeZone().getValue());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new WnpException(message.getStatus(),message.getMessage()+" Please check "+parent+".TimeZone.Value field");
				}
			}
			
			//Otherwise we have a good request
			retValue = true;
		}
		return retValue;
	}
	
	public boolean validateQueryPendingResellerPortInsRequest() throws WnpException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		String parent = "QueryPendingResellerPortInsRequest";
		message = FieldValidation.validateNullObject(parent, getQueryPendingResellerPortInsRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new WnpException(message.getStatus(),message.getMessage()+" Please bind the "+parent+" object");
		} else {
			if( getQueryPendingResellerPortInsRequest().getPrevEndingAccessNbr() != null ) {
				message = FieldValidation.validateMDNField(getQueryPendingResellerPortInsRequest().getPrevEndingAccessNbr());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new WnpException(message.getStatus(),message.getMessage()+" Please check "+parent+".PrevEndingAccessNbr");
				}
			}
			retValue = true;
		}
		return retValue;
	}
	
	// [end] validation methods
	
	// [start] accessor methods
	
	/**
	 * This API provides the ability to port-in an access number and then add a new subscription with that
	 * access number to an existing MVNO liable account.
	 * <p>Wsdl name: WholesaleWnp.wsdl</p>
	 * <p>Imported Schemas: PortEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: ActivateSubscriptionWithPortIn</p>
	 * 
	 *  @throws WnpException
	 *  @return ActivateSubscriptionWithPortInReply
	 */
	public ActivateSubscriptionWithPortInReply activateSubscriptionWithPortIn() throws WnpException {
		String methodName = "activateSubscriptionWithPortIn";
		ActivateSubscriptionWithPortInReply subscriptionReply = new ActivateSubscriptionWithPortInReply();
		if( validateActivateSubscriptionWithPortInRequest() ) {
			try { 
				subscriptionReply = wnpBinding.activateSubscriptionWithPortIn(getActivateSubscriptionWithPortInRequest());
			} catch( ErrorDetailsType error ) {
				TSCPLogger.logError(CLASS_NAME, methodName, error);
				throw new WnpException(CLASS_NAME,methodName,error);
			} catch( Exception e) {
				throw new WnpException(e);
			}
		}
		return subscriptionReply;
	}
	
	/**
	 * This API provides the ability to cancel a port-in for a MVNO access number with a port-in that is in
	 * progress through an external system.
	 * <p>Wsdl name: WholesaleWnp.wsdl</p>
	 * <p>Imported Schemas: PortEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: CancelPort</p>
	 * 
	 * @return
	 * @throws WnpException
	 */
	public CancelPortReply cancelPort() throws WnpException {
		String methodName = "cancelPort";
		CancelPortReply cancelPort = new CancelPortReply();
		if( validateCancelPortRequest() ) {
			try {
				cancelPort = wnpBinding.cancelPort(getCancelPortRequest());
			} catch( ErrorDetailsType error ) {
				TSCPLogger.logError(CLASS_NAME, methodName, error);
				throw new WnpException(CLASS_NAME,methodName,error);
			} catch( Exception e ) {
				throw new WnpException(e);
			}
		}
		return cancelPort;
	}
	
	/**
	 * This API provides the ability to modify the requested due date and time for porting an access number for
	 * a MVNO subscription.
	 * <p>Wsdl name: WholesaleWnp.wsdl</p>
	 * <p>Imported Schemas: PortEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: ChangePortInDueDateTime</p>
	 * 
	 * @return
	 * @throws WnpException
	 */
	public ChangePortInDueDateTimeReply changePortInDueDateTime() throws WnpException {
		String methodName = "changePortinDueDateTime";
		ChangePortInDueDateTimeReply ddtReply = new ChangePortInDueDateTimeReply();
		if( validateChangePortInDueDateTimeRequest() ) {
			try { 
				ddtReply = wnpBinding.changePortInDueDateTime(getChangePortInDueDateTimeRequest());
			} catch( ErrorDetailsType error ) {
				TSCPLogger.logError(CLASS_NAME, methodName, error);
				throw new WnpException(CLASS_NAME,methodName,error);
			} catch ( Exception e ) {
				throw new WnpException(e);
			}
		}
		return ddtReply;
	}
	
	/**
	 * This API provides the ability to modify a port-in request for a MVNO access number with a port-in that
	 * is in progress through an external system.
	 * <p>Wsdl name: WholesaleWnp.wsdl</p>
	 * <p>Imported Schemas: PortEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: ModifyPortIn</p>
	 * 
	 * @return
	 * @throws WnpException
	 */
	public ModifyPortInReply modifyPortIn() throws WnpException {
		String methodName = "modifyPortIn";
		ModifyPortInReply modifiedPortIn = new ModifyPortInReply();
		if( validateModifyPortInRequest() ) {
			try {
				modifiedPortIn = wnpBinding.modifyPortIn(getModifyPortInRequest());
			} catch( ErrorDetailsType error ) {
				TSCPLogger.logError(CLASS_NAME, methodName, error);
				throw new WnpException(CLASS_NAME,methodName,error);
			} catch( Exception e ) {
				throw new WnpException(e);
			}
		}
		return modifiedPortIn;
	}
	
	/**
	 * This API provides the ability to port-in an access number and then swap that access number with the
	 * current access number on an existing MVNO subscription.
	 * <p>Wsdl name: WholesaleWnp.wsdl</p>
	 * <p>Imported Schemas: PortEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: PortInSwapMdn</p>
	 * 
	 * @return
	 * @throws WnpException
	 */
	public PortInSwapMdnReply portInSwapMdn() throws WnpException {
		String methodName = "portInSwapMdn";
		PortInSwapMdnReply portSwapMdn = new PortInSwapMdnReply();
		if( validatePortInSwapMdnRequest() ) {
			try { 
				portSwapMdn = wnpBinding.portInSwapMdn(getPortInSwapMdnRequest());
			} catch( ErrorDetailsType error ) {
				TSCPLogger.logError(CLASS_NAME, methodName, error);
				throw new WnpException(CLASS_NAME,methodName,error);
			} catch( Exception e ) {
				throw new WnpException(e);
			}
		}
		return portSwapMdn;
	}
	
	/**
	 * This API is used to initiate a pre-port validation of a MVNO mobile access number (MDN).
	 * <p>Wsdl name: WholesaleWnp.wsdlImported </p>
	 * <p>Schemas: PortEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: PreValidatePort</p>
	 * 
	 * @return
	 * @throws WnpException
	 */
	public PreValidatePortReply preValidatePort() throws WnpException {
		String methodName = "preValidatePort";
		PreValidatePortReply portValidation = new PreValidatePortReply();
		if( validatePreValidatePortRequest() ) {
			try {
				portValidation = wnpBinding.preValidatePort(getPreValidatePortRequest());
			} catch( ErrorDetailsType error ) {
				TSCPLogger.logError(CLASS_NAME, methodName, error);
				throw new WnpException(CLASS_NAME,methodName,error);
			} catch( Exception e ) {
				throw new WnpException(e);
			}
		}
		return portValidation;
	}
	
	/**
	 * This API provides the ability to request pending resller port-ins.
	 * <p>Wsdl name: WholesaleWnp.wsdl</p>
	 * <p>Imported Schemas: PortEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: QueryPendingResellerPortIns</p>
	 * 
	 * @return
	 * @throws WnpException
	 */
	public QueryPendingResellerPortInsReply queryPendingResellerPortIns() throws WnpException {
		String methodName = "getPendingPortInsForReseller";
		QueryPendingResellerPortInsReply pendingPortIns = new QueryPendingResellerPortInsReply();
		if( validateQueryPendingResellerPortInsRequest() ) {
			try {
				pendingPortIns = wnpBinding.queryPendingResellerPortIns(getQueryPendingResellerPortInsRequest());
			} catch( ErrorDetailsType error ) {
				TSCPLogger.logError(CLASS_NAME, methodName, error);
				throw new WnpException(CLASS_NAME,methodName,error);
			} catch( Exception e ) {
				throw new WnpException(e);
			}
		}
		return pendingPortIns;
	}
	
	/**
	 * Overloaded method allowing access to the next set of results based on the previous list
	 * <p>This method will bind a new instance of QueryPendingResellerPortInsRequest object</p>
	 * @param prevMdn
	 * @return
	 * @throws WnpException
	 */
	public QueryPendingResellerPortInsReply queryPendingResellerPortIns(String prevMdn) throws WnpException {
		QueryPendingResellerPortInsRequest pendingResellerPortIns = new QueryPendingResellerPortInsRequest();
		pendingResellerPortIns.setPrevEndingAccessNbr(prevMdn);
		setQueryPendingResellerPortInsRequest(pendingResellerPortIns);
		return queryPendingResellerPortIns();
	}
	
	// [end] accessor methods
	
	// [start] main method
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		String input = "";
		boolean running = true;
		while( running ) {
			if( args != null && args.length > 0 ) {
				System.out.println("Using Args[0] " + args[0]);
				input = args[0];
				running = false;
			} else {
				System.out.println("No args found!");
				genMenu();
				input = br.readLine();
			}
			if( input.equals("000") ) {
				System.out.println("Shutting down...");
				running = false;
			} else if( input.equals("001") ) {
				System.out.println("Testing ActivateSubscriptionWithPortIn");
				WnpClient wnpClient = new WnpClient();
				ActivateSubscriptionWithPortInRequest portRequest = new ActivateSubscriptionWithPortInRequest();
				ActivateSubscriptionWithPortInReply portReply = new ActivateSubscriptionWithPortInReply();
				portRequest.setPortInfo(populatePortInformation(br));
				portRequest.setSub(populateSubscriptionRequest(br));
				wnpClient.setActivateSubscriptionWithPortInRequest(portRequest);
				try { 
					portReply = wnpClient.activateSubscriptionWithPortIn(); 
					if( portReply == null ) {
						throw new WnpException("Port Reply is null!!");
					}
					PortResult portResult = new PortResult();
					portResult = portReply.getPortResult();
					System.out.println("PortResult.PortId             :: "+portResult.getPortId());
					System.out.println("PortResult.CSA                :: "+portResult.getPortCsa());
					System.out.println("PortResult.MDN                :: "+portResult.getMdn());
					System.out.println("PortResult.DesiredDueDateTime :: "+portResult.getDesiredDueDateTime().toString());
					Calendar myDueDateTime = portResult.getDesiredDueDateTime();
					if( myDueDateTime != null && myDueDateTime.getTime() != null ) {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
						System.out.println("PortResult.DDT(Altered)       :: "+sdf.format(myDueDateTime.getTime()));
											
					}
					System.out.println("PortResult.PortDirectionInd   :: "+portResult.getNumberPortabilityDirectionIndicator());
					System.out.println("PortResult.OldServiceProvider :: "+portResult.getOldServiceProvider());
					System.out.println("PortResult.PortInStatus       :: "+portResult.getPortInStatus());
					System.out.println("PortResult.PortInStatusText   :: "+portResult.getPortInStatusText());
					System.out.println("PortResult.PpvStatus          :: "+portResult.getPpvStatus());
					System.out.println("PortResult.PpvStatusText      :: "+portResult.getPpvStatusText());
				} catch ( WnpException wnp_ex ) {
					MainHelper.handleException(wnp_ex);
				}
			} else if( input.equals("002") ) {
				System.out.println("Testing Cancel Port");
				WnpClient wnpClient = new WnpClient();
				CancelPortRequest portRequest = new CancelPortRequest();
				CancelPortReply portReply = new CancelPortReply();
				portRequest.setMdn(MainHelper.populateRequiredField("MDN", br, portRequest.getMdn()));
				portRequest.setRemark(MainHelper.populateRequiredField("Remarks", br, portRequest.getRemark()));
				wnpClient.setCancelPortRequest(portRequest);
				try {
					portReply = wnpClient.cancelPort();
					if( portReply == null ) {
						throw new WnpException("Port Reply is null!!");
					}
					System.out.println("PortResult.CancelStatus       :: "+portReply.getCancelStatus());
					System.out.println("PortResult.CancelStatusText   :: "+portReply.getCancelStatusText());
				} catch( WnpException wnp_ex ) {
					MainHelper.handleException(wnp_ex);
				}
			} else if( input.equals("003") ) {
				System.out.println("Testing ChangePortInDueDateTime");
				WnpClient wnpClient = new WnpClient();
				ChangePortInDueDateTimeRequest portRequest = new ChangePortInDueDateTimeRequest();
				ChangePortInDueDateTimeReply portReply = new ChangePortInDueDateTimeReply();
				portRequest.setMdn(MainHelper.populateRequiredField("MDN", br, portRequest.getMdn()));
				portRequest.setPortId(MainHelper.populateRequiredField("PortId", br, portRequest.getPortId()));
				portRequest.setRemark(MainHelper.populateRequiredField("Remarks", br, portRequest.getRemark()));
				portRequest.setTimeZone(TimeZoneCode.fromString(MainHelper.populateRequiredField("TimeZone", br, "")));
				Calendar myCalendar = Calendar.getInstance();
				myCalendar.set(MainHelper.populateIntField("Year", br, 0), MainHelper.populateIntField("Month", br, 0),MainHelper.populateIntField("Date", br, 0));
				portRequest.setDesiredDueDateTime(myCalendar);
				try {
					wnpClient.setChangePortInDueDateTimeRequest(portRequest);
					portReply = wnpClient.changePortInDueDateTime();
					if( portReply == null ) {
						throw new WnpException("PortReply is null!!");
					}
					System.out.println("PortResult.PortId             :: "+portReply.getPortId());
					System.out.println("PortResult.Mdn                :: "+portReply.getMdn());
					System.out.println("PortResult.DesiredDueDateTime :: "+portReply.getDesiredDueDateTime().toString());
					System.out.println("PortResult.StatusCode         :: "+portReply.getStatusCode());
					System.out.println("PortResult.StatusText         :: "+portReply.getStatusText());
					System.out.println("PortResult.TimeZone.Value     :: "+portReply.getTimeZone().getValue());
				} catch( WnpException wnp_ex ) {
					MainHelper.handleException(wnp_ex);
				}
			} else if( input.equals("004") ) {
				System.out.println("Testing Modify PortIn");
				WnpClient wnpClient = new WnpClient();
				ModifyPortInRequest portRequest = new ModifyPortInRequest();
				ModifyPortInReply portReply = new ModifyPortInReply();
				portRequest.setAccountNumber(MainHelper.populateRequiredField("AccountNumber", br, portRequest.getAccountNumber()));
				portRequest.setMdn(MainHelper.populateRequiredField("MDN", br, portRequest.getMdn()));
				portRequest.setPasswordPin(MainHelper.populateRequiredField("PasswordPin", br, portRequest.getPasswordPin()));
				portRequest.setSsn(MainHelper.populateRequiredField("SSN", br, portRequest.getSsn()));
				portRequest.setTaxId(MainHelper.populateField("TaxId", br, portRequest.getTaxId()));
				portRequest.setRemark(MainHelper.populateRequiredField("Remark", br, portRequest.getRemark()));
				portRequest.setBillStreetNumber(MainHelper.populateRequiredField("BillStreetNumber", br, portRequest.getBillStreetNumber()));
				portRequest.setBillStreetDirectionIndicator(MainHelper.populateField("BillStreetDirectionIndicator", br, portRequest.getBillStreetDirectionIndicator()));
				portRequest.setBillStreetName(MainHelper.populateRequiredField("BillStreetName", br, portRequest.getBillStreetName()));
				portRequest.setBillCityName(MainHelper.populateRequiredField("BillCity", br, portRequest.getBillCityName()));
				portRequest.setBillStateCode(MainHelper.populateRequiredField("BillStateCode", br, portRequest.getBillStateCode()));
				portRequest.setZip(new PostalCode(MainHelper.populateRequiredField("ZipCode", br, ""),MainHelper.populateField("Zip+4", br, "")));
				portRequest.setTimeZone(TimeZoneCode.fromString(MainHelper.populateRequiredField("TimeZone", br, "")));
				wnpClient.setModifyPortInRequest(portRequest);
				try {
					portReply = wnpClient.modifyPortIn();
					if( portReply == null ) {
						throw new WnpException("Port Reply is null ");
					}
					System.out.println("PortResult.PortId             :: "+portReply.getPortId());
					System.out.println("PortResult.MDN                :: "+portReply.getMdn());
					System.out.println("PortResult.OldServiceProvider :: "+portReply.getOldServiceProvider());
					System.out.println("PortResult.StatusCode         :: "+portReply.getStatusCode());
					System.out.println("PortResult.StatusText         :: "+portReply.getStatusText());
					System.out.println("PortResult.DesiredDueDateTime :: "+portReply.getDesiredDueDateTime().toString());
					System.out.println("PortResult.TimeZone.Value     :: "+portReply.getTimeZone().getValue());
					
				} catch( WnpException wnp_ex ) {
					MainHelper.handleException(wnp_ex);
				}
			} else if( input.equals("005") ) {
				System.out.println("Testing PortInSwapMdn");
				WnpClient wnpClient = new WnpClient();
				PortInSwapMdnRequest portRequest = new PortInSwapMdnRequest();
				PortInSwapMdnReply portReply = new PortInSwapMdnReply();
				portRequest.setNewMdn(MainHelper.populateRequiredField("New MDN", br, portRequest.getNewMdn()));
				portRequest.setOldMdn(MainHelper.populateRequiredField("Old MDN", br, portRequest.getOldMdn()));
				portRequest.setPortInfo(populatePortInformation(br));
				wnpClient.setPortInSwapMdnRequest(portRequest);
				try { 
					portReply = wnpClient.portInSwapMdn();
					if( portReply == null ) {
						throw new WnpException("Port reply is null!!");
					}
					System.out.println("PortReply.NewMdn              :: "+portReply.getNewMdn());
					System.out.println("PortReply.Msid                :: "+portReply.getMsid());
					PortResult portResult = portReply.getPortResult();
					if( portResult != null ) {
						System.out.println("PortResult.PortId             :: "+portResult.getPortId());
						System.out.println("PortResult.CSA                :: "+portResult.getPortCsa());
						System.out.println("PortResult.MDN                :: "+portResult.getMdn());
						System.out.println("PortResult.DesiredDueDateTime :: "+portResult.getDesiredDueDateTime().toString());
						System.out.println("PortResult.PortDirectionInd   :: "+portResult.getNumberPortabilityDirectionIndicator());
						System.out.println("PortResult.OldServiceProvider :: "+portResult.getOldServiceProvider());
						System.out.println("PortResult.PortInStatus       :: "+portResult.getPortInStatus());
						System.out.println("PortResult.PortInStatusText   :: "+portResult.getPortInStatusText());
						System.out.println("PortResult.PpvStatus          :: "+portResult.getPpvStatus());
						System.out.println("PortResult.PpvStatusText      :: "+portResult.getPpvStatusText());
					}
				} catch( WnpException wnp_ex ) {
					MainHelper.handleException(wnp_ex);
				}
			} else if( input.equals("006") ) {
				System.out.println("Testing PreValidatePort");
				WnpClient wnpClient = new WnpClient();
				PreValidatePortRequest portRequest = new PreValidatePortRequest();
				PreValidatePortReply portReply = new PreValidatePortReply();
				portRequest.setMdn(MainHelper.populateRequiredField("MDN", br, portRequest.getMdn()));
				portRequest.setTimeZone(TimeZoneCode.fromString(MainHelper.populateRequiredField("TimeZone", br, "")));
				wnpClient.setPreValidatePortRequest(portRequest);
				try {
					portReply = wnpClient.preValidatePort();
					if( portReply == null ) {
						throw new WnpException("Port Reply is null!!");
					}
					System.out.println("PortReply.PortCsa             :: "+portReply.getPortCsa());
					System.out.println("PortReply.PortId              :: "+portReply.getPortId());
					System.out.println("PortReply.Mdn                 :: "+portReply.getMdn());
					System.out.println("PortReply.OldServiceProvider  :: "+portReply.getOldServiceProvider());
					System.out.println("PortReply.PortDirectionInd    :: "+portReply.getNumberPortabilityDirectionIndicator());
					System.out.println("PortReply.DesiredDueDateTime  :: "+portReply.getDesiredDueDateTime().toString());
					Calendar myCalendar = portReply.getDesiredDueDateTime();
					if( myCalendar != null && myCalendar.getTime() != null ) {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
						System.out.println("PortReply.DDT(Altered)        :: "+sdf.format(myCalendar.getTime()));
					}
					System.out.println("PortReply.PortInStatus        :: "+portReply.getPortInStatus());
					System.out.println("PortReply.PortInStatusText    :: "+portReply.getPortInStatusText());
					System.out.println("PortReply.PpvStatus           :: "+portReply.getPpvStatus());
					System.out.println("PortReply.PpvStatusText       :: "+portReply.getPpvStatusText());
				} catch ( WnpException wnp_ex ) {
					wnp_ex.printStackTrace();
					MainHelper.handleException(wnp_ex);
					if( wnp_ex.getWsError()!= null) {
						System.out.println("**** API errorCode :: "+wnp_ex.getWsError().getProviderError().getProviderErrorCode());
						System.out.println("**** API errorText :: "+wnp_ex.getWsError().getProviderError().getProviderErrorText());
					}
				}
			} else if( input.equals("007" ) ) {
				System.out.println("Testing QueryPendingResellerPortIns");
		    	String currentSaxDriver = System.getProperty("org.xml.sax.driver");
		    	System.out.println("Current SAX Driver: "+currentSaxDriver);
		    	//org.xml.sax.helpers.XMLReaderFactory
		    	System.setProperty("org.xml.sax.driver","org.apache.xerces.jaxp.SAXParserFactoryImpl");
		    	//System.setProperty("org.xml.sax.driver", "org.apache.xerces.parser.SAXParser");
		    	//System.setProperty("org.xml.sax.driver", "org.xml.sax.Parser");
				WnpClient wnpClient = new WnpClient();
				QueryPendingResellerPortInsRequest portRequest = new QueryPendingResellerPortInsRequest();
				QueryPendingResellerPortInsReply portReply = new QueryPendingResellerPortInsReply();
				portRequest.setPrevEndingAccessNbr(MainHelper.populateField("Previous MDN", br, portRequest.getPrevEndingAccessNbr()));
				wnpClient.setQueryPendingResellerPortInsRequest(portRequest);
				try {
					portReply = wnpClient.queryPendingResellerPortIns();
					if( portReply == null ) {
						throw new WnpException("Port Reply is null!");
					}
					PendingPortInResult[] accessNumberList = portReply.getAccessNumberList();
					System.out.println("PortReply.NbrList Record Count:: "+portReply.getAccessNumberList().length);
					System.out.println("PortReply.MorePendingPortIns  :: "+portReply.getAreMorePendingPortIns());
					for( int i = 0; i < accessNumberList.length; i++ ) {
						System.out.println("PortReply.NbrList.MDN         :: "+accessNumberList[i].getAccessNumber());
						System.out.println("PortReply.NbrList.PortStatus  :: "+accessNumberList[i].getPortStatus());
						if( accessNumberList[i].getPortDueDate() != null ) {
							System.out.println("PortReply.NbrList.DueDate     :: "+accessNumberList[i].getPortDueDate().toString());
						}
						if( i == accessNumberList.length - 1 && portReply.getAreMorePendingPortIns().getValue().equalsIgnoreCase("TRUE") ) {
							System.out.println("More PendingPortIns Exists...Please use MDN::"+accessNumberList[i].getAccessNumber()+" to retrieve the next list.");							
						}
					}
				} catch ( WnpException wnp_ex ) {
					wnp_ex.printStackTrace();
					MainHelper.handleException(wnp_ex);
				}
		    	if( currentSaxDriver == null ) {
		    		System.out.println("Removing Sax Driver from properties");
		    		System.getProperties().remove("org.xml.sax.driver");
		    	} else {
		    		System.out.println("Restoring Sax Driver to "+currentSaxDriver);
		    		System.setProperty("org.xml.sax.driver", currentSaxDriver);
		    	}
			} else if( input.equals("999") ) {
				System.out.println("Testing PreValidatePort");
				WnpClient wnpClient = new WnpClient();
				PreValidatePortRequest portRequest = new PreValidatePortRequest();
				PreValidatePortReply portReply = new PreValidatePortReply();
				portRequest.setMdn(args[1]);
				portRequest.setTimeZone(TimeZoneCode.fromString(args[2]));
				wnpClient.setPreValidatePortRequest(portRequest);
				try {
					System.out.println("PortRequest.Mdn               :: "+portRequest.getMdn());
					System.out.println("PortRequest.TimeZone          :: "+portRequest.getTimeZone().getValue());
					System.out.println();
					portReply = wnpClient.preValidatePort();
					if( portReply == null ) {
						throw new WnpException("Port Reply is null!!");
					}
					System.out.println("PortReply.PortCsa             :: "+portReply.getPortCsa());
					System.out.println("PortReply.PortId              :: "+portReply.getPortId());
					System.out.println("PortReply.Mdn                 :: "+portReply.getMdn());
					System.out.println("PortReply.OldServiceProvider  :: "+portReply.getOldServiceProvider());
					System.out.println("PortReply.PortDirectionInd    :: "+portReply.getNumberPortabilityDirectionIndicator());
					System.out.println("PortReply.DesiredDueDateTime  :: "+portReply.getDesiredDueDateTime().toString());
					System.out.println("PortReply.PortInStatus        :: "+portReply.getPortInStatus());
					System.out.println("PortReply.PortInStatusText    :: "+portReply.getPortInStatusText());
					System.out.println("PortReply.PpvStatus           :: "+portReply.getPpvStatus());
					System.out.println("PortReply.PpvStatusText       :: "+portReply.getPpvStatusText());
				} catch ( WnpException wnp_ex ) {
					wnp_ex.printStackTrace();
					MainHelper.handleException(wnp_ex);
				}
			} else {
				System.out.println("Unknown command!");
			}
		}
		/*ResponseMessage message = new ResponseMessage();
		String mySSN = "213-33-2212";
		message = FieldValidation.validateSSNField(mySSN);
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			System.out.println("ResponseMessage.Status          :: "+message.getStatus());
			System.out.println("ResponseMessage.Message         :: "+message.getMessage());
			System.exit(0);
		}
		
		loadProps();
		System.out.println("URL::"+System.getProperty("url"));
		System.out.println("JAVA_HOME::"+System.getProperty("java_home"));
	    proxyURL = (props.getProperty("URL") != null && props.getProperty("URL").trim().length() > 0) ? props.getProperty("URL") : System.getProperty("url");

	    EngineConfiguration config = null;

	    if (System.getProperty("client.deploy.file.location") != null) {
			config = new FileProvider(System.getProperty("client.deploy.file.location"));
		}
	    WholesaleWnpServiceLocator wnpService = new WholesaleWnpServiceLocator(config);
	    try {
	    	WholesaleWnpPortType wnpPort = wnpService.getWholesaleWnpPort(new URL(proxyURL));
	    	wnpPort.activateSubscriptionWithPortIn(new ActivateSubscriptionWithPortInRequest());
	    	wnpPort.cancelPort(new CancelPortRequest());
	    	wnpPort.changePortInDueDateTime(new ChangePortInDueDateTimeRequest());
	    	wnpPort.modifyPortIn(new ModifyPortInRequest());
	    	wnpPort.portInSwapMdn(new PortInSwapMdnRequest());
	    	wnpPort.preValidatePort(new PreValidatePortRequest() );
	    	wnpPort.queryPendingResellerPortIns(new QueryPendingResellerPortInsRequest() );
	    	
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
		System.out.println("**** **** Exit System                     :: 000 **** ****");
		System.out.println("**** **** ActivateSubscriptionWithPortIn  :: 001 **** ****");
		System.out.println("**** **** Cancel Port                     :: 002 **** ****");
		System.out.println("**** **** ChangePortInDueDateTime         :: 003 **** ****");
		System.out.println("**** **** ModifyPortIn                    :: 004 **** ****");
		System.out.println("**** **** PortInSwapMdn                   :: 005 **** ****");
		System.out.println("**** **** PreValidatePort                 :: 006 **** ****");
		System.out.println("**** **** QueryPendingResellerPortIns     :: 007 **** ****");
	}
	
	private static PortInformation populatePortInformation(BufferedReader br) {
		PortInformation portInfo = new PortInformation();
		portInfo.setAccountNumber(MainHelper.populateRequiredField("AccountNumber",br,portInfo.getAccountNumber()));
		portInfo.setAuthorizedBy(MainHelper.populateRequiredField("Authorized By", br, portInfo.getAuthorizedBy()));
		portInfo.setBillFirstName(MainHelper.populateRequiredField("Bill FirstName", br, portInfo.getBillFirstName()));
		portInfo.setBillLastName(MainHelper.populateRequiredField("Bill LastName", br, portInfo.getBillLastName()));
		portInfo.setBillStreetNumber(MainHelper.populateRequiredField("BillStreetNumber", br, portInfo.getBillStreetNumber()));
		portInfo.setBillStreetDirectionIndicator(MainHelper.populateField("BillStreetDirectionIndicator", br, portInfo.getBillStreetDirectionIndicator()));
		portInfo.setBillStreetName(MainHelper.populateRequiredField("BillStreetName", br, portInfo.getBillStreetName()));
		portInfo.setBillCityName(MainHelper.populateRequiredField("Bill City", br, portInfo.getBillCityName()));
		portInfo.setBillStateCode(MainHelper.populateRequiredField("Bill State Code", br, portInfo.getBillStateCode()));
		portInfo.setZip(new PostalCode(MainHelper.populateRequiredField("Bill ZipCode", br, ""),MainHelper.populateField("Bill Zip+4", br, "")));
		portInfo.setBusinessName(MainHelper.populateField("Business Name", br, portInfo.getBusinessName()));
		portInfo.setMdn(MainHelper.populateField("MDN", br, portInfo.getMdn()));
		portInfo.setPasswordPin(MainHelper.populateRequiredField("PasswordPin", br, portInfo.getPasswordPin()));
		portInfo.setTaxId(MainHelper.populateField("TaxId", br, portInfo.getTaxId()));
		portInfo.setSsn(MainHelper.populateRequiredField("SSN", br, portInfo.getSsn()));
		portInfo.setTimeZone(TimeZoneCode.fromString(MainHelper.populateRequiredField("TimeZone", br, "")));
		return portInfo;
	}
	
	private static SubscriptionRequest populateSubscriptionRequest(BufferedReader br) {
		SubscriptionRequest subRequest = new SubscriptionRequest();
		subRequest.setCsa(MainHelper.populateRequiredField("CSA", br, subRequest.getCsa()));
		subRequest.setEsn(new SerialNumber( new ElectronicSerialNumber(MainHelper.populateRequiredField("ESN", br, ""),null),null));
		subRequest.setMdn(MainHelper.populateRequiredField("MDN", br, subRequest.getMdn()));
		subRequest.setPricePlan(new ProductDeployment(MainHelper.populateRequiredField("PricePlan.SocCode", br, ""),new java.util.Date(),null,null));
		subRequest.setServiceList(populateServiceList(br,false));
				
		return subRequest;
	}
	
	private static ProductDeployment[] populateServiceList(BufferedReader br, boolean oldServiceList) {
		Vector<ProductDeployment> productDeploymentList = new Vector<ProductDeployment>();
		boolean addMore = true;
		String input = "";
		System.out.println("Please add a service");
		try {
		while( addMore ) {
			ProductDeployment productDeployment = new ProductDeployment();	
			productDeployment.setServiceCode(MainHelper.populateRequiredField("ServiceCode", br, productDeployment.getServiceCode()));
			//productDeployment.setCallForwardingNumber(MainHelper.populateField("Call Forwarding Number", br, productDeployment.getCallForwardingNumber()));
			if( oldServiceList ) {
				productDeployment.setServiceExpirationDate(new java.util.Date());
			}
			productDeploymentList.add(productDeployment);
			System.out.println("Would you like to add another service?");
			input = br.readLine();
			if( input.substring(0,1).equalsIgnoreCase("Y") ) {
				addMore = true;
			} else {
				addMore = false;
			}
		}
		} catch ( Exception e ) {
			e.printStackTrace();
			System.exit(0);
		}
		ProductDeployment[] productDeploymentArray = new ProductDeployment[productDeploymentList.size()];
		for( int i = 0; i< productDeploymentList.size(); i++ ) {
			productDeploymentArray[i] = (ProductDeployment)productDeploymentList.get(i);
		}
		return productDeploymentArray;
	}
	
	// [end] main method
}
