package com.sapient.endur.service;

/**
 * 
 * @author Admin
 *  Creating custom exception class.
 *  The methods of DAO class throw SQLExceptions, The methods of service layer
 *  will be receiving SQLExceptions and convert them to custom exceptions so that
 *  custom exceptions are thrown to UI layer methods. UI layer are going to handle
 *  custom exceptions.
 */
public class EmployeeException extends Exception{	
	private static final long serialVersionUID = 1L;

	public EmployeeException() {
		super();
	}
	
	public EmployeeException(String message) {
		super(message);
	}
	
	public EmployeeException(String message,Throwable t) {
		super(message,t);
	}
	
	
}
