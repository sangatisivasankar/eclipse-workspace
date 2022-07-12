package com.sapient.endur.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sapient.endur.service.CredentialException;

public class CredentialExceptionDemo {

	public static void main(String[] args) {
		try(
				BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		){
			System.out.println("Enter userid: ");
			String userid= br.readLine();
			System.out.println("Enter password: ");
			String password= br.readLine();
			/*
			 * We can also throw built-in exceptions on user-specific conditions
			 */
			if(userid.isBlank()|| userid.isEmpty())			{
				throw new NullPointerException("userid and password cannot be blank");
			}
			
			//throwing custom exception
			if(userid.equals(password)) {
				throw new CredentialException("Userid and Password cannot be same");
			}
			System.out.println("Welcome, "+userid);
			
		}catch(CredentialException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}




