package com.camp.service;

import com.camp.dao.UserDao;
import com.camp.model.User;

public class UserService {

	private UserDao ud;

	public UserService() {
		ud=new UserDao();
	}
	
	public boolean login(String username, String password) {
		User u = ud.findByUsername(username);
		if(u == null) {
			return false;
		}
		return password.equals(u.getPassword());
	}
	
	public User insert(User u) {
		return ud.insert(u);
	}
}
