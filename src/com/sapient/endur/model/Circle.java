package com.sapient.endur.model;

public class Circle extends Shape{
	private Double radius;
	
	public Circle() {
		
	}

	public Circle(String color, Double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public Double getArea() {
		return Math.PI*this.radius*this.radius;
	}

	
	
	
	
}
