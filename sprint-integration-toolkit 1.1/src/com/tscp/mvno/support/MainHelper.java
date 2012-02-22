package com.tscp.mvno.support;

import java.io.BufferedReader;

import com.tscp.mvno.exception.SprintAPIException;

public class MainHelper {

	public MainHelper() {
		
	}

	/**
	 * Method designed to provide the ability to populate a String field with user input.  
	 * 
	 * @param iFieldName
	 * @param br BufferedReader Object designed to allow user input prompt
	 * @param iCurrentFieldValue 
	 * @return
	 */
	public static String populateField( String iFieldName, BufferedReader br, String iCurrentFieldValue ) {
		try {
			String userInput;
			System.out.println("****Please specify a value for "+iFieldName+"["+iCurrentFieldValue+"]::");
			userInput = br.readLine().trim();
			if( userInput != null && userInput.length() > 0 ) {
				System.out.println(iFieldName+" has been updated to "+userInput);
				return userInput;
			}
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		return iCurrentFieldValue;
	}
	
	/**
	 * Method designed to ensure that a user doesn't provide a null input after calling the {@link populateField} method.
	 * 
	 * <p>Should a user provide a null input, the method will loop and recall {@link populateField}</p>
	 * 
	 * 
	 * @param iFieldName
	 * @param br BufferedReader Object designed to allow user input prompt
	 * @param iCurrentFieldValue
	 * @return the String object which has been modified
	 */
	public static String populateRequiredField( String iFieldName, BufferedReader br, String iCurrentFieldValue ) {
		String retValue = null;
		while( retValue == null ) {
			retValue = populateField(iFieldName, br, iCurrentFieldValue);
			if( retValue == null ) {
				System.out.println("**** ****"+iFieldName+" cannot be null...");
			}
		}
		return retValue;
	}

	/**
	 * Method designed to allow users with the ability to populate an Int field while at the same time assuring 
	 * the user input is a valid integer value.  
	 * 
	 * <p>If the user input is null, then the value will not be altered.</p>\
	 * 
	 * @param iFieldName
	 * @param br
	 * @param iCurrentIntValue
	 * @return
	 */
	public static int populateIntField( String iFieldName, BufferedReader br, int iCurrentIntValue ) {
		try {
			String userInput;
			boolean invalidInput = true;

			while( invalidInput ) {
				System.out.println("****Please specify a value for "+iFieldName+"["+iCurrentIntValue+"]::");
				userInput = br.readLine().trim();
				//now that we have the input from the user, we will attempt to convert the string into an int value
				//if the conversion fails then we must alert the user and request the value again.
				if( userInput != null && userInput.length() > 0 ) {
					try {
						iCurrentIntValue = Integer.parseInt(userInput);
						invalidInput = false;
						
						System.out.println(iFieldName+" has been updated to "+iCurrentIntValue);						
						return iCurrentIntValue;
					} catch( NumberFormatException nfe ) {
						System.out.println("!!Invalid Input...Please provide a valid numerical value!!");
						invalidInput = true;
					} catch( Exception e ) {
						e.printStackTrace();
					}
				}
			}
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		return iCurrentIntValue;		
	}

	/**
	 * This method will invoke the {@link populateIntField} and ensure that the user input is not a zero value.
	 * 
	 * @param iFieldName
	 * @param br
	 * @param iCurrentIntValue
	 * @return
	 */
	public static int populateNonZeroIntField( String iFieldName, BufferedReader br, int iCurrentIntValue ) {
		int retValue = 0;
		boolean invalidInput = true;
		while( invalidInput ) {
			retValue = populateIntField(iFieldName,br,iCurrentIntValue);
			if( retValue == 0 ) { 
				System.out.println(iFieldName+" cannot be zero...");
				invalidInput = true;
			} else {
				invalidInput = false;
			}
		}
		return retValue;
	}
	
	public static void handleException( SprintAPIException api_ex ) {
		System.out.println("SubscriptionDetail Exception!!");
		System.out.println("SubscriptionDetail.Status   :: "+api_ex.getStatus());
		System.out.println("SubscriptionDetail.Message  :: "+api_ex.getMessage());
	}
}
