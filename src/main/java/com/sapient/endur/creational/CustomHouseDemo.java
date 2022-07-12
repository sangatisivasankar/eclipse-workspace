package com.sapient.endur.creational;

public class CustomHouseDemo {

	public static void main(String[] args) {
		CustomHouse myHouse1 = CustomHouse.createInstance("My custom-made house");		
		System.out.println(myHouse1);
		
		CustomHouse myHouse2 = CustomHouse.createInstance("My another custom-made house");
		System.out.println(myHouse2);
		
		CustomHouse myHouse3= CustomHouse.createInstance("My yet another custom-made house");
		System.out.println(myHouse3);
		
		
		//The constructor CustomHouse(String) is not visible
//		CustomHouse myHouse4= new CustomHouse("My yet yet another house");

	}

}









