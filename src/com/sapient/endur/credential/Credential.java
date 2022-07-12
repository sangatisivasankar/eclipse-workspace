package com.sapient.endur.credential;

public class Credential {
	private String name;
	private String password;
	private static Credential credential = null;
	
	private Credential(String name , String password) {
		this.name = name;
		this.password = password;
	}
	
	public static Credential getInstance(String name , String password) {
		 if(credential ==null) {
			 credential= new Credential(name, password);
		 }
		return credential;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Credential [name=" + name + ", password=" + password + "]";
	}
	
	
}