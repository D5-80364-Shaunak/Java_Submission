package Employee.payroll;

import java.util.Scanner;

public class SalariedEmp extends Employee{
	double weeklySalary;

	public SalariedEmp() {
		
	}
	@Override
	public double calculateEarning() {
		return weeklySalary;
	}

	@Override
	public void acceptData(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptData(sc);
		System.out.println("Enter the weekly salary:");
		weeklySalary = sc.nextDouble();
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		super.displayData();
		System.out.println("total weekly salary:" + weeklySalary);
	}
	
	
	
}
