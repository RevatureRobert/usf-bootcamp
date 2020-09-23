package com.legit.controller;

import java.io.IOException;
import java.net.HttpRetryException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.legit.service.AuthService;

public class AuthController {

	private AuthService as;

	public AuthController() {
		as = new AuthService();
	}

	public String login(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		boolean b = as.login(username, password);
		if(b) {
			new SessionController().CreateSession(req);
			return "dashboard.app";
		} else {
			return "error.app";
		}
	}
}
