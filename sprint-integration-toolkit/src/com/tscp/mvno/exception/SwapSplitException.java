package com.tscp.mvno.exception;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;

public class SwapSplitException extends SprintAPIException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SwapSplitException() {
		this("Default SwapSplitException called");
	}
	
	public SwapSplitException( String message ) {
		this("FAIL",message);
	}
	
	public SwapSplitException( String status, String message ) {
		super(status,message);
	}
	
	public SwapSplitException( Exception e ) {
		super(e);
		setStatus("FAIL");
	}
	
	public SwapSplitException( String className, String methodName, ErrorDetailsType wsError ) {
		super(className,methodName,wsError);
	}
}
