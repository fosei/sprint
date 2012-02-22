package com.tscp.mvno.exception;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;

public class PendingSubscriptionException extends SprintAPIException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PendingSubscriptionException() {
		this("FAIL","General PendingSubscriptionException thrown...");
	}

	public PendingSubscriptionException(Exception e) {
		super(e);
		setStatus("FAIL");
	}
	
	public PendingSubscriptionException( String status, String iMessage ) {
		super(status,iMessage);
	}
	
	public PendingSubscriptionException( String className, String methodName, ErrorDetailsType wsError ) {
		super(className,methodName,wsError);
	}
	
	
}
