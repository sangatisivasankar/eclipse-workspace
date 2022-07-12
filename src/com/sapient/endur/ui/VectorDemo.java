package com.sapient.endur.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import com.sapient.endur.model.Person;

/**
 * 
 * @author Admin
 *  Vector is a legacy class retrofitted into Collection framework.
 *  
 *  Vector is a legacy class and ArrayList is complementary of Vector class.
 *  The Vector methods are by default synchronized but the methods ArrayList are
 *  not synchronized by default.
 *  
 *  All the methods of the implementation classes of Collection framework except legacy classes
 *  are not synchronized. So by default the objects of implementation classes of Collection framework
 *  are not thread-safe.
 *  
 *  The utility class, Collections has methods that convert unsynchronized classes to
 *  synchronized classes.
 *  
 *  
 */
public class VectorDemo {

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
		
		//creating vector object populating with List of persons
		Vector<Person> personsV = new Vector<>(Arrays.asList(persons));
		Enumeration<Person> enumeration= personsV.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		
		System.out.println("Converting unsynchronized list to synchronized list");
		//personList is unsynchronized list
		List<Person> personList= new ArrayList<>(Arrays.asList(persons));
		//personListSync is synchronized list
		List<Person> personListSync = Collections.synchronizedList(personList);

	}

}

