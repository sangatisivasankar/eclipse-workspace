package com.sapient.sfcc.model;
/**
 * 
 * @author Admin
 * Contained class (part-of)
 */
public class Engine {
	private Long serialNumber;
	private String engineType;
	private Double capacity;
	
	public Engine() {
		
	}

	public Engine(Long serialNumber, String engineType, Double capacity) {
		super();
		this.serialNumber = serialNumber;
		this.engineType = engineType;
		this.capacity = capacity;
	}

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public Double getCapacity() {
		return capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Engine [serialNumber=" + serialNumber + ", engineType=" + engineType + ", capacity=" + capacity + "]";
	}
	
	
}



