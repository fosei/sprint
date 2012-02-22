package com.tscp.mvno.sprint.api;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
import com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaBindingStub;
import com.sprint.integration.eai.services.QueryCsa.v1.QueryCsa_wsdl.QueryCsaServiceLocator;
import com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.GeographicCodeType;
import com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.PostalCode;
import com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.QueryCsaReply;
import com.sprint.integration.interfaces.QueryCsa.v1.QueryCsaEnvelope_xsd.QueryCsaRequest;
import com.tscp.mvno.exception.QueryCsaException;
import com.tscp.mvno.support.SprintHeader;
import com.tscp.mvno.support.TSCPLogger;


public class QueryCsaClient {

	// [start] member variables
	
	public static final String CLASS_NAME = "QueryCsaClient";
	public static final String URL		  = "wholesale.query.csa.service.location.url";
	
	public static String inputPropertyFile = "client.properties";
	public static String proxyURL = "http://localhost:2222";  // WS End Point URL
	private static Properties props;
	
	private QueryCsaBindingStub		csaServiceBinding;
	private QueryCsaServiceLocator 	csaServiceLocator;
	private EngineConfiguration 	config;
	
	private QueryCsaRequest 	mCsaRequest;
	private GeographicCodeType 	mGeoCode;
	
	private String				mStreet;
	private String				mXStreet;
	private String				mCity;
	private String				mState;
	private String				mCountry;
	private String				mZip;
	private String				mPlus4;
	
	private SprintHeader        header;
	private String				userName;
	private String				orderId;
	
	// [end] member variables
	
	// [start] constructors

	public QueryCsaClient() {
		this("tscp","0000");
	}
	
	public QueryCsaClient( String userName, String orderId ) {
		loadProps();
		proxyURL = (props.getProperty(QueryCsaClient.URL) != null && props.getProperty(QueryCsaClient.URL).trim().length() > 0) ? props.getProperty(QueryCsaClient.URL) : System.getProperty("url");

	    config = null;

	    if (System.getProperty("client.deploy.file.location") != null) {
			config = new FileProvider(System.getProperty("client.deploy.file.location"));
		}
	    
	    csaServiceLocator = new QueryCsaServiceLocator(config);
	    try {
	    	csaServiceBinding = (QueryCsaBindingStub)csaServiceLocator.getQueryCsaPort(new URL(proxyURL));
	    } catch ( Exception e ) {
	    	TSCPLogger.logError(CLASS_NAME,e);
	    }
	    setUserName(userName);
	    setOrderId(orderId);
	    header = new SprintHeader(getUserName(),getOrderId());
	    csaServiceBinding.setUsername(header.getBindingUserName());
	    csaServiceBinding.setPassword(header.getBindingPassword());
	    csaServiceBinding.setTimeout(header.getTimeOut());
	    csaServiceBinding.setHeader(header.getHeader());
	}
	
	public QueryCsaClient(String userName, String orderId, String iStreet, String iXStreet, String iCity, String iState, String iCountry, String iZip, String iPlus4) {
		this(userName,orderId);
		setStreet(iStreet);
		setXStreet(iXStreet);
		setCity(iCity);
		setState(iState);
		setCountry(iCountry);
		setZip(iZip);
		setPlus4(iPlus4);
	}
	
	// [end] constructors
	
	// [start] get methods
	
	public String getOrderId() {
		return orderId;
	}

	public String getUserName() {
		return userName;
	}
	
	public QueryCsaRequest getCsaRequest() {
		return mCsaRequest;
	}
	
	public GeographicCodeType getGeoCode() {
		return mGeoCode;
	}
	
	public String getStreet() {
		return mStreet;
	}
	
	public String getXStreet() {
		return mXStreet;
	}
	
	public String getCity() {
		return mCity;
	}
	
	public String getState() {
		return mState;
	}
	
	public String getCountry() {
		return mCountry;
	}
	
	public String getZip() {
		return mZip;
	}
	
	public String getPlus4() {
		return mPlus4;
	}
	
	// [end] get methods
	
	// [start] set methods

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setGeoCode() throws QueryCsaException {
		if( getZip() == null ) {
			throw new QueryCsaException("FAIL","Invalid Zip. Zip Cannot be null");
		} else if( getZip().length() != 5 ) {
			throw new QueryCsaException("FAIL","Invalid Zip. Zip must be 5 characters long.");
		}
		mGeoCode = GeographicCodeType.fromString("Zip");
	}
	
	public void setStreet( String iStreet ) {
		mStreet = iStreet;
	}
	
	public void setXStreet( String iXStreet ) {
		mXStreet = iXStreet;
	}
	
	public void setCity( String iCity ) {
		mCity = iCity;
	}
	
	public void setState( String iState ) {
		mState = iState;
	}
	
	public void setCountry( String iCountry ) {
		mCountry = iCountry;
	}
	
	public void setZip( String iZip ) {
		mZip = iZip;
	}
	
	public void setPlus4( String iPlus4 ) {
		mPlus4 = iPlus4;
	}
	
	public void setCsaRequest() {
		PostalCode postalCode = new PostalCode(getZip(),getPlus4());
		mCsaRequest = new QueryCsaRequest(getGeoCode(),getStreet(),getXStreet(),getCity(),getState(),postalCode,getCountry());
	}
	
	public void setCsaRequest(QueryCsaRequest request) {
		mCsaRequest = request;
	}
	// [end] set methods
	
	// [start] accessor methods
	
