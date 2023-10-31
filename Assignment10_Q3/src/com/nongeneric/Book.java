package com.nongeneric;

public class Book implements Displayble{
	private String name;
	private double price;
	
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public void display() {
		System.out.printf("Name: %s, Price: %.2f\n", this.name, this.price);
		
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [name=").append(name).append(", price=").append(price).append("]");
		return builder.toString();
	}
	
	@Override
	public Displayble get() {
		// TODO Auto-generated method stub
		return this;
	}
	

}
