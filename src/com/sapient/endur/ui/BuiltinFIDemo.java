package com.sapient.endur.ui;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.sapient.endur.service.Credential;
import com.sapient.endur.service.Greet;

public class BuiltinFIDemo {

	public static void main(String[] args) {
		System.out.println("Lamda expression on user-defined functional interface");
		Greet g= ()-> "Hello Welcome";
		System.out.println(g.greet());
		
		System.out.println("Lamda expression on built-in functional interface");
		Supplier<String> s1= ()-> "Hello Welcome";
		System.out.println(s1.get());
		
		//void showFullName(String fname,String lname)
		BiConsumer<String,String> bi1= (fn,ln)->{
			String fullName= fn+" "+ln;
			System.out.println(fullName);
		};
		
		bi1.accept("Virat", "Kohli");
		
		System.out.println("Lamda on user-defined FI");

		Credential credential = (userid,password)-> (!userid.equals(password)?true:false);
		System.out.println(credential.isValidCredentials("admin", "admin@123"));
		System.out.println(credential.isValidCredentials("admin", "admin"));
		
		System.out.println("Lamda on built FI, BiPredicate<T,U>");
		BiPredicate<String,String> bip= (userid,password)-> (!userid.equals(password)?true:false);
		System.out.println(bip.test("admin", "admin@123"));
		System.out.println(bip.test("admin", "admin"));
		
		//String getFullName(String fname,String lname)
		BiFunction<String,String,String> bif = (fname,lname)-> fname+" "+lname;
		System.out.println(bif.apply("Rohit", "Sharma"));	
		
		//Long factorial(Integer)
		Function<Integer,Long> f = (n)-> {
					long result=1;
					while(n>0) {
						result=result*n--;
					}
					return result;
		};
		
		System.out.println("Factorial of 5 is "+ f.apply(5));
		
		System.out.println("Using lamda..");
		Consumer<String> consumer = (String str)-> System.out.println(str);		
		consumer.accept("Hi");
		
		System.out.println("Using method reference..");
		Consumer<String> consumer1 = System.out :: println;
		consumer1.accept("Hi");

	}

}




