package com.sapient.endur.ui;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sapient.endur.model.Person;
/*
 * JVM identifies the uniqueness of an object by its hashcode. 
 * JVM generated  hashcode is always unique ( new keyword always generates
 * a unique hashcode) and is not based on the state of an object.
 * 
 * If object's hashcode has to be based on object's state?
 * we have to override hashcode() and equals() method.
 * 
 * Thumbrule: When placing objects of user-defined classes in hash implementations,
 * override equals() and hashhcode() methods.
 */
public class PersonSetDemo {

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
						LocalDate.of(1992, 8,10),"Mumbai","jones@gmail.com",7876767680L),
				new Person(879876545432L,"Ravi Kumar",
						LocalDate.of(1998, 10,15),"Hyderabad","ravi@gmail.com",8876755680L)		
		
				};
		
		Set<Person> personSet= new HashSet<>();
		for(Person p: persons) {
			personSet.add(p);
			System.out.println(p.hashCode());
		}
		
		System.out.println(personSet.size());
		
		Iterator<Person> iterator= personSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}















