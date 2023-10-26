package Employee.payroll;

import java.util.Scanner;

public class BaseSalariedCommEmp extends CommisionEmp{
	double baseSalary;
	public BaseSalariedCommEmp() {
		System.out.println("Inside base salary comm");
	}
	
	@Override
	public double calculateEarning() {
		return super.calculateEarning() + baseSalary;
	}
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the Base Salary:");
		baseSalary = sc.nextDouble();	
	}
	
	
	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		super.displayData();
		System.out.println("Base salary:" + baseSalary);
		System.out.println("Total earnings: " + calculateEarning());
	}
	
	
	
}
