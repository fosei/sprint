package com.tscp.mvno.exception;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;

public class SubscriptionDetailException extends SprintAPIException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SubscriptionDetailException() {
		// TODO Auto-generated constructor stub
		this("SubscriptionDetail Exception thrown");
	}
	
	public SubscriptionDetailException( Exception e ) {
		super(e);
		setStatus("FAIL");		
	}
	
	public SubscriptionDetailException(String message) {
		this("FAIL",message);
	}
	
	public SubscriptionDetailException(String status, String message) {
		super(status,message);
	}
	
	public SubscriptionDetailException( String className, String methodName, ErrorDetailsType wsError ) {
		super(className,methodName,wsError);
	}
}
