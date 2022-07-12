package com.sapient.endur.service;

public class OperatorException extends Exception{
	public OperatorException() {
		super("Invalid Operator");		
	}
	
	public OperatorException(String message) {
		super(message);
	}
	
	public OperatorException(String message,Throwable t) {
		super(message,t);
	}
}




