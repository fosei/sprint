package com.tscp.mvno.sprint.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Date;import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Vector;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
import com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyBindingStub;
import com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyPortType;
import com.sprint.integration.eai.services.WholesaleSubscriptionModify.v1.WholesaleSubscriptionModify_wsdl.WholesaleSubscriptionModifyServiceLocator;
import com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ChangeServicePlansRequest;
import com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ConfirmMsg;
import com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ExpireSubscriptionRequest;
import com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.ProductDeployment;
import com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.RestoreSubscriptionRequest;
import com.sprint.integration.interfaces.WholesaleSubscriptionModify.v1.ModifySubscriptionEnvelope_xsd.SuspendSubscriptionRequest;
import com.tscp.mvno.exception.SubscriptionModifyException;
import com.tscp.mvno.support.FieldValidation;
import com.tscp.mvno.support.MainHelper;
import com.tscp.mvno.support.ResponseMessage;
import com.tscp.mvno.support.SprintHeader;
import com.tscp.mvno.support.TSCPLogger;

public class SubscriptionModifyClient {

	// [start] members
	
	public static final String CLASS_NAME = "SubscriptionModifyClient";
	public static final String URL		  = "wholesale.subscription.modify.service.location.url";
	
	public static String inputPropertyFile = "client.properties";
	public static String proxyURL = "http://localhost:2222";  // WS End Point URL
	private static Properties props;
	
	private WholesaleSubscriptionModifyBindingStub		subModBinding;
	private WholesaleSubscriptionModifyServiceLocator 	subModService;
	private WholesaleSubscriptionModifyPortType 		subModPort;
	private EngineConfiguration 						config;
	
	private ChangeServicePlansRequest		changeServicePlansRequest;
	private ExpireSubscriptionRequest		expireSubscriptionRequest;
	private RestoreSubscriptionRequest		restoreSubscriptionRequest;
	private SuspendSubscriptionRequest		suspendSubscriptionRequest;
	
	private SprintHeader header;
	private String 		 userName;
	private String		 orderId;

	// [end] members
	
	// [start] constructors
	
	public SubscriptionModifyClient() throws SubscriptionModifyException {
		this("tscp","0000");
	}
	
	public SubscriptionModifyClient(String userName, String orderId ) throws SubscriptionModifyException {
		loadProps();
		//System.out.println("URL::"+System.getProperty("url"));
		//System.out.println("JAVA_HOME::"+System.getProperty("java_home"));
	    proxyURL = (props.getProperty(SubscriptionModifyClient.URL) != null && props.getProperty(SubscriptionModifyClient.URL).trim().length() > 0) ? props.getProperty(SubscriptionModifyClient.URL) : System.getProperty("url");

	    config = null;

	    if (System.getProperty("client.deploy.file.location") != null) {
			config = new FileProvider(System.getProperty("client.deploy.file.location"));
		}

	    subModService = new WholesaleSubscriptionModifyServiceLocator(config);
	    try{
	    	subModPort = subModService.getWholesaleSubscriptionModifyPort(new URL(proxyURL));
	    	if( subModPort == null ) {
	    		throw new SubscriptionModifyException("Port could not be located at site: "+proxyURL);
	    	}
	    } catch (Exception e) {
	    	throw new SubscriptionModifyException(e);
	    }
	    
	    setUserName(userName);
	    setOrderId(orderId);
	    subModBinding = (WholesaleSubscriptionModifyBindingStub)subModPort;
	    header = new SprintHeader(getUserName(),getOrderId());
	    subModBinding.setHeader(header.getHeader());
	    subModBinding.setTimeout(header.getTimeOut());
	    subModBinding.setUsername(header.getBindingUserName());
	    subModBinding.setPassword(header.getBindingPassword());
	}
	
	// [end] constructors
	
	// [start] get methods
	
	public String getOrderId() {
		return orderId;
	}

	public String getUserName() {
		return userName;
	}

	public ChangeServicePlansRequest getChangeServicePlansRequest() {
		return changeServicePlansRequest;
	}

	public ExpireSubscriptionRequest getExpireSubscriptionRequest() {
		return expireSubscriptionRequest;
	}

	public RestoreSubscriptionRequest getRestoreSubscriptionRequest() {
		return restoreSubscriptionRequest;
	}

	public SuspendSubscriptionRequest getSuspendSubscriptionRequest() {
		return suspendSubscriptionRequest;
	}
	
