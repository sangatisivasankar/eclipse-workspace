package com.sapient.endur.ui;

import java.util.Scanner;

import com.sapient.endur.service.Activity;
import com.sapient.endur.service.Source;



public class App{

	public static void main(String args[] ) throws Exception {
		Scanner scanner=new Scanner(System.in); 
		try{
			Source object=new Source();
			Activity a=new Activity("hello","welcome","-");
			String message= object.handleException(a);
			System.out.println(message);
			if(message.equals("valid data")){
				System.out.println( object.doOperation(a));
			}else{
				System.out.println(message);
			}
		}finally{
			scanner.close();
		}
	} 
}




