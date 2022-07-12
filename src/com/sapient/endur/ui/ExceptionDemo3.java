package com.sapient.endur.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo3 {

	//calling method
	public static void main(String[] args) throws IOException {
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
	 * It is mandatory to handle checked exceptions.
	 * Handling checked exceptions using throws 
	 * called method.
	 * 
	 * getPersonNames() throws IOException which means instead of handling the
	 * exception on its own, the method is throwing IOException back to
	 * calling method( in this case, calling method is main() ). Now it
	 * the responsibility of the calling method to handle the checked exception
	 */
	private static void getPersonNames(String[] personNames) throws IOException   {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
			for(int i=0;i<personNames.length;i++) {
				System.out.println("Enter name of person:"+(i+1));				
				//String java.io.BufferedReader.readLine() throws IOException
				personNames[i]= br.readLine();
			}
		}
		
	
}



