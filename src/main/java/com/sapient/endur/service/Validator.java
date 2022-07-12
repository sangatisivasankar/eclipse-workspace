package com.sapient.endur.service;

import java.time.LocalDate;

public class Validator {
	public Boolean isValidEmpno(Integer empno) {
		String regex= "^[0-9]{4}$";
		return empno.toString().matches(regex);
	}
	
	public Boolean isValidEname(String ename) {
		String regex= "^[a-zA-Z\\s.]+$";
		return ename.matches(regex);
	}
	
	public Boolean isValidJob(String job) {
		String regex= "^[a-zA-Z\\s.]+$";
		return job.matches(regex);
	}
	
	public Boolean isValidHiredate(LocalDate hiredate) {		
		return hiredate.isBefore(LocalDate.now());
	}
	
	public Boolean isValidEmail(String email) {		
		String regex="^[a-zA-Z0-9_.]+@[a-zA-Z0-9_.]+.[a-zA-Z]{2,3}$";
		return email.matches(regex);
	}
	
	public Boolean isValidMobile(Long mobile) {		
		String regex="^[1-9]{1}[0-9]{9}$";
		return mobile.toString().matches(regex);
	}
	
	public Boolean isValidDname(String dname) {
		String regex= "^[a-zA-Z\\s]+$";
		return dname.matches(regex);
	}
	
}
