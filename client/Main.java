package com.bookapp.client;

import java.util.*;
import java.util.Scanner;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.Bookserviceimpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
	
		 System.out.println("Enter for choice\n1.for authour\n2.for Category\n3.for Price\n5.for bookid\n6.Hey Show all books"
);
	           int a=sc.nextInt();
	           Bookserviceimpl book=new Bookserviceimpl();
	           switch(a) {
	           case 6:
	        	   List<Book> bookList= new ArrayList<>();		
			bookList = book.getAllbooks();
			for (Book book1 : bookList) {
				System.out.println("title " + book1.getTitle());
				System.out.println("author " + book1.getAuthour());
				System.out.println("category " + book1.getCategory());
				System.out.println("price " + book1.getPrice());
				System.out.println("book id " + book1.getBookid());
				System.out.println();
			}
			break;
		case 5:
			System.out.println("enter id");
			int b = sc.nextInt();
			Book bookList1 = new Book();
			try {
				bookList1 = book.getBookbyId(b);
				System.out.println("title " + bookList1.getTitle());
				System.out.println("author " + bookList1.getAuthour());
				System.out.println("category " + bookList1.getCategory());
				System.out.println("price " + bookList1.getPrice());
				System.out.println("book id " + bookList1.getBookid());
				System.out.println();
			} catch (BookNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 1:
			System.out.println("enter author");
			String authour=sc.next();
			List<Book> bookList2 = new ArrayList<>();
			try {
			bookList2 = book.getBooksbyAuthour(authour);
			for (Book book3 : bookList2) {
				System.out.println("title " + book3.getTitle());
				System.out.println("author " + book3.getAuthour());
				System.out.println("category " + book3.getCategory());
				System.out.println("price " + book3.getPrice());
				System.out.println("book id " + book3.getBookid());
				System.out.println();
			}
			}catch(BookNotFoundException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			System.out.println("enter category");
			String category=sc.next();
			List<Book> bookList3 = new ArrayList<>();
			try {
			bookList3 = book.getBooksbyCategory(category);
			for (Book book4 : bookList3) {
				System.out.println("title " + book4.getTitle());
				System.out.println("author " + book4.getAuthour());
				System.out.println("category " + book4.getCategory());
				System.out.println("price " + book4.getPrice());
				System.out.println("book id " + book4.getBookid());
				System.out.println();
			}
			}catch(BookNotFoundException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println("enter max price");
			double price=sc.nextDouble();
			List<Book> bookList4 = new ArrayList<>();
			try {
			bookList4 = book.getBooksbyPrice(price);
			for (Book book5 : bookList4) {
				System.out.println("title " + book5.getTitle());
				System.out.println("author " + book5.getAuthour());
				System.out.println("category " + book5.getCategory());
				System.out.println("price " + book5.getPrice());
				System.out.println("book id " + book5.getBookid());
				System.out.println();
			}
			}catch(BookNotFoundException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
			default:
				System.out.println("invaild choice");
	        	   
	        	   
	        	   
	           
	           }
	           
		 
	
		 }
}	
		

	
