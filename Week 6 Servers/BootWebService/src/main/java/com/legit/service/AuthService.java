package com.legit.service;

import com.legit.model.User;
import com.legit.repo.UserDao;

public class AuthService {
	
	private UserDao ud;

	public AuthService() {
		ud = new UserDao();
	}
	
	public boolean login(String username, String password) {
		User u = ud.findByUsername(username);
		return password.equals(u.getPassword());
	}
	
	

}
