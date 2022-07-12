package com.sapient.endur.model;
/**
 * 
 * @author Admin
 * The methods of an interface are by default public and abstract.
 * This violates Interface Segregation policy.
 * 
 * In Interface Segregation, instead of providing more that one abstract method in an interface,
 * go for functional interfaces( An interface with only one abstract method). This the classes
 * have flexibility in selecting the required FIs.
 * 
 * Note: A class can implement any number of interface.
 * 
 */
public interface Transaction {
	public abstract void deposit(Double amount);
	public abstract String withdraw(Double amount);
	public abstract Double transfer(Double amount, Account toAccount);
	
}

