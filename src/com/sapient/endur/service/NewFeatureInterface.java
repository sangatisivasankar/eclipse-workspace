package com.sapient.endur.service;
/**
 * 
 * @author Admin
 * Apart from public abstract methods and public static final variables,
 * we can have default methods and static methods in an interface.
 * This feature is provided from JDK 8 onwards.
 * 
 * We can have any number default methods and static methods in an interface.
 * 
 * Note: default methods and static methods in interface are meant for
 * downward compatibility.
 * 
 */
public interface NewFeatureInterface {
	//public abstract void  greeting();
	
	//default method
	public default  String sayHi() {
		return "Hi";
	}
	
	//static method
	public static String sayHello() {
		return "Hello";
	}
	
	
}


