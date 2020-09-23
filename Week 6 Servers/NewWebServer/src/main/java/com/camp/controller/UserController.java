package com.camp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.camp.service.UserService;

public class UserController {

	private UserService us;

	public UserController() {
		us = new UserService();
	}
	
	
	public String login(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		boolean authenticated = us.login(username, password);
		if(authenticated) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			return "html/success.html";
		} else {
			return "home.app";
		}
	}
	
}
