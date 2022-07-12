package com.sapient.sfcc.util;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=7654,reverse=0;
		while(number!=0) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println("the reverse of the given number:" +reverse);

	}
	
}

