package com.realshape;
import com.shape.*;
public class Rectangle extends Polygon{
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle(int noOfSides, double length, double breadth) {
		super(noOfSides);
		this.length = length;
		this.breadth = breadth;
	}

	
	
	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getBreadth() {
		return breadth;
	}



	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}



	@Override
	public double calcArea() {
		return this.length * this.breadth;
	}
	
}
