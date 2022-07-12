package com.sapient.endur.model;
/**
 * 
 * @author Admin
 * Demo of an abstract class.
 * If a class has even one abstract method, declare the class as abstract.
 */
public abstract class Shape {
	private String color;
	
	public  Shape() {
		
	}
	
	public Shape(String color) {
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//abstract method
	public abstract Double getArea();
	
}
