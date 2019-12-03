package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {
	public static Connection conn=null;
	
	public static Connection getMyConnection()
	{
		if(conn==null)
		{
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.71:3307/dac48?useSSL=false";
				conn =DriverManager.getConnection(url,"dac48","welcome");
				System.out.println("Connection created");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
		return conn;
		
	}
	
	public static void closeConn()
	{
		if(conn!=null)
		{
			try
			{
				conn.close();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}