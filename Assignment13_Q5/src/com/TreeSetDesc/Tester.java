package com.TreeSetDesc;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.TreeSetDesc.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class BookPriceDecsComp implements Comparator<Book>{

			@Override
			public int compare(Book b1, Book b2) {
				int diff = -Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
				
			}
		}
			
		Set<Book> bookSet = new TreeSet<Book>(new BookPriceDecsComp());
	
			
		Collections.addAll(bookSet,
					new Book("12",230.30, "Esther",5),
					new Book("11", 150.0, "John",4),
					new Book("31",120.45, "Ramprasad", 3),
					new Book("42", 145.56, "Shaunak", 6),
					new Book("67", 230.56, "Nitin_Ghule", 6),
					new Book("67", 245.00, "Rajiv", 5));
			//Book book = new Book();
//			book.accept();
//			bookSet.add(book);
			
			Iterator<Book> itr = bookSet.iterator();
			while(itr.hasNext()) {
				Book obj = itr.next();
				System.out.println(obj.toString());
			}
			
		
	}

}
