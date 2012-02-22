package com.tscp.mvno.support;

import org.apache.log4j.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;

public class TSCPLogger {
	private static final String DEFAULT_CLASS  = "defaultClass";
	private static final String DEFAULT_METHOD = "defaultMethod";
	
	static Logger logger = Logger.getLogger(TSCPLogger.class);
	
	// [start] log error
	
	public static void logError( String className, Throwable t ) {
		logger.error(className+" Exception!!",t);
	}
	
	public static void logError( ErrorDetailsType error ) {
		logError(DEFAULT_CLASS,error);
	}
	
	public static void logError( String className, ErrorDetailsType error ) {
		logError(className,DEFAULT_METHOD,error);
	}
	
	public static void logError( String className, String methodName, ErrorDetailsType error ) {
		logger.error(className+"."+methodName+" SOAP Fault Actor      :: "+error.getFaultActor());
		logger.error(className+"."+methodName+" SOAP Fault Node       :: "+error.getFaultNode());
		logger.error(className+"."+methodName+" SOAP Fault Reason     :: "+error.getFaultReason());
		logger.error(className+"."+methodName+" SOAP Fault Role       :: "+error.getFaultRole());
		logger.error(className+"."+methodName+" SOAP Fault String     :: "+error.getFaultString());
		logger.error(className+"."+methodName+" SOAP Fault Message    :: "+error.getMessage());
		logger.error(className+"."+methodName+" SOAP Fault Code       :: "+error.getFaultCode());
		logger.error(className+"."+methodName+" ProviderError.Code    :: "+error.getProviderError().getProviderErrorCode());
		logger.error(className+"."+methodName+" ProviderError.Text    :: "+error.getProviderError().getProviderErrorText());
		logger.error(className+"."+methodName+" SOAP Localized Message:: "+error.getLocalizedMessage());
		/*logger.error(className+"."+methodName+" SOAP Fault Details    :: "+error.getFaultDetails());
		//Flatten out the details
		Element[] detailsList = error.getFaultDetails();
		Node child = detailsList[0].getFirstChild();
		Node errorCode = child.getFirstChild();
		Node errorText = child.getLastChild();
		logger.error(className+"."+methodName+"    Details.ErrorCode :: "+errorCode.getFirstChild().getNodeValue());
		logger.error(className+"."+methodName+"    Details.ErrorText :: "+errorText.getFirstChild().getNodeValue());
		logger.error(className+"."+methodName+" SOAP Dump             :: "+error.dumpToString());*/
		
	} 
	
	// [end] log error
	
	// [start] log info
	
	public static void logInfo( String message ) {
		logInfo(DEFAULT_CLASS,message);
	}
	
	public static void logInfo( String className, String message ) {
		logInfo(className,DEFAULT_METHOD,message);
	}
	
	public static void logInfo( String className, String methodName, String message ) {
		logger.info(className+"."+methodName+" "+message);
	}
	
	// [end] log info
}
