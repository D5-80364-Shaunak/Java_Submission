package com.realshape;

import com.shape.*;

public class Circle extends BoundedShape {
	
	double radius;
	
	public static final double PI = 3.142;
	
	
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}


	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
    
	



	public double getRadius() {
		return radius;
	}




	public void setRadius(double radius) {
		this.radius = radius;
	}




	@Override
	public double calcArea() {
		return PI * this.radius * this.radius;
	}

}
