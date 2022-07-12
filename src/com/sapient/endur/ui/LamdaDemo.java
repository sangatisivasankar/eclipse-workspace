package com.sapient.endur.ui;

import com.sapient.endur.service.Credential;
import com.sapient.endur.service.Factorial;
import com.sapient.endur.service.MaxFinder;

public class LamdaDemo {

	public static void main(String[] args) {
		System.out.println("Applying anonymous inner class");
		int mx =  ( new MaxFinder() {

			@Override
			public int maximum(int number1, int number2) {
					return (number1>number2)?number1:number2;
			}
			
		}).maximum(10,12);
		
		System.out.println("Maximum number is "+ mx);
		
		System.out.println("Applying Lambda Expression..");
		
		MaxFinder finder1= (n1,n2)-> {
										return (n1>n2)?n1:n2;
									};
		
		 //same as
									
			
		MaxFinder finder2= (n1,n2)-> (n1>n2)?n1:n2;
		
		System.out.println("Maximum number is "+ finder1.maximum(10, 12));
		System.out.println("Maximum number is "+ finder2.maximum(10, 12));
		
		
		System.out.println("Implementing factorial by lamda expression");
		System.out.println("Step 1: Create functional interface for factorial" );
		System.out.println("Step 2: Compute and return factorial using Lamda expression");
		Factorial factorial = n-> {
			 						long r=1;
			 						while(n>0) {
			 							r=r*n--;
			 						}
			 						return r;
								};

		System.out.println("Factorial of 5 is "+ factorial.getFactorial(5));
		
		/* using lamda expression, define a method that receives userid and password,
		 * returns true if userid and password are different else returns false.
		 * steps:
		 * 	1. create interface and declare the abstract method
		 *  2. Define the method using lamda expression
		 *  3. Invoke the method
		 */
		
		Credential credential = (userid,password)-> (!userid.equals(password)?true:false);
		System.out.println(credential.isValidCredentials("admin", "admin@123"));
		System.out.println(credential.isValidCredentials("admin", "admin"));

		
	}

}

