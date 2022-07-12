package com.sapient.endur.ui;

public class NestedTryCatchDemo {
	public static void main(String args[]) { 
		try {
			int a=args.length;
			int b= (int)20/a;
			System.out.println("b= "+ b);
			try {
				if(a==1) 
					a=a/(a-a);
				if(a==2) { 
					int c[]={1};
					c[1]=2; 
				}
			}
			catch(ArrayIndexOutOfBoundsException oe) { 
				System.out.println("Array index out of bounds"); 
			}
			System.out.println("In outer try block");
		}
		catch(ArithmeticException ae) { 
			System.out.println("Divide by 0"); } 
	}
}


