package com.sapient.endur.service;

public class IncreasingNumber {

	public static boolean checkNumber(int number) {
		boolean flag=true;
		int a=number%10;
		int b=0;
		for (int i = number/10; i >0; i=i/10) {
			b=i%10;
			if(a<b) {
				flag=false;
				break;
			}
			a=b;
		}
		return flag;
	}
	public static void main(String[] args) {
		System.out.println(checkNumber(124677899));
	}
}
