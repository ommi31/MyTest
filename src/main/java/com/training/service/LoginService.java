package com.training.service;

import com.training.beans.MyUser;

public interface LoginService {

	

	//int resetPass(String newpass, String name);

	//int addUSer(String name, String pass);

	boolean validate(String nm, String pass);
	

}
