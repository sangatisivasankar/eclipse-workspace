package com.sapient.endur.model;

public class Doctor {
	private String doctorName;
	private String worksAtHospital;	
	
	public Doctor() {
		
	}	

	public Doctor(String doctorName, String worksAtHospital) {
		super();
		this.doctorName = doctorName;
		this.worksAtHospital = worksAtHospital;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getWorksAtHospital() {
		return worksAtHospital;
	}


	public void setWorksAtHospital(String worksAtHospital) {
		this.worksAtHospital = worksAtHospital;
	}
	
	public void treatPatient() {
		System.out.println("check pulse..");
		System.out.println("check temperature..");
	}
	
}


