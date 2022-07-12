package com.sapient.endur.ui;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

import com.sapient.endur.model.Person;
import com.sapient.endur.service.Validator;

public class PersonTester {
	private static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number of persons: ");
		int ne= Integer.parseInt(scanner.nextLine());

		Person persons[]= new Person[ne];

		getPersonsDetails(persons); 

		showPersonsDetails(persons);


		Person votingPersons[]= getPersonsEligibleForVoting(persons); 
		System.out.println("Persons eligible for voting..");
		for(Person p: votingPersons) {
//			if(p!=null) {
//				System.out.println(p);
//			}
			System.out.println(p);
		}

		Person workInSapient[]= getPersonsWorkingInSapient(persons);
		System.out.println("Persons working in Sapient..");
		for(Person p: workInSapient) {
			System.out.println(p);
		}
	}


	private static Person[] getPersonsWorkingInSapient(Person[] persons) {
		Person sapient[]= new Person[persons.length];
		int j=0;
		for(int i=0;i<persons.length;i++) {
			String email= persons[i].getEmail();
			String domain= email.split("@")[1].split(".")[0];
			if(domain.equals("sapient")) {
				sapient[j++]=persons[i];
			}
		}		
		
		return Arrays.copyOf(sapient, j);	
	}

	private static Person[] getPersonsEligibleForVoting(Person[] persons) {
		Person voters[]= new Person[persons.length];
		int j=0;
		for(int i=0;i<persons.length;i++) {
			Period period= persons[i].getBirthdate().until(LocalDate.now());
			if(period.getYears() >= 18) {
				voters[j++]= persons[i];
			}
		}		
		
		return Arrays.copyOf(voters, j);		
		
	}

	private static void showPersonsDetails(Person[] persons) {
		for(Person p : persons) {
			System.out.println(p);
		}

	}

	private static void getPersonsDetails(Person[] persons) {
		
		try {
			for(int i=0;i<persons.length;i++) {
				System.out.println("Enter Adharcard number(12-digit number): " );
				Long adharCardNumber= Long.parseLong(scanner.nextLine());				
				System.out.println("Enter person's name ");
				String name= scanner.nextLine();			
				System.out.println("Enter birthdate(yyyy-mm-dd): ");
				LocalDate birthdate= LocalDate.parse(scanner.nextLine());
				System.out.println("Enter address: ");
				String address= scanner.nextLine();
				System.out.println("Enter email Id: ");
				String email=scanner.nextLine();
				System.out.println("Enter mobile number: ");
				Long mobile= Long.parseLong(scanner.nextLine());
				
				validatePerson(adharCardNumber, name, birthdate, email, mobile);
				
				persons[i]= new Person(adharCardNumber,name,birthdate,address,email,mobile);
			}
		}catch(DateTimeParseException e) {
			//			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	private static void validatePerson( Long adharCardNumber, String name, LocalDate birthdate,
			String email, Long mobile) throws Exception {
		
		Validator validator= new Validator();
		
		if(!validator.isValidAdhhar(adharCardNumber)) {
			throw new Exception("Invalid adhar card number");
		}
		
		if(!validator.isValidName(name)) {
			throw new Exception("Invalid name");
		}
		
		if(!validator.isValidBirthdate(birthdate)) {
			throw new Exception("Invalid birthdate");
		}
		
		if(!validator.isValidEmail(email)) {
			throw new Exception("Invalid email Id");
		}
		
		if(!validator.isValidMobile(mobile)) {
			throw new Exception("Invalid mobile");
		}
	}




}

