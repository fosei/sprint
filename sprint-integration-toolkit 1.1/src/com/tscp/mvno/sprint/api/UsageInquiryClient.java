package com.tscp.mvno.sprint.api;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
import com.sprint.integration.eai.services.WholesaleUsageInquiry.v1.WholesaleUsageInquiry_wsdl.WholesaleUsageInquiryBindingStub;
import com.sprint.integration.eai.services.WholesaleUsageInquiry.v1.WholesaleUsageInquiry_wsdl.WholesaleUsageInquiryPortType;
import com.sprint.integration.eai.services.WholesaleUsageInquiry.v1.WholesaleUsageInquiry_wsdl.WholesaleUsageInquiryServiceLocator;
import com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.QuerySubscriptionUsageReply;
import com.sprint.integration.interfaces.WholesaleUsageInquiry.v1.UsageInquiryEnvelope_xsd.QuerySubscriptionUsageRequest;
import com.tscp.mvno.exception.UsageInquiryException;
import com.tscp.mvno.support.FieldValidation;
import com.tscp.mvno.support.MainHelper;
import com.tscp.mvno.support.ResponseMessage;
import com.tscp.mvno.support.SprintHeader;
import com.tscp.mvno.support.TSCPLogger;

public class UsageInquiryClient {
	
	// [start] member fields
	
	public static final String CLASS_NAME = "UsageInquiryClient";
	public static final String URL		  = "wholesale.usage.inquiry.service.location.url";
	
	public static String inputPropertyFile = "client.properties";
	public static String proxyURL = "http://localhost:2222";  // WS End Point URL
	private static Properties props;
	
	private WholesaleUsageInquiryServiceLocator usageInquiryService;
	private WholesaleUsageInquiryBindingStub	usageBindingStub;
	private EngineConfiguration 				config;
	
	private SprintHeader 					header;
	private String							userName;
	private String							orderId;
	
	// [end] member fields
	
	// [start] get methods
	
	public String getOrderId() {
		return orderId;
	}

	public String getUserName() {
		return userName;
	}
	
	// [end] get methods
	
	// [start] set methods

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	// [end] set methods
	
	// [start] constructors
	
	public UsageInquiryClient() throws UsageInquiryException {
		this("tscp","0000");
	}
	
	public UsageInquiryClient(String iUserName, String iOrderID) throws UsageInquiryException {
		loadProps();
		//System.out.println("URL::"+System.getProperty("url"));
		//System.out.println("JAVA_HOME::"+System.getProperty("java_home"));
	    proxyURL = (props.getProperty(UsageInquiryClient.URL) != null && props.getProperty(UsageInquiryClient.URL).trim().length() > 0) ? props.getProperty(UsageInquiryClient.URL) : System.getProperty("url");
	    System.out.println("ProxyURL :: "+proxyURL);
	    config = null;

	    if (System.getProperty("client.deploy.file.location") != null) {
			config = new FileProvider(System.getProperty("client.deploy.file.location"));
		}
	    
		usageInquiryService = new WholesaleUsageInquiryServiceLocator(config);
		WholesaleUsageInquiryPortType usagePort;
		try {
			usagePort = usageInquiryService.getWholesaleUsageInquiryPort(new URL(proxyURL));
		} catch (Exception ex ) {
			throw new UsageInquiryException(ex);
		}
		usageBindingStub = (WholesaleUsageInquiryBindingStub)usagePort;
		setUserName(iUserName);
		setOrderId(iOrderID);
		header = new SprintHeader(getUserName(),getOrderId());
		usageBindingStub.setTimeout(header.getTimeOut());
		usageBindingStub.setPassword(header.getBindingPassword());
		usageBindingStub.setUsername(header.getBindingUserName());
		usageBindingStub.setHeader(header.getHeader());
	}
	
	// [end] constructors

	// [start] validation methods
	
