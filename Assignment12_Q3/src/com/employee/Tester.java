package com.employee;

import com.employee.Employee;

import java.util.*;
public class Tester {

	public static void main(String[] args) {
		List<Employee> lstEmp = new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add employee.");
			System.out.println("2.delete employee.");
			System.out.println("3. find employee.");
			System.out.println("4. sort employees.");
			System.out.println("5. Modify employee information.");
			System.out.println("6. display employee list.");
			
			System.out.println("Enter your choice.");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: // adding a new employee
				Employee e1 = new Employee();
				e1.accept();
				lstEmp.add(e1);
				System.out.println("Employee added successfully!");
				break;
			
			case 2:
				//delete employee using remove method.
				System.out.println("Enter empid of employee:");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setId(id);
				if(lstEmp.contains(key))
					lstEmp.remove(key);
				System.out.println("Employee deleted successfully.");
				break;
				
			case 3:// finding employee
				System.out.println("Enter emp id of employee to find ");
				int id1 = sc.nextInt();
				Employee key1 = new Employee();
				key1.setId(id1);
				int index = lstEmp.indexOf(key1);
				if(index == -1)
					System.out.println("Employee not found!");
				else {
					System.out.println("Employee found!");
					System.out.println(lstEmp.get(index).toString());
				}
				break;
				
			case 4:
				//sort employee (using Collections.sort(list) method)
				Collections.sort(lstEmp);
				System.out.println("Employee list sorted sucessfully!");
				break;
				
			case 5:
				//modify employee info
				System.out.println("Enter emp id of employee to be modified.");
				int id2 = sc.nextInt();
				Employee key3 = new Employee();
				key3.setId(id2);
				int index1 = lstEmp.indexOf(key3);
				if(index1 == -1) {
					System.out.println("Employee not found!");
				}
				else {
					Employee oldEmp = lstEmp.get(index1);
					System.out.println("Employee found: " + oldEmp);
					System.out.println("Enter the details of employee.");
					Employee newEmp = new Employee();
					newEmp.accept();
					lstEmp.set(index1, newEmp);
					System.out.println("Employee info modified successful.");
				}
				break;
				
				
			case 6:
				for(Employee ele: lstEmp)
					System.out.println(ele.toString());
				break;
				
			}
			
		}while(choice != 0);
		System.out.println("Thank you for using this app!");
	}

}
