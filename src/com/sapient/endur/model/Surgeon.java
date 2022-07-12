package com.sapient.endur.model;

public class Surgeon extends Doctor{
	
	public Surgeon() {
		
	}
	
	public Surgeon(String doctorName, String worksAtHospital) {
		super(doctorName,worksAtHospital); //invoking 2-arg constructor of super class which is Doctor class
	}

	@Override
	public void treatPatient() {
		//calling treatPatient() of Doctor class
		super.treatPatient();
		System.out.println("check blood sugar levels..");
	}
	
	public void makeIncision() {
		System.out.println("In operation theatre to make incision..");
	}
	
	
}



