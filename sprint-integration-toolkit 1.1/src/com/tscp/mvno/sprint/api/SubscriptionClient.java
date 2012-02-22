package com.tscp.mvno.sprint.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;
import java.util.Vector;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
import com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionBindingStub;
import com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionPortType;
import com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl.WholesaleSubscriptionServiceLocator;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivatePendingSubscriptionReply;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivatePendingSubscriptionRequest;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionMsidReply;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionMsidRequest;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaReply;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaRequest;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaWithRsvIdReply;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaWithRsvIdRequest;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionReply;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionRequest;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionWithRsvIdReply;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionWithRsvIdRequest;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ElectronicSerialNumber;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.MobileEquipmentIdentifier;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ProductDeployment;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeNpaReply;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeNpaRequest;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeReply;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeRequest;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionNpaReply;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionNpaRequest;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionReply;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionRequest;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionWithRsvIdReply;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionWithRsvIdRequest;
import com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.SerialNumber;
import com.tscp.mvno.exception.PendingSubscriptionException;
import com.tscp.mvno.support.FieldValidation;
import com.tscp.mvno.support.MainHelper;
import com.tscp.mvno.support.ResponseMessage;
import com.tscp.mvno.support.SprintHeader;
import com.tscp.mvno.support.TSCPLogger;


public class SubscriptionClient {

	// [start] members
	
	public static final String CLASS_NAME = "SubscriptionClient";
	public static final String URL = "wholesale.subscription.service.location.url"; //Props file name for Subscription Service
	public static String inputPropertyFile = "client.properties";
	public static String proxyURL = "http://localhost:2222";  // WS End Point URL
	private static Properties props;
	
	private WholesaleSubscriptionServiceLocator 	subscriptionService;
	private WholesaleSubscriptionPortType 			subscriptionPort;
	private WholesaleSubscriptionBindingStub		subscriptionBinding;
	
	private ActivatePendingSubscriptionRequest 		activatePendingSubscriptionRequest;
	private	ActivatePendingSubscriptionReply		activatePendingSubscriptionReply;
	private ActivateSubscriptionRequest 			activateSubscriptionRequest;
	private ActivateSubscriptionReply				activateSubscriptionReply;
	private ActivateSubscriptionMsidRequest			activateSubscriptionMsidRequest;
	private ActivateSubscriptionMsidReply			activateSubscriptionMsidReply;
	private ActivateSubscriptionNpaRequest			activateSubscriptionNpaRequest;
	private ActivateSubscriptionNpaReply			activateSubscriptionNpaReply;
	private ActivateSubscriptionNpaWithRsvIdRequest activateSubscriptionNpaWithRsvIdRequest;
	private ActivateSubscriptionNpaWithRsvIdReply	activateSubscriptionNpaWithRsvIdReply;
	private ActivateSubscriptionWithRsvIdRequest	activateSubscriptionWithRsvIdRequest;
	private ActivateSubscriptionWithRsvIdReply		activateSubscriptionWithRsvIdReply;
	
	private ReserveSubscriptionRequest				reserveSubscriptionRequest;
	private ReserveSubscriptionGeoCodeRequest		reserveSubscriptionGeoCodeRequest;
	private ReserveSubscriptionGeoCodeNpaRequest	reserveSubscriptionGeoCodeNpaRequest;
	private ReserveSubscriptionNpaRequest			reserveSubscriptionNpaRequest;
	private ReserveSubscriptionWithRsvIdRequest		reserveSubscriptionWithRsvId;
	
	private SprintHeader 	header;
	private String 			userName;
	private String 			orderId;

	// [end] members
	
	// [start] constructors
	
	public SubscriptionClient() throws PendingSubscriptionException {
		this("tscp","0000");		
	}
	
	public SubscriptionClient( String userName, String orderId ) throws PendingSubscriptionException {
		loadProps();
	    proxyURL = (props.getProperty(SubscriptionClient.URL) != null && props.getProperty(SubscriptionClient.URL).trim().length() > 0) ? props.getProperty(SubscriptionClient.URL) : System.getProperty("url");

	    EngineConfiguration config = null;

	    if (System.getProperty("client.deploy.file.location") != null) {
			config = new FileProvider(System.getProperty("client.deploy.file.location"));
		}
	    subscriptionService = new WholesaleSubscriptionServiceLocator(config);	
	    try {
	    	subscriptionBinding = (WholesaleSubscriptionBindingStub)subscriptionService.getWholesaleSubscriptionPort(new URL(proxyURL));
	    } catch (Exception e) {
	    	throw new PendingSubscriptionException(e);
	    }
	    setUserName(userName);
	    setOrderId(orderId);
	    header = new SprintHeader(getUserName(),getOrderId());
	    subscriptionBinding.setHeader(header.getHeader());
	    subscriptionBinding.setTimeout(header.getTimeOut());
	    subscriptionBinding.setUsername(header.getBindingUserName());
	    subscriptionBinding.setPassword(header.getBindingPassword());
	}
	
	
	public SubscriptionClient(ActivatePendingSubscriptionRequest activatePendingSubscriptionRequest) throws PendingSubscriptionException {
		this();
		setActivatePendingSubscriptionReply(activatePendingSubscriptionReply);
	}
	
	// [end] constructors
	
	// [start] get methods

	public String getOrderId() {
		return orderId;
	}

	public String getUserName() {
		return userName;
	}

	public ActivatePendingSubscriptionReply getActivatePendingSubscriptionReply() {
		return activatePendingSubscriptionReply;
	}

	public ActivatePendingSubscriptionRequest getActivatePendingSubscriptionRequest() {
		return activatePendingSubscriptionRequest;
	}

