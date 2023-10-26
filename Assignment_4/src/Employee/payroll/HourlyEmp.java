package Employee.payroll;

import java.util.Scanner;

public class HourlyEmp extends Employee{
	double hours;
	double hourlyWage;
	
	public HourlyEmp(){
		
	}
	
	@Override
	public double calculateEarning() {
		double earnings = 0.0;
		if(hours <= 40)
			earnings = hourlyWage * hours;
		else if(hours > 40) {
			earnings =  40 * hourlyWage + (40 - hours) * hourlyWage * 1.5;
		}
		return earnings;
	}
	
	@Override
	public void acceptData(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptData(sc);
		System.out.println("Enter working hours:");
		hours = sc.nextDouble();
		System.out.println("Enter hourly wages:");
		hourlyWage = sc.nextDouble();
		
	}
	
	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		super.displayData();
		System.out.println("Hours worked :" + hours);
		System.out.println("Total earnings: " + this.calculateEarning());
		
	}
}
