package com.sapient.sfcc.util;

/**
 * 
 * @author 1. public static boolean isPerfectNumber(int n); a perfect number is
 *         a positive integer that is equal to the sum of its positive divisors,
 *         excluding the number itself. all its factors except the number
 *         itself, returns true if the given number is a perfect number else
 *         returns false
 *
 */

public class Program1 {

	public static void main(String[] args) {

		for (int n = 2; n <= 1000; n++) {
			if (isPerfectNumber(n))
				System.out.println(n + " is perfect number");
			{
			}

		}

	}

	static boolean isPerfectNumber(int num) {
		int sum = 1;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				if (i * i != num)
					sum = sum + i + num / i;
				else
					sum = sum + i;
			} // end of if
		} // end of for
		if (sum == num && num != 1)
			return true;
		return false;
	} // end of function
//driver code  
}
