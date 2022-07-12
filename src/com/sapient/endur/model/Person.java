package com.sapient.endur.model;

import java.time.LocalDate;
import java.util.Objects;
/**
 * 
 * @author Admin
 * If objects of user-defined class have to sorted, then the class has to 
 * implement Comparable interface and override compareTo() method  if sorting
 * has to base based natural key( property which contains unique values).
 * 
 * 
 * If objects of user-defined class have to sorted based on non-key attribute,
 *  1. create a separate class that implements Comparator interface and overrides compare() method
 *  2. use anonymous inner class
 *  3. Apply lamda expression
 * 
 */
public class Person implements Comparable<Person>{
	private Long adharCard;
	private String name;
	private LocalDate birthdate;
	private String address;
	private String email;
	private Long mobile;
	
	private static String colonyName;
	
	static {
		colonyName="Sapient Colonny";
	}
	
	public Person() {
		
	}


	public Person(Long adharCard) {
		super();
		this.adharCard = adharCard;
	}


	public Person(Long adharCard, String name, LocalDate birthdate, String address, String email, Long mobile) {
		super();
		this.adharCard = adharCard;
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}


	public Long getAdharCard() {
		return adharCard;
	}


	public void setAdharCard(Long adharCard) {
		this.adharCard = adharCard;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getMobile() {
		return mobile;
	}


	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	
	

	public static String getColonyName() {
		return colonyName;
	}


	public static void setColonyName(String colonyName) {
		Person.colonyName = colonyName;
	}


	@Override
	public String toString() {
		return "Person [adharCard=" + adharCard + ", name=" + name + ", birthdate=" + birthdate + ", address=" + address
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}


	@Override
	public int compareTo(Person o) {
		return this.getAdharCard().compareTo(o.getAdharCard());
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, adharCard, birthdate, email, mobile, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && Objects.equals(adharCard, other.adharCard)
				&& Objects.equals(birthdate, other.birthdate) && Objects.equals(email, other.email)
				&& Objects.equals(mobile, other.mobile) && Objects.equals(name, other.name);
	}	
	
	
	
}

