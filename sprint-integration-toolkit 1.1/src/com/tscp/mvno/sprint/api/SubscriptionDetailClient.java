package com.tscp.mvno.sprint.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;
import org.apache.log4j.Logger;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
import com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub;
import com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailPortType;
import com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceLocator;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.CsaRecord;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ElectronicSerialNumber;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.MobileEquipmentIdentifier;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.ProductDeployment;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryCsaListReply;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryPpSocListReply;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryPpSocListRequest;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryReservedSubscriptionReply;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryReservedSubscriptionRequest;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QuerySubscriptionReply;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QuerySubscriptionRequest;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryValidNpaListReply;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryValidNpaListRequest;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.SerialNumber;
import com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.SocProfileRecord;
import com.tscp.mvno.exception.SubscriptionDetailException;
import com.tscp.mvno.support.FieldValidation;
import com.tscp.mvno.support.MainHelper;
import com.tscp.mvno.support.ResponseMessage;
import com.tscp.mvno.support.SprintHeader;
import com.tscp.mvno.support.TSCPLogger;

public class SubscriptionDetailClient {

	// [start] member variables
	public static final String CLASS_NAME 	= "SubscriptionDetailClient";
	public static final String URL			= "wholesale.subscription.detail.service.location.url";
	
	public static String inputPropertyFile = "client.properties";
	public static String proxyURL = "http://localhost:2222";  // WS End Point URL
	private static Properties props;
	
	private WholesaleSubscriptionDetailBindingStub 		subscriptionDetailbinding;
	private WholesaleSubscriptionDetailServiceLocator 	subscriptionDetailService;
	private WholesaleSubscriptionDetailPortType			subscriptionDetailPortType;				
	private EngineConfiguration 						config;
	
	private QueryPpSocListRequest						ppSocListRequest;
	private QueryReservedSubscriptionRequest			reservedSubscriptionRequest;
	private QuerySubscriptionRequest					subscriptionRequest;
	private QueryValidNpaListRequest					validNpaListRequest;
	
	private SprintHeader								header;
	private String										userName;
	private String										orderId;
	
	static Logger logger = Logger.getLogger(SprintHeader.class);;
	
	// [end] member variables
	
	// [start] constructors 

	public SubscriptionDetailClient() throws SubscriptionDetailException {
		this("tscp");
	}
	
	public SubscriptionDetailClient( String userName ) throws SubscriptionDetailException {
		this(userName,"0000");
	}
	
	public SubscriptionDetailClient( String userName, String orderId ) throws SubscriptionDetailException {
		loadProps();
		System.out.println("URL::"+System.getProperty("url"));
		System.out.println("JAVA_HOME::"+System.getProperty("java_home"));
	    proxyURL = (props.getProperty(SubscriptionDetailClient.URL) != null && props.getProperty(SubscriptionDetailClient.URL).trim().length() > 0) ? props.getProperty(SubscriptionDetailClient.URL) : System.getProperty("url");

	    System.out.println("proxyURL::"+proxyURL);
	    if (System.getProperty("client.deploy.file.location") != null) {
			config = new FileProvider(System.getProperty("client.deploy.file.location"));
		}
	    subscriptionDetailService = new WholesaleSubscriptionDetailServiceLocator(config);
	    //subscriptionDetailService = new WholesaleSubscriptionDetailServiceLocator();
	    try {
	    	subscriptionDetailPortType = subscriptionDetailService.getWholesaleSubscriptionDetailPort(new URL(proxyURL));
	    } catch (Exception e) {
	    	
	    }
	    setUserName(userName);
	    setOrderId(orderId);
	    header = new SprintHeader(userName,orderId);
		subscriptionDetailbinding = (WholesaleSubscriptionDetailBindingStub)subscriptionDetailPortType;
		subscriptionDetailbinding.setHeader(header.getHeader());
		subscriptionDetailbinding.setTimeout(header.getTimeOut());
		subscriptionDetailbinding.setUsername(header.getBindingUserName());
		subscriptionDetailbinding.setPassword(header.getBindingPassword());
	}
	
	// [end] constructors
	
	// [start] get methods

	public QueryPpSocListRequest getPpSocListRequest() {
		return ppSocListRequest;
	}

	public QueryReservedSubscriptionRequest getReservedSubscriptionRequest() {
		return reservedSubscriptionRequest;
	}

	public QuerySubscriptionRequest getSubscriptionRequest() {
		return subscriptionRequest;
	}

	public QueryValidNpaListRequest getValidNpaListRequest() {
		return validNpaListRequest;
	}
	
	public String getOrderId() {
		return orderId;
	}

	public String getUserName() {
		return userName;
	}

	// [end] get methods
	
	// [start] set methods

	public void setPpSocListRequest(QueryPpSocListRequest ppSocListRequest) {
		this.ppSocListRequest = ppSocListRequest;
	}
	
	public void setReservedSubscriptionRequest(
			QueryReservedSubscriptionRequest reservedSubscriptionRequest) {
		this.reservedSubscriptionRequest = reservedSubscriptionRequest;
	}

	public void setSubscriptionRequest(QuerySubscriptionRequest subscriptionRequest) {
		this.subscriptionRequest = subscriptionRequest;
	}

	public void setValidNpaListRequest(QueryValidNpaListRequest validNpaListRequest) {
		this.validNpaListRequest = validNpaListRequest;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	// [end] set methods
	
	// [start] validation methods
	
	public boolean validateReservedSubscriptionRequest() throws SubscriptionDetailException {
		boolean retValue = false;
		ResponseMessage message = FieldValidation.validateNullObject("QueryReservedSubscriptionRequest", getReservedSubscriptionRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new SubscriptionDetailException(message.getStatus(),message.getMessage()+" Please bind ReservedSubscriptionRequest object");
		} else {
			message = FieldValidation.validateMDNField(getReservedSubscriptionRequest().getMdn());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new SubscriptionDetailException(message.getStatus(),message.getMessage()+" Please validate MDN.");
			} else {
				retValue = true;
			}
		}
		return retValue;
	}
	
