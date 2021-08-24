package com.bookapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public class Bookserviceimpl implements Bookservice {

	@Override
	public Book getBookbyId(int bookid) throws BookNotFoundException {
		boolean flag = false;
		List<Book> bookList = getAllbooks();
		for (Book book : bookList) {
			if (bookid == book.getBookid()) {
				flag = true;
				return book;
			}
		}
		if (!flag) {
			throw new BookNotFoundException("invalid id");
		}
		return null;
	}

	@Override
	public List<Book> getBooksbyAuthour(String Authour) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> bookList = getAllbooks();
		boolean flag = false;
		List<Book> booklist1 = new ArrayList();
		for (Book bookauthour : bookList) {
			if (bookauthour.getAuthour().equals(Authour)) {
				booklist1.add(bookauthour);
				flag = true;

			}
		}
		if(!flag) {
			throw new BookNotFoundException("invalid authour name");
		}

		return booklist1;
	}

	@Override
	public List<Book> getBooksbyCategory(String Category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> bookList = getAllbooks();
		boolean flag=true;
		List<Book> booklist1 = new ArrayList();
		for(Book bookcategory:bookList) {
			if(Category.equals(bookcategory.getCategory())) {
				booklist1.add(bookcategory);
				flag=false;
			}
		
		
	}
		if(!flag) {
			throw new BookNotFoundException("invalid category");
		}
		return booklist1;
	}
	

	@Override
	public List<Book> getBooksbyPrice(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				List<Book> bookList = getAllbooks();
				boolean flag=true;
				List<Book> booklist1 = new ArrayList();
				for(Book bookprice:bookList) {
					if(bookprice.getPrice()<=price) {
						booklist1.add(bookprice);
					}
				}
				
				if(!flag) {
					throw new BookNotFoundException("invalid price");
				}
			
				
		return booklist1;
	}

	@Override
	public List<Book> getAllbooks() {

		return showBooks();
	}

	private List<Book> showBooks() {
		return Arrays.asList(new Book(1900, 1, "Java in action", "kathy", "tech"),
				new Book(400, 2, "sam club", "robin", "self"), new Book(1200, 6, "jee", "kathy", "tech"),
				new Book(800, 3, "captain robin hook", "hal", "children"),
				new Book(4, 700, "pooh tales", "kathy", "children"), new Book(1900, 5, "leadership", "robin", "self"));
	}

}
