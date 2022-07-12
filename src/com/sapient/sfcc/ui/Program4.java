package com.sapient.sfcc.ui;
import java.util.*;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		reShape(s1);
		
	}
	public static String reShape(String s) {
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb2 = new StringBuffer();
		String s2 = sb.reverse().toString();
		for(int i=0;i<s2.length();i++) {
			sb2.append(s2.charAt(i));
			sb2.append("-");
		}
		sb2.deleteCharAt(sb2.length() -1);
		System.out.println(sb2.toString());
		return sb2.toString();
		
	}

}

