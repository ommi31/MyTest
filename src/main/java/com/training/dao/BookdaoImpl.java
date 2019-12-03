package com.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.training.beans.Book;

@Repository
public class BookdaoImpl implements Bookdao 
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Book> getAllProduct() 
	{
		String sql="select * from book1";
		List<Book> blist=jdbcTemplate.query(sql, new RowMapper<Book>()
		{	
			public Book mapRow(ResultSet rs,int nrows) throws SQLException
			{
				Book b=new Book();
				b.setId(rs.getInt(1));
				b.setName(rs.getString(2));
				b.setPrice(rs.getInt(3));
				return b;
			
			}});
		return blist;
	}
	
	public int addBook(Book b) {
		String sql="insert into book1 values(?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {b.getId(),b.getName(),b.getPrice()});
		
	}
	@Override
	public int deleteProductById(int id)
	{
		String sql="delete from book1 where id=?";
		return jdbcTemplate.update(sql,new Object[] {id});
	}

	@Override
	public int editBookbyId(int id, String name, int price) {
		String sql="update book1 set name=?,price=? where id=?";
		return jdbcTemplate.update(sql,new Object[] {name,price,id});

	}

	
	

/*	@Override
	public int editBookbyId(int b) 
	{
		String sql="update book1 set name=?,price=? where id=?";
		return jdbcTemplate.update(sql,new Object[] {b.getName(),b.getPrice(),b.getId()});
	}
*/
}
