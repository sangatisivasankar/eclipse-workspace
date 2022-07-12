package com.sapient.sfcc.ui;
import java.util.regex.*;

public class Program3 {
	public static boolean isValidPanCardNo(String panCardNo) {
	 String regex ="[A-Z]{3}[0-9]{4}[A-Z]{1}";
	 Pattern p =Pattern.compile(regex);
	 if(panCardNo==null) {
		 return false;
	 }
	 Matcher m=p.matcher(panCardNo);
	 return m.matches();
	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ABC1234N";
		System.out.println(isValidPanCardNo(str1));
		
		String str2="ABDD1234";
		System.out.println(isValidPanCardNo(str2));

	}

}
