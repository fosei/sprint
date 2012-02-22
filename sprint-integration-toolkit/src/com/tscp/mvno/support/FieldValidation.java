package com.tscp.mvno.support;

/**
 * FieldValidation is designed to provide the API system a means of validating common fields.
 * 
 * <P>Although the Sprint API will validate entries when invoked, I've decided to run tests prior 
 * to engaging in transactions over the web.
 * </P>
 * @author Dan
 *
 */
public class FieldValidation {
	
	public static final String STATUS_FAILED	= "FAIL";
	public static final String STATUS_SUCCEED	= "SUCCEED";
	
	/**
	 * A centralized means for verifying MDN field.
	 * 
	 * <p>Add more validation rules as necessary.</p>
	 * @param iMdn
	 * @return
	 */
	public static ResponseMessage validateMDNField( String iMdn ) {
		ResponseMessage response;
		if( iMdn == null ) {
			response = new ResponseMessage(STATUS_FAILED,"MDN is null!");
		} else {
			if( iMdn.length() != 10 ) {
				response = new ResponseMessage(STATUS_FAILED,"MDN is not of correct length.  Expected 10...found "+iMdn.length());
			} else {
				response = new ResponseMessage(STATUS_SUCCEED,"");
			}
		} 
		return response;
	}
	
	/**
	 * Ensures a complex object type is not null
	 * <p>If the object is null, then a response message will return alerting such</p>
	 * @param objectName
	 * @param o
	 * @return
	 */
	public static ResponseMessage validateNullObject( String objectName, Object o ) {
		ResponseMessage response;
		if( o == null ) {
			response = new ResponseMessage(STATUS_FAILED,objectName+" is null!!");
		} else
			response = new ResponseMessage(STATUS_SUCCEED,"");
		return response;
	}

	/**
	 * Simple Csa validation function
	 * 
	 * @param iCsa
	 * @return
	 */
	public static ResponseMessage validateCsaField( String iCsa ) {
		ResponseMessage response;
		if( iCsa == null ) {
			response = new ResponseMessage(STATUS_FAILED,"CSA is null!");
		} else {
			response = new ResponseMessage(STATUS_SUCCEED,"");
		} 
		return response;
	}
	
	public static ResponseMessage validateTimeZoneField( String iTimeZone ) {
		ResponseMessage response;
		if( iTimeZone == null ) {
			response = new ResponseMessage(STATUS_FAILED,"TimeZone is null!");
		} else if ( iTimeZone.length() != 3 ) {
			response = new ResponseMessage(STATUS_FAILED,"TimeZone must be 3 characters in length");
		} else {
			response = new ResponseMessage(STATUS_SUCCEED,"");
		} 
		return response;
	}
	
	public static ResponseMessage validateSSNField( String iSSN ) {
		ResponseMessage response;
		if( iSSN == null ) {
			response = new ResponseMessage(STATUS_FAILED,"SSN is null!");
		} else if ( iSSN.length() != 11 ) {
			response = new ResponseMessage(STATUS_FAILED,"SSN must be 11 characters in length including dashes");
		} else if ( !iSSN.substring(3, 4).equals("-") && !iSSN.substring(6, 7).equals("-") ) {
			response = new ResponseMessage(STATUS_FAILED,"SSN must be formatted as XXX-XX-XXXX");
		} else {
			response = new ResponseMessage(STATUS_SUCCEED,"");
		} 
		return response;
	}
	
	public static ResponseMessage validateDueDateTime( java.util.Calendar iDueDate ) {
		ResponseMessage response;
		if( iDueDate == null ) {
			response = new ResponseMessage(STATUS_FAILED,"DueDate Field is null!");
		} else {
			response = new ResponseMessage(STATUS_SUCCEED,"");
		} 
		return response;
	}
}
