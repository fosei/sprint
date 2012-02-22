package com.tscp.mvno.exception;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;

public class WnpException extends SprintAPIException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public WnpException() {
		this("Default WNP Exception invoked!");
	}
	
	public WnpException( String message ) {
		this("FAIL",message);
	}
	
	public WnpException( String status, String message ) {
		super(status,message);
	}
	
	public WnpException( Exception e ) {
		super(e);
		setStatus("FAIL");
	}
	
	public WnpException( String className, String methodName, ErrorDetailsType wsError ) {
		super(className,methodName,wsError);
	}
	
}
