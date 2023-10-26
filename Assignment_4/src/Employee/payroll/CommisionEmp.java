package Employee.payroll;

import java.util.Scanner;

public class CommisionEmp extends Employee{
	int grossSales;
	double commisionRate;
	
	@Override
	public double calculateEarning() {
		return commisionRate *grossSales;
	}
	
	@Override
	public void acceptData(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptData(sc);
		System.out.println("Gross sales: ");
		grossSales = sc.nextInt();
		System.out.println("Rate of Commission");
		commisionRate = sc.nextDouble();
	}
	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		super.displayData();
		System.out.println("Gross Sales :" + grossSales);
		System.out.println("Rate of commission: " + commisionRate);
		System.out.println("Total Earnings: " + calculateEarning());
	}
}
