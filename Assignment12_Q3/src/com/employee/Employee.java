package com.employee;

import java.util.*;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj == this)
			return true;
		if(!(obj instanceof Employee))
			return false;
		Employee other = (Employee)obj;
		return this.id == other.id;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		id = sc.nextInt();
		System.out.println("Enter employee name:");
		name = sc.next();
		System.out.println("Enter salary :");
		salary = sc.nextDouble();
	}
	
	public void display() {
		System.out.println("Employee id :" + id);
		System.out.println("Employee name :" + name);
		System.out.println("Salary :" + salary);
		
	}

	@Override
	public int compareTo(Employee obj) {
		int diff = this.id - obj.id;
		return diff;
	}
	
	
	
	

}
