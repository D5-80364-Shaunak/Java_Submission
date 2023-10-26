package com.app.fruit;

public class Apple extends Fruit{
	
	
	public Apple() {
		this.color = "Red";
		this.weight = 2.0;
		this.name = "Apple";
		this.isFresh = true;
	}
	

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color , weight, name, isFresh);
	}
	
	
	

	@Override
	public String taste() {
		String out_apple = "sweet n sour";
		return out_apple;
	}


	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	

}
