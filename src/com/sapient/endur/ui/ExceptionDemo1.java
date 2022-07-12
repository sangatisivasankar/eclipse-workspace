package com.sapient.endur.ui;
/**
 * 
 * @author Admin
 *	Handling exceptions
 * 1. using try catch block
 * 2. using throws
 * 
 * In try..catch block, If the last catch block is of type Exception, any type of exception
 * which is not explicitly handled gets trapped here.
 * 
 * So as thumb rule, always provide catch block with type, Exception as last catch block.
 * 
 * In multi-catch block, the sub classes should precede super classes
 */
public class ExceptionDemo1 {

	public static void main(String[] args) {
		/*
		 * Without try..catch block
		 */
//		String myName=null;
//		System.out.println(myName.length());
//		System.out.println("End of the program");
		
		
		/* with try..catch block*/
		String myName= "12345a";
		try {			
			System.out.println(myName.length());
			int myNumber= Integer.parseInt(myName);
			System.out.println(myNumber);
			System.out.println(myName.charAt(5));
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			myName="12345";
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			int myNum= Integer.parseInt(myName);
			System.out.println(myNum);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("End of the program");

	}

}


