package com.legit.controller;

import java.io.IOException;
import java.net.HttpRetryException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legit.service.AuthService;

public class AuthController {

	private AuthService as;
	
	
	public AuthController() {
		as=new AuthService();
	}


	public void login(HttpServletRequest req, HttpServletResponse res) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		boolean b = as.login(username, password);
		String result = b? "<h1>you were successful</h1>" : "<h1>you failed you loser</h1>";
		try {
			res.getWriter().println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
