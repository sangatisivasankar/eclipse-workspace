package com.sapient.endur.ui;

import java.util.Scanner;

public class MyString {

	public static void main(String[] args) {
		int[]checkPalindrome=new int[14];
		System.out.println();
		String str = "Character";
        System.out.println(str.contains("a"));
        System.out.println(str.contains("Char"));
        System.out.println("Enter you're name here");
        Scanner name = new Scanner(System.in);

        String realName;
        realName = name.nextLine();//String variable = user input
        System.out.println("Name: "+ realName);

        if (realName == "Maaz") {

            System.out.println("Name: Maaz");

        } else {
            System.out.println("This person is not in the database");
        }
        
        
        
        
        int a = 10;
        int b = 20;
 
       
        MyString object = new MyString();
 
        System.out.println("Value of a: " + a
                           + " & b: " + b);
 
        object.MyString(a, b);
 
        
        System.out.println("Value of a: "
                           + a + " & b: " + b);
    }
       
	
public static boolean checkPalindrome(String str) {
	int len= str.length();
	for(int i=0;i<len/2;i++) {
		if(str.charAt(i)!=str.charAt(len - 1))
			return false;
	}
	return true;
}
public static void MyString(int x, int y)
{
    x++;
    y++;
}
}