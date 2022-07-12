package com.sapient.sfcc.model;
/*
 * By default, the constructor methods of sub class invoke default constructor of super class
 */
public class Sub extends Super {
	//data hiding
	/*
	 * If a sub class instance variable has same name as the instance variable of its
	 * super class, then it is called as data hiding. When instance of sub class is created,
	 * memory is allocated for both the data members.
	 * 
	 * It not recommended to same names
	 */
	private String message;
	
	public Sub() {
		super();
	}
	
	public Sub(String message) {
		//super() is by default implicitly invoked
		super(); // invoked default constructor of super class even if this statement 
		this.message=message;
	}
	
	public Sub(String message1, String message2) {		
		super(message1); // invoking 1-arg constructor of super class 
		this.message=message2;
	}
	
	public String getMessage() {
		return this.message;
	}

//	public String getMessage() {
//		return super.getMessage()+ ","+ this.message;
//	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void showData() {
		System.out.println(super.getMessage()+","+ this.getMessage());
	}
	
	@Override
	public String toString() {
		return "Sub [message=" + message + "]";
	}
	
	
}


