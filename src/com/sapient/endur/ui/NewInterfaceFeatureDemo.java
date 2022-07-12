package com.sapient.endur.ui;

import com.sapient.endur.service.NewFeatureInterface;

public class NewInterfaceFeatureDemo implements NewFeatureInterface{

	public static void main(String[] args) {		
		System.out.println(NewFeatureInterface.sayHello());
		System.out.println( new NewInterfaceFeatureDemo().sayHi()  );

	}

}