	// [end] get methods
	
	// [start] set methods

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setChangeServicePlansRequest(
			ChangeServicePlansRequest changeServicePlansRequest) {
		this.changeServicePlansRequest = changeServicePlansRequest;
	}

	public void setExpireSubscriptionRequest(
			ExpireSubscriptionRequest expireSubscriptionRequest) {
		this.expireSubscriptionRequest = expireSubscriptionRequest;
	}

	public void setRestoreSubscriptionRequest(
			RestoreSubscriptionRequest restoreSubscriptionRequest) {
		this.restoreSubscriptionRequest = restoreSubscriptionRequest;
	}

	public void setSuspendSubscriptionRequest(
			SuspendSubscriptionRequest suspendSubscriptionRequest) {
		this.suspendSubscriptionRequest = suspendSubscriptionRequest;
	}
	
	// [end] set methods
	
	// [start] validation methods
	
	public boolean validateChangeServicePlansRequest() throws SubscriptionModifyException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		
		//Validate the request is not null
		message = FieldValidation.validateNullObject("ChangeServicePlansRequest", getChangeServicePlansRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new SubscriptionModifyException(message.getStatus(),message.getMessage()+" Please bind the ChangeServicePlansRequest object.");
		} else {
			
			//Validate the TN field
			message = FieldValidation.validateMDNField(getChangeServicePlansRequest().getMdn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new SubscriptionModifyException(message.getStatus(),message.getMessage()+" Please check the MDN for the ChangeServicePlanRequest object");
			} 
			
			//Validate Price Plan Object
			//message = FieldValidation.validateNullObject("ChangeServicePlansRequest PricePlan", getChangeServicePlansRequest().getPricePlan());
			//if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
		//		throw new SubscriptionModifyException(message.getStatus(),message.getMessage()+" Please check the price plan object." );
			//} else {
			
			//Validate the PricePlan's soccode
			if( getChangeServicePlansRequest().getPricePlan() != null ) {
				message = FieldValidation.validateNullObject("ChangeServicePlansRequest PricePlan serviceCode", getChangeServicePlansRequest().getPricePlan().getServiceCode());
				if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
					throw new SubscriptionModifyException(message.getStatus(),message.getMessage()+" Please check the soccode for the priceplan object");
				}
			}
			
