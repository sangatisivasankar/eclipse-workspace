package com.sapient.endur.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
 * ArrayList is indexed-based
 * 
 * Default capacity of ArrayList is 10 and capacity increment is 50%
 */
public class ListDemo {

	public static void main(String[] args) {
		//raw type
//		List rawList= new ArrayList<>();
//		rawList.add(new String("hello"));
//		rawList.add(10000);
//		rawList.add(new Date());
//		
//		String str= (String) rawList.get(0);
//		
//		System.out.println(str);
		
		//Generics
		List<String> courseList= new ArrayList<>();
		courseList.add("Java");courseList.add("Java EE");
		courseList.add("Javascript");courseList.add("Spring");
		courseList.add("C++");courseList.add("C");
		
		System.out.println("sorting the list..");
		Collections.sort(courseList);
		System.out.println("After sorting");
		courseList.stream().forEach(System.out::println);
		int index=Collections.binarySearch(courseList, "Javascript");
		System.out.println(index);
		
//		System.out.println(courseList.size());
//		System.out.println("ArrayList indexed-based...");
//		for(int i=0;i<courseList.size();i++) {
//			System.out.println(courseList.get(i));
//		}
//		
//		System.out.println("Iterating through array list");
//		Iterator<String> iterator= courseList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		courseList.add(0, "jQuery");
//		System.out.println(courseList.size());
//		courseList.set(1, "Hibernate");
//		System.out.println(courseList.size());
//		
//		System.out.println("After manipulation..");
//		iterator= courseList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		// ArrayList ca hold duplicate objects and also multiple nulls.
//		courseList.add("Javascript");
//		courseList.add(null);
//		courseList.add("Javascript");
//		courseList.add(null);
//		
//		System.out.println("After further manipulation..");
//		iterator= courseList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
	}

}




