package com.sapient.endur.ui;

import java.util.Arrays;

import com.sapient.endur.model.StringWrapper;

public class SortDemo {

	public static void main(String[] args) {
		String courses[]= {"Java","Oracle","C++","Java EE"};
		System.out.println("Sorting String objects...");
		System.out.println("Before sorting..");
		for(String s: courses) {
			System.out.println(s);
		}
		
		Arrays.sort(courses);
		
		System.out.println("After sorting..");
		for(String s: courses) {
			System.out.println(s);
		}
		
		System.out.println("Sorting StringWrapper objects..");
		//StringWrapper is user-defiend object
		StringWrapper stringWrapper[]= {
						new StringWrapper("Hello"),
						new StringWrapper("Welcome"),
						new StringWrapper("Hi"),
						new StringWrapper("Java"),		
						};
		
		//throws java.lang.ClassCastException exception at runtime
		Arrays.sort(stringWrapper);
		
		for(StringWrapper s: stringWrapper) {
			System.out.println(s);
		}

	}

}




