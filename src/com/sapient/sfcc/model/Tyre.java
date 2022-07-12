package com.sapient.sfcc.model;

public class Tyre {
	private String brandName;
	private Integer size;
	
	public Tyre() {
		
	}

	public Tyre(String brandName, Integer size) {
		super();
		this.brandName = brandName;
		this.size = size;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tyre [brandName=" + brandName + ", size=" + size + "]";
	}
	
	
	
}



