package com.sapient.endur.model;

public class Computer {
//	private String state;
//	
//	public Computer() {
//		
//	}
//
//	public Computer(String state) {
//		super();
//		this.state = state;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
	
	
	private ComputerState state;
	
	public Computer() {
		
	}

	public Computer(ComputerState state) {
		super();
		this.state = state;
	}

	public ComputerState getState() {
		return state;
	}

	public void setState(ComputerState state) {
		this.state = state;
	}
	
	
	
	
	
	
	
}






