package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.beans.MyUser;


@Repository
public class LoginDaoImpl implements LoginDao
{

	@Override
	public boolean validateUser(String nm, String pass) {
		
		return false;
	}


}
