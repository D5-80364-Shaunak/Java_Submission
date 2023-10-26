package com.shape.tester;

import com.shape.*;
import com.realshape.*;

public class MainBoundedShape {

	public static void main(String[] args) {
		BoundedShape circle = new Circle(7.0); //upcasting 
		Circle obj = (Circle) circle; // downcasting
		System.out.println("The area of circle having radius" + obj.getRadius() +"is"+":"+obj.calcArea());
		
		Polygon square = new Square(2.0);
		Square obj1 = (Square) square;
		System.out.println("The area of square having side " + obj1.getSide() +"is"+":"+obj1.calcArea());
		
		Polygon rectangle = new Rectangle(12, 20);
		Rectangle obj2 = (Rectangle) rectangle;
		System.out.println("The area of rectangle having length " 
		+ obj2.getLength() + "and breadth" + obj2.getBreadth() +
		"is" +obj2.calcArea());
		
		Polygon triangle = new Triangle(3.0, 4.5, 5.0);
		Triangle obj3 = (Triangle) triangle;
		System.out.println("The area of square having sides" +
					obj3.getSide1() + "," + obj3.getSide2() +
					"," + obj3.getSide3() + "is :" +
					obj3.calcArea());
		
	}

}
