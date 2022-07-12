package com.sapient.sfcc.ui;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		if(s1.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{3}[-]{1}[0-9]{3}")) {
			System.out.println(s1);
		}

	}

}


