package com.sapient.sfcc.model;
/**
 * 
 * @param a
 * @param 
 * @return
 * 
 *   In method overloading , the method parameters should differ either in
	 a. number of parameters
	 b. type of parameters
	 c. sequence of parameters

 *   2.5 is double constant while 2.5f is float constant
 *   79987998808 is int constant while 79987998808L is long constant
 */
public class Overload {
	public double max(int a, float b) {
		return (a>b)?a:b;
	}
	
	public double max(float a, int b) {
		return (a>b)?a:b;
	}
	
	public double max(int a, int b, int c) {
		return   (a>b)?a:b  > c ?(a>b)?a:b : c;		
	}
}

