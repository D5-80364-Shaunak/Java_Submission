package com.book;
import java.util.*;
import java.util.ArrayList;



public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ArrayList<Book> arr = new ArrayList<Book>();
	 arr.add(new Book("2321", "Sapiens", 125.40, "Harari", 6));
	 arr.add(new Book("2322", "rework", 250.40, "Fried", 4));
	 arr.add(new Book("2323", "Thinking fast and slow", 125.40, "Kahenman", 3));
	 arr.add(new Book("2324", "Alchemist", 100.40, "cohelo", 2));
	 arr.add(new Book("2325", "Shoe dog", 200.40, "knight", 1));
	 Scanner sc = new Scanner(System.in);
	 int choice = 235;
	 while(choice != 0) {
		 System.out.println("0. Exit");
		 System.out.println("1.Add new book in list.");
		 System.out.println("2. Display all books in forward order.");
		 System.out.println("3.Delete book of given id.");
		 System.out.println("4.Check if book with given isbn is in list or not.");
		 System.out.println("5.Delete all books in list");
		 System.out.println("6.Display number of books in list");
		 System.out.println("Enter your choice:");
		 choice = sc.nextInt();
	   switch(choice) {
	 	case 1:
	 		Book book = new Book();
	 		System.out.println("Enter the details of book you want to add");
	 		System.out.println("Enter the isbn:");
	 		book.setIsbn(sc.next());
	 		System.out.println("Enter book name :");
	 		book.setName(sc.next());
	 		System.out.println("Enter book price :");
	 		book.setPrice(sc.nextDouble());
	 		System.out.println("Enter author name :");
	 		book.setAuthorName(sc.next());
	 		System.out.println("Enter book quantity:");
	 		book.setQuantity(sc.nextInt());
	 		arr.add(book);
	 		System.out.println("Book added sucecessfully.");
	 		break;
	 	
	 	case 2:
	 		System.out.println("The list of books:");
	 		for(Book ele: arr)
	 			System.out.println(ele);
	 		break;
	 			
	 			
	 		
	 	case 3:
	 		System.out.println("Enter the isbn number of book which you want to delete.");
	 		String find = sc.next();
	 		//Book b1 = new Book();
	 		Book key = new Book();
	 		key.setIsbn(find);
	 		if(arr.contains(key)) {
	 			arr.remove(key);
	 		}
	 		break;
	 		
	 	case 4:
	 		System.out.println("Enter isbn number:");
	 		String search = sc.next();
	 		Book key_1 =  new Book();
	 		key_1.setIsbn(search);
	 		if(arr.contains(key_1)) {
	 			System.out.println("Book found" );
	 		}
	 		else
	 			System.out.println("Book not found");
	 		break;
	 		
	 	case 5:
	 		System.out.println("Do you really want to clear list?");
	 		System.out.println("If yes then press 1 if no then press 0.");
	 		int opt = sc.nextInt();
	 		if(opt == 1) {
	 		arr.clear();
	 		System.out.println("List has been cleared.");
	 		break;
	 		}
	 		break;
	 	case 6:
	 		
	 		break;
	 		
	 	}
	   
	   if(choice == 0) {
		   System.out.println("Thank you...");
		   break;
	   }

	 }
	 
	}

}
