package com.legit.service;

import java.util.List;

import com.legit.model.User;
import com.legit.repo.UserDao;

public class UserService {

	private UserDao ud;
	
	public UserService() {
		ud = new UserDao();
	}
	
	public List<User> findAll(){
		return ud.findAll();
	}
}
