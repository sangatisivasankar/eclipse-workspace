package com.sapient.endur.model;

import java.time.LocalDate;

public class CommercialAccount extends Account implements Transaction{
	
	public CommercialAccount() {
		
	}

	public CommercialAccount(Long accountNumber, AccountType accountType, String ownerName, LocalDate openingDate,
			Double balance) {
		super(accountNumber, accountType, ownerName, openingDate, balance);
		
	}

	@Override
	public void deposit(Double amount) {
		this.setBalance(this.getBalance()+amount);
		
	}

	@Override
	public String withdraw(Double amount) {
		if(amount <= this.getBalance()) {
			this.setBalance(this.getBalance()-amount);
			return amount+ " withdrawn";
		}else {
			return "Insufficient Funds";
		}
		
	}

	@Override
	public Double transfer(Double amount, Account toAccount) {
		Account fromAccount=this;
		if(amount <= fromAccount.getBalance()) {
			//credit toAccount
			toAccount.setBalance(toAccount.getBalance()+amount);
			//debit fromAccount
			fromAccount.setBalance(fromAccount.getBalance()-amount);
			return fromAccount.getBalance();
		}else {
			return null;
		}
		
		
	}
	
	
	
	

}


