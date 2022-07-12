package com.sapient.sfcc.service;

import com.sapient.sfcc.model.Triangle;
/*
 * Example of Dependency(uses-a) association. Here computeAreaOfTriangle() method of 
 * TriangleManager class is using sqrt() method of Math class to completed the job
 */
public class TriangleManager {
	
	public Double  computeAreaOfTriangle(Triangle triangle) {
		double s1= triangle.getS1();
		double s2= triangle.getS2();
		double s3= triangle.getS3();
		
		double s= (s1+s2+s3)/2.0;		
		double result= 	Math.sqrt(s*(s-s1) * (s-s2) * (s-s3) );
		
		return result;
		
	}
}



