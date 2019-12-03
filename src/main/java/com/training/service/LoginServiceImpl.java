package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.beans.MyUser;
import com.training.dao.LoginDao;
import com.training.dao.LoginDaoImpl;


public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginDao loginDao;
	
		/*public int resetPass(String newpass, String name) {
		
		return ld.reset(newpass,name);
	}

	@Override
	public int addUSer(String name, String pass) {
		return ld.add(name,pass);
		
	}

*/
	@Override
	public boolean validate(String nm, String pass) {
		return loginDao.validateUser(nm,pass);
		
	}
	

}
