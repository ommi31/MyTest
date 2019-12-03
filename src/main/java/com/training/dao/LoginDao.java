package com.training.dao;

import java.util.List;

import com.training.beans.MyUser;



public interface LoginDao 
{
	
	/*public int reset(String newpass, String cpass);

	public int add(String name, String pass);

*/
	public boolean validateUser(String nm, String pass);

}