	public ActivateSubscriptionMsidReply getActivateSubscriptionMsidReply() {
		return activateSubscriptionMsidReply;
	}

	public ActivateSubscriptionMsidRequest getActivateSubscriptionMsidRequest() {
		return activateSubscriptionMsidRequest;
	}

	public ActivateSubscriptionNpaReply getActivateSubscriptionNpaReply() {
		return activateSubscriptionNpaReply;
	}

	public ActivateSubscriptionNpaRequest getActivateSubscriptionNpaRequest() {
		return activateSubscriptionNpaRequest;
	}

	public ActivateSubscriptionNpaWithRsvIdReply getActivateSubscriptionNpaWithRsvIdReply() {
		return activateSubscriptionNpaWithRsvIdReply;
	}

	public ActivateSubscriptionNpaWithRsvIdRequest getActivateSubscriptionNpaWithRsvIdRequest() {
		return activateSubscriptionNpaWithRsvIdRequest;
	}

	public ActivateSubscriptionReply getActivateSubscriptionReply() {
		return activateSubscriptionReply;
	}

	public ActivateSubscriptionRequest getActivateSubscriptionRequest() {
		return activateSubscriptionRequest;
	}

	public ActivateSubscriptionWithRsvIdReply getActivateSubscriptionWithRsvIdReply() {
		return activateSubscriptionWithRsvIdReply;
	}

	public ActivateSubscriptionWithRsvIdRequest getActivateSubscriptionWithRsvIdRequest() {
		return activateSubscriptionWithRsvIdRequest;
	}

	public ReserveSubscriptionGeoCodeNpaRequest getReserveSubscriptionGeoCodeNpaRequest() {
		return reserveSubscriptionGeoCodeNpaRequest;
	}

	public ReserveSubscriptionGeoCodeRequest getReserveSubscriptionGeoCodeRequest() {
		return reserveSubscriptionGeoCodeRequest;
	}

	public ReserveSubscriptionNpaRequest getReserveSubscriptionNpaRequest() {
		return reserveSubscriptionNpaRequest;
	}

	public ReserveSubscriptionRequest getReserveSubscriptionRequest() {
		return reserveSubscriptionRequest;
	}

	public ReserveSubscriptionWithRsvIdRequest getReserveSubscriptionWithRsvId() {
		return reserveSubscriptionWithRsvId;
	}
	
	// [end] get Methods
	
	// [start] set Methods

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setActivatePendingSubscriptionReply(
			ActivatePendingSubscriptionReply activatePendingSubscriptionReply) {
		this.activatePendingSubscriptionReply = activatePendingSubscriptionReply;
	}

	public void setActivatePendingSubscriptionRequest(
			ActivatePendingSubscriptionRequest activatePendingSubscriptionRequest) {
		this.activatePendingSubscriptionRequest = activatePendingSubscriptionRequest;
	}

	public void setActivateSubscriptionMsidReply(
			ActivateSubscriptionMsidReply activateSubscriptionMsidReply) {
		this.activateSubscriptionMsidReply = activateSubscriptionMsidReply;
	}

	public void setActivateSubscriptionMsidRequest(
			ActivateSubscriptionMsidRequest activateSubscriptionMsidRequest) {
		this.activateSubscriptionMsidRequest = activateSubscriptionMsidRequest;
	}

	public void setActivateSubscriptionNpaReply(
			ActivateSubscriptionNpaReply activateSubscriptionNpaReply) {
		this.activateSubscriptionNpaReply = activateSubscriptionNpaReply;
	}

	public void setActivateSubscriptionNpaRequest(
			ActivateSubscriptionNpaRequest activateSubscriptionNpaRequest) {
		this.activateSubscriptionNpaRequest = activateSubscriptionNpaRequest;
	}

	public void setActivateSubscriptionNpaWithRsvIdReply(
			ActivateSubscriptionNpaWithRsvIdReply activateSubscriptionNpaWithRsvIdReply) {
		this.activateSubscriptionNpaWithRsvIdReply = activateSubscriptionNpaWithRsvIdReply;
	}

	public void setActivateSubscriptionNpaWithRsvIdRequest(
			ActivateSubscriptionNpaWithRsvIdRequest activateSubscriptionNpaWithRsvIdRequest) {
		this.activateSubscriptionNpaWithRsvIdRequest = activateSubscriptionNpaWithRsvIdRequest;
	}

	public void setActivateSubscriptionReply(
			ActivateSubscriptionReply activateSubscriptionReply) {
		this.activateSubscriptionReply = activateSubscriptionReply;
	}

	public void setActivateSubscriptionRequest(
			ActivateSubscriptionRequest activateSubscriptionRequest) {
		this.activateSubscriptionRequest = activateSubscriptionRequest;
	}

	public void setActivateSubscriptionWithRsvIdReply(
			ActivateSubscriptionWithRsvIdReply activateSubscriptionWithRsvIdReply) {
		this.activateSubscriptionWithRsvIdReply = activateSubscriptionWithRsvIdReply;
	}

	public void setActivateSubscriptionWithRsvIdRequest(
			ActivateSubscriptionWithRsvIdRequest activateSubscriptionWithRsvIdReqeust) {
		this.activateSubscriptionWithRsvIdRequest = activateSubscriptionWithRsvIdReqeust;
	}

	public void setReserveSubscriptionGeoCodeNpaRequest(
			ReserveSubscriptionGeoCodeNpaRequest reserveSubscriptionGeoCodeNpaRequest) {
		this.reserveSubscriptionGeoCodeNpaRequest = reserveSubscriptionGeoCodeNpaRequest;
	}

	public void setReserveSubscriptionGeoCodeRequest(
			ReserveSubscriptionGeoCodeRequest reserveSubscriptionGeoCodeRequest) {
		this.reserveSubscriptionGeoCodeRequest = reserveSubscriptionGeoCodeRequest;
	}

