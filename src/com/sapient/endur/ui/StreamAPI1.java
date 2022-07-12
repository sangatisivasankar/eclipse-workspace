package com.sapient.endur.ui;

import java.util.Arrays;
import java.util.List;

public class StreamAPI1 {

	public static void main(String[] args) {
		List<String> courseList=  Arrays.asList("Java","Javascript","Java EE","HTML5","CSS3");
		
		System.out.println("Displays length of each string..");
		courseList.stream().map( (s)->s.length()).forEach(System.out::println);

	}

}











