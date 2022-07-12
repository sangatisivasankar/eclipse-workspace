package com.sapient.sfcc.util;

public class Program7 {

	public static void main(String[] args) {
		int num=3583,reverseNum=0,remainder;
		int originalNum = num;
			while(num !=0) {
				remainder=num%10;
				reverseNum=num*10+remainder;
				num /=10;
			}
			if(originalNum == reverseNum) {
				System.out.println(originalNum + "is palindrome.");
			}
			else {
				System.out.println(originalNum + "is not palindrome.");
				
			}
				
	}

}

