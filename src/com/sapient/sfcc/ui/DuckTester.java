package com.sapient.sfcc.ui;

import com.sapient.sfcc.model.Duck;

/**
 * 
 * @author Admin
 * 1. Create Duck array as static member of the class that can hold 4 ducks
 * 2. Initialize the array in static block with hard-coded data
 * 3. write a method, getDuckWithMaxWeight() which returns Duck object with max. weight
 * 4. -- Display ducks in alphabetical order of color, using Comparator
 */
public class DuckTester {
	private static Duck ducks[] = new Duck[4];
	
	static {
		ducks[0]=  new Duck("white",1.8);
		ducks[1]= new Duck("grey",1.5);
		ducks[2]= new Duck("black",0.95);
		ducks[3]= new Duck("gold",1.94);
	}
	
	
	public static void main(String[] args) {
		Duck duck= getDuckWithMaxWeight();
		System.out.println("Duck with max. weight: "+ duck);

	}


	private static Duck getDuckWithMaxWeight() {
		double max = ducks[0].getWeight();
		Duck duck= ducks[0];
		for(int i=1;i<ducks.length;i++) {
			if(ducks[i].getWeight()>max) {
				max= ducks[i].getWeight();
				duck= ducks[i];
			}
		}
		return duck;
	}

}