	public boolean validateQuerySubscriptionUsageRequest( QuerySubscriptionUsageRequest subscriptionUsageRequest ) throws UsageInquiryException {
		boolean retValue = false;
		ResponseMessage responseMessage = new ResponseMessage();
		responseMessage = FieldValidation.validateNullObject("QuerySubscriptionUsageRequest",subscriptionUsageRequest);
		if( responseMessage == null ) {
			throw new UsageInquiryException("Failed validating null object subscriptionUsageRequest");
		} else if( responseMessage.getStatus().equals(FieldValidation.STATUS_FAILED) ) {
			throw new UsageInquiryException(FieldValidation.STATUS_FAILED,"Failed validating QuerySubscriptionUsageRequest");
		} else {
			//validate either MDN or ESN must be populated
			try {
				if( subscriptionUsageRequest.getMdn() != null ) {
					responseMessage = FieldValidation.validateMDNField(subscriptionUsageRequest.getMdn());
					if( responseMessage.getStatus() != FieldValidation.STATUS_SUCCEED ) {
						throw new UsageInquiryException(FieldValidation.STATUS_FAILED,"QuerySubscriptionUsageRequest.MDN field is invalid..."+responseMessage.getMessage());
					}
				} else if( subscriptionUsageRequest.getEsn().getElectronicSerialNumber().getElectronicSerialNumberDec() != null ) {
					responseMessage = FieldValidation.validateNullObject("ESN Decimal Field", subscriptionUsageRequest.getEsn().getElectronicSerialNumber().getElectronicSerialNumberDec());
					if( responseMessage.getStatus() != FieldValidation.STATUS_SUCCEED ) {
						throw new UsageInquiryException(FieldValidation.STATUS_FAILED,"QuerySubscriptionUsageRequest.ESN field is invalid..."+responseMessage.getMessage());
					}
				}
			} catch ( NullPointerException npe ) {
				throw new UsageInquiryException(FieldValidation.STATUS_FAILED,"Either ESN or MDN must be populated...");
			}
			retValue = true;
		}
		return retValue;
	}
	
	// [end] validation methods
	
	// [start] accessor methods
	
	public QuerySubscriptionUsageReply queryUsage(QuerySubscriptionUsageRequest usageRequest) throws UsageInquiryException {
		String methodName = "queryUsage";
		QuerySubscriptionUsageReply subReply = new QuerySubscriptionUsageReply();
		if( validateQuerySubscriptionUsageRequest(usageRequest) ) {
			try {
				subReply = usageBindingStub.querySubscriptionUsage(usageRequest);
			} catch ( ErrorDetailsType ws_err ) {
				TSCPLogger.logError(CLASS_NAME,methodName,ws_err);
				throw new UsageInquiryException(CLASS_NAME,methodName,ws_err);
			} catch ( Exception ex ) {
				throw new UsageInquiryException(ex);
			}
		}
		return subReply;
	}
	
	// [end] accessor methods
	
	
	public static void main(String[] args) {
		try {
			UsageInquiryClient usageClient = new UsageInquiryClient();
			QuerySubscriptionUsageRequest usageRequest = new QuerySubscriptionUsageRequest();
			QuerySubscriptionUsageReply usageReply = new QuerySubscriptionUsageReply();
			usageRequest.setMdn("6192591321");
			usageReply = usageClient.queryUsage(usageRequest);
			if( usageReply != null ) {
				System.out.println("Usage Reply returned...");
				System.out.println("MDN                   :: "+usageReply.getMdn());
				System.out.println("TotalCalls            :: "+usageReply.getTotalCalls().toString());
			} else {
				System.out.println("Usage Reply is null");
			}
		} catch( UsageInquiryException usage_ex ) {
			if( usage_ex.getWsError() != null ) {
				System.out.println("Error Code :: "+usage_ex.getWsError().getProviderError().getProviderErrorCode());
				System.out.println("Error Text :: "+usage_ex.getWsError().getProviderError().getProviderErrorText());
			}
			MainHelper.handleException(usage_ex);
			usage_ex.printStackTrace();
		} catch( Exception e ) {
			e.printStackTrace();
		}
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
}
