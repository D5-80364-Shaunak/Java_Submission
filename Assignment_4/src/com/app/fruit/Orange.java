package com.app.fruit;

public class Orange extends Fruit{
	public Orange() {
		this.color = "Orange";
		this.weight = 1.5;
		this.name = "Orange";
		this.isFresh = true;
	}
	

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		String out_orange = "sour";
		return out_orange;
	}
	
}
