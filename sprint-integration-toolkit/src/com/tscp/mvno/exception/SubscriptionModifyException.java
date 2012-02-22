package com.tscp.mvno.exception;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;

public class SubscriptionModifyException extends SprintAPIException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SubscriptionModifyException() {
		this("Default SubscriptionModifyException Raised!!");
	}
	
	public SubscriptionModifyException( Exception e ) {
		super(e);
		setStatus("FAIL");
	}
	
	public SubscriptionModifyException( String message ) {
		this("FAIL",message);
	}
	
	public SubscriptionModifyException( String status, String message ) {
		super(status,message);
	}
	
	public SubscriptionModifyException( String className, String methodName, ErrorDetailsType wsError ) {
		super(className,methodName,wsError);
	}
}
