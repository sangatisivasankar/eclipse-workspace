package com.sapient.endur.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.sapient.endur.model.Person;

public class PersonListDemo {

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
		
		// Array -> ArrayList		
		List<Person> personList= Arrays.asList(persons);
		System.out.println("List of all persons..");
		showPersons(personList);
		/*
		 * method returns List of Persons born in 90's ( 1990-2000)
		 */
//		List<Person> rangePerson = getPersonsByRange(personList);
//		System.out.println("List of persons born in 90's..");
//		showPersons(rangePerson);
		//sorting based on adharCard
//		Collections.sort(personList);
		
		//sorting based on alphabetical order of names
//		Collections.sort(personList, (p1,p2)->p1.getName().compareTo(p2.getName()));	
		
		
		//sorting based on ascending order of mobile numbers
		Collections.sort(personList, (p1,p2)->p1.getMobile().compareTo(p2.getMobile()));
		
		System.out.println("After sorting..");
		showPersons(personList);
		
		
	}

	private static void showPersons(List<Person> personList) {
//		System.out.println("Imperative programming");
//		Iterator<Person> iterator= personList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		System.out.println("Functional programming");
		personList.stream().forEach(System.out::println);
		
	}

	private static List<Person> getPersonsByRange(List<Person> personList) {
		List<Person> personsByAge=new ArrayList<>();
		
		Iterator<Person> iterator= personList.iterator();
		while(iterator.hasNext()) {
			Person p= iterator.next();
			int birthYear= p.getBirthdate().getYear();
			if(birthYear>=1990&&birthYear<=2000) {
				personsByAge.add(p);
			}
		}
		return personsByAge;
	}

}





