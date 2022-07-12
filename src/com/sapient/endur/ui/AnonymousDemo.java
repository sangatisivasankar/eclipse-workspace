package com.sapient.endur.ui;
/**
 * 
 * @author Admin
 *	Anonymous inner classes are the nameless classes defined within  a method.
 * Syntax:
 * (	new  Object(){
 *   //define the methods
 * 
 *   } ).method();
 */
public class AnonymousDemo {

	public static void main(String[] args) {
		// Anonymous inner class
		
	(new Object(){
			public void getMessage() {
				System.out.println("Welcome to anonymous inner class");
			}
		}).getMessage();

	}

}









