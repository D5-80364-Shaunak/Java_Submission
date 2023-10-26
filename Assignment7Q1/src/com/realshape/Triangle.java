package com.realshape;
import com.shape.*;
public class Triangle extends Polygon{
	private double side1;
	private double side2;
	private double side3;
	
	
	public Triangle(double d, double e, double f) {
		this.side1 = d;
		this.side2 = e;
		this.side3 = f;
	}
	
	public Triangle(int noOfSides, double side1, double side2, double side3) {
		super(noOfSides);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}



	public double semiPerimeter()
	{
		return (this.side1 + this.side2 + this.side3)/2;
	}
	
	
	
	public double getSide1() {
		return side1;
	}



	public void setSide1(double side1) {
		this.side1 = side1;
	}



	public double getSide2() {
		return side2;
	}



	public void setSide2(double side2) {
		this.side2 = side2;
	}



	public double getSide3() {
		return side3;
	}



	public void setSide3(double side3) {
		this.side3 = side3;
	}



	@Override
	public double calcArea() {
		double s = semiPerimeter();
		return Math.sqrt(s*(s - this.side1)*(s - this.side2)* (s -this.side3));
	}
}