			//Validate the new Features list
			if( getChangeServicePlansRequest().getServiceList() != null ) {
				ProductDeployment[] newServiceList = getChangeServicePlansRequest().getServiceList();
				
				//If there is an object in this list, then it should have a soc code populated
				for( int i = 0; i < newServiceList.length; i++ ) {
					message = FieldValidation.validateNullObject("ChangeServicePlansRequest ServiceList New Feature at index["+i+"]", newServiceList[i]);
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new SubscriptionModifyException(message.getStatus(),message.getMessage()+" Please check new feature at index::"+i);
					} else {
						message = FieldValidation.validateNullObject("ChangeServicePlansRequest ServiceList New Feature at index["+i+"].socCode", newServiceList[i].getServiceCode());
						if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
							throw new SubscriptionModifyException(message.getStatus(),message.getMessage()+" Please check new feature["+i+"].socCode");
						}
					}
				}
			}
			
			//Validate the old features list
			if( getChangeServicePlansRequest().getOldServiceList() != null ) {
				ProductDeployment[] oldServiceList = getChangeServicePlansRequest().getOldServiceList();
				
				//If there is an object in this list, then it should have a soc code populated
				for( int i = 0; i < oldServiceList.length; i++ ) {
					message = FieldValidation.validateNullObject("ChangeServicePlansRequest ServiceList Old Feature at index["+i+"]", oldServiceList[i]);
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new SubscriptionModifyException(message.getStatus(),message.getMessage()+" Please check old feature at index::"+i);
					} else {
						message = FieldValidation.validateNullObject("ChangeServicePlansRequest ServiceList Old Feature at index["+i+"].socCode", oldServiceList[i].getServiceCode());
						if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
							throw new SubscriptionModifyException(message.getStatus(),message.getMessage()+" Please check old feature["+i+"].socCode");
						}
						
						message = FieldValidation.validateNullObject("ChangeServicePlansRequest OldServiceList.ExpDate", oldServiceList[i].getServiceExpirationDate());
						if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
							throw new SubscriptionModifyException(message.getStatus(),message.getMessage()+" Please check the old feature's expiration date for SOC:"+oldServiceList[i].getServiceCode());
						}
					}
				}
			}
			
			retValue = true;
		}
		
		return retValue;
	}
	
	public boolean validateExpireSubscriptionRequest() throws SubscriptionModifyException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		
		//Validate the MDN field in the ExpireSubscriptionRequest
		message = FieldValidation.validateMDNField(getExpireSubscriptionRequest().getMdn());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED)  ) {
			throw new SubscriptionModifyException( message.getStatus(), message.getMessage()+" Please check ExpireSubscriptionRequest.MDN field");
		} else {
			retValue = true;
		}
		return retValue;
	}
	
	public boolean validateRestoreSubscriptionRequest() throws SubscriptionModifyException {
		boolean retValue = false; 
		ResponseMessage message = new ResponseMessage();
		
		//Validate the MDN field in the RestoreSubscriptionRequest
		message = FieldValidation.validateMDNField(getRestoreSubscriptionRequest().getMdn());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED)  ) {
			throw new SubscriptionModifyException( message.getStatus(), message.getMessage()+" Please check RestoreSubscriptionRequest.MDN field");
		} else {
			retValue = true;
		}
		
		return retValue;
	}
	
	public boolean validateSuspendSubscripitonRequest() throws SubscriptionModifyException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		
		//Validate the Request exists
		message = FieldValidation.validateNullObject("SuspendSubscriptionRequest", getSuspendSubscriptionRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new SubscriptionModifyException( message.getStatus(),message.getMessage()+" Please bind the SuspendSubscriptionRequest object.");
		}
		
		//Validate the MDN field in the SuspendSubscriptionRequest
		message = FieldValidation.validateMDNField(getSuspendSubscriptionRequest().getMdn());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED)  ) {
			throw new SubscriptionModifyException( message.getStatus(), message.getMessage()+" Please check SuspendSubscriptionRequest.MDN field");
		} else {
			retValue = true;
		}
		
		return retValue;
	}
	
	// [end] validation methods
	
	// [start] accessor methods

	/**
	 * This API is used to maintain service configuration for an existing MVNO subscription.
	 * <p>Wsdl name: WholesaleSubscriptionModify.wsdl</p>
	 * <p>Imported Schemas: ModifySubscriptionEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: ChangeServicePlans</p>
	 * 
	 * @throws SubscriptionModifyException
	 * @returns ConfirmMsg
	 * 
	 */
	public ConfirmMsg changeServicePlans() throws SubscriptionModifyException {
		String methodName = "changeServicePlans";
		ConfirmMsg msg = new ConfirmMsg();
		if( validateChangeServicePlansRequest() ) {
			try { 
				msg = subModBinding.changeServicePlans(getChangeServicePlansRequest());
			} catch ( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new SubscriptionModifyException(CLASS_NAME, methodName, ws_err);
			} catch( Exception e ) {
				throw new SubscriptionModifyException(e);
			}
		}
		return msg;
	}
		
	/**
	 * This API provides the ability to expire a MVNO subscription.
	 * <p>Wsdl name: WholesaleSubscriptionModify.wsdl</p>
	 * <p>Imported Schemas: ModifySubscriptionEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: ExpireSubscription</p>
	 * 
	 * @return ConfirmMsg
	 * @throws SubscriptionModifyException
	 */
	public ConfirmMsg expireSubscription() throws SubscriptionModifyException {
		String methodName = "expireSubscription";
		ConfirmMsg msg = new ConfirmMsg();
		if( validateExpireSubscriptionRequest() ) {
			try { 
				msg = subModBinding.expireSubscription(getExpireSubscriptionRequest());
			} catch ( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new SubscriptionModifyException(CLASS_NAME, methodName, ws_err);
			} catch ( Exception e ) {
				throw new SubscriptionModifyException(e);
			}
		}
		
		return msg;
	}
	
	/**
	 * This API provides the ability to restore a suspended or hotlined access number and any suspended or
	 * hotlined NAIs associated with a MVNO subscription.
	 * <p>Wsdl name: WholesaleSubscriptionModify.wsdl</p>
	 * <p>Imported Schemas: ModifySubscriptionEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: RestoreSubscription</p>
	 * 
	 * @return ConfirmMsg
	 * @throws SubscriptionModifyException
	 */
	public ConfirmMsg restoreSubscription() throws SubscriptionModifyException {
		String methodName = "restoreSubscription";
		ConfirmMsg msg = new ConfirmMsg();
		if( validateRestoreSubscriptionRequest() ) {
			try { 
				msg = subModBinding.restoreSubscription(getRestoreSubscriptionRequest());
			} catch ( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new SubscriptionModifyException(CLASS_NAME, methodName, ws_err);
			} catch ( Exception e ) {
				throw new SubscriptionModifyException(e);
			}
		}
		
		return msg;
	}
	
	/**
	 * This overloaded method will bind a new instance of RestoreSubscriptionRequest prior to invoking
	 * restoreSubscription()
	 * 
	 * @param mdn
	 * @return
	 * @throws SubscriptionModifyException
	 */
	public ConfirmMsg restoreSubscription(String mdn) throws SubscriptionModifyException {
		RestoreSubscriptionRequest restoreRequest = new RestoreSubscriptionRequest(mdn);
		setRestoreSubscriptionRequest(restoreRequest);
		return restoreSubscription();
	}
	
	/**
	 * This API provides the ability to suspend or hotline the access number and any active NAIs associated
	 * with a MVNO subscription.
	 * <p>Wsdl name: WholesaleSubscriptionModify.wsdl</p>
	 * <p>Imported Schemas: ModifySubscriptionEnvelope.xsd, ErrorDetails.xsd, WSMessageHeaderVx.xsd</p>
	 * <p>Operation: SuspendSubscription</p>
	 * 
	 * @return
	 * @throws SubscriptionModifyException
	 */
	public ConfirmMsg suspendSubscription() throws SubscriptionModifyException { 
		String methodName = "suspendSubscription";
		ConfirmMsg msg = new ConfirmMsg();
		if( validateSuspendSubscripitonRequest() ) {
			try {
				msg = subModBinding.suspendSubscription(getSuspendSubscriptionRequest());
			} catch ( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new SubscriptionModifyException(CLASS_NAME, methodName, ws_err);
			} catch ( Exception e ) {
				throw new SubscriptionModifyException(e);
			}
		}
		
		return msg;
	}
	
	/**
	 * This variant of suspend subscription will invoke suspendSubscription(String mdn, String activity)
	 * using the defaul activity of null.
	 * 
	 * @param mdn
	 * @return
	 * @throws SubscriptionModifyException
	 */
	public ConfirmMsg suspendSubscription(String mdn) throws SubscriptionModifyException {
		return suspendSubscription(mdn,null);
	}
	
	/**
	 * Overloaded version of suspendSubscription().
	 * <p>This method will bind a new object of {@link SuspendSubscriptionRequest} with the provided MDN 
	 * and activity.</p>
	 * 
	 * <p>Valid activity values are null and HTL(for hotline)</p>
	 * 
	 * @param mdn
	 * @param activity
	 * @return
	 * @throws SubscriptionModifyException
	 */
	public ConfirmMsg suspendSubscription( String mdn, String activity ) throws SubscriptionModifyException {
		SuspendSubscriptionRequest suspendRequest = new SuspendSubscriptionRequest(mdn,activity);
		setSuspendSubscriptionRequest(suspendRequest);
		return suspendSubscription();
	}
	
	// [end] accessor methods	
	
	// [start] main method
	
	public static void main(String[] args) throws Exception {
		System.out.println("Begin Testing SubscriptionModify");
		SubscriptionModifyClient client = new SubscriptionModifyClient();
		boolean running = true;
		String input = "";
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			while(running) {
				if( args != null && args.length > 0 ) {
					input = args[0];
					running = false;
				} else {
					System.out.println("No args detected!");
					genMenu();
					input = br.readLine();
				}
				if( input.equalsIgnoreCase("000") ) {
					running = false;
					System.out.println("Exiting Test");
				} else if( input.equalsIgnoreCase("001") ) {
					System.out.println("Testing Change Service Plans");
					try {
						ChangeServicePlansRequest serviceRequest = new ChangeServicePlansRequest();
						serviceRequest.setMdn(MainHelper.populateRequiredField("MDN",br,serviceRequest.getMdn()));
						serviceRequest.setPricePlan(populatePricePlan(br));
						serviceRequest.setOldServiceList(populateServiceList(br, true));
						serviceRequest.setServiceList(populateServiceList(br, false));
						client.setChangeServicePlansRequest(serviceRequest);
						ConfirmMsg msg = new ConfirmMsg();
						msg = client.changeServicePlans();
						if( msg == null ) {
							throw new SubscriptionModifyException("Confirm Message is null");
						}
						System.out.println("Confirm Message :: "+msg.getConfirmMsg());
					} catch( SubscriptionModifyException error ) {
						MainHelper.handleException(error);
					}
				} else if( input.equalsIgnoreCase("002") ) {
					System.out.println("Testing Expire Subscription");
					try {
						ExpireSubscriptionRequest subRequest = new ExpireSubscriptionRequest();
						subRequest.setMdn(MainHelper.populateField("MDN", br, subRequest.getMdn()));
						subRequest.setExpireDate(new java.util.Date());
						client.setExpireSubscriptionRequest(subRequest);
						ConfirmMsg msg = new ConfirmMsg();
						msg = client.expireSubscription();
						if( msg == null ) {
							throw new SubscriptionModifyException("Confirm Message is null");
						}
						System.out.println("Confirm Message :: "+msg.getConfirmMsg());
					} catch( SubscriptionModifyException error ) {
						MainHelper.handleException(error);
					}
				} else if( input.equalsIgnoreCase("003") ) {
					System.out.println("Testing Restore Subscription");
					try {
						RestoreSubscriptionRequest subRequest = new RestoreSubscriptionRequest();
						subRequest.setMdn(MainHelper.populateField("MDN", br, subRequest.getMdn()));
						client.setRestoreSubscriptionRequest(subRequest);
						ConfirmMsg msg = new ConfirmMsg();
						msg = client.restoreSubscription();
						if( msg == null ) {
							throw new SubscriptionModifyException("Confirm Message is null");
						}
						System.out.println("Confirm Message :: "+msg.getConfirmMsg());
					} catch( SubscriptionModifyException error ) {
						MainHelper.handleException(error);
					}
				} else if( input.equalsIgnoreCase("004") ) {
					System.out.println("Testing Suspend Subscription");
					try {
						SuspendSubscriptionRequest subRequest = new SuspendSubscriptionRequest();
						subRequest.setMdn(MainHelper.populateField("MDN", br, subRequest.getMdn()));
						subRequest.setActivity(MainHelper.populateField("Activity", br, subRequest.getActivity()));
						client.setSuspendSubscriptionRequest(subRequest);
						ConfirmMsg msg = new ConfirmMsg();
						msg = client.suspendSubscription();
						if( msg == null ) {
							throw new SubscriptionModifyException("Confirm Message is null");
						}
						System.out.println("Confirm Message :: "+msg.getConfirmMsg());
					} catch( SubscriptionModifyException error ) {
						MainHelper.handleException(error);
					}
				} else {
					System.out.println("Unknown command!");
				}
			}
		} catch( Exception e ) {
			e.printStackTrace();
		}
		
		//Testing Change Subscription
		/*ChangeServicePlansRequest changeRequest = new ChangeServicePlansRequest();
		changeRequest.setMdn("6192591242");
		//ProductDeployment 
		//changeRequest.setPricePlan(pricePlan)
		//ProductDeployment[] newServiceList = new ProductDeployment[2];
		//newServiceList[0] = new ProductDeployment("PRSVM3",null,null,null);
		//newServiceList[1] = new ProductDeployment("PRSMOMT",null,null,null);
		//changeRequest.setServiceList(newServiceList);

		Date myDate = new Date();
		
		ProductDeployment[] oldServiceList = new ProductDeployment[2];
		oldServiceList[0] = new ProductDeployment("PRSVM3",null,myDate,null);
		oldServiceList[1] = new ProductDeployment("PRSMOMT",null,myDate,null);
		changeRequest.setOldServiceList(oldServiceList);
		client.setChangeServicePlansRequest(changeRequest);
		ConfirmMsg msg = client.changeServicePlans();*/
		
		//Testing Suspend Subscription
		/*System.out.println("Testing Suspend Subscription");
		SuspendSubscriptionRequest suspendRequest = new SuspendSubscriptionRequest();
		suspendRequest.setMdn("6192591242");
		client.setSuspendSubscriptionRequest(suspendRequest);
		ConfirmMsg msg = client.suspendSubscription();*/
		
		//Testing Restore Subscription
