package com.sapient.sfcc.ui;

import com.sapient.sfcc.model.Duck;

public class DuckDemo {

	public static void main(String[] args) {
		Duck duck1= new Duck();
		Duck duck2= new Duck("White",1.2);
		Duck duck3= new Duck("Black");
		Duck duck4 = new Duck(2.0);
		Duck duck5= new Duck(111,"Grey",1.8);
		
		System.out.println("Total ducks: "+ Duck.getCounter());
		
		System.out.println("Duck1 Details:"+ duck1);
		System.out.println("Duck2 Details:"+ duck2);
		System.out.println("Duck3 Details:"+ duck3);
		System.out.println("Duck4 Details:"+ duck4);
		System.out.println("Duck5 Details: "+ duck5);

	}

}







