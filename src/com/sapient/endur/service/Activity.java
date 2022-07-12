package com.sapient.endur.service;
public class Activity{
	private String operand1;
	private String operand2;
	private String operator;

	public Activity() {
		
	}

	public Activity(String operand1, String operand2, String operator) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}

	public String getOperand1() {
		return operand1;
	}

	public String getOperand2() {
		return operand2;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperand1(String operand1) {
		this.operand1 = operand1;
	}

	public void setOperand2(String operand2) {
		this.operand2 = operand2;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}	
	

}

