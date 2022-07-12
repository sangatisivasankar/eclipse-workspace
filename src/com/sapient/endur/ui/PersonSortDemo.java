package com.sapient.endur.ui;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

import com.sapient.endur.model.Person;

public class PersonSortDemo {
	private static Person persons[]=new Person[5];
	static {
		persons[0]= 
					new Person(879876545432L,"Ravi Kumar",
							LocalDate.of(1995, 10,15),"Hyderabad","ravi@gmail.com",8876755680L);
		persons[1]= 
				new Person(779876545432L,"Avinash",
						LocalDate.of(1994, 10,14),"Chennai","avvi@gmail.com",7876761245L);
		persons[2]= 
				new Person(679876545432L,"Vinod Kumar",
						LocalDate.of(1995, 10,16),"Hyderabad","vinod@gmail.com",9876767600L);
		persons[3]= 
				new Person(879876545400L,"Madhavi",
						LocalDate.of(1997, 10,16),"Pune","madhavi@gmail.com",8876767685L);
		persons[4]= 
				new Person(999876545432L,"Jones",
						LocalDate.of(1994, 10,15),"Mumbai","jones@gmail.com",7876767680L);
	}
	public static void main(String[] args) {
		System.out.println("Before sorting..");
		for(Person p: persons) {
			System.out.println(p);
		}
		//sorting based on adhar card number
//		Arrays.sort(persons);
		
		//sorting based on person names using anonymous inner class
		Arrays.sort(persons,  new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
					return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		System.out.println("Sorting based on person names..");
		for(Person p: persons) {
			System.out.println(p);
		}
		
		//TO DO
		
		System.out.println("Sorting based on person birthdates..");
		for(Person p: persons) {
			System.out.println(p);
		}

	}

}







