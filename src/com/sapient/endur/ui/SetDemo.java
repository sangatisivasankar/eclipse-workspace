package com.sapient.endur.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> courseSet= new HashSet<>();
		courseSet.add("Java");courseSet.add("Java EE");
		courseSet.add("Java");courseSet.add("Javascript");
		courseSet.add("HTML5");
		System.out.println(courseSet.size()); //4
		
		Iterator<String> iterator= courseSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//display the courses which contains "Java" either  in upper-case or lower-case or mixed notation
		
		iterator= courseSet.iterator();
		//display the courses which contains "Java" in upper-case or lower-case or mixed notation
		System.out.println("Courses with string java in it...");
		while(iterator.hasNext()) {
			String courseName= iterator.next();
			if(courseName.toLowerCase().contains("java")) {
				System.out.println(courseName);
			}
		}

 
	}

}

