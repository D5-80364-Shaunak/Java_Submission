package com.nongeneric;

public class Tester {
	public static void printDisplaybleBox(Displayble b) {
		b.get().display();
	}
	
	public static void printAnyBox(Displayble b) {
		System.out.println(b.get().toString());
		}
	
	
	public static void main(String[] args) {
		Person p1 = new Person("Shaunak", 23);
		printDisplaybleBox(p1);
		printAnyBox(p1);

	}

}
