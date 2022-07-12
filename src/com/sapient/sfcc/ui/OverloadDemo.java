package com.sapient.sfcc.ui;

import com.sapient.sfcc.model.Overload;

public class OverloadDemo {

	public static void main(String[] args) {
		//to invoke instance methods of class, Overload, create instance of the class
		Overload overload= new Overload();
		
		System.out.println(overload.max(10,9.99f)); //exact match
		System.out.println(overload.max(10.0f,11)); //exact match
		
		// System.out.println(overload.max(66.0f, 67.0));
	}

}





