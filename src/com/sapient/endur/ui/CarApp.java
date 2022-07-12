package com.sapient.endur.ui;

import java.util.Arrays;
import java.util.List;

import com.sapient.endur.model.Car;
import com.sapient.endur.service.CarService;

public class CarApp{

	public static void main(String[] args){
		Car cars[]= {
						new Car("Maruti","Swift Dezire",810000.00),
						new Car("Hyundai","Verna",1100000.00),
						new Car("Toyota","Innova",2450000.00),
						new Car("Audi","Q3",4500000.00)
				
					};
		
		try {
			CarService carService = new CarService();
			
			System.out.println("Car Names exceeding 10 Lakhs...");	
			String[] carNames= carService.getCarNames(cars);					
			Arrays.stream(carNames).forEach(System.out::println);
			
			double total= carService.sumOfPrices(cars);
			System.out.println("Sum of price of all cars= "+ total);
			
			
			double maxPrice= carService.maxPrice(cars);
			System.out.println("Car with maximum price= "+ maxPrice);
			
			System.out.println("List of cars by "+ "Toyota");
			List<Car> carList= carService.getCarsByMaker(cars, "Toyota");
			carList.stream().forEach(System.out::println);
			
			
			//convert Car[] to List<Car>
			List<Car> allCarsList= Arrays.asList(cars);
			Double[] prices= carService.getAllCarPrices(allCarsList);
			System.out.println("Prices of all cars..");
			Arrays.stream(prices).forEach(System.out::println);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}








