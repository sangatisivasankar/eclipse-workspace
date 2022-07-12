package com.sapient.endur.service;

public class Calculator {
	
	public Integer addNumber(Integer number1 , Integer number2 ) {
		return number1+number2;
	}
	
	public Integer substractNumber(Integer number1 , Integer number2 ) {
		return number1-number2;
	}
	
	public Integer multiplyNumber(Integer number1 , Integer number2 ) {
		return number1*number2;
	}
	
	public Double divideNumber(Integer number1 , Integer number2 ) {
		return (double) (number1/number2);
	}

}