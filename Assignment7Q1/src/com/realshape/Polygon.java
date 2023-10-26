package com.realshape;

import com.shape.*;
public abstract class Polygon extends BoundedShape {
	private int noOfSides;
	
	public Polygon() {}
	
	public Polygon(int noOfSides) {
		this.noOfSides = noOfSides;
	}
	


	public int getNoOfSides() {
		return noOfSides;
	}
	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}
	public  abstract double calcArea();
}
