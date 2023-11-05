package com.hashset;
import java.util.Objects;
import java.util.Scanner;


public class Book implements Comparable<Book>{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	 
	 public Book() {
		 
	 }

	public Book(String isbn,double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter isbn number:");
		isbn = sc.next();
		System.out.println("Enter price of the book:");
		price = sc.nextDouble();
		System.out.println("Enter name of the author:");
		authorName = sc.next();
		System.out.println("Enter quantity:");
		quantity = sc.nextInt();
	}

	@Override
	public int compareTo(Book arg0) {
		// TODO Auto-generated method stub
		int diff = this.isbn.compareTo(arg0.isbn);
		return diff;
	}
	
}
