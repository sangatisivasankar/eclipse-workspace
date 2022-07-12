package com.sapient.endur.ui;

public class FactorialUsingThread {

	public static final Integer number = 5;

	public static void main(String[] args) {		new Thread( ( ) -> {
		long fact = 1;
		int n = number;
		while(n > 0) {
			fact = fact * n--;
		}

		System.out.println(fact);
		}).start();
	
	}

}