package com.sapient.sfcc.util;

public class Program6 {
	static void printFibonacciNumbers(int n) {
		int f1 = 0,f2 = 1,i;
		if(n<1)
			return;
		System.out.println(f1 +"");
		for(i=1 ;i<n;i++) {
			System.out.println(f2 +"");
			int next =f1+f2;
			f1 =f2;
			f2 = next;
		}
	}

	public static void main(String[] args) {
		
		printFibonacciNumbers(6);
		

	}

}
