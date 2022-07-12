package com.sapient.endur.service;

import com.sapient.endur.credential.Credential;

public class CredentialDemo {
	public static void main(String[] args) {
		Credential credential1=Credential.getInstance("Siva", "Siva123");
		System.out.println(credential1);
		
		
		Credential credential2=Credential.getInstance("Hari", "Hari123");
		System.out.println(credential2);
		
		
		Credential credential3=Credential.getInstance("Vasu", "Vasu123");
		System.out.println(credential3);
		
	}

}