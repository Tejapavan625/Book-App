package com.bookapp.model;

public class Book {
	double price;
	int bookid;
	private String title;
	private String authour;
	private String category;
	
	public Book() {
		super();
	}
		
	
	public Book(double price, int bookid, String title, String authour, String category) {
		super();
		this.price = price;
		this.bookid = bookid;
		this.title = title;
		this.authour = authour;
		this.category = category;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", bookid=" + bookid + ", title=" + title + ", authour=" + authour
				+ ", category=" + category + "]";
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
