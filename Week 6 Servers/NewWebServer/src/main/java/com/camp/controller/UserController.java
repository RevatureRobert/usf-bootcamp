package com.camp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.camp.model.User;
import com.camp.service.UserService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserController {

	private UserService us;

	public UserController() {
		us = new UserService();
	}

	public String login(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		boolean authenticated = us.login(username, password);
		if (authenticated) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			return "html/success.html";
		} else {
			return "home.app";
		}
	}

	public void sendData(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		User u = new User(0, session.getAttribute("username").toString(), session.getAttribute("password").toString());
		try {
			res.getWriter().println(u.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String logout(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.invalidate();
		return "html/login.html";
	}
	
	public void create(HttpServletRequest req, HttpServletResponse res) {
		ObjectMapper om = new ObjectMapper();
		try {
			User u = om.readValue(req.getInputStream(), User.class);
			User user = us.insert(u);
			res.getWriter().println(om.writeValueAsString(user));
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
