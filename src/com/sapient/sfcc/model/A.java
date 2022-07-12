package com.sapient.sfcc.model;
/**
 * 
 * @author Admin
 * 		  If no constructors are defined in a class, Java provides a default constructor. But if
	      we overload constructor methods i.e. we provide parameterized constructors, Java will
	      withdraw providing the default constructor.
	      
	      Thumb Rule: When overloading constructor methods, always define default constructor
 */
public class A{
	private Integer a;

	public A() {
		
	}
	
	public A(Integer a){
		this.a=a;
	}

}


//


//package com.sapient.sfcc.ui;

//import com.sapient.sfcc.model.A;

//public class Demo{
//	public static void main(String[] args){
		
//		A aobj= new A(); // compile error
//	}		

//}








