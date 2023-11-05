package com.employeeQueue;

import java.util.Collections;
//import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import com.employeeQueue.*;

public class Tester {

	public static void main(String[] args) {
		Queue<Employee> queue = new PriorityQueue<Employee>(new EmployeePriorityComp());
		//Scanner sc = new Scanner(System.in);
		Employee emp1 = new Employee(12, "Shaunak", 50000.0);
		Employee emp2 = new Employee(11, "Shamal", 54000.0);
		Employee emp3 = new Employee(18, "Shantanu", 45000.0);
		Employee emp4 = new Employee(21, "Shambhavi", 33000.0);
		Employee emp5 = new Employee(44, "Sheetal", 75000.0);
		Employee emp6 = new Employee(15, "Shirish", 100000.0);
		
		Collections.addAll(queue, emp1, emp2, emp3, emp4, emp5, emp6);
		while(!(queue.isEmpty())) {
			Employee ele = queue.poll();
			System.out.println("Employee removed:"+ ele);
		}
		
		
		
		

	}

}
