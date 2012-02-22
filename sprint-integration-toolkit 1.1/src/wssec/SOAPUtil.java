package wssec;

import java.io.ByteArrayInputStream;
import java.util.Properties;

import javax.xml.soap.SOAPMessage;
import javax.xml.transform.dom.DOMSource;

import org.apache.xml.security.c14n.Canonicalizer;
import org.w3c.dom.Document;

public class SOAPUtil {

    /**
     * Convert a DOM Document into a soap message.
     * <p/>
     *
     * @param doc
     * @return
     * @throws Exception
     */
    public static javax.xml.soap.SOAPMessage toSOAPMessage(Document doc) throws Exception {
    	org.apache.xml.security.c14n.Canonicalizer c14n =
                org.apache.xml.security.c14n.Canonicalizer.getInstance(Canonicalizer.ALGO_ID_C14N_WITH_COMMENTS);
        byte[] canonicalMessage = c14n.canonicalizeSubtree(doc);
        ByteArrayInputStream in = new ByteArrayInputStream(canonicalMessage);
        Properties myProperties = System.getProperties();
        String currentMessageFactory = System.getProperty("javax.xml.soap.MessageFactory");
        System.out.println("Current Message Factory: "+currentMessageFactory);
        System.setProperty("javax.xml.soap.MessageFactory", "org.apache.axis.soap.MessageFactoryImpl");
//        System.setProperty("javax.xml.parsers.SAXParserFactory", "org.apache.xerces.jaxp.SAXParserFactoryImpl");
//        javax.xml.parsers.SAXParserFactory
//        org.apache.xerces.jaxp.SAXParserFactoryImpl
        javax.xml.soap.MessageFactory factory = javax.xml.soap.MessageFactory.newInstance();
        myProperties.remove("javax.xml.soap.MessageFactory");
//        myProperties.remove("javax.xml.parsers.SAXParserFactory");
        System.setProperties(myProperties);
        

        return factory.createMessage(null, in);
    }
    
    public static org.apache.axis.Message toAxisMessage(Document doc) throws Exception {
        Canonicalizer c14n =
                Canonicalizer.getInstance(Canonicalizer.ALGO_ID_C14N_WITH_COMMENTS);
        byte[] canonicalMessage = c14n.canonicalizeSubtree(doc);
        ByteArrayInputStream in = new ByteArrayInputStream(canonicalMessage);
        javax.xml.soap.MessageFactory factory = javax.xml.soap.MessageFactory.newInstance();
        
        org.apache.axis.Message myMessage = new org.apache.axis.Message(factory.createMessage(null, in));
        return myMessage;
    }

    /**
     * Update soap message.
     * <p/>
     *
     * @param doc
     * @param message
     * @return
     * @throws Exception
     */
    public static SOAPMessage updateSOAPMessage(Document doc,
                                                SOAPMessage message)
            throws Exception {
        DOMSource domSource = new DOMSource(doc);
        message.getSOAPPart().setContent(domSource);
        return message;
    }
}
