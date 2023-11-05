package com.student;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		Student[] arr = new Student[size];
		arr[0] = new Student(1, "Shaunak", "Pune", 77.22);
		arr[1] = new Student(5, "Chaitanya", "Pune", 83.45);
		arr[2] = new Student(3, "Aaditya", "Mumbai", 91.22);
		arr[3] = new Student(2, "Yash", "Nasik", 65.22);
		arr[4] = new Student(4, "Vedant", "Ratnagiri", 89.22);
		StudentDataComparator c2 = new StudentDataComparator();
		
		Arrays.sort(arr, c2);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("\nroll no: %d, name : %s, city : %s, marks: %.2f"
					,arr[i].getRoll(), arr[i].getName(), arr[i].getCity(), arr[i].getMarks());
		}
		
		
		
	}

}
