package com.sapient.sfcc.ui;

public class Program6 {
	public int lengthOfLastWord(final String a) {
		int len = 0;
		String x =a.trim();
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i) == ' ')
				len = 0;
			else
			    len++;
		}
		return len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String input="IBM TECHNOLOGIES";
		String input="HELLO HOW ARE YOU";
        Program6 program6 = new Program6();
		System.out.println("The length of last word is " +program6.lengthOfLastWord(input));
		

	}

}

