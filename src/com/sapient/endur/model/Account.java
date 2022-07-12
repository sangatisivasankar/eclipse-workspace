package com.sapient.endur.model;

import java.time.LocalDate;

public class Account {
	public Account(Long accountNumber, AccountType accountType, String ownerName, LocalDate openingDate,
			Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.ownerName = ownerName;
		this.openingDate = openingDate;
		this.balance = balance;
	}

	private Long accountNumber;
	private AccountType accountType;
	private String ownerName;
	private LocalDate openingDate;
	private Double balance;
	
	public Account() {
		
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", ownerName=" + ownerName
				+ ", openingDate=" + openingDate + ", balance=" + balance + "]";
	}
	
	
}






