
package com.sapient.endur.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6 {

	public static void main(String[] args) {
		Map<String,String>  countryMap= new HashMap<>();
		countryMap.put("India", "New Delhi");
		countryMap.put("USA", "Washington DC");
		countryMap.put("UK", "London");
		countryMap.put("Germany", "Berlin");
		Lab6 lab6= new Lab6();
		List<String> cityList= lab6.getValues(countryMap);
		cityList.stream().forEach(System.out::println);
		
		char[] arr = {'a','b','c','a','a','b'};
		
		Map<Character,Integer> map= lab6.countChars(arr);
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
	/**
	 * 
	 * @param countryMap receives HashMap, stores values of the Map in a List in an order 
	 * and returns List
	 * @return
	 */
	public List<String> getValues(Map<String,String> countryMap) {
		Collection<String> collection= countryMap.values();
		List<String> list= new ArrayList<>(collection);
		Collections.sort(list);
		return list;
	}
	
	/**
	 * 
	 * @param arr receives character array 
	 * @return return Map where key is the characetr and value is number of times 
	 * each character is present in the array
	 * Ex. char[] arr = {'a','b','c,'a','a','b'};
	 * 
	 * returns (a:3),(b:2),(c:1) as Map
	 */
	public Map<Character,Integer> countChars(char[] arr){
		Map<Character,Integer> countMap= new HashMap<>();
		for(char ch : arr) {
			if(countMap.containsKey(ch)) {
				countMap.put(ch, countMap.get(ch)+1);
			}else {
				countMap.put(ch, 1);
			}
		}
		return countMap;
	}
	
	/**
	 * 
	 * @param arr receives int array
	 * @return returns Map with number as the key and the square as the value
		Ex. int arr[]={1,2,3,4};
		   Map : 1 1, 2 4, 3 9, 4 16
	 */
	public Map<Integer,Integer> getSquares(int[] arr){
		Map<Integer,Integer> squareMap= new HashMap<>();
		for(int i : arr) {
			squareMap.put(i, i*i);
		}
		return squareMap;
	}
	
	
	public Map<Long,String> getStudents(Map<Long,Integer> studentMarks){
		Map<Long,String> studentMedal= new HashMap<>();
		for(Map.Entry<Long, Integer> m : studentMarks.entrySet()) {
			if(m.getValue()>90) {
				studentMedal.put(m.getKey(), "Gold");
			}else if(m.getValue()>=80) {
				studentMedal.put(m.getKey(), "Silver");
			}else if(m.getValue()>=70) {
				studentMedal.put(m.getKey(), "Bronze");
			}else {
				studentMedal.put(m.getKey(), "No Medal");
			}
		}
		return studentMedal;
	}
	
	
	
	
	
	public Map<Integer,Integer> getSecondSmallest(int[] arr){
		Map<Integer,Integer> smallestMap= new HashMap<>();
		for(int i : arr) {
			Arrays.sort(arr);
		}
		return smallestMap;
	}
	

	
	
	
}


