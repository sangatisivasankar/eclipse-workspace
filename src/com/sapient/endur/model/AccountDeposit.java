package com.sapient.endur.model;

@FunctionalInterface
public interface AccountDeposit {
	public abstract Double deposit(Double amount);
}

