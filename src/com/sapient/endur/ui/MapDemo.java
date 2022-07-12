package com.sapient.endur.ui;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class MapDemo {
	public static void main(String[] args) {
//		Map<String,String> countryMap= new HashMap<>();
//		Map<String,String> countryMap= new LinkedHashMap<>();		
		//to store key:value pairs in the order of keys, use TreeSet
		Map<String,String> countryMap= new TreeMap<>();
		countryMap.put("India", "Delhi");
		countryMap.put("USA", "Washington DC");
		countryMap.put("UK", "London");
		countryMap.put("India", "New Delhi"); // New Delhi replaces Delhi
		
		System.out.println(countryMap.size());
		
		//reading only keys
		Set<String> countrySet= countryMap.keySet();
		Iterator<String> iterator= countrySet.iterator();
		while(iterator.hasNext()) {
			String k= iterator.next();
			System.out.println(k+":"+countryMap.get(k));
		}

		System.out.println("Displaying only values..");
		//reading only values
		Collection<String> c = countryMap.values();
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Displaying both key:value pairs using entrySet()..");
		for(Map.Entry<String,String> m : countryMap.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
	}

}
