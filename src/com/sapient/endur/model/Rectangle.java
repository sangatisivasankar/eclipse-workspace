package com.sapient.endur.model;

public class Rectangle extends Shape{
	private Double length;
	private Double width;
	
	public Rectangle() {
		
	}

	public Rectangle(String color, Double length, Double width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public Double getArea() {
		return this.length*this.width;
	}
	
	
	
	
}



