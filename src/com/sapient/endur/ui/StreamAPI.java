package com.sapient.endur.ui;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
/**
 * 
 * @author Admin
 *  This demo on applying Stream API terminal operations
 *  min(),max(),forEach(), collect() and reduce()
 */
public class StreamAPI {

	public static void main(String[] args) {
		Stream<Integer> intStream= Stream.of(10,20,30,25,50,40,19,91);
		System.out.println(intStream.count());
				
		//reopen intStream
		intStream= Stream.of(10,20,30,25,50,40,19,91);
		Optional<Integer> optional= intStream.min((n1,n2)->n1.compareTo(n2));
		if(optional.isPresent()) {
			System.out.println("Minimum value: "+ optional.get());
		}else {
			System.out.println("No such value");
		}
		
		Stream<String> strStream= Stream.of("Java","Java EE","Spring","Javascript","HTML5","CSS3");
		//display the smallest word alphabetically
		Optional<String> opt = strStream.min( (s1,s2)->s1.compareTo(s2)   );
		System.out.println(opt.get());
		
		//display the smallest word length-wise
		strStream= Stream.of("Java","Java EE","Spring","Javascript","HTML5","CSS");
		Optional<String> opt1=  
				strStream
				.min( (s1,s2)-> new Integer(s1.length() ).compareTo(new Integer(s2.length() ))  );
		System.out.println(opt1.get());
		
		strStream= Stream.of("Java","Java EE","Spring","Javascript","HTML5","CSS");
		Optional<String> opt2=  
				strStream
				.min( (s1,s2)-> s1.length()<s2.length()?-1:1) ;
		System.out.println(opt2.get());
		
		//display sum of all digits of the stream
		intStream= Stream.of(10,20,30,25,50,40,19,91);
		Optional<Integer> sum = intStream.reduce( (n1,n2)->n1+n2 );
		System.out.println(sum.get());
		
		System.out.println("Displaying the intStream..");
		//display the integer values of the stream
		intStream= Stream.of(10,20,30,25,50,40,19,91);
		intStream.forEach(System.out::println);
		
		System.out.println("displaying even numbers..");
		intStream= Stream.of(10,20,31,25,50,40,19,91);
	   intStream.filter( (n)-> n%2==0  )
	   .forEach(System.out::println);

	   List<Integer> myList=  Arrays.asList(90,87,96,65,49,95,76,81,99,65);


	   
//	   Optional<Integer> op=myList.stream()
//	   .limit(5)
//	   .reduce((n1,n2)->n1+n2);
//	   
//	   
//	   System.out.println(op.get());
	   
	   //limit the list to first 5 elements
	   int sm= myList.stream()
	   .limit(5)
	   .reduce((n1,n2)->n1+n2)
	   .get();
	   
	   System.out.println(sm);
	   
	   //skip first 5 elements
	   int sm1= myList.stream().skip(5).reduce( (n1,n2)->n1+n2  ).get();
	   System.out.println(sm1);

		
	}

}







