package com.sapient.endur.ui;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.sapient.endur.model.Person;

public class PersonMapDemo {

	public static void main(String[] args) {
		Person[] persons= {
				new Person(879876545432L,"Ravi Kumar",
				LocalDate.of(1998, 10,15),"Hyderabad","ravi@gmail.com",8876755680L),
				new Person(779876545432L,"Avinash",
						LocalDate.of(2001, 12,1),"Chennai","avvi@gmail.com",7876761245L),
				new Person(679876545432L,"Vinod Kumar",
						LocalDate.of(1995, 5,12),"Hyderabad","vinod@gmail.com",9876767600L),
				new Person(879876545400L,"Madhavi",
						LocalDate.of(2010, 7,5),"Pune","madhavi@gmail.com",8876767685L),
				new Person(999876545432L,"Jones",
						LocalDate.of(1992, 8,10),"Mumbai","jones@gmail.com",7876767680L)
		
		
				};
		
		Map<Long,Person> personMap= new HashMap<>();
		for(int i=0;i<persons.length;i++) {
			personMap.put(persons[i].getAdharCard(), persons[i]);
		}
		
		System.out.println("Display persons residing Hyderabad..");
		for(Map.Entry<Long,Person> m: personMap.entrySet()) {
			if(m.getValue().getAddress().equalsIgnoreCase("Hyderabad")) {
				System.out.println(m.getValue());
			}
		}
		
	}

}












