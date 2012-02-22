package com.tscp.mvno.exception;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;

/**
 * A handy wrapper class that extends the {@linkplain SprintAPIException} Exception class
 * <p>
 * This class is designed to clearly differentiate between various exceptions in the event that we need to catch 
 * specific exceptions when multiple exceptions can be thrown.
 * 
 * @author Dan
 *
 * @see PendingSubscriptionException
 * @see SprintAPIException
 * @see SubscriptionDetailException
 * @see SubscriptionModifyException
 * @see SwapSplitException
 * @see WnpException
 */
public class PortMessageException extends SprintAPIException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PortMessageException() {
		this("FAIL","General PendingSubscriptionException thrown...");
	}

	public PortMessageException(Exception e) {
		super(e);
		setStatus("FAIL");
	}
	
	public PortMessageException( String status, String iMessage ) {
		super(status,iMessage);
	}
	
	public PortMessageException( String className, String methodName, ErrorDetailsType wsError ) {
		super(className,methodName,wsError);
	}
	
	public PortMessageException( String className, String methodName, com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType wsError ) {
		super(className,methodName,wsError);
	}
	
}