	public boolean validatePpSocListRequest() throws SubscriptionDetailException {
		boolean retValue = false;
		ResponseMessage message = FieldValidation.validateNullObject("PpSocListRequest", getPpSocListRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new SubscriptionDetailException(message.getStatus(),message.getMessage()+" Please bind the ppSocListRequest object");
		} else {
			message = FieldValidation.validateCsaField(getPpSocListRequest().getCsa());
			if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
				throw new SubscriptionDetailException(message.getStatus(),message.getMessage()+" PpSocListRequest must have CSA Field populated");
			} else {
				retValue = true;
			}
		}
		return retValue;
	}
	
	public boolean validateSubscriptionRequest() throws SubscriptionDetailException {
		boolean retValue = false;
		ResponseMessage message = FieldValidation.validateNullObject("QuerySubscriptionRequest", getSubscriptionRequest());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new SubscriptionDetailException(message.getStatus(),message.getStatus());
		} else {
			if( getSubscriptionRequest().getMdn() != null || getSubscriptionRequest().getEsn() != null ) {
				if( getSubscriptionRequest().getMdn() != null && getSubscriptionRequest().getEsn() == null ) {
					message = FieldValidation.validateMDNField(getSubscriptionRequest().getMdn());
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new SubscriptionDetailException(message.getStatus(),message.getMessage());
					} 
				} else if( getSubscriptionRequest().getMdn() == null && getSubscriptionRequest().getEsn() != null ) {
					message = FieldValidation.validateNullObject("SubscriptionRequest ESN",getSubscriptionRequest().getEsn());
					if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
						throw new SubscriptionDetailException(message.getStatus(),message.getMessage());
					} else {
						SerialNumber serialno = getSubscriptionRequest().getEsn();
						message = FieldValidation.validateNullObject("SubscriptionDetailRequest Esn", serialno.getElectronicSerialNumber());
						if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
							message = FieldValidation.validateNullObject("SubscriptionDetailRequest MEID", serialno.getMobileEquipmentIdentifier());
							if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
								throw new SubscriptionDetailException(message.getStatus(),"Either ESN or MEID must be populated if MDN is null...");
							}
						}
					}
				}
				retValue = true;
			} else {
				throw new SubscriptionDetailException(FieldValidation.STATUS_FAILED,"QuerySubscriptionRequest must have either MDN or ESN poputlated");
			}
		}
		return retValue;
	}
	
	public boolean validateValidNpaListRequest() throws SubscriptionDetailException {
		boolean retValue = false;
		ResponseMessage message = new ResponseMessage();
		message = FieldValidation.validateCsaField(getValidNpaListRequest().getCsa());
		if( message.getStatus().equalsIgnoreCase(FieldValidation.STATUS_FAILED) ) {
			throw new SubscriptionDetailException(message.getStatus(),message.getMessage()+" Please confirm CSA provided.");
		} else {
			retValue = true;
		}
		return retValue;
	}
	
	// [end] validation methods
	
	// [start] accessors
	
	/**
	 * Method designed to return a list of CSAs known to the MVNO
	 * 
	 */
	public QueryCsaListReply queryCsaList( String parameter ) throws SubscriptionDetailException {
		String methodName = "queryCsaList";
		QueryCsaListReply csaList = new QueryCsaListReply();
		try {
			System.out.println("Testing queryCsaList::Start");
			csaList = subscriptionDetailbinding.queryCsaList(parameter);
//			com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub binding;
//	        try {
//	            binding = (com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub)
//	                          new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceLocator(config).getWholesaleSubscriptionDetailPort();
//	        }
//	        catch (javax.xml.rpc.ServiceException jre) {
//	            if(jre.getLinkedCause()!=null)
//	                jre.getLinkedCause().printStackTrace();
//	            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
//	        }
//	        ResponseMessage message = new ResponseMessage();
//	        message = FieldValidation.validateNullObject("binding is null", binding);
//	        if( message.getStatus().equals(FieldValidation.STATUS_FAILED) ) {
//	        	throw new SubscriptionDetailException(message.getMessage()+" Binding is null");
//	        }
//
//	        // Time out after a minute
//	        binding.setTimeout(60000);
//
//	        // Set header
//	        /**
//             * Header work
//             * 	Done manually by dta
//             */
//	        binding.setUsername("PRIMUS05");
//	        binding.setPassword("MAY08G03");
//	        
//	        // header attempt3
//        	
//	        SOAPHeaderElement messageHeader = new SOAPHeaderElement(new PrefixedQName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "wsMessageHeader", "m"));
//	        
//	        MessageElement trackingMessageHeader = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "trackingMessageHeader", "m"));
//	        trackingMessageHeader.setPrefix("m");
//	        
//	        MessageElement applicationId = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "applicationId", "m") );
//	        applicationId.setValue("500001305");
//	        applicationId.setPrefix("m");
//	        
//	        MessageElement applicationUserId = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "applicationUserId", "m"));
//	        applicationUserId.setValue("PRIMUS5");
//	        applicationUserId.setPrefix("m");
//	        
//	        MessageElement messageId = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "messageId", "m"));
//	        messageId.setValue("1234");
//	        messageId.setPrefix("m");
//	        
//	        MessageElement timeToLive = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "timeToLive", "m"));
//	        timeToLive.setValue("0");
//	        timeToLive.setPrefix("m");
//	        
//	        MessageElement messageDateTimeStamp = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "messageDateTimeStamp", "m"));
//	        messageDateTimeStamp.setValue("2008-03-26T16:14:47.0Z");
//	        messageDateTimeStamp.setPrefix("m");
//	        //messageDateTimeStamp.setType(new QName())
//	        
//	        trackingMessageHeader.addChildElement(applicationId);
//	        trackingMessageHeader.addChildElement(applicationUserId);
//	        trackingMessageHeader.addChildElement(messageId);
//	        trackingMessageHeader.addChildElement(timeToLive);
//	        trackingMessageHeader.addChildElement(messageDateTimeStamp);
//	        
//	        
//	        messageHeader.addChildElement(trackingMessageHeader);
//	        trackingMessageHeader.setParentElement(messageHeader);
//	        binding.setHeader(messageHeader);
//	        // end header attempt3
//	        
//	        SOAPHeaderElement[] headerList = binding.getHeaders();
//	        if( headerList != null && headerList.length > 0 ) {
//	        	System.out.println("headerlist is not empty!!");
//	        	for( int i = 0; i < headerList.length; i++ ) {
//	        		System.out.println("HeaderList["+i+"]");
//	        		System.out.println("HeaderList["+i+"].LocalName     :: "+headerList[i].getLocalName());
//	        		System.out.println("HeaderList["+i+"].Name          :: "+headerList[i].getName());
//	        		System.out.println("HeaderList["+i+"].Value         :: "+headerList[i].getValue());
//	        		System.out.println("HeaderList["+i+"].toString      :: "+headerList[i].toString());
//	        	}
//	        }
//	        binding.setPassword("MAY08G03");
//	        binding.setUsername("PRIMUS5");
//            /**
//             * End Header work
//             */
//	        
//	        // Test operation
//	        try {
//	            com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryCsaListReply value = null;
//	            //value = binding.queryCsaList(new java.lang.String());
//	            value = binding.queryCsaList("");
//	            csaList = value;
//			} catch( ErrorDetailsType ws_err ) {
//				//logger.error("SOAP Fault Actor   :: "+ws_err.getFaultActor());
//				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
//	        } catch ( Exception e ) {
//	        	throw new SubscriptionDetailException(e);
//	        }
	             //TBD - validate results
//			com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceTestCase myTest = new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceTestCase("SubscriptionDetailClient");
//			try {
//				myTest.test5WholesaleSubscriptionDetailPortQueryCsaList();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			csaList = subscriptionDetailPortType.queryCsaList(null);
		} catch( ErrorDetailsType ws_err ) {
			TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
			throw new SubscriptionDetailException(CLASS_NAME,methodName,ws_err);
		} catch( Exception e ) {
			throw new SubscriptionDetailException(e);
		}
		return csaList;
	}
	
	/**
	 * This method assumes that an external system has already made an instance of {@link QueryReservedSubscriptionRequest} 
	 * prior to being invoked.
	 * 
	 * <p>
	 * If the request object is null, then the method will throw a {@link SubscriptionDetailException}
	 * </p>
	 * @return QueryReservedSubscriptionReply
	 * @throws SubscriptionDetailException
	 * 
	 */
	public QueryReservedSubscriptionReply queryReservedSubscription() throws SubscriptionDetailException {
		String methodName = "queryReservedSubscription";
		QueryReservedSubscriptionReply reservedSubscription = new QueryReservedSubscriptionReply();
		if( validateReservedSubscriptionRequest() ) {	        
			try {
				reservedSubscription = subscriptionDetailbinding.queryReservedSubscription(getReservedSubscriptionRequest());
			} catch( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new SubscriptionDetailException(CLASS_NAME,methodName,ws_err);
			} catch (Exception e) {
				throw new SubscriptionDetailException(e);
			}
		}
		return reservedSubscription;
	}
	
	/**
	 * This method will override the local instance of {@link QueryReservedSubscriptionRequest} with a new request 
	 * object using the MDN provided. 
	 * 
	 * @param iMdn -- String value representing the MDN
	 * @return
	 * @throws SubscriptionDetailException
	 */
	public QueryReservedSubscriptionReply queryReservedSubscription(String iMdn) throws SubscriptionDetailException {
		QueryReservedSubscriptionRequest request = new QueryReservedSubscriptionRequest();
		request.setMdn(iMdn);
		setReservedSubscriptionRequest(request);
		QueryReservedSubscriptionReply reservedSubscription = queryReservedSubscription();
		return reservedSubscription;
	}
	
	/**
	 * Invoke the queryPpSocList to retrieve the list of known SOCCodes given a CSA
	 * 
	 * <P>This method assumes that the internal object {@link QueryPpSocListRequest} has been bound
	 * and instantiated.
	 * </P>
	 * @return
	 * @throws SubscriptionDetailException
	 */
	public QueryPpSocListReply queryPpSocList() throws SubscriptionDetailException {
		String methodName = "queryPpSocList";
		QueryPpSocListReply ppSocList = new QueryPpSocListReply();
		if( validatePpSocListRequest() ) {
			try {
				//ppSocList = subscriptionDetailPortType.queryPpSocList(getPpSocListRequest());
				System.setProperty("javax.xml.parsers.SAXParserFactory", "org.apache.xerces.jaxp.SAXParserFactoryImpl");
	            System.setProperty("javax.xml.parsers.SAXParser", "org.apache.xerces.jaxp.SAXParserImpl");
				ppSocList = subscriptionDetailbinding.queryPpSocList(getPpSocListRequest());
				System.getProperties().remove("javax.xml.parsers.SAXParserFactory");
				System.getProperties().remove("javax.xml.parsers.SAXParser");
			} catch( ErrorDetailsType ws_err ) {
				System.out.println("WS Error thrown");
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new SubscriptionDetailException(CLASS_NAME,methodName,ws_err);
			} catch( Exception e ) {
				throw new SubscriptionDetailException(e);
			}
		}
		return ppSocList;
	}
	
	/**
	 * This method will ignore the internal {@link QueryPpSocListRequest} object and override it with 
	 * the provided CSA value.
	 * 
	 * @param iCsa
	 * @return
	 * @throws SubscriptionDetailException
	 */
	public QueryPpSocListReply queryPpSocList(String iCsa) throws SubscriptionDetailException {
		QueryPpSocListRequest request = new QueryPpSocListRequest(iCsa);
		setPpSocListRequest(request);
		QueryPpSocListReply ppSocList = queryPpSocList();
		return ppSocList;
	}
	
	/**
	 * method designed to allow access to current subscription information.
	 * 
	 * <p>
	 * This API provides the ability to access MVNO subscription current and historical information based on 
	 * access number or Device ID.
	 * </p><p>Wsdl name: WholesaleSubscriptionDetail.wsdl</p>
	 * <p>Imported Schemas: SubscriptionDetailEnvelope.xsd, ErrorDetails.xsd, WSMessageHeader.xsd</P>
	 * <p>Operation: QuerySubscription
	 * </P>
	 * @return
	 * @throws SubscriptionDetailException
	 */
	public QuerySubscriptionReply querySubscription() throws SubscriptionDetailException {
		String methodName = "querySubscription";
		QuerySubscriptionReply subscription = new QuerySubscriptionReply();
		if( validateSubscriptionRequest() ) {
			try {
				subscription = subscriptionDetailbinding.querySubscription(getSubscriptionRequest());
			} catch( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new SubscriptionDetailException(CLASS_NAME,methodName,ws_err);
			} catch( Exception e ) {
				throw new SubscriptionDetailException(e);
			}
		}
		return subscription;
	}
	
	/**
	 * Overloaded method of querySubscription() designed to allow an external system to designate the 
	 * MDN to be used.
	 * 
	 * <p>
	 * MDN provided will override the locally stored copy of {@link QuerySubscriptionRequest} with a new 
	 * version of the request using the MDN provided.
	 * </p>
	 * @param iMdn
	 * @return
	 * @throws SubscriptionDetailException
	 */
	public QuerySubscriptionReply querySubscription(String iMdn) throws SubscriptionDetailException {
		QuerySubscriptionRequest request = new QuerySubscriptionRequest();
		request.setMdn(iMdn);
		setSubscriptionRequest(request);
		return querySubscription();
	}
	
	/**
	 * <p>
	 * This method will provide the invoker the ability to obtain service level information pertaining to 
	 * a specific esn. 
	 * </p>
	 * <p>
	 * By invoking this method, the user will bind a new {@link QuerySubscriptionRequest} using an ESN as the 
	 * query basis.
	 * </p>
	 * @param iEsnDec   Decimal representation of the ESN -- 11 to 18 Characters in length
	 * @param iEsnHex   Hexidecimal representation of the ESN -- 4 to 8 Characters in length
	 * @param iMeIdDec	Decimal representation of the Mobile Equipment Id
	 * @param iMeIdHex	Hexidecimal representation of the Mobile Equipment Id
	 * @return
	 * @throws SubscriptionDetailException
	 */
	public QuerySubscriptionReply querySubscription(String iEsnDec, String iEsnHex, String iMeIdDec, String iMeIdHex ) throws SubscriptionDetailException {
		ElectronicSerialNumber esn = new ElectronicSerialNumber(iEsnDec,iEsnHex);
		MobileEquipmentIdentifier mei = new MobileEquipmentIdentifier(iMeIdDec,iMeIdHex);
		SerialNumber serialNo = new SerialNumber(esn,mei);
		QuerySubscriptionRequest request = new QuerySubscriptionRequest();
		request.setEsn(serialNo);
		return querySubscription();
	}
	
	/**
	 * This API is used to get the valid NPA List for a given leaf level CSA.
	 * <p>Wsdl name: WholesaleSubscriptionDetail.wsdl</p>
	 * <p>Imported Schemas: SubscriptionDetailEnvelope.xsd, ErrorDetails.xsd, WSMessageHeader.xsd</p>
	 * <p>Operation: QueryValidNpaList</p>
	 * 
	 * @return
	 * @throws SubscriptionDetailException
	 */
	public QueryValidNpaListReply queryNpaList() throws SubscriptionDetailException { 
		String methodName = "queryNpaList";
		QueryValidNpaListReply validNpaList = new QueryValidNpaListReply();
		if( validateValidNpaListRequest() ) {
//	        com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub binding;
//	        try {
//	            binding = (com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailBindingStub)
//	                          new com.sprint.integration.eai.services.WholesaleSubscriptionDetail.v1.WholesaleSubscriptionDetail_wsdl.WholesaleSubscriptionDetailServiceLocator(config).getWholesaleSubscriptionDetailPort();
//	        }
//	        catch (javax.xml.rpc.ServiceException jre) {
//	            if(jre.getLinkedCause()!=null)
//	                jre.getLinkedCause().printStackTrace();
//	            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
//	        }
//	        //assertNotNull("binding is null", binding);
//
//	        // Time out after a minute
//	        binding.setTimeout(60000);
//
//	        // Test operation
//	        try {
//		        // header attempt3
//	        	
//		        SOAPHeaderElement messageHeader = new SOAPHeaderElement(new PrefixedQName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "wsMessageHeader", "m"));
//		        
//		        MessageElement trackingMessageHeader = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "trackingMessageHeader", "m"));
//		        trackingMessageHeader.setPrefix("m");
//		        
//		        MessageElement applicationId = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "applicationId", "m") );
//		        applicationId.setValue("500001305");
//		        applicationId.setPrefix("m");
//		        
//		        MessageElement applicationUserId = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "applicationUserId", "m"));
//		        applicationUserId.setValue("PRIMUS5");
//		        applicationUserId.setPrefix("m");
//		        
//		        MessageElement messageId = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "messageId", "m"));
//		        messageId.setValue("1234");
//		        messageId.setPrefix("m");
//		        
//		        MessageElement timeToLive = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "timeToLive", "m"));
//		        timeToLive.setValue("0");
//		        timeToLive.setPrefix("m");
//		        
//		        MessageElement messageDateTimeStamp = new MessageElement(new QName("http://integration.sprint.com/common/header/WSMessageHeader/v2", "messageDateTimeStamp", "m"));
//		        messageDateTimeStamp.setValue("2008-03-26T16:14:47.0Z");
//		        messageDateTimeStamp.setPrefix("m");
//		        //messageDateTimeStamp.setType(new QName())
//		        
//		        trackingMessageHeader.addChildElement(applicationId);
//		        trackingMessageHeader.addChildElement(applicationUserId);
//		        trackingMessageHeader.addChildElement(messageId);
//		        trackingMessageHeader.addChildElement(timeToLive);
//		        trackingMessageHeader.addChildElement(messageDateTimeStamp);
//		        
//		        
//		        messageHeader.addChildElement(trackingMessageHeader);
//		        trackingMessageHeader.setParentElement(messageHeader);
//		        binding.setHeader(messageHeader);
//		        binding.setPassword("MAY08G03");
//		        binding.setUsername("PRIMUS5");
//		        for( int i = 0; i < binding.getHeaders().length; i++ ) {
//		        	System.out.println("Message Header["+i+"]:");
//		        	System.out.println(binding.getHeaders()[i].toString());
//		        	System.out.println("");
//		        }
//		        // end header attempt3
//		        
//	            com.sprint.integration.interfaces.WholesaleSubscriptionDetail.v1.SubscriptionDetailEnvelope_xsd.QueryValidNpaListReply value = null;
//	            value = binding.queryValidNpaList(getValidNpaListRequest());
//	            validNpaList = value;
//	        }
//	        catch (com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType e1) {
//	            //throw new junit.framework.AssertionFailedError("fault Exception caught: " + e1);
//	        	System.out.println("Actor        : "+e1.getFaultActor());
//	        	System.out.println("Node         : "+e1.getFaultNode());
//	        	System.out.println("FaultReason  : "+e1.getFaultReason());
//	        	System.out.println("FaultString  : "+e1.getFaultString());
//	        	System.out.println("FaultCode    : "+e1.getFaultCode());
//	        	System.out.println("FaultDetails : "+e1.getFaultDetails());
//	        	System.out.println("FaultMessage : "+e1.getMessage());
//	        	ProviderErrorType error = e1.getProviderError();
//	        	TypeDesc desc = ProviderErrorType.getTypeDesc();
//	        	System.out.println("ErrorCode    : "+error.getProviderErrorCode());
//	        	System.out.println("ErrorText    : "+error.getProviderErrorText());
//	        	//System.out.println("ErrorTypeDesc: "+desc.);
//	        	throw new SubscriptionDetailException(e1);
//	        } catch( Exception e ) {
//	        	throw new SubscriptionDetailException(e);
//	        }
			try {
				//validNpaList = subscriptionDetailPortType.queryValidNpaList(getValidNpaListRequest());
				validNpaList = subscriptionDetailbinding.queryValidNpaList(getValidNpaListRequest());
			} catch( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
				throw new SubscriptionDetailException(CLASS_NAME,methodName,ws_err);
			} catch ( Exception e ) {
				throw new SubscriptionDetailException(e);
			}
		}
		return validNpaList;
	}
	
	/**
	 * Overloaded method designed to allow the invoker the ability to provide a CSA Value as a parameter.
	 * 
	 * <p>This method will rebind the local instance of {@link QueryValidNpaListRequest} with a new one using
	 * the CSA value provided.</p>
	 * 
	 * @param iCsa
	 * @return
	 * @throws SubscriptionDetailException
	 */
	public QueryValidNpaListReply queryNpaList( String iCsa ) throws SubscriptionDetailException {
		QueryValidNpaListRequest request = new QueryValidNpaListRequest();
		request.setCsa(iCsa);
		setValidNpaListRequest(request);
		return queryNpaList();
	}
	
	// [end] accessors

	// [start] main method
	
	public static void main(String[] args) throws Exception {
		System.out.println("Testing Subscription Detail");
		String input = "";
		try {
			boolean running = true;
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
			while( running ) {
				if( args != null && args.length > 0 ) {
					System.out.println("args[] is not empty");
					for( int i = 0; i < args.length; i++ ) {
						System.out.println("args["+i+"]::"+args[i]);
					}
					input = args[0];
					running = false;
				} else {
					System.out.println("**** No arguments found...Please set set one of the following as arg[0]");
					genMenu();
					input = br.readLine();
				}
				if( input.equals("000") ) {
					//System.out.println("No Recorder 00 Message: "+org.apache.axis.utils.Messages.getMessage("noRecorder00"));
					running = false;
				} else if ( input.equals("001") ) {
					System.out.println("Testing Query Csa List");
			    	SubscriptionDetailClient subscriptionDetail = new SubscriptionDetailClient();
//			    	String currentSaxDriver = System.getProperty("org.xml.sax.helpers.XMLReaderFactory");
//			    	System.out.println("Current SAX Driver: "+currentSaxDriver);
//			    	System.setProperty("javax.xml.parsers.SAXParserFactory", "org.apache.xerces.parser.SAXParser");
//			    	System.setProperty("javax.xml.parsers.SAXParser", "org.apache.xerces.parsers.SAXParser");
//			    	
			    	
			    	QueryCsaListReply csaList = new QueryCsaListReply();
			    	subscriptionDetail.setUserName(MainHelper.populateRequiredField("UserName", br, subscriptionDetail.getUserName()));
			    	subscriptionDetail.setOrderId(MainHelper.populateRequiredField("OrderId", br, subscriptionDetail.getOrderId()));
			    	csaList = subscriptionDetail.queryCsaList("");
			    	if( csaList != null ) {
			    		CsaRecord[] csaArray = csaList.getCsaList();
			    		for( int i = 0; i < csaArray.length; i++ ) {
			    			System.out.println("Csa Information at index    ::  "+i);
			    			System.out.println("    CSA Value               ::  "+csaArray[i].getCsa());
			    			System.out.println("    CSA Description         ::  "+csaArray[i].getCsaDescription());
			    		}
			    	} else {
			    		System.out.println("csaList is null!!");
			    	}
//			    	if( currentSaxDriver == null ) {
//			    		System.out.println("Removing Sax Driver from properties");
//			    		System.getProperties().remove("org.xml.sax.helpers.XMLReaderFactory");
//			    		System.getProperties().remove("javax.xml.parsers.SAXParserFactory");
//			    		System.getProperties().remove("javax.xml.parsers.SAXParser");
//			    		System.getProperties().remove("org.xml.sax.driver");
//			    	} else {
//			    		System.out.println("Restoring Sax Driver to "+currentSaxDriver);
//			    		System.getProperties().remove("org.xml.sax.helpers.XMLReaderFactory");
//			    		System.getProperties().remove("javax.xml.parsers.SAXParserFactory");
//			    		System.getProperties().remove("javax.xml.parsers.SAXParser");
//			    		System.setProperty("org.xml.sax.driver", currentSaxDriver);
//			    	}
				} else if ( input.equals("002") ) {
					System.out.println("Testing Query Reserved Subscription");
			    	SubscriptionDetailClient subClient = new SubscriptionDetailClient();
			    	QueryReservedSubscriptionRequest subRequest = new QueryReservedSubscriptionRequest();
			    	QueryReservedSubscriptionReply subReply = new QueryReservedSubscriptionReply();
			    	subClient.setUserName(MainHelper.populateRequiredField("UserName", br, subClient.getUserName()));
			    	subClient.setOrderId(MainHelper.populateRequiredField("OrderId", br, subClient.getOrderId()));
			    	subRequest.setMdn(MainHelper.populateRequiredField("Mdn", br, subRequest.getMdn()));
			    	subClient.setReservedSubscriptionRequest(subRequest);
			    	try {
			    		subReply = subClient.queryReservedSubscription();
			    		if( subReply == null ) {
			    			throw new SubscriptionDetailException("SubReply is null!");
			    		}
			    		System.out.println("SubReply.Csa         :: "+subReply.getCsa());
			    		System.out.println("SubReply.Mdn         :: "+subReply.getMdn());
			    		System.out.println("SubReply.Msid        :: "+subReply.getMsid());
			    		System.out.println("SubReply.RsvDate     :: "+subReply.getReserveDate().toString());
			    		System.out.println("SubReply.RsvTime     :: "+subReply.getReserveTime());
			    		System.out.println("SubReply.RsvMdnId    :: "+subReply.getReserveMdnId());
			    		System.out.println("SubReply.RsvSubId    :: "+subReply.getReserveSubscriptionId());
			    		System.out.println("SubReply.RsvTime     :: "+subReply.getReserveTime());
			    		System.out.println("SubReply.PricePlan   :: "+subReply.getPricePlan().getServiceCode());
			    		System.out.println("SubReply.ServiceList :: ");
			    		for( int i = 0; i < subReply.getServiceList().length; i++ ) {
			    			ProductDeployment service = subReply.getServiceList()[i];
			    			if( service != null ) {
			    				System.out.println("**** Service["+i+"].ServiceCode :: "+service.getServiceCode());
			    				System.out.println("**** Service["+i+"].EffDate     :: "+service.getServiceEffectiveDate());
			    				System.out.println("**** Service["+i+"].ExpDate     :: "+service.getServiceExpirationDate());
			    			}
			    		}
			    	} catch( SubscriptionDetailException sub_ex ) {
			    		handleLocalException(sub_ex);
			    	}
				} else if ( input.equals("003") ) {
					System.out.println("Testing Query Pp Soc List");
					SubscriptionDetailClient subClient = new SubscriptionDetailClient();
					QueryPpSocListRequest ppSocRequest = new QueryPpSocListRequest();
					QueryPpSocListReply ppSocReply = new QueryPpSocListReply();
					if( args != null && args.length > 1 ) {
						subClient.setUserName(args[1]);
					} else {
						subClient.setUserName(MainHelper.populateRequiredField("UserName", br, subClient.getUserName()));
					}
					if( args != null && args.length > 2 ) {
						subClient.setOrderId(args[2]);
					} else {
						subClient.setOrderId(MainHelper.populateRequiredField("OrderId", br, subClient.getOrderId()));
					}
					if( args != null && args.length > 3 ) {
						ppSocRequest.setCsa(args[3]);
					} else {
						ppSocRequest.setCsa(MainHelper.populateRequiredField("Csa", br, ppSocRequest.getCsa()));
					}
					
					subClient.setPpSocListRequest(ppSocRequest);
					try { 
						ppSocReply = subClient.queryPpSocList();
				    	if( ppSocReply != null ) {
				    		SocProfileRecord[] socList = ppSocReply.getSocProfileList();
				    		if( socList != null ) {
			    				System.out.println("iterating through SOC List");
				    			for( int i = 0; i < socList.length; i++ ) {
				    				System.out.println("SOC["+i+"]                  :"+socList[i].getSoc());
				    				System.out.println("SOC["+i+"].ServiceCode      :"+socList[i].getServiceCode());
				    				System.out.println("SOC["+i+"].SocDescription   :"+socList[i].getSocDescription());
				    				System.out.println("SOC["+i+"].SocStatus        :"+socList[i].getSocStatus());
				    				System.out.println("SOC["+i+"].EffDate          :"+socList[i].getEffectiveDate());
				    				System.out.println("SOC["+i+"].ExpDate          :"+socList[i].getExpirationDate());
				    				System.out.println("SOC["+i+"].SalesEffDate     :"+socList[i].getSaleEffectiveDate());
				    				System.out.println("SOC["+i+"].SalesExpDate     :"+socList[i].getSaleExpireDate());
				    				System.out.println("SOC["+i+"].ServiceType      :"+socList[i].getServiceType());
				    				System.out.println("");
				    			}
				    		}
				    	} else {
				    		System.out.println("ppSocList is null!");
				    	}
					} catch( SubscriptionDetailException sub_ex ) {
						handleLocalException(sub_ex);
					}
				} else if ( input.equals("004") ) {
					System.out.println("TestingQuery Subscription");
					SubscriptionDetailClient subClient = new SubscriptionDetailClient();
					QuerySubscriptionRequest subRequest = new QuerySubscriptionRequest();
					QuerySubscriptionReply subReply = new QuerySubscriptionReply();
					if( args != null && args.length >= 2 ) {
						subClient.setUserName(args[1]);
					} else {
						subClient.setUserName(MainHelper.populateRequiredField("UserName", br, subClient.getUserName()));
					}
					if( args != null && args.length >= 3 ) {
						subClient.setOrderId(args[2]);
					} else {
						subClient.setOrderId(MainHelper.populateRequiredField("OrderId", br, subClient.getOrderId()));
					}
					if( args != null && args.length >= 4 ) {
						subRequest.setMdn(args[3]);
					} else {
						System.out.println("Populate ESN or MDN?");
						input = br.readLine();
						if( input.substring(0,1).equalsIgnoreCase("e") ) {
							subRequest.setEsn(populateSerialNumber(br));
						} else if( input.substring(0,1).equalsIgnoreCase("m") ) {
							subRequest.setMdn(MainHelper.populateRequiredField("Mdn", br, subRequest.getMdn()));
						} else {
							System.out.println("Unknown command");
						}
					}
					subClient.setSubscriptionRequest(subRequest);
					try {
						if( subClient.validateSubscriptionRequest() ) {
							subReply = subClient.querySubscription();
							if( subReply == null ) {
								throw new SubscriptionDetailException("SubReply is null!!");
							}
							System.out.println("SubReply.ActivationDate  :: "+subReply.getActivationDate());
							System.out.println("SubReply.Csa             :: "+subReply.getCsa());
							System.out.println("SubReply.SubTypeCode     :: "+subReply.getSubscriptionTypeCode());
							System.out.println("SubReply.EffectiveDate   :: "+subReply.getSubscriptionEffectiveDate());
							System.out.println("SubReply.ExpirationDate  :: "+subReply.getSubscriptionExpireDate());
							if( subReply.getCurrentNaiList() != null ) {
								System.out.println("SubReply.CurrentNaiList  :: ");
								for( int i = 0; i < subReply.getCurrentNaiList().length; i++ ) {
									System.out.println("**** Nai["+i+"].CurrentNaiValue        :: "+subReply.getCurrentNaiList()[i].getNaiValue());
									System.out.println("**** Nai["+i+"].CurrentNaiEffDate      :: "+subReply.getCurrentNaiList()[i].getEffectiveDate());
									System.out.println("**** Nai["+i+"].CurrentNaiExpDate      :: "+subReply.getCurrentNaiList()[i].getExpirationDate());
									System.out.println("**** Nai["+i+"].CurrentNaiSrvAttrCode  :: "+subReply.getCurrentNaiList()[i].getServiceAttributeTypeCode());
									System.out.println("**** Nai["+i+"].CurrentNaiNetStatCode  :: "+subReply.getCurrentNaiList()[i].getNetworkStatusCode());
								}
							} else {
								System.out.println("SubReply.CurrentNaiList  :: null...");
							}
							if( subReply.getEsnList() != null ) {
								System.out.println("SubReply.EsnList         :: ");
								for( int i = 0; i < subReply.getEsnList().length; i++ ) {
									System.out.println("**** ESN["+i+"].EsnMeid(DEC)           :: "+subReply.getEsnList()[i].getEsnMeidDeclId());
									System.out.println("**** ESN["+i+"].ESNEffectiveDate       :: "+subReply.getEsnList()[i].getEffectiveDate());
									SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");								
									System.out.println("**** ESN["+i+"].ESNEffectiveDateFmttd  :: "+sdf.format(subReply.getEsnList()[i].getEffectiveDate()));
									System.out.println("**** ESN["+i+"].ESNEffectiveTime       :: "+subReply.getEsnList()[i].getEffectiveTime().toString());
									System.out.println("**** ESN["+i+"].ESNExpirationDate      :: "+subReply.getEsnList()[i].getExpirationDate());								
								}
							} else {
								System.out.println("SubReply.EsnList         :: is null...");
							}
							if( subReply.getMdnList() != null ) {
								System.out.println("SubReply.MdnList         :: ");
								for( int i = 0; i <subReply.getMdnList().length; i++ ) {
									System.out.println("**** MDN["+i+"].AccessNumber           :: "+subReply.getMdnList()[i].getAccessNbr());
									System.out.println("**** MDN["+i+"].EffectiveDate          :: "+subReply.getMdnList()[i].getEffectiveDate());
									System.out.println("**** MDN["+i+"].EffectiveTime          :: "+subReply.getMdnList()[i].getEffectiveTime());
									System.out.println("**** MDN["+i+"].ExpirationDate         :: "+subReply.getMdnList()[i].getExpirationDate());
									System.out.println("**** MDN["+i+"].ExpirationTime         :: "+subReply.getMdnList()[i].getExpirationTime());
									System.out.println("**** MDN["+i+"].MSID                   :: "+subReply.getMdnList()[i].getMsid());
									System.out.println("**** MDN["+i+"].PortDueDate            :: "+subReply.getMdnList()[i].getPortDueDate());
									if( subReply.getMdnList()[i].getPortStateInd() != null ) {
										System.out.println("**** MDN["+i+"].PortStateIndicator     :: "+subReply.getMdnList()[i].getPortStateInd().getValue());
									}
									if( subReply.getMdnList()[i].getSwitchStatusCode() != null ) {
										System.out.println("**** MDN["+i+"].SwitchStatusCode       :: "+subReply.getMdnList()[i].getSwitchStatusCode());
									}
								}
							} else {
								System.out.println("SubReply.MdnList         :: is null...");
							}
							if( subReply.getPricePlanList() != null ) {
								System.out.println("SubReply.PricePlanList   :: ");
								for( int i = 0; i < subReply.getPricePlanList().length; i++ ) {
									System.out.println("**** PricePlan["+i+"].ServiceCode      :: "+subReply.getPricePlanList()[i].getServiceCode());
									System.out.println("**** PricePlan["+i+"].ServiceDesc      :: "+subReply.getPricePlanList()[i].getServiceDescription());
									System.out.println("**** PricePlan["+i+"].CallFwdNum       :: "+subReply.getPricePlanList()[i].getCallForwardingNumber());
									System.out.println("**** PricePlan["+i+"].EffectiveDate    :: "+subReply.getPricePlanList()[i].getEffectiveDate());
									System.out.println("**** PricePlan["+i+"].ExpirationDate   :: "+subReply.getPricePlanList()[i].getExpirationDate());
									if( subReply.getPricePlanList()[i].getServiceDescriptionList() != null ) {
										System.out.println("**** **** PricePlan["+i+"].ServiceDescriptionList is not null...Traversing...");
										for( int j = 0; j < subReply.getPricePlanList()[i].getServiceDescriptionList().length; ++j ) {
											if( subReply.getPricePlanList()[i].getServiceDescriptionList()[j] != null ) {
												System.out.println("**** **** PricePlan["+i+"].ServiceDescriptionList["+j+"]"+subReply.getPricePlanList()[i].getServiceDescriptionList()[j]);
											}
										}
									} else {
										System.out.println("**** **** PricePlan["+i+"].ServiceDescriptionList is empty...Skipping...");
									}
								}
							} else {
								System.out.println("SubReply.PricePlanList   :: is null...");								
							}
							if( subReply.getDetailedServiceList() != null ) {
								System.out.println("SubReply.DetSrvList      :: ");
								for( int i = 0; i < subReply.getDetailedServiceList().length; i ++ ) {
									System.out.println("**** Srv["+i+"].ServiceCode            :: "+subReply.getDetailedServiceList()[i].getServiceCode());
									System.out.println("**** Srv["+i+"].ServiceCodeDescription :: "+subReply.getDetailedServiceList()[i].getServiceDescription());
									System.out.println("**** Srv["+i+"].ServiceEffectiveDate   :: "+subReply.getDetailedServiceList()[i].getEffectiveDate());
									System.out.println("**** Srv["+i+"].ServiceExpirationDate  :: "+subReply.getDetailedServiceList()[i].getExpirationDate());
									System.out.println("**** Srv["+i+"].ServiceCallForwardNum  :: "+subReply.getDetailedServiceList()[i].getCallForwardingNumber());
								}
							} else {
								System.out.println("SubReply.DetSrvList      :: is null....");
							}
							//javax.xml.soap.SOAPFactory.
							//javax.xml.soap.SOAPEx
						}
					} catch ( SubscriptionDetailException sub_ex ) {
						handleLocalException(sub_ex);
					}
				} else if ( input.equals("005") ) {
					System.out.println("Testing Query Npa List");
					SubscriptionDetailClient subClient = new SubscriptionDetailClient();
					QueryValidNpaListRequest npaListRequest = new QueryValidNpaListRequest();
					QueryValidNpaListReply npaListReply = new QueryValidNpaListReply();
					if( args != null && args.length >= 2 ) {
						subClient.setUserName(args[1]);
					} else {
						subClient.setUserName(MainHelper.populateRequiredField("UserName", br, subClient.getUserName()));
					}
					if( args != null && args.length >= 3 ) {
						subClient.setOrderId(args[2]);
					} else {
						subClient.setOrderId(MainHelper.populateRequiredField("OrderId", br, subClient.getOrderId()));
					}
					if( args != null && args.length >= 4 ) {
						npaListRequest.setCsa(args[3]);
					} else {
						npaListRequest.setCsa(MainHelper.populateRequiredField("Csa", br, npaListRequest.getCsa()));
					}
					subClient.setValidNpaListRequest(npaListRequest);
					try { 
						npaListReply = subClient.queryNpaList();
						if( npaListReply == null ) {
							throw new SubscriptionDetailException(" NpaListReply is null!!");
						}
						System.out.println("Found "+npaListReply.getValidNpaList().length+" NPAs");
						for( int i = 0; i < npaListReply.getValidNpaList().length; i++ ) {
							System.out.println("NPA["+i+"]              :: "+npaListReply.getValidNpaList()[i]);
						}
					} catch( SubscriptionDetailException sub_ex ) {
						handleLocalException(sub_ex);
					}
				} else if ( input.equals("?") ) {
					genMenu();
				} else if ( input.equals("999") ) {
					System.out.println("Testing Query Csa List");
			    	SubscriptionDetailClient subscriptionDetail = new SubscriptionDetailClient();
			    	String currentSaxDriver = System.getProperty("org.xml.sax.driver");
			    	System.out.println("Current SAX Driver: "+currentSaxDriver);
			    	System.setProperty("org.xml.sax.driver", "org.apache.xerces.parser.SAXParser");
			    	QueryCsaListReply csaList = new QueryCsaListReply();
			    	//subscriptionDetail.setUserName(MainHelper.populateRequiredField("UserName", br, subscriptionDetail.getUserName()));
			    	//subscriptionDetail.setOrderId(MainHelper.populateRequiredField("OrderId", br, subscriptionDetail.getOrderId()));
			    	csaList = subscriptionDetail.queryCsaList("");
			    	if( csaList != null ) {
			    		CsaRecord[] csaArray = csaList.getCsaList();
			    		for( int i = 0; i < csaArray.length; i++ ) {
			    			System.out.println("Csa Information at index    ::  "+i);
			    			System.out.println("    CSA Value               ::  "+csaArray[i].getCsa());
			    			System.out.println("    CSA Description         ::  "+csaArray[i].getCsaDescription());
			    		}
			    	} else {
			    		System.out.println("csaList is null!!");
			    	}
			    	if( currentSaxDriver == null ) {
			    		System.out.println("Removing Sax Driver from properties");
			    		System.getProperties().remove("org.xml.sax.driver");
			    	} else {
			    		System.out.println("Restoring Sax Driver to "+currentSaxDriver);
			    		System.setProperty("org.xml.sax.driver", currentSaxDriver);
			    	}
				} else {
					System.out.println("Unknown Command! ? for help");
				}
			}
	    	//SubscriptionDetailClient subscriptionDetail = new SubscriptionDetailClient();
	    	/*QueryCsaListReply csaList = new QueryCsaListReply();
	    	csaList = subscriptionDetail.queryCsaList("");
	    	if( csaList != null ) {
	    		CsaRecord[] csaArray = csaList.getCsaList();
	    		for( int i = 0; i < csaArray.length; i++ ) {
	    			System.out.println("Csa Information at index    ::  "+i);
	    			System.out.println("    CSA Value               ::  "+csaArray[i].getCsa());
	    			System.out.println("    CSA Description         ::  "+csaArray[i].getCsaDescription());
	    		}
	    	} else {
	    		System.out.println("csaList is null!!");
	    	}*/
	    	/*QueryValidNpaListReply npaList = new QueryValidNpaListReply();
	    	npaList = subscriptionDetail.queryNpaList("PHXPHX602");
	    	if( npaList != null ) {
	    		String[] npas = npaList.getValidNpaList();
	    		System.out.println("Npa List returned...");
	    		for( int i = 0; i<npas.length; i++ ) {
	    			System.out.println("...npas["+i+"]     :: "+npas[i]);
	    		}
	    	} else {
	    		System.out.println("npaList is null!");
	    	}*/
	    	/*QueryPpSocListReply ppSocList = new QueryPpSocListReply();
	    	ppSocList = subscriptionDetail.queryPpSocList("NEVSDG619");
	    	if( ppSocList != null ) {
	    		SocProfileRecord[] socList = ppSocList.getSocProfileList();
	    		if( socList != null ) {
    				System.out.println("iterating through SOC List");
	    			for( int i = 0; i < socList.length; i++ ) {
	    				System.out.println("SOC["+i+"]                  :"+socList[i].getSoc());
	    				System.out.println("SOC["+i+"].ServiceCode      :"+socList[i].getServiceCode());
	    				System.out.println("SOC["+i+"].SocDescription   :"+socList[i].getSocDescription());
	    				System.out.println("SOC["+i+"].SocStatus        :"+socList[i].getSocStatus());
	    				System.out.println("SOC["+i+"].EffDate          :"+socList[i].getEffectiveDate());
	    				System.out.println("SOC["+i+"].ExpDate          :"+socList[i].getExpirationDate());
	    				System.out.println("SOC["+i+"].SalesEffDate     :"+socList[i].getSaleEffectiveDate());
	    				System.out.println("SOC["+i+"].SalesExpDate     :"+socList[i].getSaleExpireDate());
	    				System.out.println("");
	    			}
	    		}
	    	} else {
	    		System.out.println("ppSocList is null!");
	    	}*/
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		/*loadProps();
		System.out.println("URL::"+System.getProperty("url"));
		System.out.println("JAVA_HOME::"+System.getProperty("java_home"));
	    proxyURL = (props.getProperty("URL") != null && props.getProperty("URL").trim().length() > 0) ? props.getProperty("URL") : System.getProperty("url");

	    EngineConfiguration config = null;

	    if (System.getProperty("client.deploy.file.location") != null) {
			config = new FileProvider(System.getProperty("client.deploy.file.location"));
		}
	    WholesaleSubscriptionDetailServiceLocator subDetailService = new WholesaleSubscriptionDetailServiceLocator(config);
	    try {
	    	
	    	WholesaleSubscriptionDetailPortType subDetailPort = subDetailService.getWholesaleSubscriptionDetailPort(new URL(proxyURL));
	    	QueryCsaListReply csaList = subDetailPort.queryCsaList(null);
	    	if( csaList != null ) {
	    		System.out.println("SUCCEED");
	    	}
	    	//subDetailPort.queryPpSocList(parameters)
	    	//subDetailPort.queryReservedSubscription(parameters)
	    	//subDetailPort.querySubscription(parameters)
	    	//subDetailPort.queryValidNpaList(parameters)
	    } catch (Exception e) {
	    	e.printStackTrace();
	    	System.exit(0);
	    }*/
	    System.out.println("Done Testing SubscriptionDetail Service");
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
		System.out.println("**** **** Exit System                  :: 000 **** ****");
		System.out.println("**** **** Query Csa List               :: 001 **** ****");
		System.out.println("**** **** Query Reserved Subscription  :: 002 **** ****");
		System.out.println("**** **** Query Pp Soc list            :: 003 **** ****");
		System.out.println("**** **** Query Subscription           :: 004 **** ****");
		System.out.println("**** **** Query Npa List               :: 005 **** ****");
	}
	
	private static void handleLocalException( SubscriptionDetailException sub_ex ) {
		System.out.println("SubscriptionDetail Exception!!");
		System.out.println("SubscriptionDetail.Status   :: "+sub_ex.getStatus());
		System.out.println("SubscriptionDetail.Message  :: "+sub_ex.getMessage());
		sub_ex.printStackTrace();
	}
	
	private static SerialNumber populateSerialNumber(BufferedReader br) {
		SerialNumber serialNumber = new SerialNumber();
		try {
			ElectronicSerialNumber electronicSerialNumber = new ElectronicSerialNumber();
			electronicSerialNumber.setElectronicSerialNumberDec(MainHelper.populateRequiredField("ESN in Decimal", br, electronicSerialNumber.getElectronicSerialNumberDec()));
			
			serialNumber.setElectronicSerialNumber(electronicSerialNumber);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return serialNumber;
	}
	
	// [end] main method
}
