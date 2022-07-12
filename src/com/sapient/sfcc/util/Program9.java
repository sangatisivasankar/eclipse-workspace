package com.sapient.sfcc.util;

public class Program9 {
	static int sumOfPrimes(int n) {
		boolean prime[] = new boolean[n + 1];
		for(int p=2;p*p<= n;p++) {
			if(prime[p]==true) {
				for(int i=p*2;i<=n;i+=p)
					prime[i]=false;
				
			}
		}
		int sum=0;
		for(int i=2;i<=n;i++) 
			if(prime[i]) 
				sum+=i;
			
		return sum;
	}

	public static void main(String[] args) {
		int n=16;
		System.out.println(sumOfPrimes(n));

	}

}

