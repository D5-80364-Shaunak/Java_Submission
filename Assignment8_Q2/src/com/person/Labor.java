package com.person;

public class Labor extends Employee{
	public double rate;
	public int hours;
	
	public Labor() {
		super();
		
	}
	
	public Labor(String name, int age,int id, double salary,double rate, int hours) {
		super(name, age, id, salary);
		this.rate = rate;
		this.hours = hours;
	}
	
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) throws EmployeeException {
		if(rate < 0)
			throw new EmployeeException("rate", this.rate);
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) throws EmployeeException {
		if(hours < 0)
			throw new EmployeeException("hour", this.hours);
		this.hours = hours;
	}

	@Override
	public double calcSal() {

		return rate * hours;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Labor))
			return false;
		Labor other = (Labor)obj;
		return (super.equals(obj) && this.rate == other.rate && this.hours == other.hours);
	}
}
