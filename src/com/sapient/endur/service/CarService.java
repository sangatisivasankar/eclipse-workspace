package com.sapient.endur.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sapient.endur.model.Car;

//Implement the methods using Stream API
public class CarService {
	//returns total price of all cars
	public double sumOfPrices(Car[] cars) {
		Stream<Car> stream= Arrays.stream(cars);
		
		Double sum= stream
		.map((c)->c.getPrice())
		.reduce((p1,p2)->p1+p2)
		.get();
		
		return sum;
	}

	//return array of car names whose price is greater than 1000000
	public String[] getCarNames(Car[] cars) {
		Stream<Car> stream= Arrays.stream(cars);
		
	
		//Method-1
		
		String[] highPricedCars= stream				
								.filter((c)->c.getPrice()>1000000)
								.map((c)->c.getCarName())
//								.toArray(size->new String[size]);
								.toArray(String[]::new);
		
		
		//Method-2
//		Object [] objArray=Arrays.stream(cars)
//				.filter((a)->a.getPrice()>1000000.0)
//				.map((a)->a.getCarName())
//				.toArray();
		
		//convert Object[] to String[]			
//		String highPricedCars[]= Arrays.copyOf(objArray, objArray.length, String[].class);							
		
		return highPricedCars;
	}

	//returns price of highest-priced car
	public double maxPrice(Car[] cars) {
		Stream<Car> stream= Arrays.stream(cars);
		Double  mx =  stream
					  .map((c)->c.getPrice())
					  .max( (p1,p2)->p1.compareTo(p2) ).get();
		return mx;
	}












	
	/**
	 * 
	 * @param cars : array of Car
	 * @param make : car maker name
	 * @return : returns List of Cars manufactured by the given maker
	 */
	public List<Car> getCarsByMaker(Car[] cars, String make){
		Stream<Car> stream= Arrays.stream(cars);
		List<Car> carList = stream
							.filter(  (c)->c.getCareMake().equalsIgnoreCase(make)  )
							.collect(Collectors.toList());
		return carList;

	}
	
	/**
	 * 
	 * @param carList receives List of cars
	 * @return  Double [] array containing prices of all the cars
	 */
	public Double[] getAllCarPrices(List<Car> carList) {
		Double prices[] = carList.stream()
							.map((c)->c.getPrice())
							.toArray(Double[] :: new);
		return prices;

	}
	
	
}
