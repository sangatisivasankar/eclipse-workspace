package com.sapient.endur.ui;

import com.sapient.endur.model.Computer;
import com.sapient.endur.model.ComputerState;

public class ComputerDemo {

	public static void main(String[] args) {
//		Computer myComputer= new Computer("OFF");
//		System.out.println("My computer state: "+ myComputer.getState());
//		myComputer.setState("ON");
//		System.out.println("My computer state: "+ myComputer.getState());
//		myComputer.setState("someString");
//		System.out.println("My computer state: "+ myComputer.getState());
		
		Computer myComputer= new Computer(ComputerState.OFF);
		System.out.println("MyComputer state: "+myComputer.getState());
		
		myComputer.setState(ComputerState.ON);
		System.out.println("MyComputer state: "+myComputer.getState());
		/*
		 * compile-time checking
		 */
//		myComputer.setState("HIBERNATE");
		

	}

}
