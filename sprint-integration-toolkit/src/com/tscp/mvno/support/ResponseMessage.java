package com.tscp.mvno.support;

public class ResponseMessage {
	private String status;
	private String message;
	
	public ResponseMessage() {
		this("unknown");
	}
	
	public ResponseMessage( String status ) {
		this(status,"No message assigned");
	}
	
	public ResponseMessage( String status, String message ) {
		this.status = status;
		this.message = message;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setStatus( String status ) {
		this.status = status;
	}
	
	public void setMessage( String message ) {
		this.message = message;
	}
}
