package Employee.payroll;

import java.util.Scanner;

public abstract class Employee {
	String firstName;
	String lastName;
	double ssn;
	
	public Employee(){
		
	}
	
	
	public abstract double calculateEarning();
	
	public void acceptData(Scanner sc) {
		System.out.println("Enter first name:");
		firstName = sc.next();
		System.out.println("Enter Last name:");
		lastName = sc.next();
		System.out.println("Enter Social security number:");
		ssn = sc.nextInt();
	}
	
	public void displayData() {
		System.out.println("First name:" + firstName);
		System.out.println("Last name:" + lastName);
		System.out.println("SSN :" + ssn);
		
	}
}