//		System.out.println("testing restore subscription");
//		RestoreSubscriptionRequest restoreRequest = new RestoreSubscriptionRequest();
//		restoreRequest.setMdn("6192591242");
//		client.setRestoreSubscriptionRequest(restoreRequest);
//		ConfirmMsg msg = client.restoreSubscription();
//		if( msg != null ) {
//			System.out.println("ConfirmMsg returned with the following msg: "+msg.getConfirmMsg());
//		} else {
//			System.out.println("Confirmation Message is null!");
//		}
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
//	    //2120 CAMINO DEL RIO N, SAN DIEGO, CA 92108
//
//	    System.out.println("Obtaining serivce information");
//	    WholesaleSubscriptionModifyServiceLocator subModService = new WholesaleSubscriptionModifyServiceLocator(config);
//	    try{
//	    	WholesaleSubscriptionModifyPortType subModPort = subModService.getWholesaleSubscriptionModifyPort(new URL(proxyURL));
//	    	subModPort.changeServicePlans(new ChangeServicePlansRequest());
//	    	//subModPort.expireSubscription(parameters)
//	    	//subModPort.restoreSubscription(parameters)
//	    	//subModPort.suspendSubscription(parameters)
//	    	
//	    } catch (AxisFault afault) {
//	    	System.out.println("aFaultCaught :: "+afault.getFaultReason());
//	    	//throw afault;
//	    	afault.printStackTrace();
//	    } catch (Exception e) {
//	    	e.printStackTrace();
//	    	System.out.println("ERROR::"+e.getMessage());
//	    }
	    System.out.println("Done Testing SubscriptionModify");
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
		System.out.println("**** **** Exit System           :: 000 **** ****");
		System.out.println("**** **** Change Services       :: 001 **** ****");
		System.out.println("**** **** Expire Subscription   :: 002 **** ****");
		System.out.println("**** **** Restore Subscription  :: 003 **** ****");
		System.out.println("**** **** Suspend Subscription  :: 004 **** ****");
	}
	
	private static ProductDeployment[] populateServiceList(BufferedReader br, boolean oldServiceList) {
		Vector<ProductDeployment> productList = new Vector<ProductDeployment>();
		String input = "";
		boolean running = true;
		try {
			while( running ) {
				if( oldServiceList ) {
					System.out.println("Add Features to be Removed?");
				} else { 
					System.out.println("Add Features?");
				}
				input = br.readLine();
				if( input.substring(0, 1).equalsIgnoreCase("y") ) {
					ProductDeployment product = new ProductDeployment();
					product.setServiceCode(MainHelper.populateRequiredField("ServiceCode", br, product.getServiceCode()));
					if( oldServiceList ) {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
						System.out.println("Please designate an expiration date..");												//System.out.println("Please designate a start date..");
						String date = br.readLine();
						try { 
							product.setServiceExpirationDate(sdf.parse(date));
						} catch ( Exception e ) {
							product.setServiceExpirationDate(new java.util.Date());
						}
					} else {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
						System.out.println("Please designate a start date..");
						String date = br.readLine();
						try {
							product.setServiceEffectiveDate(sdf.parse(date));
						} catch( Exception e ) {
							product.setServiceEffectiveDate(new java.util.Date());
						}
					}
					product.setCallForwardingNumber(MainHelper.populateField("Call Forwarding Number", br, product.getCallForwardingNumber()));
					productList.add(product);
				} else { 
					running = false;
				}
			}
				
		} catch( Exception e ) {
			e.printStackTrace();
			System.exit(0);
		}
		ProductDeployment[] serviceList = new ProductDeployment[productList.size()];
		for( int i = 0; i < productList.size(); ++i ) {
			serviceList[i] = productList.get(i);
		}
		//serviceList = (ProductDeployment[])productList.toArray();
		return serviceList;
	}
	
	private static ProductDeployment populatePricePlan(BufferedReader br ) {

		ProductDeployment product = new ProductDeployment();
		product.setServiceCode(MainHelper.populateRequiredField("ServiceCode", br, product.getServiceCode()));
		product.setServiceEffectiveDate(null);		//product.setServiceEffectiveDate(Date.valueOf("));		//product.setServiceEffectiveDate(Date.valueOf(MainHelper.populateField("Price Plan Effective Date", br, product.getServiceEffectiveDate().toString())));
		product.setServiceExpirationDate(null);		//product.setServiceExpirationDate(Date.valueOf(MainHelper.populateField("Price Plan Expiration Date", br, product.getServiceExpirationDate().toString())));
		//product.setCallForwardingNumber(MainHelper.populateField("Call Forwarding Number", br, product.getCallForwardingNumber()));
		return product;
	}
	
	// [end] main method

}
