/* 
 * DigitalSignatureCreationHandler.java
 *
 * Handler for use in an apache axis web services client application 
 * that requires digital signatures.  Configure a log4j.properties
 * file in your classpath to see debug output.
 *
 */

package com.sprint.webservices.security.handlers;

import java.io.*;
import java.util.Properties;
import java.net.URL;
import org.apache.axis.*;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.components.crypto.Crypto;
import org.apache.ws.security.components.crypto.CryptoFactory;
import org.apache.ws.security.message.WSSecHeader;
import org.apache.ws.security.message.WSSignEnvelope;
import org.apache.ws.security.message.WSSecSignature;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.Init;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.MessageFactory;
import org.apache.log4j.Logger;
import wssec.SOAPUtil;
import dom.Writer;


public class DigitalSignatureCreationHandler extends BasicHandler
{

    public DigitalSignatureCreationHandler()
    {
        aliasName = null;
        keyStoreType = null;
        pfxLocation = null;
        aliasPassword = null;
        pfxPassword = null;
        propFileLocation = null;

        try
        {
            Properties sysProps = System.getProperties();

	    ClassLoader cl = this.getClass().getClassLoader();

	    // TODO: Parameterize this through the axis hooks.
            InputStream in = cl.getResourceAsStream("client-crypto.properties");

            Properties props = new Properties();

            props.load(in);

            String cryptoProvider = props.getProperty("org.apache.ws.security.crypto.provider");

            keyStoreType = props.getProperty("org.apache.ws.security.crypto.merlin.keystore.type");

            pfxPassword = props.getProperty("org.apache.ws.security.crypto.merlin.keystore.password");

            aliasPassword = props.getProperty("org.apache.ws.security.crypto.merlin.alias.password");

            pfxLocation = props.getProperty("org.apache.ws.security.crypto.merlin.file");
	    
            aliasName = props.getProperty("org.apache.ws.security.crypto.merlin.keystore.alias");

            in.close();

	    logger.debug("org.apache.ws.security.crypto.merlin.keystore.alias: " + aliasName);
	    logger.debug("org.apache.ws.security.crypto.merlin.file: " + pfxLocation);
	    logger.debug("org.apache.ws.security.crypto.merlin.alias.password: " + aliasPassword);
	    logger.debug("org.apache.ws.security.crypto.merlin.keystore.password: " + pfxPassword);
	    logger.debug("org.apache.ws.security.crypto.provider: " + cryptoProvider);
	    logger.debug("org.apache.ws.security.crypto.merlin.keystore.keystore.type: " + keyStoreType);

	    URL url = new URL("http://localhost/foo");

	    try{

	        url = cl.getResource(pfxLocation);

                if(!(new File(url.getFile())).exists())
                {
                    logger.error(pfxLocation + " file not found");
                    System.exit(0);
                }

	    }

	    catch (Exception e)
	    {
		logger.error("Caught exception attempting to load keystore " + pfxLocation);
		e.printStackTrace();
		System.exit(0);
	    }

	    logger.debug("Using keystore found at " + url);

            if(pfxPassword.equals("") || aliasName.equals("") || cryptoProvider.equals("") || keyStoreType.equals(""))
            {
                logger.error("Please verify contents of crypto.properties file");
                System.exit(0);
            }

            crypto = CryptoFactory.getInstance(cryptoProvider, props);

	    logger.debug("Successfully retreived instance of " + cryptoProvider);

	    /*
            if(propFileLocation == null)
            {
                System.out.println("Usage: java -Dcrypto.file.location=<crypto.properties>");
                System.exit(0);
            }
	    */
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void invoke(MessageContext msgContext)
        throws AxisFault
    {
        try
        {
            Message requestMessage = msgContext.getRequestMessage();
            SOAPPart sPart = (SOAPPart)requestMessage.getSOAPPart();
            org.w3c.dom.Document doc = ((SOAPEnvelope)sPart.getEnvelope()).getAsDocument();
            if(doc == null)
                logger.warn("SOAP Envelope Document null");

	    logger.debug("Unsigned SOAP Envelope:");
	    if (logger.isDebugEnabled())
	    {
       	        // XMLUtils.outputDOM(doc, System.out);
		logger.debug(docToString(doc));
	    }

	    // Create new signature object
	    WSSecSignature sig = new WSSecSignature();

	    // Set signature properties
	    sig.setUserInfo(aliasName, aliasPassword);

	    /* See org.apache.ws.security.message.WSSecBase in WSS4J API docs
	     *
	     * Valid key identifier types in 1.5 are:
	     * WSConstants.ISSUER_SERIAL, 
	     * WSConstants.BST_DIRECT_REFERENCE, 
	     * WSConstants.X509_KEY_IDENTIFIER, 
	     * WSConstants.SKI_KEY_IDENTIFIER
	     *
	     */
            sig.setKeyIdentifierType(WSConstants.BST_DIRECT_REFERENCE);
            // sig.setKeyIdentifierType(WSConstants.X509_KEY_IDENTIFIER);

            sig.setUseSingleCertificate(false);

	    WSSecHeader secHdr = new WSSecHeader();

	    Element secElement = secHdr.insertSecurityHeader(doc);

	    logger.debug("Prior to creating the signed doc");

            org.w3c.dom.Document signedDoc = sig.build(doc, crypto, secHdr);

	    /* Deprecated APIs as of WSS4J 1.5
	    
            WSSignEnvelope sig = new WSSignEnvelope();
            sig.setUserInfo(aliasName, aliasPassword);
            sig.setKeyIdentifierType(1);
            sig.setKeyIdentifierType(org.apache.ws.security.WSConstants.BST_DIRECT_REFERENCE);
            sig.setKeyIdentifierType(org.apache.ws.security.WSConstants.ISSUER_SERIAL);
            sig.setKeyIdentifierType(org.apache.ws.security.WSConstants.X509_KEY_IDENTIFIER);
            sig.setUseSingleCertificate(false);
            org.w3c.dom.Document signedDoc = sig.build(doc, crypto);

	    */
	    
            logger.info("Signed Successfully...");

	    /* Deprecated API as of WSS4J 1.5
            Message signedWSSignEnvMsg = (Message)AxisUtil.toSOAPMessage(signedDoc);
	    */

            Message signedWSSignEnvMsg = (Message)SOAPUtil.toSOAPMessage(signedDoc);

            msgContext.setCurrentMessage(signedWSSignEnvMsg);

	    logger.debug("Signed Envelope:");
	    if (logger.isDebugEnabled())
	    {
		logger.debug(docToString((Document)signedWSSignEnvMsg.getSOAPEnvelope().getAsDocument()));
	    }

        }
        catch(Exception e)
        {
	    logger.error("Caught exception during DigitalSignatureCreationHandler.invoke(): " + e.toString());
            throw AxisFault.makeFault(e);
        }
    }

    public void undo(MessageContext messagecontext)
    {
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

    // Set up logging environment
    static Logger logger = Logger.getLogger(DigitalSignatureCreationHandler.class);

    static Crypto crypto = null;
    String aliasName;
    String keyStoreType;
    String pfxLocation;
    String aliasPassword;
    String pfxPassword;
    String propFileLocation;

    static 
    {
        Init.init();
    }

}
