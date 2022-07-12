package com.sapient.sfcc.model;

import java.util.Arrays;

/**
 * 
 * @author Admin
 * Container class: A Car has Engine, array of Tyres
 */
public class Car {
	private String make;
	private Engine engine;
	private Tyre[] tyres= new Tyre[4];
	
	
	public Car() {
		
	}


	public Car(String make, Engine engine, Tyre[] tyres) {
		super();
		this.make = make;
		this.engine = engine;
		this.tyres = tyres;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public Tyre[] getTyres() {
		return tyres;
	}


	public void setTyres(Tyre[] tyres) {
		this.tyres = tyres;
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", engine=" + engine + ", tyres=" + Arrays.toString(tyres) + "]";
	}
	
	
	
}





