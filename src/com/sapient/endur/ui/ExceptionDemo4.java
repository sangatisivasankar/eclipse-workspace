package com.sapient.endur.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		String[] personNames= new String[4];
		getPersonNames(personNames);
		displayPersonNames(personNames);

	}

	//implement using try with resource syntax
	private static void getPersonNames(String[] personNames) {
		try(
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in))	;
		){
			for(int i=0;i<personNames.length;i++) {
				System.out.println("Enter name of person:"+(i+1));
				personNames[i]=br.readLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}

	private static void displayPersonNames(String[] personNames) {
		for(String s: personNames) {
			System.out.println(s);
		}
		
	}

}

