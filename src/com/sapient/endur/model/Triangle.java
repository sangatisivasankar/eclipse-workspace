package com.sapient.endur.model;

public  class Triangle extends Shape{
	private Double s1;
	private Double s2;
	private Double s3;
	
	public Triangle() {
		
	}

	public Triangle(String color, Double s1, Double s2, Double s3) {
		super(color);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}	
	
	
	public Double getS1() {
		return s1;
	}

	public void setS1(Double s1) {
		this.s1 = s1;
	}

	public Double getS2() {
		return s2;
	}

	public void setS2(Double s2) {
		this.s2 = s2;
	}

	public Double getS3() {
		return s3;
	}

	public void setS3(Double s3) {
		this.s3 = s3;
	}

	@Override
	public Double getArea() {
		double s= (s1+s2+s3)/2.0;		
		double result= 	Math.sqrt(s*(s-s1) * (s-s2) * (s-s3) );
		
		return result;
	}
	
	
	
}


