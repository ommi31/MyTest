package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.beans.Book;
import com.training.dao.Bookdao;

@Service
public class BookServiceImpl implements BookService
{

	@Autowired
	Bookdao bookdao;
	public List<Book> getAllbook() 
	{
	
		return bookdao.getAllProduct();
	}
	@Override
	public int addBook(Book b) {
		
		return bookdao.addBook(b);
	}
	@Override
	public int deleteProdById(int id) 
	{
		
		return bookdao.deleteProductById(id);
	}
	@Override
	public int editBookById(int id, String name, int price) {
		
		return bookdao.editBookbyId(id,name,price);
	}
	

}
