package com.bookapp.service;

import java.util.*;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface Bookservice {
	
	Book getBookbyId(int bookid)throws BookNotFoundException;
	List<Book> getBooksbyAuthour(String Authour) throws BookNotFoundException;
	
	List<Book> getBooksbyCategory(String Category) throws BookNotFoundException;
	List<Book> getBooksbyPrice(double price) throws BookNotFoundException;
	
		List<Book> getAllbooks();

	
	

}
