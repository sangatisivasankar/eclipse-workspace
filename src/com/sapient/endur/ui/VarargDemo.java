package com.sapient.endur.ui;
/**
 * 
 * @author Admin
 * Vararg : Variable list of arguments
 * 
 * Method overloading
 * 
 * public void m(int n1);
 * public void m(int n1, int n3);
 * public void m(int n1, int n2, int n3);
 * 
 * Other Way
 *  three dots( ...) is called ellipse operator , an parameter of ellipse type can take
 *  varibale number of arguments
 * public void m( int ...n)
 */
public class VarargDemo {

	public static void main(String[] args) {
		sayGreeting(1,"Hello");
		System.out.println("-----------------");
		sayGreeting(2,"Hello","Welcome");
		System.out.println("-----------------");
		sayGreeting(3,"Hi","Hello","Welcome"); //and so on

	}
	
	public static void sayGreeting(Integer id,String ...message) {
		System.out.println("Id: "+ id);
		for(String s: message) {
			System.out.println(s);
		}
	}
	
	//Following method definition gives error
	//The variable argument type String of the method sayGreeting must be the last parameter
//	public static void sayGreeting( String ...message,Integer id) {
//		System.out.println("Id: "+ id);
//		for(String s: message) {
//			System.out.println(s);
//		}
//	}

}







