package com.tscp.mvno.support;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.xml.namespace.QName;

import org.apache.axis.message.MessageElement;
import org.apache.axis.message.PrefixedQName;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.log4j.Logger;

public class SprintHeader {

	// [start] members
	private static String HDR_PROPERTY_FILE 		= "header.properties";
	private static String HDR_NAMESPACE				= "";
	private static String HDR_WS_MESSAGE	 		= "";
	private static String HDR_TRACKING_MESSAGE		= "";
	
	private static String HDR_APPLICATION_ID		= "";
	private static String HDR_APPLICATION_USER_ID	= "";
	private static String HDR_TIME_TO_LIVE			= "";
	
	
	
	/**
	 * The ID of the corporate entity or business unit from which the message originated
	 * <p>e.g. FirstName/LastName/Unique User Identifier</p>
	 */
	private String consumerId;
	/**
	 * Each message is part of a conversationbetween two or more systems in a given session.
	 * The Conversation ID is a UID, which can be used to group all messages exchanged within a session. 
	 * This field is primarily used for tracking, reporting, root-cause-analysis, and non-repudiation.
	 */
	private String conversationId;
	/**
	 * A Unique identifier for this message, to enable tracking, reporting and correlation.
	 */
	private String messageId;
	/**
	 * The dateTimestamp of when the message was created.
	 * <p>This can be used for tracking and reporting and also by the consuming application to determine 
	 * if the message is stale </p>
	 * <p>Timestamp should be in GMT TZ when the caller is unable to format with timezone and offset.</p>
	 * <p>e.g. 2007-10-01T14:20:33 is acceptable.</p>
	 */
	private String messageDateTimeStamp;
	
	private String 	bindingUserName			= "";
	private String 	bindingPassword			= "";
	private int 	timeOut					= 0;
	
	private static Properties props;
	static Logger logger = Logger.getLogger(SprintHeader.class);
	
	private SOAPHeaderElement messageHeader;
	
	// [end] members
	
	// [start] get methods
	
	public int getTimeOut() {
		return timeOut;
	}
	
	public String getBindingUserName() {
		return bindingUserName;
	}
	
	public String getBindingPassword() {
		return bindingPassword;
	}

	public String getConsumerId() {
		return consumerId;
	}

	public String getConversationId() {
		return conversationId;
	}

	public String getMessageDateTimeStamp() {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date myDate = new Date();
		messageDateTimeStamp = myFormat.format(myDate);
		return messageDateTimeStamp;
	}

	public String getMessageId() {
		return messageId;
	}
	
	// [end] get methods
	
	// [start] set methods
	
	private void setTimeOut(int timeOut) {
		this.timeOut = timeOut;
	}
	
	public void setBindingUserName(String bindingUserName) {
		this.bindingUserName = bindingUserName;
	}
	
