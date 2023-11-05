package com.book;

public class Book{
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
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null)
			return false;
		if(obj == this)
			return true;
		if(!(obj instanceof Book))
			return false;
		Book other = (Book)obj;
		return this.isbn.equals(other.isbn);
		
		
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}
}
