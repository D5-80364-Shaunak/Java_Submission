package com.bookLinkedList;

import java.util.Objects;
import java.util.Scanner;

public class Book {
	private String isbn;
	 private String name;
	 private double price;
	 private String authorName;
	 private int quantity;
	 
	 public Book() {
		 
	 }

	public Book(String isbn,String name, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn) ||Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter isbn number:");
		isbn = sc.next();
		System.out.println("Enter name of the book:");
		name = sc.next();
		System.out.println("Enter price of the book:");
		price = sc.nextDouble();
		System.out.println("Enter name of the author:");
		authorName = sc.next();
		System.out.println("Enter quantity:");
		quantity = sc.nextInt();
	}
}
