package com.sapient.endur.model;

import java.time.LocalDate;

public class ConsumerAccount extends Account implements Transaction{
	public static final Double WITHDRAWAL_LIMIT = 750.0;
	
	public ConsumerAccount() {
		
	}

	public ConsumerAccount(Long accountNumber, AccountType accountType, String ownerName, LocalDate openingDate,
			Double balance) {
		super(accountNumber, accountType, ownerName, openingDate, balance);
		
	}

	@Override
	public void deposit(Double amount) {
		Double balance= this.getBalance();
		balance= balance+amount;
		this.setBalance(balance);		
	}

	@Override
	public String withdraw(Double amount) {
		if(amount > this.getBalance()) {
			return "Insufficient Funds";
		}else if(amount <= WITHDRAWAL_LIMIT) {
			this.setBalance(this.getBalance()-amount);
			return amount+" withdrawn";
		}else {
			return "Withdrawal amount exceeding limit of 750";
		}
	}

	@Override
	public Double transfer(Double amount, Account toAccount) {
		Account fromAccount=this;
		if(amount <=fromAccount.getBalance()) {
			//credit toAccount
			toAccount.setBalance( toAccount.getBalance()+  amount);
			//debit fromAccount
			fromAccount.setBalance(fromAccount.getBalance()-amount);
			//returning balance after transfer
			return fromAccount.getBalance();
		}else {
			return null;
		}
		
	}	
	
	
	
}

