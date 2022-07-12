package com.sapient.sfcc.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.sapient.sfcc.model.Trainee;

public class TraineeTester {

	public static void main(String[] args) {
		/*
		 * trainee id is a 5-digit number before ID
		 * trainee name: characters between ID and BD
		 * birthdate (ddmmyyyy) : digits between BD and MB
		 * mobile: 10-digit number after MB
		 */
		String idCard= "16786IDSmithBD12061999MB7897898789";
		
		/*
		 * Create Trainee object by extracting the data from the above expression
		 * and display the trainee details.
		 */
		
//		System.out.println(idCard.split("ID")[0]);
//		System.out.println(idCard.split("ID")[1]);
		
		Integer id = Integer.parseInt(idCard.split("ID")[0]);		
		String name = idCard.split("BD")[0].split("ID")[1];
		String bdate= idCard.split("MB")[0].split("BD")[1];
		LocalDate birthdate= LocalDate.parse(bdate, DateTimeFormatter.ofPattern("ddMMyyyy"));
		Long mobile =   Long.parseLong(idCard.split("MB")[1]) ;      
		
		Trainee trainee = new Trainee(id,name,birthdate,mobile);
		
		System.out.println(trainee);
				
		
	}
   
}


