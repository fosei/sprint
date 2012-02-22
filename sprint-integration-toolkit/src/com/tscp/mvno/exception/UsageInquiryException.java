package com.tscp.mvno.exception;

import com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;

public class UsageInquiryException extends SprintAPIException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsageInquiryException() {
		this("Default UsageInquiry Exception thrown...");
	}
	
	public UsageInquiryException( String iMessage ) {
		this(iMessage,"FAIL");
	}
	
	public UsageInquiryException( String iMessage, String iStatus ) {
		super(iStatus,iMessage);
	}
	
	public UsageInquiryException( Exception e ) {
		super(e);
		setStatus("FAIL");
	}
	
	public UsageInquiryException( String className, String methodName, ErrorDetailsType wsError ) {
		super(className,methodName,wsError);
	}

}
