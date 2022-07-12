package com.sapient.endur.ui;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.sapient.endur.model.StringWrapper;
/*
 * The user-defined classes have to implement Comparable interface so that when objects
		these classes are placed in TreeSet, JVM can perform sorting by calling the 
		compareTo() method.
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		Set<StringWrapper> sampleSet= new  TreeSet<>();
		sampleSet.add(new StringWrapper("Hello"));
		sampleSet.add(new StringWrapper("Hi"));
		sampleSet.add(new StringWrapper("Hi Hello"));
		sampleSet.add(new StringWrapper("Hi Welcome"));
		//java.lang.ClassCastException
		System.out.println(sampleSet.size());
		
		Iterator<StringWrapper> iterator= sampleSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}



