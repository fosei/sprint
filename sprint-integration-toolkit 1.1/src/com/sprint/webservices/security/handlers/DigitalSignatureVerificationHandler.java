/*
 * DigitalSignatureVerificationHandler.java
 *
 * Axis WSS4J handler class for digital signature verification
 *
 */

package com.sprint.webservices.security.handlers;

import java.io.*;
import java.net.URL;
import java.security.KeyStore;
import java.security.cert.*;
import java.util.Vector;
import java.util.Iterator;
import java.util.Properties;
import javax.xml.rpc.JAXRPCException;
import org.apache.axis.*;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeader;
import org.apache.log4j.Logger;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.WSSConfig;
import org.apache.ws.security.WSSecurityEngine;
import org.apache.ws.security.WSSecurityEngineResult;
import org.apache.ws.security.components.crypto.Crypto;
import org.apache.ws.security.components.crypto.CryptoFactory;
import org.apache.ws.security.util.WSSecurityUtil;
import org.apache.ws.security.message.token.Timestamp;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.w3c.dom.*;
import dom.Writer;

public class DigitalSignatureVerificationHandler extends BasicHandler
{

    // Set up logging environment
    static Logger logger = Logger.getLogger(DigitalSignatureVerificationHandler.class);
    static final String SOAP_ACTOR_NEXT = "http://schemas.xmlsoap.org/soap/actor/next";
    static final String MSG_OUTPUT_FILE = "C:/temp/messages.txt";
    // static final String SOAP_ACTOR_NEXT = "next";

    static Crypto crypto = null;
    String aliasName = null;
    String keyStoreType = null;
    String pfxLocation = null;
    String aliasPassword = null;
    String pfxPassword = null;
    String propFileLocation = null;
    Certificate certFromWire;

    public DigitalSignatureVerificationHandler()
    {

        try
        {
            Properties sysProps = System.getProperties();

	    ClassLoader cl = this.getClass().getClassLoader();

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

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void invoke(MessageContext msgContext)
        throws AxisFault
    {
        WSSecurityEngine secEngine = new WSSecurityEngine();
        try
        {
            org.apache.axis.Message responseMessage = msgContext.getResponseMessage();

            SOAPPart sPart = (SOAPPart)responseMessage.getSOAPPart();

            Document doc = ((SOAPEnvelope)sPart.getEnvelope()).getAsDocument();

            if(doc != null)
	    {
		if (logger.isDebugEnabled())
		{
	            logger.debug("Response document with BST: ");
		    logger.debug(docToString(doc));
		}
	    
                certFromWire = getCertificateFromDocument(doc);

                // java.util.Vector resultVector = secEngine.processSecurityHeader(doc, WSConstants.URI_SOAP11_NEXT_ACTOR, null, crypto);
                java.util.Vector resultVector = secEngine.processSecurityHeader(doc, null, null, crypto);

		// Loop through the resultsVector and report what was done on this Header
		logger.debug("Results vector after calling processSecurityHeader: ");	
		if (logger.isDebugEnabled())
		{
		    for (Iterator it = resultVector.iterator(); it.hasNext(); )
		    {
			WSSecurityEngineResult wsresult = (WSSecurityEngineResult)it.next();
			printEngineResult(wsresult);
		    }
		}
		
		// Must consume the MustUnderstandHeader after processing or else next handler in the
		// chain will throw a "do not understand MustUnderstand header" exception.
		scrubSecurityHeader(responseMessage);

		if (logger.isDebugEnabled())
		{
	            logger.debug("Response document after processing security header: ");
		    logger.debug(docToString(doc));
		}

                msgContext.setCurrentMessage(responseMessage);
	    }
	    else
	    {
                logger.fatal("FAILURE: response document is null");

		System.exit(0);
	    }
        }
        catch(Exception e)
        {
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

    private void printEngineResult(WSSecurityEngineResult wsResult)
    {
	Timestamp ts = null;	
	
	try
	{
	    logger.debug("Actions: " + wsResult.getAction());
	    logger.debug("Principal: " + wsResult.getPrincipal().toString());
	    logger.debug("Certificate: " + wsResult.getCertificate().toString());
	    ts = wsResult.getTimestamp();
	    if (ts != null)
	    {
	        logger.debug("Timestamp: " + ts.toString());
	    }
	}
	catch (NullPointerException e)
	{
	}
	catch (Exception e)
	{
	    logger.error("Caught unknown exception " + e.getMessage());
	}
    }

    // Consume the security header so it's not propagated to the client endpoint.
    private org.apache.axis.Message scrubSecurityHeader(org.apache.axis.Message message) throws javax.xml.soap.SOAPException
    {

	SOAPPart sp = (SOAPPart)message.getSOAPPart();

	SOAPEnvelope se = (SOAPEnvelope)sp.getEnvelope();

	se.getHeader().detachNode();

	SOAPHeader sh = (SOAPHeader)se.addHeader();

	return message;
    }

    private Certificate getCertificateFromDocument(Document signedDoc)
    {
        X509Certificate x509Cert;
	
        ByteArrayInputStream in;

        x509Cert = null;

        in = null;

	try
	{
           Node binarySecurityToken = getHeaderElement(signedDoc, "BinarySecurityToken");

           if(binarySecurityToken == null)
              throw new JAXRPCException("Document does not contain any certificate to verify.");

           Text text = getFirstNode((Element)binarySecurityToken);

           byte data[] = getToken(text);

           in = new ByteArrayInputStream(data);

           CertificateFactory certFact = CertificateFactory.getInstance("X.509");

           x509Cert = (X509Certificate)certFact.generateCertificate(in);

           in.close();
        }
        catch(JAXRPCException e)
        {
           e.printStackTrace();
        }
        catch(Exception e)
       	{ 
           e.printStackTrace();
	}

        return x509Cert;
    }

    private Node getHeaderElement(Document signedDoc, String wsConstant)
    {
        Node element = null;

        try
        {
            org.apache.ws.security.SOAPConstants soapConstants = WSSecurityUtil.getSOAPConstants(signedDoc.getDocumentElement());

            // WSSConfig wssConfig = WSSConfig.getDefaultWSConfig();
	    //
            // Element securityHeader = WSSecurityUtil.getSecurityHeader(wssConfig, signedDoc, "", soapConstants);
	    //
            Element securityHeader = WSSecurityUtil.getSecurityHeader(signedDoc, "", soapConstants);

            if(securityHeader == null)
            {
                System.out.println("Document did not contain any security header");

                throw new JAXRPCException("Document did not contain any security header");
            }

            NodeList securityHeaderElementList = securityHeader.getChildNodes();

            int noOfsecurityHeaderElements = securityHeaderElementList.getLength();

            for(int i = 0; i < noOfsecurityHeaderElements; i++)
            {
                Node securityHeaderNode = securityHeaderElementList.item(i);

                if(securityHeaderNode.getNodeType() == 1)
                {
                    String securityHeaderName = securityHeaderNode.getLocalName();

                    if(securityHeaderName.equals(wsConstant))

                        element = securityHeaderNode;
                }
            }

        }
        catch(JAXRPCException e)
        {
            throw e;
        }
        catch(Exception e)
        {
            e.printStackTrace();

            System.out.println(e);
        }
        return element;
    }

    private byte[] getToken(Text node) throws Base64DecodingException
    {
        if(node == null)
            return null;

        return Base64.decode(node.getData());
    }

    private Text getFirstNode(Element element)
    {
        Node node = element.getFirstChild();

        return node == null || !(node instanceof Text) ? null : (Text)node;
    }

}
