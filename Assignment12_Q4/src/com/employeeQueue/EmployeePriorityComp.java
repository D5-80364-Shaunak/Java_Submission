package com.employeeQueue;

import java.util.Comparator;

public class EmployeePriorityComp implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		int diff = -((int)e1.getSalary()-(int)e2.getSalary());
		return diff;
	}
	
}
