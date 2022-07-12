package com.sapient.endur.service;

public class SumOfSquares {
	
	public static int calculateDifference(int n) {
		int sum;
		int a=0;
		int b=0;
		for (int i = 1; i <=n; i++) {
			a=a+i*i;
			b=b+i;
		}
		sum=a-(b*b);
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(calculateDifference(3));
	}

}
