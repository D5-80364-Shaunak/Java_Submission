package com.hashset;
import java.util.*;
import com.hashset.*;

public class Tester {

	public static void main(String[] args) {
		//Set<Book> bookSet = new HashSet<Book>();
		//Set<Book> bookSet = new HashSet<Book>();
		Map<> bookSet = new TreeSet<Book>();
		
		Collections.addAll(bookSet,
				new Book("12",230.30, "Esther",5),
				new Book("11", 150.0, "John",4),
				new Book("31",120.45, "Ramprasad", 3),
				new Book("42", 145.56, "Shaunak", 6),
				new Book("67", 230.56, "Nitin_Ghule", 6),
				new Book("67", 245.00, "Rajiv", 5));
		//Book book = new Book();
//		book.accept();
//		bookSet.add(book);
		
		Iterator<Book> itr = bookSet.iterator();
		while(itr.hasNext()) {
			Book obj = itr.next();
			System.out.println(obj.toString());
		}
	}

}

/* Output After overriding hashcode() method.
 Book [isbn=12, price=150.0, authorName=John, quantity=4]
Book [isbn=67, price=230.56, authorName=Nitin_Ghule, quantity=6]
Book [isbn=31, price=120.45, authorName=Ramprasad, quantity=3]
Book [isbn=42, price=145.56, authorName=Shaunak, quantity=6]
Book [isbn=11, price=230.3, authorName=Esther, quantity=5]
*/
