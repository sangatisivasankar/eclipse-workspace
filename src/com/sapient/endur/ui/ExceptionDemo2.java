package com.sapient.endur.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		String[] personNames= new String[4];
		getPersonNames(personNames);
		displayPersonNames(personNames);


	}
	
	
	
	
	private static void displayPersonNames(String[] personNames) {
		for(String s: personNames) {
			System.out.println(s);
		}
		
	}


	/*
	 * Handling checked exceptions using try..catch block
	 */
	private static void getPersonNames(String[] personNames)  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int i=0;i<personNames.length;i++) {
				System.out.println("Enter name of person:"+(i+1));
				//It is mandatory to handle checked exceptions
				//String java.io.BufferedReader.readLine() throws IOException
				personNames[i]= br.readLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//void java.io.BufferedReader.close() throws IOException
				br.close(); // close BufferedReader stream
			}catch(IOException e) {
							}
		}

	}
}
