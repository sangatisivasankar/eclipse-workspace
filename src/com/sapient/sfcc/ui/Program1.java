package com.sapient.sfcc.ui;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Program1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 =scanner.nextLine();
		System.out.println(capsStart(s1));
	}
	public static String capsStart(String s1) {
		StringBuffer sb= new StringBuffer();
		StringTokenizer t= new StringTokenizer(s1 ," ");
		while(t.hasMoreTokens()) {
			String s2=t.nextToken();
			String s3=s2.substring(0,1);
			String s4=s2.substring(1,s2.length());
			sb.append(s3.toUpperCase()).append(s4).append(" ");
			return sb.toString();
		}
		return null;
	}
}


