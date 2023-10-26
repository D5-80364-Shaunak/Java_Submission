package com.app.fruit;

public class Mango extends Fruit {
     public Mango() {
		this.name = "Mango";
		this.weight = 2.0;
		this.color = "Yellow";
		this.isFresh = true;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String taste() {
		String out_mango = "Sweet";
		return out_mango;
	}
     
    
     
     


}
