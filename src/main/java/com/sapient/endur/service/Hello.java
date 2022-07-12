package com.sapient.endur.service;

public class Hello{
	private String greeting;
	
	public Hello(){
		this.greeting="Hello";		
	}
	
	public Hello(String greeting) {
		this.greeting=greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public String toString() {
		return "Hello [greeting=" + greeting + "]";
	}
	
	
}

