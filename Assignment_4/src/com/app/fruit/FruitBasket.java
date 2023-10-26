package com.app.fruit;

import java.util.*;

public class FruitBasket {

	public static void main(String[] args) {
		int choice = 10, size = 0, counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of basket: ");
		size = sc.nextInt();
		Fruit[] basket = new Fruit[size];
		while(choice != 0) {
			System.out.println("Choose from the below options:");
			System.out.println("0. Exit");
			System.out.println("1. Add Mango.");
			System.out.println("2. Add Orange.");
			System.out.println("3. Add Apple.");
			System.out.println("4. Display names of all fruits in basket.");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits in basket");
			System.out.println("6. Display taste of all stale fruits in basket");
			System.out.println("7. Mark fruit as stale.");
			//System.out.println("8. Mark all sour fruits stale.");
			choice  = sc.nextInt();
			switch(choice) {
			
			case 1:
				
				if(counter < size) {
					basket[counter] = new Mango();
					counter++;
					System.out.println("Mango Added Succesfully");
				}
				else {
					System.out.println("Basket is full.");
					
				}
				break;
					

				
			case 2:
				if(counter < size) {
					basket[counter] = new Orange();
					counter++;
					System.out.println("Orange Added Succesfully");
				}
				else {
					System.out.println("Basket is full.");
					
				}
				break;
				
			case 3:
				if(counter < size) {
					basket[counter] = new Apple();
					counter++;
					System.out.println("Apple Added Succesfully");
				}
				else {
					System.out.println("Basket is full.");
				}
				break;
			
			case 4:
				for(int i = 0; i < counter; i++)
				{
					System.out.println(basket[i].getName());
	
				}
				break;
				
			case 5:
				for(int i = 0; i < counter; i++) {
					System.out.println(basket[i].toString());
				}
				break;
				
			case 6:
				for(int i = 0; i < counter; i++) {
					if(basket[i].isFresh == false) {
						System.out.println(basket[i].taste());
					}
				}
				break;
			
			case 7:
				for(int i = 0; i < counter; i++) {
					System.out.print(i + 1);
					System.out.println(basket[i].toString());
				   }
				System.out.println("Enter the number of fruit you want to mark as stale.");
				int num = sc.nextInt();
				basket[num - 1].setFresh(false);
			}	
			if(choice == 0) break;
		}
		System.out.println("Thank you for using this app!");
	}
	CommisionEmp
}
