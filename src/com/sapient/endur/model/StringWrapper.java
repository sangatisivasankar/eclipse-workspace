package com.sapient.endur.model;

import java.util.Objects;

/**
 * 
 * @author Admin
 *  Data Encapsulation: Embedding the data and the methods that act on the data
 *  as a single unit is called data encapsulation.
 *  
 *  Data encapsulation principles state that the data members of a class have to be
 *  private and the methods that act on the data members have to be public.
 *  
 *  Every property(data member) can have a pair of methods called getter and setter
 *  methods.
 *  
 *  getter methods return current state of an object while setter methods modify
 *  the current state of an object.
 *  
 *  StringWrapper is a user-defined class.
 *  
 *  JVM-generated hashcode is always unique which is not based on object's state.
 *  If you want the objects of user-defined class to return same hashcode if they have
 *  same state, explicitly override hashCode() and equals() method.
 *  
 *  By overriding hashCode() and equals() methods in StringWrapper class, if two
 *  StringWrapper class objects have same state, they return same hashcodes and equals()
 *  return true.
 *  
 *  To provide String representation of an user-defined class, override, toString() method.
 */
public class StringWrapper implements Comparable<StringWrapper>{
	//message is data member of this class which is an instance variable
	private String message;
	
	//default or no-arg or 0-arg constructor
	//Ex. StringWrapper stringWrapper = new StringWrapper();
	public StringWrapper() {
		
	}

	//1-arg constructor
	//Ex. StringWrapper stringWrapper = new StringWrapper("Hello World!");
	public StringWrapper(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(message);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringWrapper other = (StringWrapper) obj;
		return Objects.equals(message, other.message);
	}

	@Override
	public String toString() {
//		return "StringWrapper [message=" + message + "]";
		return message ;
	}

	@Override
	public int compareTo(StringWrapper o) {
			return this.message.compareTo(o.message);
	}	
	
	
	
}

