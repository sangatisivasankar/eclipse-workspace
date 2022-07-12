package com.sapient.endur.creational;
/**
 * 
 * @author Admin
 * By default classes are based on prototype design pattern i.e. there
 * is no limit on number of objects that can be created.
 * 
 * In singleton design pattern, only one instance of a class can be created
 */
public class CustomHouse {
	private String houseDetails;
	private static CustomHouse customHouse=null;
	
	private  CustomHouse() {
		
	}
	
	private  CustomHouse(String houseDetails) {
		this.houseDetails=houseDetails;
	}
	
	public static CustomHouse createInstance(String houseDetails) {
		if(customHouse==null) {
			customHouse= new CustomHouse(houseDetails);
		}		
		return customHouse;		
	}

	public String getHouseDetails() {
		return houseDetails;
	}

	public void setHouseDetails(String houseDetails) {
		this.houseDetails = houseDetails;
	}
	
	
}



