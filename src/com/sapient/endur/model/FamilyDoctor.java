package com.sapient.endur.model;

public class FamilyDoctor extends Doctor{
	private Integer makesHouseCalls;
	
	
	public FamilyDoctor() {
		
	}
	
	public FamilyDoctor(String doctorName,String worksAtHospital,Integer makesHouseCalls) {
		super(doctorName,worksAtHospital);
		this.makesHouseCalls=makesHouseCalls;
	}


	public Integer getMakesHouseCalls() {
		return makesHouseCalls;
	}


	public void setMakesHouseCalls(Integer makesHouseCalls) {
		this.makesHouseCalls = makesHouseCalls;
	}
	
	public void giveAdvise() {
		System.out.println("take some rest..");
	}
	
}



