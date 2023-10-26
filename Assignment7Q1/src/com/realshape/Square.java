package com.realshape;
import com.shape.*;
public class Square extends Polygon{
	private double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}
    
	
	

    
	public Square(int noOfSides, double side) {
		super(noOfSides);
		this.side = side;
		
		
	}




	public double getSide() {
		return side;
	}



	public void setSide(double side) {
		this.side = side;
	}



	@Override
	public double calcArea() {
		
		return this.side * this.side;
	}

}
