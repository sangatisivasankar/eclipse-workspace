package com.sapient.sfcc.util;

public class Program8 {
	static boolean isPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<n;i++)
			if(n%i==0)
				return false;
		
		return true;
	}
	

	public static void main(String[] args) {
	     
		if(isPrime(10))
			System.out.println("true");
		else
			System.out.println("false");


	}

}


