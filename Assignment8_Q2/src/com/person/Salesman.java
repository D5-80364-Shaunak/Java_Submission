package com.person;

public class Salesman extends Employee{
	public double target;
	public double commission;
	
	public Salesman() {
		super();
	}
	
	public Salesman(String name, int age,int id, double salary,double target, double commission) {
		super(name, age, id, salary);
		this.target = target;
		this.commission = commission;
	}
	
	public double getTarget() {
		return target;
	}

	public void setTarget(double target) throws EmployeeException {
		if(target < 0)
			throw new EmployeeException("target", this.target);
		this.target = target;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) throws EmployeeException {
		if(commission < 0)
			throw new EmployeeException("commission", this.commission);
		this.commission = commission;
	}

	@Override
	public double calcSal() {
		// TODO Auto-generated method stub
		return this.salary + this.commission;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Salesman))
			return false;
		Salesman other = (Salesman)obj;
		return (super.equals(obj) && this.target == other.target && this.commission == other.commission);
	}
}
