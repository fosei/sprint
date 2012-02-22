package com.tscp.mvno.exception;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;

public class SprintAPIException extends Exception {

	// [start] members
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String status;
	private String className;
	private String methodName;
	private ErrorDetailsType wsError;
	
	private com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType wsErrorV2;

	// [end] members
	
	// [start] constructors
	
	public SprintAPIException() {
		this("Default Exception thrown!");
	}
	
	public SprintAPIException( String message ) {
		this("FAIL",message);
	}
	
	public SprintAPIException( String status, String message ) {
		super(message);
		setStatus(status);
	}
	
	public SprintAPIException( Exception e ) {
		super(e);
	}
	
	public SprintAPIException( String className, String methodName, ErrorDetailsType wsError ) {
		this("Webservice Exception thrown");
		setClassName(className);
		setMethodName(methodName);
		setWsError(wsError);
	}
	
	public SprintAPIException( String className, String methodName, com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType wsError ) {
		this("Webservice Exception thrown");
		setClassName(className);
		setMethodName(methodName);
		setWsError(wsError);
	}
	
	// [end] constructors
	
	// [start] get methods
	
	public String getStatus() {
		return status;
	}
	
	public String getClassName() {
		return className;
	}

	public String getMethodName() {
		return methodName;
	}
	
	public ErrorDetailsType getWsError() {
		return wsError;
	}
	
	public com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType getWsErrorV2() {
		return wsErrorV2;
	}

	// [end] get methods
	
	// [start] set methods
	
	public void setStatus(String status) {
		this.status = status;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public void setWsError(ErrorDetailsType wsError) {
		this.wsError = wsError;
	}
	
	public void setWsError(com.sprint.integration.common.ErrorDetailsV2_xsd.ErrorDetailsType wsError) {
		this.wsErrorV2 = wsError;
	}
	
	// [end] set methods

}
