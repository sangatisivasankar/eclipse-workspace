package com.sapient.sfcc.model;
/**
 * 
 * @author Admin
 * Every instance/object of a class will have a separate memory allocated to its instance variables
 * whereas all the instances/objects of a class will share a single copy of static variables.
 * 
 * static variables also called class variables are allocated memory in the method area.
 * 
 * Initialize static variables: Initialize static variables during its loading the class by
 * class loader.
 * 
 * static{
 *  //initialize the static variables.
 * 
 * }
 * 
 * 
 * 
 * 
 * Default values of data members of a class:
 * Integer : 0
 * Real : 0.0
 * Reference types (Class Names/Interface Names/Array Names) : null
 * 
 * syntax of constructor method:
 * public ClassName([<parameters>]){
 * 
 * }
 *
 *
 *
 * Duck is a POJO class
 */
public class Duck {
	//instance variables	
	private Integer tagId;
	private String color;
	private Double weight;
	
	//static variable
	private static Integer counter;
	
	
	static {
		counter=0;
	}
	
	//default constructor also called as no-arg or 0-arg constructor
	public Duck() {
		this.tagId = ++counter;
	}

	//2-arg constructor
	public Duck(String color, Double weight) {
		this.tagId= ++counter;
		this.color = color;
		this.weight = weight;
	}	
	
	//1-arg constructor
	public Duck(String color) {
		this.tagId= ++counter;
		this.color = color;
	}
	
	//1-arg constructor
	public Duck(Double weight) {
		this.tagId= ++counter;
		this.weight = weight;
	}
	
	//3-arg constructor
	public Duck(Integer tagId, String color, Double weight) {		
		this.tagId = tagId;
		this.color = color;
		this.weight = weight;
		counter++;
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public static Integer getCounter() {
		return counter;
	}

	public static void setCounter(Integer counter) {
		Duck.counter = counter;
	}

	//String-representation of Duck object
	
	@Override
	public String toString() {
		return "Duck [tagId=" + tagId + ", color=" + color + ", weight=" + weight + "]";
	}	
	
	
	
	
	
	
	
}






