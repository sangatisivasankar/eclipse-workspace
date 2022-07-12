package com.sapient.sfcc.model;

import java.time.LocalDate;

/**
 * 
 * @author Admin
 * Trainee is a POJO class that describes an entity called Trainee
 * 
 * Applying this() method to avoid boiler-plate code. 
 * Note: this() method should be the first statement of the constructor
 */
public class Trainee {
	private Integer traineeId;
	private String traineeName;
	private LocalDate birthdate;
	private Long mobile;
	
	// default constructor
	public Trainee() {
		
	}
	
	// 3-arg constructor except traineeId
	public Trainee(String traineeName, LocalDate birthdate, Long mobile) {
//		super();
//		this.traineeName = traineeName;
//		this.birthdate = birthdate;
//		this.mobile = mobile;		
		this(null,traineeName,birthdate,mobile);
	}

	// all-arg constructor
	public Trainee(Integer traineeId, String traineeName, LocalDate birthdate, Long mobile) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.birthdate = birthdate;
		this.mobile = mobile;
	}

	//getter and setter methods
	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	//override toString() method
	
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", birthdate=" + birthdate
				+ ", mobile=" + mobile + "]";
	}
	
	
	
	
}