	public boolean bindQueryCsaRequest() throws QueryCsaException {
		boolean retValue = false;

		setGeoCode();
		setCsaRequest();
		retValue = true;
		
		return retValue;
	}
	
	public boolean bindQueryCsaRequest( String iStreet, String iXStreet, String iCity, String iState, String iCountry, String iZip, String iPlus4 ) throws QueryCsaException {
		boolean retValue = false;

		setStreet(iStreet);
		setXStreet(iXStreet);
		setCity(iCity);
		setState(iState);
		setCountry(iCountry);
		setZip(iZip);
		setPlus4(iPlus4);	
		
		retValue = bindQueryCsaRequest();
		
		return retValue;
	}
	
	public QueryCsaReply getCsa( String iStreet, String iXStreet, String iCity, String iState, String iCountry, String iZip, String iPlus4 ) throws QueryCsaException {
		QueryCsaReply lCsaReply = new QueryCsaReply();
		if(  bindQueryCsaRequest(iStreet,iXStreet,iCity,iState,iCountry,iZip,iPlus4) ) {
			lCsaReply = getCsa();
		}
		return lCsaReply;
	}
	
	public QueryCsaReply getCsa() throws QueryCsaException {
		String methodName = "getCsa";
		QueryCsaReply lCsaReply = new QueryCsaReply();
		try{	    	
	    	lCsaReply = csaServiceBinding.queryCsa(getCsaRequest());
	    	if( lCsaReply == null ) {
	    		throw new QueryCsaException("FAIL", "CSA Reply returned was null");
	    	}
		    if( lCsaReply == null ) {
		    	System.out.println("FAILURE...CSA Reply is null");
		    }
		} catch( ErrorDetailsType ws_err ) {
			TSCPLogger.logError(CLASS_NAME, methodName, ws_err);
			throw new QueryCsaException(CLASS_NAME,methodName,ws_err);
		} catch (AxisFault afault) {
	    	System.out.println("aFaultCaught :: "+afault.getFaultReason());
	    	//throw afault;
	    	afault.printStackTrace();
		} catch (QueryCsaException csa_ex ) {
			System.out.println("QueryCsaException thrown: "+csa_ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Generic Exception thrown!!"+ex.getMessage());
			ex.printStackTrace();
		}
		return lCsaReply;
	}
	
	// [end] accessor methods
	
	// [start] main method
	
	public static void main(String[] args) throws Exception {
		loadProps();
		System.out.println("URL::"+System.getProperty("url"));
		System.out.println("JAVA_HOME::"+System.getProperty("java_home"));
	    proxyURL = (props.getProperty("URL") != null && props.getProperty("URL").trim().length() > 0) ? props.getProperty("URL") : System.getProperty("url");

//	    EngineConfiguration config = null;

//	    if (System.getProperty("client.deploy.file.location") != null) {
//			config = new FileProvider(System.getProperty("client.deploy.file.location"));
//		}
	    //2120 CAMINO DEL RIO N, SAN DIEGO, CA 92108

	    
	    
	    /**
	     * Query CSA Stub
	     */
	    
	    
	    System.out.println("Testing Query CSA");
	    GeographicCodeType geoCode = GeographicCodeType.fromString("Zip");
	    String street = null;//"2120 CAMINO DEL RIO N";
	    String xStreet = null;//"La Jolla";
	    String city    = null;//"SAN DIEGO";
	    String state   = null;//"CA";
	    String country = null;
	    String zip     = "92108";//"91739";
	    String plus4   = null;
	    PostalCode zipCode = new PostalCode(zip,plus4);
	    QueryCsaRequest csaBody = new QueryCsaRequest(geoCode,street,xStreet,city,state,zipCode,country);
	    System.out.println("Obtaining serivce information");
	    //QueryCsaServiceLocator csaServiceLocator = new QueryCsaServiceLocator(config);
	    //QueryCsaBindingStub csaStub = new QueryCsaBindingStub(csaServiceLocator);
	    //csaStub = (QueryCsaBindingStub)csaServiceLocator.getQueryCsaPort();
	    //csaStub.set
	    //SOAPHeaderElement[] headerElement = csaStub.getHeaders();
	    //csaStub.
	    System.out.println("done");
	    try{
	    	//SOAPHeader header = new SOAPHeader();
	    	QueryCsaClient csaClient = new QueryCsaClient();
	    	
	    	//QueryCsaPortType csaPort = csaServiceLocator.getQueryCsaPort(new URL(proxyURL));
	    	
		    //QueryCsaReply csaReply = csaPort.queryCsa(csaBody);
	    	csaClient.setCsaRequest(csaBody);
	    	QueryCsaReply csaReply = csaClient.getCsa();
		    if( csaReply != null ) {
		    	System.out.println("CSA Reply :: City      :: " + csaReply.getCity());
		    	System.out.println("CSA Reply :: Country   :: " + csaReply.getCountry());
		    	System.out.println("CSA Reply :: State     :: " + csaReply.getState());
		    	System.out.println("CSA Reply :: NPA       :: " + csaReply.getNpa());
		    	System.out.println("CSA Reply :: CSA Value :: " + csaReply.getCsa());
		    } else {
		    	System.out.println("FAILURE...CSA Reply is null");
		    }
/*
	    } catch (AxisFault afault) {
	    	System.out.println("aFaultCaught :: "+afault.getFaultReason());
	    	//throw afault;
	    	afault.printStackTrace();*/
	    } catch (Exception e) {
	    	e.printStackTrace();
	    	System.out.println("ERROR::"+e.getMessage());
	    }
	    System.out.println("Done Testing Query CSA");
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
	
	// [end] main method
}