	public void setBindingPassword(String password) {
		bindingPassword = password;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public void setMessageDateTimeStamp(String messageDateTimeStamp) {
		this.messageDateTimeStamp = messageDateTimeStamp;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	// [end] set methods

	// [start] constructors
	
	public SprintHeader() {
		this("tscp");
	}
	
	public SprintHeader(String userName) {
		this(userName,"0000");
	}
	
	public SprintHeader(String userName, String orderId) {
		props = new Properties();
		loadProps();
		setConsumerId(userName);
		setMessageId(orderId);
	}
	
	// [end] constructors
	
	public SOAPHeaderElement getHeader() {
		//SOAPHeaderElement messageHeader;
    	try {
    		messageHeader = new SOAPHeaderElement(new PrefixedQName(HDR_NAMESPACE, HDR_WS_MESSAGE, "m"));
        
	        MessageElement trackingMessageHeader = new MessageElement(new QName(HDR_NAMESPACE, "trackingMessageHeader", "m"));
	        trackingMessageHeader.setPrefix("m");
	        
	        MessageElement applicationId = new MessageElement(new QName(HDR_NAMESPACE, "applicationId", "m") );
	        applicationId.setValue(HDR_APPLICATION_ID);
	        applicationId.setPrefix("m");
	        
	        MessageElement applicationUserId = new MessageElement(new QName(HDR_NAMESPACE, "applicationUserId", "m"));
	        applicationUserId.setValue(HDR_APPLICATION_USER_ID);
	        applicationUserId.setPrefix("m");
	        
	        MessageElement messageId = new MessageElement(new QName(HDR_NAMESPACE, "messageId", "m"));
	        messageId.setValue(getMessageId());
	        messageId.setPrefix("m");
	        
	        MessageElement timeToLive = new MessageElement(new QName(HDR_NAMESPACE, "timeToLive", "m"));
	        timeToLive.setValue(HDR_TIME_TO_LIVE);
	        timeToLive.setPrefix("m");
	        
	        MessageElement messageDateTimeStamp = new MessageElement(new QName(HDR_NAMESPACE, "messageDateTimeStamp", "m"));
	        messageDateTimeStamp.setValue(getMessageDateTimeStamp());
	        messageDateTimeStamp.setPrefix("m");
	        
	        trackingMessageHeader.addChildElement(applicationId);
	        trackingMessageHeader.addChildElement(applicationUserId);
	        trackingMessageHeader.addChildElement(messageId);
	        trackingMessageHeader.addChildElement(timeToLive);
	        trackingMessageHeader.addChildElement(messageDateTimeStamp);
	        
	        
	        messageHeader.addChildElement(trackingMessageHeader);
	        trackingMessageHeader.setParentElement(messageHeader);
    	} catch( Exception e ) {
    		logger.error("Error occurred when generating header object: "+e.getMessage());
    	}
        return messageHeader;
	}
	
	private void loadProps() {
		try {
			ClassLoader cl = SprintHeader.class.getClassLoader();
			InputStream is = cl.getResourceAsStream(HDR_PROPERTY_FILE);
			logger.debug("Loading header properties file...");
			
			props.load(is);
			HDR_NAMESPACE 			= props.getProperty("header.namespace");
			HDR_WS_MESSAGE 			= props.getProperty("header.parent");
			HDR_TRACKING_MESSAGE 	= props.getProperty("header.trackingMessage");
			HDR_APPLICATION_ID		= props.getProperty("header.applicationId");
			HDR_APPLICATION_USER_ID = props.getProperty("header.applicationUserId");
			HDR_TIME_TO_LIVE		= props.getProperty("header.timeToLive");
			
			bindingUserName			= props.getProperty("bindingUserName");
			bindingPassword    		= props.getProperty("bindingPassword");
			try {
				setTimeOut(Integer.parseInt(props.getProperty("bindingTimeOut")));
			} catch (Exception e) {
				setTimeOut(60000);
			}
			
			if( HDR_NAMESPACE == null ) {
				logger.warn("SprintHeader.HDR_NAMESPACE is null!!");
			} 
			if( HDR_WS_MESSAGE == null ) {
				logger.warn("SprintHeader.HDR_WS_MESSAGE is null!!");
			}
			if( HDR_TRACKING_MESSAGE == null ) {
				logger.warn("SprintHeader.HDR_TRACKING_MESSAGE is null!!");
			}
			if( HDR_APPLICATION_ID == null ) {
				logger.warn("SprintHeader.HDR_APPLICATION_ID is null!!");
			}
			if( HDR_APPLICATION_USER_ID == null ) {
				logger.warn("SprintHeader.HDR_APPLICATION_USER_ID is null!!");
			}
			if( bindingPassword == null ) {
				logger.warn("SprintHeader.APPLICAITON_PASSWORD is null!!");
			}
			if( getTimeOut() == 0 ) {
				setTimeOut(60000);
			}
		} catch( Exception e ) {
			
		}
	}
	
	public static void main(String[] args) {
		java.util.Date myDate = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		
		myDate.getTime();
		System.out.println("Date: "+myDate.getTime());
		System.out.println("SimpleDateFormat:"+sdf.format(myDate));
		//System.exit(0);
		SprintHeader header = new SprintHeader();
		header.getHeader();
	}
}
