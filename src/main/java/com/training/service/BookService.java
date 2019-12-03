package com.training.service;

import java.util.List;



import com.training.beans.Book;

public interface BookService {

	List<Book> getAllbook();

	int addBook(Book b);

	int deleteProdById(int id);

	int editBookById(int id, String name, int price);

	
	
	

}
