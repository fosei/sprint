/* 
 * SoapRequestHeaderHandler.java
 *
 * Handler for use in an apache axis client that requires SOAP header
 * manipulation on the request.  Configure a log4j.properties
 * file in your classpath to see debug output.
 *
 */

package com.sprint.webservices.handlers;

import java.io.*;
import java.util.Date;
import java.util.Properties;
import javax.xml.soap.SOAPMessage;
import javax.xml.namespace.QName;
// import javax.xml.soap.SOAPPart;
import org.apache.axis.SOAPPart;
import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.Message;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.PrefixedQName;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeader;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.log4j.Logger;
import org.w3c.dom.*;
import dom.Writer;



public class SoapRequestHeaderHandler extends BasicHandler
{

    	static Logger logger = Logger.getLogger(SoapRequestHeaderHandler.class);

	// Static values to use for the header
	private static String HDR_NAMESPACE = "";
	private static String HDR_PROPERTY_FILE = "header.properties";
	private static String CORP_AUTH_MSO_CODE = "";
	private static String CORP_AUTH_CONSUMER_ID = "";
	private static String IND_AUTH_MDN = "";
	private static String IND_AUTH_PASSWD = "";

	private static boolean _isIndCredentialsConfigured = true;


	private static Properties props;

	public SoapRequestHeaderHandler()
	{
		logger.debug("Initialized SoapRequestHeaderHandler");
		loadProps();
	}

    	public void invoke(MessageContext messageContext) throws AxisFault
	{

		logger.debug("Invoked SoapRequestHeaderHandler");

		try
		{
			SOAPMessage msg = 
				(SOAPMessage)messageContext.getMessage(); 
 			org.apache.axis.SOAPPart part = (org.apache.axis.SOAPPart)msg.getSOAPPart(); 
 			SOAPEnvelope envelope = (SOAPEnvelope)part.getEnvelope(); 
 			SOAPHeader header = (SOAPHeader)envelope.getHeader(); 

			SOAPHeaderElement messageHeader = (SOAPHeaderElement) header.addHeaderElement(new PrefixedQName(HDR_NAMESPACE, "messageHeader", "m"));


			MessageElement securityMessageHeader = new MessageElement(new QName("securityMessageHeader"));	
			MessageElement corporateAuthorizationCredentials = new MessageElement(new QName("corporateAuthorizationCredentials"));	

			MessageElement msoCode = new MessageElement(new QName("msoCode"));
			msoCode.setValue(CORP_AUTH_MSO_CODE);
			corporateAuthorizationCredentials.addChildElement(msoCode);

			MessageElement consumerId = new MessageElement(new QName("consumerId"));
			consumerId.setValue(CORP_AUTH_CONSUMER_ID);
			corporateAuthorizationCredentials.addChildElement(consumerId);

			securityMessageHeader.addChildElement(corporateAuthorizationCredentials);

			if (_isIndCredentialsConfigured)
			{
			
			    MessageElement individualAuthorizationCredentials = new MessageElement(new QName("individualAuthorizationCredentials"));	

			    MessageElement mdn = new MessageElement(new QName("mdn"));
			    mdn.setValue(IND_AUTH_MDN);
			    individualAuthorizationCredentials.addChildElement(mdn);

			    MessageElement password = new MessageElement(new QName("password"));
			    password.setValue(IND_AUTH_PASSWD);
			    corporateAuthorizationCredentials.addChildElement(password);

			    securityMessageHeader.addChildElement(individualAuthorizationCredentials);
			}

			messageHeader.addChildElement(securityMessageHeader);

            		Document doc = ((SOAPEnvelope)part.getEnvelope()).getAsDocument();
			if (logger.isDebugEnabled())
			{
	            		logger.debug("Request document with added headers: ");
		    		logger.debug(docToString(doc));
			}


		}
		catch (Exception e)
		{
			logger.error("Caught unhandled exception: " + e);
			e.printStackTrace();
		}

	}

	private static void loadProps()
	{

		try 
		{
	    	    ClassLoader cl = SoapRequestHeaderHandler.class.getClassLoader();
            	    InputStream in = cl.getResourceAsStream(HDR_PROPERTY_FILE);
		    props = new Properties();
		    logger.debug("Loading header properties file...");
		    props.load(in);

		    HDR_NAMESPACE = props.getProperty("header.namespace");
		    if (HDR_NAMESPACE == null) 
		    {
		        logger.warn("WARNING: null value for header.namespace.");
		    }
		    CORP_AUTH_MSO_CODE = props.getProperty("corpAuth.msoCode");
		    if (CORP_AUTH_MSO_CODE == null) 
		    {
		        logger.warn("WARNING: null value for corpAuth.msoCode.");
		    }
		    CORP_AUTH_CONSUMER_ID = props.getProperty("corpAuth.consumerId");
		    if (CORP_AUTH_CONSUMER_ID == null) 
		    {
		        logger.warn("WARNING: null value for corpAuth.consumerId");
		    }

		    IND_AUTH_MDN = props.getProperty("indAuth.mdn");
		    if (IND_AUTH_MDN == null) 
		    {
		        logger.warn("WARNING: null value for indAuth.mdn");
			_isIndCredentialsConfigured = false;
		    }

		    IND_AUTH_PASSWD = props.getProperty("indAuth.password");
		    if (IND_AUTH_PASSWD == null) 
		    {
		        logger.warn("WARNING: null value for indAuth.password");
			_isIndCredentialsConfigured = false;
		    }

		} 
		catch (java.io.IOException e)
		{
		    logger.error("Cannot load file " + HDR_PROPERTY_FILE + ". Please ensure it is in the CLASSPATH.");
		    logger.error(e.toString());
		    System.exit(0);
		}

		catch (Exception e) 
		{
		    logger.error("Caught an unhandled exception while attempting to load file " + HDR_PROPERTY_FILE);
		    logger.error(e.toString());
		    System.exit(0);
		}
	}

	private static String createTransactionId()
	{
		return Long.toString(new Date().getTime());
	}

    	private String docToString(Document doc)
    	{
        	Writer writer = new Writer();

		try
		{
	    		ByteArrayOutputStream bos = new ByteArrayOutputStream();
	    		writer.setOutput(bos, "UTF8");
	    		writer.write(doc);
	    		bos.close();
	    		return bos.toString();
		}
		catch (Exception e)
		{
            		logger.error("ERROR: Could not open output stream for document."); 
	    		return null;
		}
    
    	}

    	public void undo(MessageContext messagecontext)
    	{

	}
    

}
