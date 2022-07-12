package com.sapient.endur.ui;

import java.time.LocalDate;
import java.util.Arrays;

import com.sapient.endur.model.Person;
import com.sapient.endur.service.PersonNameComparator;

public class PersonSortDemo {
	private static Person persons[]=new Person[5];
	static {
		persons[0]= 
					new Person(879876545432L,"Ravi Kumar",
							LocalDate.of(1995, 10,15),"Hyderabad","ravi@gmail.com",8876755680L);
		persons[1]= 
				new Person(779876545432L,"Avinash",
						LocalDate.of(1995, 10,15),"Chennai","avvi@gmail.com",7876761245L);
		persons[2]= 
				new Person(679876545432L,"Vinod Kumar",
						LocalDate.of(1995, 10,15),"Hyderabad","vinod@gmail.com",9876767600L);
		persons[3]= 
				new Person(879876545400L,"Madhavi",
						LocalDate.of(1995, 10,15),"Pune","madhavi@gmail.com",8876767685L);
		persons[4]= 
				new Person(999876545432L,"Jones",
						LocalDate.of(1995, 10,15),"Mumbai","jones@gmail.com",7876767680L);
	}
	public static void main(String[] args) {
		System.out.println("Before sorting..");
		for(Person p: persons) {
			System.out.println(p);
		}
		//sorting based on adhar card number
//		Arrays.sort(persons);
		
		//sorting based on person names
		Arrays.sort(persons,new PersonNameComparator());
		
		System.out.println("After sorting..");
		for(Person p: persons) {
			System.out.println(p);
		}

	}

}



