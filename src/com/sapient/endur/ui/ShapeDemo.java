package com.sapient.endur.ui;

import com.sapient.endur.model.Circle;
import com.sapient.endur.model.Rectangle;
import com.sapient.endur.model.Shape;
import com.sapient.endur.model.Triangle;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape shape[]= new Shape[5];
		
		shape[0]= new Circle("Black",2.5);
		shape[1]= new Triangle("Red",1.5,1.5,1.5);
		shape[2]= new Triangle("Green",0.7,0.8,0.7);		
		shape[3]= new Circle("Black",1.5);
		shape[4]= new Rectangle("Blue",10.0,5.0);
		
		for(Shape s: shape) {
			if(s instanceof Circle) {
				System.out.println("Color and Area of circle is "+ s.getColor()+","+s.getArea());
			}else if(s instanceof Rectangle) {
				System.out.println("Color and Area of rectangle is "+ s.getColor()+","+s.getArea());
			}else if(s instanceof Triangle) {
				System.out.println("Color and Area of triangle is "+ s.getColor()+","+s.getArea());
			}
		}

	}

}








