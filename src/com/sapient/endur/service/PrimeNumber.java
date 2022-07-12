package com.sapient.endur.service;

public class PrimeNumber {
	
	public static void primeNumber(int n) {
		int count=1;
		for (int i = 2; i <=n; i++) {
			boolean prime=true;
			for (int j = 2; j <=i/2 ;j++) {
				if(i%j==0) {
					prime=false;
					break;
				}	
			}
			if(prime)
				System.out.println(count+++"::"+i);
				
		}
		
	}
	public static void main(String[] args) {
		primeNumber(100);
	}
}
