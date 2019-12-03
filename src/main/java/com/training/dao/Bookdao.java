package com.training.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.beans.Book;

public interface Bookdao 
{
	List<Book> getAllProduct();

	public int addBook(Book b);
	int deleteProductById(int id);

	int editBookbyId(int id, String name, int price); 
	
}
