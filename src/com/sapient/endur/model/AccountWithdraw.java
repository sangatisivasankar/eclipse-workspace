package com.sapient.endur.model;

@FunctionalInterface
public interface AccountWithdraw {
	public abstract Double withdraw(Double amount);	
}
