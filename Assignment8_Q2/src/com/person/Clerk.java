package com.person;

public class Clerk extends Employee{
	
	
	
	public Clerk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clerk(String name, int age, int id, double salary) {
		super(name, age, id, salary);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public double calcSal() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	
	
	

}
