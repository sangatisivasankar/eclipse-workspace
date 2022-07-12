package com.sapient.sfcc.model;

public class Triangle {
	private Integer s1;
	private Integer s2;
	private Integer s3;
	
	public Triangle() {
		
	}

	public Triangle(Integer s1, Integer s2, Integer s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public Integer getS1() {
		return s1;
	}

	public void setS1(Integer s1) {
		this.s1 = s1;
	}

	public Integer getS2() {
		return s2;
	}

	public void setS2(Integer s2) {
		this.s2 = s2;
	}

	public Integer getS3() {
		return s3;
	}

	public void setS3(Integer s3) {
		this.s3 = s3;
	}	
	
	
}
