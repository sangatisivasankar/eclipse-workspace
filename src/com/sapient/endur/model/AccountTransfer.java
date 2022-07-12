package com.sapient.endur.model;

@FunctionalInterface
public interface AccountTransfer {
	public abstract Double transfer(Double amount, Account toAccount);
}


