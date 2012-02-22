package com.tscp.mvno.exception;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;

public class QueryCsaException extends SprintAPIException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public QueryCsaException() {
		this("Generic Query Csa Exception thrown!");
	}
	
	public QueryCsaException( String iMessage ) {
		this("default",iMessage);
	}
	
	public QueryCsaException( String iStatus, String iMessage ) {
		super(iStatus,iMessage);
	}
	
	public QueryCsaException( String className, String methodName, ErrorDetailsType wsError ) {
		super(className,methodName,wsError);
	}
}
