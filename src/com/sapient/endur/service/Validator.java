package com.sapient.endur.service;

import java.time.LocalDate;

/**
 * 
 * @author Admin
 * This is Validator class that validates the Person details.
 * This type of validation is called Server side validation
 */
public class Validator{

	/**
	 * 
	 * @param adharCard receives adhar card number, returns true if it is valid number,
	 * a 12-digit number is valid else returns false
	 * @return
	 */
	public Boolean isValidAdhhar(Long adharCard){
		String pattern= "^[0-9]{12}$";
		return adharCard.toString().matches(pattern);		
	}

	/**
	 * 
	 * @param name receives person name
	 * @return return true if name contains alphabets, dots and spaces (optional) else
	 * returns false
	 * 
	 */
	public Boolean isValidName(String name) {
		String pattern="^[a-zA-Z]+[a-zA-Z\\s.]+$";
		return name.matches(pattern);
	}

	/**
	 * 
	 * @param localDate receives person's birthdate
	 * @return returns true if birthdate is less that current date else 
	 * returns false
	 */
	public Boolean isValidBirthdate(LocalDate localDate) {		
		return localDate.isBefore(LocalDate.now());
	}

	/**
	 * 
	 * @param email receives email
	 * @return return true if the email id is valid else returns false
	 * 
	 */
	public Boolean isValidEmail(String email) {
		String pattern="^[a-zA-Z0-9.]+@[a-zA-Z]+.[a-zA-Z]{2,3}$";
		return email.matches(pattern);
	}

	/**
	 * 
	 * @param mobile receives mobile number
	 * @return return true if it 10-digit number and the mobile number begins with 6 or 7 or 8 or 9
	 * else returns false
	 */
	public Boolean isValidMobile(Long mobile) {
//		String pattern= "^[0-9]{10}$";
//
//		if(mobile.toString().matches(pattern) ) {
//			char op= mobile.toString().charAt(0);
//			if(op=='6' || op=='7' || op=='8' || op=='9') {
//				return true;
//			}
//		}
//		return false;
		
		String pattern= "^[6789][0-9]{9}$";
		return mobile.toString().matches(pattern);
	}



}


