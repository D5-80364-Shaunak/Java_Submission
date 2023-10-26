package Employee.payroll;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int size = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employee you want to enter:");
		size = sc.nextInt();
		int choice = -1;
		Employee[] employee = new Employee[size];
		double totalAmount = 0.0;
		
		for(int i = 0; i < size; i++) {
			System.out.println("1. Salaried Employee.");
			System.out.println("2. Hourly Employee.");
			System.out.println("3. commissioned employee");
			System.out.println("4. BaseSalary plus commission employee.");
			System.out.println("Enter your choice.");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					employee[i] = new SalariedEmp();
					break;
				case 2:
					employee[i] = new HourlyEmp();
					break;
				case 3:
					employee[i] = new CommisionEmp();
					break;
				case 4:
					employee[i] = new BaseSalariedCommEmp();
					break;
			}
			employee[i].acceptData(sc);
			totalAmount += employee[i].calculateEarning();
			System.out.println("The payroll for " + employee[i].firstName + " is "  + employee[i].calculateEarning());
			
		}
		System.out.println("Total payroll for your firm is: " + totalAmount);
	}

}
