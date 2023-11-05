package com.book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{
	
	
	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		int diff = b1.getIsbn().compareTo(b2.getIsbn());
		return diff;
	}

}