	public void setReserveSubscriptionNpaRequest(
			ReserveSubscriptionNpaRequest reserveSubscriptionNpaRequest) {
		this.reserveSubscriptionNpaRequest = reserveSubscriptionNpaRequest;
	}

	public void setReserveSubscriptionRequest(
			ReserveSubscriptionRequest reserveSubscriptionRequest) {
		this.reserveSubscriptionRequest = reserveSubscriptionRequest;
	}

	public void setReserveSubscriptionWithRsvId(
			ReserveSubscriptionWithRsvIdRequest reserveSubscriptionWithRsvId) {
		this.reserveSubscriptionWithRsvId = reserveSubscriptionWithRsvId;
	}
	
	// [end] set methods
	
	// [start] validation methods
	
	public boolean validateActivatePendingSubscriptionRequest() throws PendingSubscriptionException {
		boolean retValue = false;
		ResponseMessage response = FieldValidation.validateNullObject("ActivatePendingSubscriptionRequest", getActivatePendingSubscriptionRequest() );
		if( response.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new PendingSubscriptionException(response.getStatus(),response.getMessage()+" Please bind the request prior to continuing.");		
		} else {
			ActivatePendingSubscriptionRequest lSub = getActivatePendingSubscriptionRequest();
			response = FieldValidation.validateMDNField(lSub.getMdn());
			if( response.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(response.getStatus(),response.getMessage()+" MDN is not found in ActivatePendingSubscription object!");
			}
			
			response = FieldValidation.validateNullObject("ESN", lSub.getEsn());
			if( response.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(response.getStatus(),response.getMessage()+" ESN is not found in ActivatePendingSubscription object!");					
			}
			retValue = true;
		}
		return retValue;
	}
	
	public boolean validateActivateSubscriptionWithRsvId() throws PendingSubscriptionException {
		boolean retValue = false;
		ResponseMessage response = FieldValidation.validateNullObject("ActivateSubscriptionWithRsvIdRequest",getActivateSubscriptionWithRsvIdRequest());
		
		//Validate the ActivateSubscriptionWithRsvId object to be bound
		if( response.getStatus().equalsIgnoreCase("FAIL") ) {
			throw new PendingSubscriptionException(response.getStatus(),response.getMessage()+" Please bind the ActivateSubscriptionWithRsvIdRequest object");
		} else {		
			//Validate that the ESN field is bound in the ActivateSubscriptionWithRsvIdRequest
			response = FieldValidation.validateNullObject("ESN",getActivateSubscriptionWithRsvIdRequest().getEsn());
			if( response.getStatus().equalsIgnoreCase("FAIL") ) {
				throw new PendingSubscriptionException(response.getStatus(),response.getMessage()+" ActivateSubscriptionWithRsvIdRequest must have ESN populated.");
			}
			retValue = true;
		} 
		return retValue;
	}
	
	public boolean validateActivateSubscriptionNpa() throws PendingSubscriptionException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		
		//Validate that the request object is bound.
		message = FieldValidation.validateNullObject("ActivateSubscriptioNpaRequest", getActivateSubscriptionNpaRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please bind the ActivateSubscriptionNpaRequest object.");
		} else {
			//Validate the CSA
			message = FieldValidation.validateCsaField(getActivateSubscriptionNpaRequest().getCsa());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please Check the CSA associated with this ActivateSubscriptionNpa Request");
			}

