package com.functionalInterface2;

import java.util.Scanner;

//import java.util.function.BinaryOperator;

interface Arithmetic{
	double calc(double x,  double y);
}

public class Main {
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result :" + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		while(choice != 0) {
			System.out.println("0.Exit.");
			System.out.println("1. Add numbers.");
			System.out.println("2. Subtract numbers.");
			System.out.println("3. Multiply numbers.");
			System.out.println("4. Divide numbers.");
			System.out.println("Enter your choice.");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter two numbers:");
					double a1 = sc.nextDouble();
					double a2 = sc.nextDouble();
					calculate(a1, a2, (x, y)-> x + y);
					break;
				case 2:
					System.out.println("Enter two numbers:");
					double s1 = sc.nextDouble();
					double s2 = sc.nextDouble();
					calculate(s1, s2, (a, b) -> a  - b);
					break;		
				case 3:
					System.out.println("Enter two numbers:");
					double m1 = sc.nextDouble();
					double m2 = sc.nextDouble();
					calculate(m1, m2, (z, v) -> z * v);
					break;
				
				case 4:
					System.out.println("Enter two numbers:");
					double d1 = sc.nextDouble();
					double d2 = sc.nextDouble();
					if(d2 != 0)
						calculate(d1, d2, (k, v) -> k / v);
					else
						System.out.println("Division by zero is not possible.");
					break;
				
				
			}
			System.out.println("Bye!!");
			
			
		}
		
		
		
		
	}

	







}