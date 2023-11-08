package com.bookLinkedList;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		List<Book> listBook = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		do {
			System.out.println("0.Exit");
			System.out.println("1. Add new book in the list.");
			System.out.println("2. Display all books in forward order.");
			System.out.println("3. Search a book with given isbn.");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Delete a book with given name.");
			System.out.println("7. Sort books by isbn in asc order.");
			System.out.println("8. Sort books by price in desc order.");
			System.out.println("9. Reverse the list.");
			System.out.println("Enter your choice.");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: // add new book to the list. if 
				Book newBook = new Book();
				System.out.println("Enter the details of the book.");
				newBook.accept();
				int index1 = listBook.indexOf(newBook);
				if(index1 == -1) {
					listBook.add(newBook);
					System.out.println("Book added succsessfully.");
				  }
				else {
					System.out.println("The book is already present in the list!");
					newBook.setQuantity(newBook.getQuantity()+1);
					listBook.set(index1,newBook);
				}
				break;
			
			case 2: //Display books using get();
				System.out.println("The list of books:");
				for(int i = 0; i < listBook.size(); i++) {
					System.out.println(listBook.get(i));
				}
				break;
			
			case 5:// delete book using isbn.
				System.out.println("Enter the isbn of the book you want to delete:");
				String id = sc.next();
				Book key = new Book();
				key.setIsbn(id);
				if(listBook.contains(key)) {
					listBook.remove(key);
					System.out.println("Book deleted sccuessfully");
				}
				else {
				System.out.println("Book not found.");
				}
				break;
			
			case 3: //search book by given isbn.
				System.out.println("Enter the isbn :");
				String isbn_3 = sc.next();
				Book searchBook = new Book();
				searchBook.setIsbn(isbn_3);
				if(listBook.indexOf(searchBook) != -1) {
					System.out.println("Book found in the list." + searchBook.getName());
				}
				else
				{
					System.out.println("Book not found!");
				}
				break;
			
			case 4:
				System.out.println("Enter the sr. no. of the book you want to delete.");
				int index_4 = sc.nextInt();
				listBook.remove(index_4 - 1);
				System.out.println("The book of serial number" + index_4 + "has been deleted successfully!");
				break;
			
			case 6://delete a book with given name.
				System.out.println("Enter the name of book you want to delete.");
				String name6 = sc.next();
				Book key6= new Book();
				key6.setName(name6);
				int index6 = listBook.indexOf(key6);
				if(index6 == -1) {
					System.out.println("Book not found.");
				}
				else
				{
					listBook.remove(index6);
					System.out.println("Book has been deleted.");
				}
				
				break;
	
			case 7: // Sort books in ascending order.
				Collections.sort(arr); 
					System.out.println("Books list sorted by ISBN(Ascending)successfully...");
					break;
				
			case 8:
				class BooksDescComparator implements Comparator<Book>{
						@Override
						public int compare(Book arg0, Book arg1) {
							int diff = -Double.compare(arg0.getPrice(), arg1.getPrice());
							return diff;
						}
					}
					Collections.sort(arr,new BooksDescComparator());
					System.out.println("Books list sorted by ISBN (Descending) successfully...");
					break;

			case 9:
				Collections.reverse(arr);
				System.out.println("List reversed successfully");
				break;
				
			}
			
			
		}while(choice != 0);
		System.out.println("Thank you for using this app!");
	}

}
