package com.sapient.sfcc.ui;

import com.sapient.sfcc.model.Car;
import com.sapient.sfcc.model.Engine;
import com.sapient.sfcc.model.Tyre;

public class CarAggregationDemo {

	public static void main(String[] args) {	
		/*
		 * Injecting one Engine object and 4 Tyre objects while creating Car object
		 */
		Car myCar= 
				new Car("Maruti Suziki",
						new Engine(12345679L,"petrol",1.8),
						new Tyre[] { new Tyre("MRF",22),new Tyre("MRF",22),
								new Tyre("MRF",22),new Tyre("MRF",22)}
						);
		
		System.out.println("My Car Details...");
		System.out.println(myCar);
		
		//Before disposing Car, we want to take out Engine and one rear Tyre
		Engine oldEngine = myCar.getEngine();
		Tyre oldTyre= myCar.getTyres()[2];		
		
		myCar=null; //Since the Car object in the Heap doesn't have any reference, it will be GCed
		
		System.out.println("Retrieving parts of my old car before disposing the car...");
		System.out.println(oldEngine);
		System.out.println(oldTyre);

	}

}