			//Validate that the ESN field is bound in the ActivateSubscriptionWithRsvIdRequest
			message = FieldValidation.validateNullObject("ESN",getActivateSubscriptionNpaRequest().getEsn());
			if( message.getStatus().equalsIgnoreCase("FAIL") ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" ActivateSubscriptionNpaRequest must have ESN populated.");
			}
			
			//Validate the Price Plan
			message = FieldValidation.validateNullObject("ActivateSubscriptionNpaRequest PricePlan", getActivateSubscriptionNpaRequest().getPricePlan());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please bind the Price Plan for this Activation");
			} else {
				//Validate the PricePlan's Service Code
				message = FieldValidation.validateNullObject("ReserveSubscriptionRequest PricePlan.Code", getActivateSubscriptionNpaRequest().getPricePlan().getServiceCode());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please populate the priceplan's soccode");
				}
			}
			
			retValue = true;
			
		}
		
		return retValue;
	}
	
	public boolean validateReserveSubscriptionRequest() throws PendingSubscriptionException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		message = FieldValidation.validateNullObject("ReserveSubscriptionRequest", getReserveSubscriptionRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please bind the ReserveSubscriptionRequest object.");
		} else {
			//Validate the CSA
			message = FieldValidation.validateCsaField(getReserveSubscriptionRequest().getCsa());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please Check the CSA associated with this Reservation");
			}
			
			//Validate the Price Plan
			message = FieldValidation.validateNullObject("ReserveSubscriptionRequest PricePlan", getReserveSubscriptionRequest().getPricePlan());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please bind the Price Plan for this Reservation");
			} else {
				//Validate the PricePlan's Service Code
				message = FieldValidation.validateNullObject("ReserveSubscriptionRequest PricePlan.Code", getReserveSubscriptionRequest().getPricePlan().getServiceCode());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please populate the priceplan's soccode");
				}
			}
			
			//Validate the Service List
			//message = FieldValidation.validateNullObject("ReserveSubscriptionRequest Service List", getReserveSubscriptionRequest().getServiceList());
			//if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			//	throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please bind the Service List to the Reservation Request");
			//} 
			if( getReserveSubscriptionRequest().getServiceList() != null ) { //else {
				ProductDeployment[] serviceList = getReserveSubscriptionRequest().getServiceList();
				
				//iterate through each soc and confirm that a soc code exists
				for( int i = 0; i < serviceList.length; i++ ) {
					message = FieldValidation.validateNullObject("Feature list at index["+i+"]", serviceList[i]);
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please check the services list");
					}
					
					message = FieldValidation.validateNullObject("Feature list at index["+i+"]", serviceList[i].getServiceCode());
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please check the services list");
					}
				}
			}
			
			//after passing each individual if block, the only result is a good request
			retValue = true;
		}
		return retValue;
	}
	
	public boolean validateReserveSubscriptionNpaRequest() throws PendingSubscriptionException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		message = FieldValidation.validateNullObject("ReserveSubscripitonNpaRequest", getReserveSubscriptionNpaRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please bind the ReserveSubscripitonNpaRequest Object");
		} else {
			//Validate the CSA
			message = FieldValidation.validateCsaField(getReserveSubscriptionNpaRequest().getCsa());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please Check the CSA associated with this Reservation");
			}
			
			//Validate the Price Plan
			message = FieldValidation.validateNullObject("ReserveSubscriptionRequest PricePlan", getReserveSubscriptionNpaRequest().getPricePlan());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please bind the Price Plan for this Reservation");
			} else {
				//Validate the PricePlan's Service Code
				message = FieldValidation.validateNullObject("ReserveSubscriptionRequest PricePlan.Code", getReserveSubscriptionNpaRequest().getPricePlan().getServiceCode());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please populate the priceplan's soccode");
				}
			}
			
			//Validate the Service List
			/*message = FieldValidation.validateNullObject("ReserveSubscriptionRequest Service List", getReserveSubscriptionNpaRequest().getServiceList());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please bind the Service List to the Reservation Request");
			} else {*/
			if( getReserveSubscriptionNpaRequest().getServiceList() != null ) {
				ProductDeployment[] serviceList = getReserveSubscriptionNpaRequest().getServiceList();
				
				//iterate through each soc and confirm that a soc code exists
				for( int i = 0; i < serviceList.length; i++ ) {
					message = FieldValidation.validateNullObject("Feature list at index["+i+"]", serviceList[i]);
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please check the services list");
					}
					
					message = FieldValidation.validateNullObject("Feature list at index["+i+"]", serviceList[i].getServiceCode());
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please check the services list");
					}
				}
			}
			
			//after passing each individual if block, the only result is a good request
			retValue = true;
		}
		return retValue;
	}
	
	public boolean validateReserveSubscriptionWithRsvIdRequest() throws PendingSubscriptionException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		message = FieldValidation.validateNullObject("ReserveSubscriptionRequest", getReserveSubscriptionWithRsvId());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please bind the ReserveSubscriptionRequest object.");
		} else {
			//Validate the ResId
			message = FieldValidation.validateNullObject("ReserveSubscriptionRequest ResID", getReserveSubscriptionWithRsvId().getReserveMdnId());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please Check the ReservationID associated with this Reservation");
			}
			
			//Validate the CSA
			message = FieldValidation.validateCsaField(getReserveSubscriptionWithRsvId().getCsa());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please Check the CSA associated with this Reservation");
			}
			
			//Validate the Price Plan
			message = FieldValidation.validateNullObject("ReserveSubscriptionRequest PricePlan", getReserveSubscriptionWithRsvId().getPricePlan());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please bind the Price Plan for this Reservation");
			} else {
				//Validate the PricePlan's Service Code
				message = FieldValidation.validateNullObject("ReserveSubscriptionRequest PricePlan.Code", getReserveSubscriptionWithRsvId().getPricePlan().getServiceCode());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please populate the priceplan's soccode");
				}
			}
			
			//Validate the Service List
			message = FieldValidation.validateNullObject("ReserveSubscriptionRequest Service List", getReserveSubscriptionWithRsvId().getServiceList());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please bind the Service List to the Reservation Request");
			} else {
				ProductDeployment[] serviceList = getReserveSubscriptionWithRsvId().getServiceList();
				
				//iterate through each soc and confirm that a soc code exists
				for( int i = 0; i < serviceList.length; i++ ) {
					message = FieldValidation.validateNullObject("Feature list at index["+i+"]", serviceList[i]);
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please check the services list");
					}
					
					message = FieldValidation.validateNullObject("Feature list at index["+i+"]", serviceList[i].getServiceCode());
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new PendingSubscriptionException(message.getStatus(),message.getMessage()+" Please check the services list");
					}
				}
			}
			
			//after passing each individual if block, the only result is a good request
			retValue = true;
		}
		return retValue;
	}
	
	// [end] validation methods
	
	// [start] accessor methods
	
	/**
	 * This API is used to activate an existing reserved MVNO subscription.
	 * <p>Wsdl name: WholesaleSubscription.wsdl</p>
	 * <p>Imported Schemas: SubscriptionEnvelope.xsd, ErrorDetails.xsd, WSMessageHeader.xsd</p>
	 * <p>Operation: ActivatePendingSubscription</p>
	 * 
	 * @throws PendingSubscriptionException 
	 * @return ActivatePendingSubscriptionReply
	 */
	public ActivatePendingSubscriptionReply activatePendingSubscription() throws PendingSubscriptionException {
		String methodName = "activatePendingSubscription";
		if( validateActivatePendingSubscriptionRequest() ) {
			try {
				setActivatePendingSubscriptionReply(subscriptionBinding.activatePendingSubscription(getActivatePendingSubscriptionRequest()));
			} catch ( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new PendingSubscriptionException(CLASS_NAME,methodName,ws_err);
			} catch (Exception e) {
				throw new PendingSubscriptionException(e);
			}
		}
		return getActivatePendingSubscriptionReply();
	}
	
	public ActivateSubscriptionReply activateSubscription() throws PendingSubscriptionException {
		throw new PendingSubscriptionException("FAIL","This method is not yet implemented.");
		//return getActivateSubscriptionRequest();
	}
	
	public ActivateSubscriptionMsidReply activateSubscriptionMsid() throws PendingSubscriptionException {
		throw new PendingSubscriptionException("FAIL","This method is not yet implemented");
	}
	
	/**
	 * This API is used to add a new subscription with an access number in the given NPA.
	 * <p>Wsdl name: WholesaleSubscription.wsdl</p>
	 * <p>Imported Schemas: SubscriptionEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: ActivateSubscriptionNpa</p>
	 * 
	 * @return
	 * @throws PendingSubscriptionException
	 */
	public ActivateSubscriptionNpaReply activateSubscriptionNpa() throws PendingSubscriptionException {
		//throw new PendingSubscriptionException("FAIL","This method is not yet implemented");
		ActivateSubscriptionNpaReply subReply = new ActivateSubscriptionNpaReply();
		String methodName = "activateSubscriptionNpa";
		if( validateActivateSubscriptionNpa() ) {
			try {
				subReply = subscriptionBinding.activateSubscriptionNpa(getActivateSubscriptionNpaRequest());
			} catch ( ErrorDetailsType error ) {
				TSCPLogger.logError(CLASS_NAME, methodName, error);
				throw new PendingSubscriptionException(CLASS_NAME,methodName,error);
			} catch ( Exception e ) {
				throw new PendingSubscriptionException(e);
			}
		}
		return subReply;
	}
	
	public ActivateSubscriptionNpaWithRsvIdReply activateSubscriptionNpaWithRsvId() throws PendingSubscriptionException {
		throw new PendingSubscriptionException("FAIL","This method is not yet implemented");
	}
	
	public ActivateSubscriptionWithRsvIdReply activateSubscriptionWithRsvId() throws PendingSubscriptionException {
		String methodName = "activateSubscriptionWithRsvId";
		if( validateActivateSubscriptionWithRsvId() ) {
			try {
				setActivateSubscriptionWithRsvIdReply(subscriptionBinding.activateSubscriptionWithRsvId(getActivateSubscriptionWithRsvIdRequest()));
			} catch ( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new PendingSubscriptionException(CLASS_NAME,methodName,ws_err);
			} catch ( Exception e ) {
				throw new PendingSubscriptionException(e);
			}
		}
		return getActivateSubscriptionWithRsvIdReply();
	}
	
	/**
	 * This API provides the ability to reserve a MVNO subscription and an MDN for the subscription without an ESN.
	 * <p>Wsdl name: WholesaleSubscription.wsdl</p>
	 * <p>Imported Schemas: SubscriptionEnvelope.xsd, ErrorDetails.xsd, WSMessageHeader.xsd</p>
	 * <p>Operation: ReserveSubscription</p>
	 * 
	 * @return
	 * @throws PendingSubscriptionException
	 */
	public ReserveSubscriptionReply reserveSubscription() throws PendingSubscriptionException {
		String methodName = "reserveSubscription";
		ReserveSubscriptionReply resSub = new ReserveSubscriptionReply();
		if( validateReserveSubscriptionRequest() ) {
			try { 
				resSub = subscriptionBinding.reserveSubscription(getReserveSubscriptionRequest());
			} catch ( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new PendingSubscriptionException(CLASS_NAME,methodName,ws_err);
			} catch ( Exception e ) {
				throw new PendingSubscriptionException(e);
			}
		}
		return resSub;
	}
	
	public ReserveSubscriptionGeoCodeReply reserveSubscriptionGeoCode() throws PendingSubscriptionException {
		throw new PendingSubscriptionException("FAIL","This method is not yet implemented");
	}
	
	public ReserveSubscriptionGeoCodeNpaReply reserveSubscriptionGeoCodeNpa() throws PendingSubscriptionException {
		throw new PendingSubscriptionException("FAIL","This method is not yet implemented");
	}
	
	/**
	 * This API provides the ability to reserve a MVNO subscription and an MDN in the given NPA for the
	 * subscription without an ESN.
	 * <p>Wsdl name: WholesaleSubscription.wsdl</p>
	 * <p>Imported Schemas: SubscriptionEnvelope.xsd, ErrorDetails.xsd, WSMessageHeader.xsd</p>
	 * <p>Operation: ReserveSubscriptionNpa</p>
	 * 
	 * @return
	 * @throws PendingSubscriptionException
	 */
	public ReserveSubscriptionNpaReply reserveSubscriptionNpa() throws PendingSubscriptionException {
		String methodName = "reserveSubscriptionNpa";
		ReserveSubscriptionNpaReply resSub = new ReserveSubscriptionNpaReply();
		if( validateReserveSubscriptionNpaRequest() ) {
			try {
				resSub = subscriptionBinding.reserveSubscriptionNpa(getReserveSubscriptionNpaRequest());
			} catch ( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new PendingSubscriptionException(CLASS_NAME,methodName,ws_err);
			} catch( Exception e ) {
				throw new PendingSubscriptionException(e);
			}
		}
		return resSub;
	}
	
	/**
	 * This API provides the ability to reserve a MVNO subscription and an MDN with optionally provided
	 * reservationId for the subscription without an ESN.
	 * <p>Wsdl name: WholesaleSubscription.wsdl</p>
	 * <p>Imported Schemas: SubscriptionEnvelope.xsd, ErrorDetails.xsd, WSMessageHeader.xsd</p>
	 * <p>Operation: ReserveSubscriptionWithRsvId</p>
	 * 
	 * @return
	 * @throws PendingSubscriptionException
	 */
	public ReserveSubscriptionWithRsvIdReply reserveSubscriptionWithRsvId() throws PendingSubscriptionException {
		String methodName = "reserveSubscriptionWithRsvId";
		ReserveSubscriptionWithRsvIdReply resSub = new ReserveSubscriptionWithRsvIdReply();
		if( validateReserveSubscriptionWithRsvIdRequest() ) {
			try {
				resSub = subscriptionPort.reserveSubscriptionWithRsvId(getReserveSubscriptionWithRsvId());
			} catch ( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new PendingSubscriptionException(CLASS_NAME,methodName,ws_err);
			} catch ( Exception e ) {
				throw new PendingSubscriptionException(e);
			}
		}
		return resSub;
	}
	
	// [end] accessor methods
	
	// [start] main method
	
	public static void main( String[] args ) {
		System.out.println("Testing Subscription Client...");
		try {
			boolean running = true;
			String input = "";
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
			while( running ) {
				if( args != null && args.length > 0 ) {
					System.out.println("args[] is not empty");
					for( int i = 0; i < args.length; i++ ) {
						System.out.println("args["+i+"]::"+args[i]);
					}
				} else {
					System.out.println("**** No arguments found...Please set set one of the following as arg[0]");
					genMenu();
					input = br.readLine();
				}
				if( input.equals("001") ) {
					System.out.println("Testing ReserveSubscription");
					SubscriptionClient subClient = new SubscriptionClient();
					ReserveSubscriptionReply subReply = new ReserveSubscriptionReply();
					try {
						subReply = subClient.reserveSubscription();
						if( subReply == null ) {
							throw new PendingSubscriptionException("Fail","Subscription Reply is null");
						}
						System.out.println("SubReply.Csa     :: "+subReply.getCsa());
						System.out.println("SubReply.Mdn     :: "+subReply.getMdn());
						System.out.println("SubReply.Msid    :: "+subReply.getMsid());						
					} catch( PendingSubscriptionException sub_ex ) {
						handleLocalException(sub_ex);
					}
				} else if( input.equals("002") ) {
					System.out.println("Testing ReserveSubscriptionGeoCode");
					SubscriptionClient subClient = new SubscriptionClient();
					ReserveSubscriptionGeoCodeReply subReply = new ReserveSubscriptionGeoCodeReply();
					try {						
						subReply = subClient.reserveSubscriptionGeoCode();
						if( subReply == null ) {
							throw new PendingSubscriptionException("Fail","Subscription Reply is null");
						}	
						System.out.println("SubReply.Csa     :: "+subReply.getCsa());
						System.out.println("SubReply.Mdn     :: "+subReply.getMdn());
						System.out.println("SubReply.Msid    :: "+subReply.getMsid());	
					} catch( PendingSubscriptionException sub_ex ) {
						handleLocalException(sub_ex);
					}
				} else if( input.equals("003") ) {
					System.out.println("Testing ReserveSubscriptionGeoCodeNpa");
				} else if( input.equals("004") ) {
					System.out.println("Testing ReserveSubscriptionNpa");
					SubscriptionClient subClient = new SubscriptionClient();
					subClient.setUserName(MainHelper.populateField("UserName", br, subClient.getUserName()));
					subClient.setOrderId(MainHelper.populateField("OrderId", br, subClient.getOrderId()));
					ReserveSubscriptionNpaRequest subRequest = new ReserveSubscriptionNpaRequest();
					subRequest.setCsa(MainHelper.populateRequiredField("CSA", br, subRequest.getCsa()));
					subRequest.setNpa(MainHelper.populateRequiredField("NPA", br, subRequest.getNpa()));
					subRequest.setPricePlan(populatePricePlan(br));
					System.out.println("Populate Services?");
					input = br.readLine(); 
					if( input.substring(0,1).equalsIgnoreCase("Y") ) {
						subRequest.setServiceList(populateServiceList(br, false));
					}	
					subClient.setReserveSubscriptionNpaRequest(subRequest);
					ReserveSubscriptionNpaReply subReply = new ReserveSubscriptionNpaReply();
					try { 
						subReply = subClient.reserveSubscriptionNpa();
						if( subReply == null ) {
							throw new PendingSubscriptionException("Fail","Subscription Reply is null");
						}
						System.out.println("SubReply.Csa     :: "+subReply.getCsa());
						System.out.println("SubReply.Mdn     :: "+subReply.getMdn());
						System.out.println("SubReply.Msid    :: "+subReply.getMsid());	
						
					} catch( PendingSubscriptionException sub_ex ) {
						handleLocalException(sub_ex);
					}
				} else if( input.equals("005") ) {
					System.out.println("Testing ReserveSubscriptionWithRsvId");
					SubscriptionClient subClient = new SubscriptionClient();
					try {
						subClient.setUserName(MainHelper.populateRequiredField("UserName", br, subClient.getUserName()));
						subClient.setOrderId(MainHelper.populateRequiredField("OrderId", br, subClient.getOrderId()));
						ReserveSubscriptionWithRsvIdRequest subRequest = new ReserveSubscriptionWithRsvIdRequest();
						subRequest.setCsa(MainHelper.populateRequiredField("CSA", br, subRequest.getCsa()));
						subRequest.setPricePlan(populatePricePlan(br));
						subClient.setReserveSubscriptionWithRsvId(subRequest);
						ReserveSubscriptionWithRsvIdReply subReply = new ReserveSubscriptionWithRsvIdReply(); 
						subReply = subClient.reserveSubscriptionWithRsvId();
						if( subReply == null ) {
							throw new PendingSubscriptionException("Fail","Sub reply is null!!");
						}
					} catch( PendingSubscriptionException sub_ex ) {
						MainHelper.handleException(sub_ex);
					}
				} else if( input.equals("006") ) {
					System.out.println("Testing ActivatePendingSubscription");
					SubscriptionClient subClient = new SubscriptionClient();
					subClient.setUserName(MainHelper.populateRequiredField("UserName", br, subClient.getUserName()));
					subClient.setOrderId(MainHelper.populateRequiredField("OrderId", br, subClient.getOrderId()));
					ActivatePendingSubscriptionRequest subRequest = new ActivatePendingSubscriptionRequest();
					subRequest.setMdn(MainHelper.populateRequiredField("MDN", br, subRequest.getMdn()));
					subRequest.setEsn(populateSerialNumber(br));
					subClient.setActivatePendingSubscriptionRequest(subRequest);
					ActivatePendingSubscriptionReply subReply = new ActivatePendingSubscriptionReply();
					try {
						subReply = subClient.activatePendingSubscription();
						if( subReply == null ) {
							throw new PendingSubscriptionException("Fail","Subscription Reply is null!!");
						}
						System.out.println("SubReply.Esn(Dec):: "+subReply.getEsn().getElectronicSerialNumber().getElectronicSerialNumberDec());
						System.out.println("SubReply.Mdn     :: "+subReply.getMdn());
						System.out.println("SubReply.Msid    :: "+subReply.getMsid());	
					} catch ( PendingSubscriptionException sub_ex ) {
						handleLocalException(sub_ex);
					}
				} else if( input.equals("007") ) {
					System.out.println("Testing ActivateSubscription");
				} else if( input.equals("008") ) {
					System.out.println("Testing ActivateSubscriptionMsid");
				} else if( input.equals("009") ) {
					System.out.println("Testing ActivateSubscriptionNpa");
					SubscriptionClient subClient = new SubscriptionClient();
					subClient.setUserName(MainHelper.populateField("UserName", br, subClient.getUserName()));
					subClient.setOrderId(MainHelper.populateField("OrderId", br, subClient.getOrderId()));
					ActivateSubscriptionNpaRequest subRequest = new ActivateSubscriptionNpaRequest();
					subRequest.setCsa(MainHelper.populateRequiredField("CSA", br, subRequest.getCsa()));
					subRequest.setNpa(MainHelper.populateField("NPA", br, subRequest.getNpa()));
					subRequest.setMdn(MainHelper.populateRequiredField("MDN", br, subRequest.getMdn()));
					subRequest.setEsn(populateSerialNumber(br));
					
					subRequest.setPricePlan(populatePricePlan(br));
					System.out.println("Populate Services?");
					input = br.readLine(); 
					if( input.substring(0,1).equalsIgnoreCase("Y") ) {
						subRequest.setServiceList(populateServiceList(br, false));
					}					
					subClient.setActivateSubscriptionNpaRequest(subRequest);
					ActivateSubscriptionNpaReply subReply = new ActivateSubscriptionNpaReply();
					try {
						subReply = subClient.activateSubscriptionNpa();
						if( subReply == null ) {
							throw new PendingSubscriptionException("Fail","Subscription Reply is null");
						}
						System.out.println("SubReply.Csa     :: "+subReply.getCsa());
						System.out.println("SubReply.Mdn     :: "+subReply.getMdn());
						System.out.println("SubReply.Msid    :: "+subReply.getMsid());	
					} catch( PendingSubscriptionException sub_ex ) {
						handleLocalException(sub_ex);
					}
					
				} else if( input.equals("010") ) {
					System.out.println("Testing ActivateSubscriptionNpaWithRsvId");
				} else if( input.equals("011") ) {
					System.out.println("Testing ActivateSubscriptionWithRsvId");
				} else if( input.equals("?") ) {
					genMenu();
				} else if( input.equals("000") ) {
					running = false;
				} else {
					System.out.println("!!Unknown command...Please try again(? for help)");
				}
				args = null;
			}
			//input = br.readLine();
//			SubscriptionClient client = new SubscriptionClient();
			//ActivateSubscriptionWithRsvIdRequest request = new ActivateSubscriptionWithRsvIdRequest();
			//client.setActivateSubscriptionWithRsvIdRequest(request);
			
			//client.activateSubscriptionWithRsvId();
			
			//Test reserve subscription
/*			System.out.println("Testing ReserveSubscription");
			String msid = null;
			String csa = "NEVSDG619";
			ProductDeployment pricePlan = new ProductDeployment();
			pricePlan.setServiceCode("PRSALL004");
			ProductDeployment[] serviceList = null;//new ProductDeployment[2];
			ReserveSubscriptionRequest subRequest = new ReserveSubscriptionRequest(msid,csa,pricePlan,serviceList);
			client.setReserveSubscriptionRequest(subRequest);
			ReserveSubscriptionReply subReply = client.reserveSubscription();
			if( subReply != null ) {
				System.out.println("SubReply returned with the following information: " );
				System.out.println("SubReply.CSA     :: " + subReply.getCsa());
				System.out.println("SubReply.MDN     :: " + subReply.getMdn());
				System.out.println("SubReply.MSID    :: " + subReply.getMsid());
			} else {
				System.out.println("subReply is null!!");
			}*/
			//Test activate pending subscription
			/*System.out.println("Testing activePendingSubsription");
			ActivatePendingSubscriptionRequest actSub = new ActivatePendingSubscriptionRequest();
			SerialNumber serial = new SerialNumber();
			ElectronicSerialNumber esn = new ElectronicSerialNumber("11913779601", null);
			serial.setElectronicSerialNumber(esn);
			//serial.setMobileEquipmentIdentifier(mobileEquipmentIdentifier)
			actSub.setEsn(serial);
			actSub.setMdn("6192591242");
			client.setActivatePendingSubscriptionRequest(actSub);
			ActivatePendingSubscriptionReply subReply = client.activatePendingSubscription();
			if( subReply != null ) {
				System.out.println("ActivatePendingSubscriptionReply.MDN     :: "+subReply.getMdn());
				System.out.println("ActivatePendingSubscriptionReply.MSID    :: "+subReply.getMsid());
			} else {
				System.out.println("SubReply is null!");
			}*/
			
		} catch ( PendingSubscriptionException psub_ex ) {
			System.out.println("Pending Subscription Error!!");
			System.out.println("        STATUS        :: "+psub_ex.getStatus());
			System.out.println("        Message       :: "+psub_ex.getMessage());
			System.exit(0);
		} catch ( Exception e ) {
			e.printStackTrace();
			System.exit(0);
		}
//		loadProps();
//		System.out.println("URL::"+System.getProperty("url"));
//		System.out.println("JAVA_HOME::"+System.getProperty("java_home"));
//	    proxyURL = (props.getProperty("URL") != null && props.getProperty("URL").trim().length() > 0) ? props.getProperty("URL") : System.getProperty("url");
//
//	    EngineConfiguration config = null;
//
//	    if (System.getProperty("client.deploy.file.location") != null) {
//			config = new FileProvider(System.getProperty("client.deploy.file.location"));
//		}
//	    try {
//			WholesaleSubscriptionServiceLocator subService = new WholesaleSubscriptionServiceLocator(config);
//			WholesaleSubscriptionPortType subPort = subService.getWholesaleSubscriptionPort(new URL(proxyURL));
//			subPort.activatePendingSubscription(new ActivatePendingSubscriptionRequest());
//			//subPort.activateSubscription(parameters)
//			//subPort.activateSubscriptionMsid(parameters)
//			//subPort.activateSubscriptionNpa(parameters)
//			//subPort.activateSubscriptionWithRsvId(parameters);
//			
//			//subPort.reserveSubscription(parameters)
//			//subPort.reserveSubscriptionGeoCode(parameters)
//			//subPort.reserveSubscriptionGeoCodeNpa(parameters)
//			//subPort.reserveSubscriptionNpa(parameters)
//			//subPort.reserveSubscriptionWithRsvId(parameters)
//			
//	    } catch ( Exception e ) {
//	    	System.out.println("Exception thrown :: "+e.getMessage());
//	    	
//	    }
		System.out.println("Done Testing SubscriptionClient");
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
		System.out.println("**** **** Exit                              :: 000 **** ****");
		System.out.println("**** **** ReserveSubscription               :: 001 **** ****");
		System.out.println("**** **** ReserveSubscriptionGeoCode        :: 002 **** ****");
		System.out.println("**** **** ReserveSubscriptionGeoCodeNpa     :: 003 **** ****");
		System.out.println("**** **** ReserveSubscriptionNpa            :: 004 **** ****");
		System.out.println("**** **** ReserveSubscriptionWithRsvId      :: 005 **** ****");
		System.out.println("**** **** ActivatePendingSubscription       :: 006 **** ****");
		System.out.println("**** **** ActivateSubscription              :: 007 **** ****");
		System.out.println("**** **** ActivateSubscriptionMsid          :: 008 **** ****");
		System.out.println("**** **** ActivateSubscriptionNpa           :: 009 **** ****");
		System.out.println("**** **** ActivateSusbcriptionNpaWithRsvId  :: 010 **** ****");
		System.out.println("**** **** ActivateSubscriptionWithRsvId     :: 011 **** ****");
	}
	
	private static void handleLocalException( PendingSubscriptionException sub_ex ) {
		System.out.println("PendingSubscription Exception!!");
		System.out.println("PendingSubscription.Status :: "+sub_ex.getStatus());
		System.out.println("PendingSubscription.Message:: "+sub_ex.getMessage());
	}
	
	
	private static ProductDeployment populatePricePlan(BufferedReader br) {
		ProductDeployment pricePlan = new ProductDeployment();
		String input = "";
		System.out.println("**** **** Populate the Price Plan information **** ****");
		try {
			pricePlan.setServiceCode(MainHelper.populateRequiredField("PricePlan SocCode", br, pricePlan.getServiceCode()));
			System.out.println("Populate the Call Forwarding Number?");
			input = br.readLine();
			if( input.substring(0, 1).equalsIgnoreCase("Y") ) {
				pricePlan.setCallForwardingNumber(MainHelper.populateField("Call Forwarding Number", br, pricePlan.getCallForwardingNumber()));
			}
			//System.out.println("Populate the Effective Date?");
			/*if( input.substring(0,1).equalsIgnoreCase("Y") ) {
				pricePlan.setServiceEffectiveDate(new java.util.Date())
			}*/
		} catch ( Exception e ) {
			e.printStackTrace();
			System.exit(0);
		}
		return pricePlan;
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
	
	private static SerialNumber populateSerialNumber(BufferedReader br) {
		SerialNumber serialNumber = new SerialNumber();
		try {
			boolean validInput = false;
			while( !validInput ) {
				String tempEsnOrMEID = MainHelper.populateRequiredField("ESN in Decimal", br, null);
				if( tempEsnOrMEID.length() == 11 ) {
					ElectronicSerialNumber electronicSerialNumber = new ElectronicSerialNumber();
					electronicSerialNumber.setElectronicSerialNumberDec(tempEsnOrMEID);
					serialNumber.setElectronicSerialNumber(electronicSerialNumber);
					validInput = true;
				} else if( tempEsnOrMEID.length() == 18 ) {
					MobileEquipmentIdentifier mobileEquipmentIdentifier = new MobileEquipmentIdentifier();
					mobileEquipmentIdentifier.setMobileEquipmentIdentifierDec(tempEsnOrMEID);
					serialNumber.setMobileEquipmentIdentifier(mobileEquipmentIdentifier);
					validInput = true;
				} else {
					System.out.println("Invalid Length for ESN...please repopulate");
					validInput = false;
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
