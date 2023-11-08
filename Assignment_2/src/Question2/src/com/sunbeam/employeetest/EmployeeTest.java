package com.sunbeam.employeetest;

import com.sunbeam.employee.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Bhanu", "Prakash", 1000000);
		e1.display();
		Employee e2 = new Employee("Shubham", "Kumar", 100000);
		e2.display();
		double salE1 = e1.getSalary();
		double salE2 = e2.getSalary();
		e1.setSalary(salE1*1.1);
		e2.setSalary(salE2*1.1);
		e1.display();
		e2.display();
		Employee e3 = new Employee("Bhanu", "Prakash", -1000000); // Entered negative salary
		e3.display();

	}

}
