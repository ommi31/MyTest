package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.beans.Book;
import com.training.service.BookService;
import com.training.service.BookServiceImpl;

@Controller
public class BookController 
{
	@Autowired
	BookService bookService;
	
	@RequestMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping("/book")
	public ModelAndView getAllbook() 
	{
	
		List<Book> blist=bookService.getAllbook();
		System.out.println(blist);
		return new ModelAndView("displaybook","blist",blist); 
	}
	
	@RequestMapping("/addbook")
	public ModelAndView showAddBook()
	{
		return new ModelAndView("addbook","command",new Book());
		
	}
	@RequestMapping("/bookadd")
	public ModelAndView addBook(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("price") int price)
	{
		Book b=new Book(id,name,price);
		int n=bookService.addBook(b);
		return new ModelAndView("redirect:/book");
	}
	
	@RequestMapping("delete/{id}")	
	public ModelAndView deleteBook(@PathVariable("id") int id)
	{
		bookService.deleteProdById(id);
		return new ModelAndView("redirect:/book");	
	}
	
	@RequestMapping("edit/{id}")
	public ModelAndView editBook(@PathVariable("id") int id)
	{
		
		return new ModelAndView("editform","command",new Book());
		
	}@RequestMapping("edit/updateBook/{id}")
	public ModelAndView updateBook(@RequestParam("id") int id,@RequestParam("name")String name,@RequestParam ("price") int price)
	{
		int n1=bookService.editBookById(id,name,price);
		
		
		return new ModelAndView("redirect:/book");
		
	}
	
}
