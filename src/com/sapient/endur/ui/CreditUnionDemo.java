
package com.sapient.endur.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.sapient.endur.model.Account;
import com.sapient.endur.model.AccountType;
import com.sapient.endur.model.CertificateOfDepositAccount;
import com.sapient.endur.model.CommercialAccount;
import com.sapient.endur.model.ConsumerAccount;
import com.sapient.endur.model.CreditUnion;

public class CreditUnionDemo {
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		Account[] accounts= new Account[5];
		populateAccounts(accounts);
		
		
		CreditUnion creditUnion= new CreditUnion("ABC Bank",accounts);
		Account[] bankAccounts= creditUnion.getAccounts();
		while(true) {
			System.out.println("Enter account number: ");
			long accountNumber= Long.parseLong(scanner.nextLine());
			int i=0;
			for(; i<bankAccounts.length; i++) {
				if(accountNumber==bankAccounts[i].getAccountNumber()) {
					
					if(bankAccounts[i].getAccountType().equals(AccountType.CERTIFICATE_OF_DEPOSIT)) {
						//typecast Account to CertificateOfDepositAccount
						Double amountAfterMaturity = ((CertificateOfDepositAccount)bankAccounts[i]).withdraw(null);
						if(amountAfterMaturity!=null) {
							System.out.println("Maturity amount: "+ amountAfterMaturity);
						}else {
							System.out.println("Not yet reached maturity date");
						}
					}else if(bankAccounts[i].getAccountType().equals(AccountType.MONEY_MARKET)){
						System.out.println("Enter (d)eposit or (w)ithdraw (t)ransfer");
						String trans =  scanner.nextLine();
						if(trans.equalsIgnoreCase("d")) {
							System.out.println("Enter deposit amount: ");
							Double amount= Double.parseDouble(scanner.nextLine());
							if(bankAccounts[i] instanceof ConsumerAccount) {
								((ConsumerAccount)bankAccounts[i] ).deposit(amount);
							}else if(bankAccounts[i] instanceof CommercialAccount)  {
								((CommercialAccount)bankAccounts[i] ).deposit(amount);
							}else {
								System.out.println("Invalid account");
							}
						}else if(trans.equalsIgnoreCase("w")) {
							//TO DO
						}else if(trans.equalsIgnoreCase("t")){
							//TO DO
						}else {
							System.out.println("Invalid transaction type");
						}
						
						
					}
					System.out.println(bankAccounts[i]);
					break;
				}
				
			}
			
			if(i==bankAccounts.length) {
				System.out.println("Invalid account number");
			}
				
			System.out.println("Enter any character to continue or x for exit");
			if(scanner.nextLine().equalsIgnoreCase("x")) {
				break;
			}
		}
		
	}

	private static void populateAccounts(Account[] accounts) {
		accounts[0]= new ConsumerAccount(675876876L,AccountType.MONEY_MARKET,"Smith",LocalDate.of(2010, 9, 1),350000.0);
		accounts[1]= new CommercialAccount(565478987L,AccountType.MONEY_MARKET,"Clarke",LocalDate.of(2019, 10,10),1000000.0);;
		accounts[2]= new ConsumerAccount(655786909L,AccountType.MONEY_MARKET,"Jones",LocalDate.of(2000, 10, 10),550000.0);
		accounts[3]= new CertificateOfDepositAccount(808765456L,AccountType.CERTIFICATE_OF_DEPOSIT,"Rohit Sharma",LocalDate.of(2012, 10, 5), 500000.0,LocalDate.of(2015, 10, 5));
		accounts[4]= new CertificateOfDepositAccount(805705000L,AccountType.CERTIFICATE_OF_DEPOSIT,"Virat Kohli",LocalDate.of(2020, 1, 1), 500000.0,LocalDate.of(2025, 1, 1));
	}

	

}










