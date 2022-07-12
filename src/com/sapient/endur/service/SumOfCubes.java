package com.sapient.endur.service;

public class SumOfCubes {

	public static int sumOfCubes(int n) {
		int sum=0;
		for (int i = n; i>0; i=i/10) {
			int r=i%10;
			sum=sum+r*r*r;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumOfCubes(2020));
	}

}
