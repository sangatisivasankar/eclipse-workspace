package com.sapient.sfcc.ui;

import com.sapient.sfcc.model.Triangle;
import com.sapient.sfcc.service.TriangleManager;

public class TriangleDemo {

	public static void main(String[] args) {
		Triangle triangle= new Triangle(3,3,3);
		
		TriangleManager manager= new TriangleManager();
		System.out.println("Area of triangle: "+manager.computeAreaOfTriangle(triangle));
		

	}

}

