package com.markerInterface;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person obj1 =  new Person("Shaunak", 72, 180, new Date(2, 5, 1998));
		obj1.display();
		Person obj2 = (Person)obj1.clone();
		obj2.getBirth().setDay(3);
		obj2.display();
		obj1.display();
		}
}

