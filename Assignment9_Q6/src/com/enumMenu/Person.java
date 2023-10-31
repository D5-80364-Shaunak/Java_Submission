package com.enumMenu;

import java.util.Scanner;

/* Declare an enum for Gender (MALE, FEMALE). Create a class Person with ﬁelds name, age and gender. In main(), create a array of Person. Write a menu
driven program (using enum), to add new person, display all people, ﬁnd a person by name.*/

enum Genders{
	male, female, other
}

public class Person{
	private String name;
	private int age;
	private Genders gender;
	
	public Person(String name, int age, Genders gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Genders getGender() {
		return gender;
	}

	public void setGender(Genders gender) {
		this.gender = gender;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name :");
		sc.nextLine();
		System.out.println("Age :");
		sc.nextLine();
		System.out.println("Gender :");
		sc.next();
	}
	
	public void displayData() {
		System.out.println("Name :" + getName());
		System.out.println("Age :" + getAge());
		System.out.println("Gender :" + getGender());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	
	
	
	
}


