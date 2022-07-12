package com.sapient.endur.service;
/**
 * 
 * @author Admin
 * Custom Checked Exception
 * This exception object is thrown when the user enters invalid credentials.
 */
public class CredentialException extends Exception{
	private static final long serialVersionUID = 1L;

	public CredentialException() {
		super("Invalid  Credentials");
	}

	public CredentialException(String message) {
		super(message);
		
	}
	
	public CredentialException(String message,Throwable t) {
		super(message,t);		
	}
	
	
}
