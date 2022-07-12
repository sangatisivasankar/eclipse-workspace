package com.sapient.sfcc.util;
public class Program5 {
	static double binaryToDecimal (int n) {
		int num =n;
		int decValue=0;
		int base=1;
		int temp=num;
		while(temp>0) {
			int last_digit=temp%10;
			temp=temp/10;
			decValue +=last_digit*base;
			base=base*2;
		}
		return decValue;
	}

	public static void main(String[] args) {
		int n=1010;
		int num;
		System.out.println();
		
	}

}

