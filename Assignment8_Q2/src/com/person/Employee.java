package com.person;

public abstract class Employee extends Person{
	public int id;
	public double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int age,int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}
	
	public abstract double calcSal();

	public int getId() {
		return id;
	}

	public void setId(int id) throws EmployeeException {
		if(id < 0)
			throw new EmployeeException("id", id);
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws EmployeeException {
		if(salary < 0)
			throw new EmployeeException("salary", this.salary)
		this.salary = salary;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Employee))
			return false;
		Employee other = (Employee)obj;
		return (super.equals(obj) && this.salary == other.salary && this.id == other.id);
	}
	
	

}
