package com.sapient.endur.model;

import java.time.LocalDate;
import java.time.Period;

public class CertificateOfDepositAccount extends Account implements AccountWithdraw{
	private LocalDate maturityDate;
	public static final Double CD_RATE_PER_ANNUM = 7.5;
	
	public CertificateOfDepositAccount() {
		
	}

	public CertificateOfDepositAccount(Long accountNumber, AccountType accountType, String ownerName,
			LocalDate openingDate, Double balance, LocalDate maturityDate) {
		super(accountNumber, accountType, ownerName, openingDate, balance);
		this.maturityDate = maturityDate;
	}
		

	public LocalDate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}

	@Override
	public Double withdraw(Double amount) {
		//check current date is on or after maturityDate
		if(LocalDate.now().isAfter(maturityDate) ) {
			Period period  =this.getOpeningDate().until(maturityDate);
			Double balance= this.getBalance();
			Double totalAmount = balance + balance*CD_RATE_PER_ANNUM*period.getYears()/100.0;
			return totalAmount;
		}else {
			return null;
		}
		
	}
	
	
}


