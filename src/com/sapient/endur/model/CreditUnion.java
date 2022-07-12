package com.sapient.endur.model;

public class CreditUnion {
	private String bankName;
	private Account[] accounts;
	
	public CreditUnion() {
		accounts= new Account[100];
	}

	public CreditUnion(String bankName, Account[] accounts) {
		super();
		this.bankName = bankName;
		this.accounts = accounts;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	
	
	
}











