package com.camp.servlet;

import javax.servlet.http.HttpServletRequest;

import com.camp.controller.UserController;

public class RequestDispatcher {

	public static String routes(HttpServletRequest req) {
		switch(req.getRequestURI()) {
		case "/NewWebServer/home.app":
			return "html/login.html";
		case "/NewWebServer/login.app":
			return new UserController().login(req);
		default:
			return "html/login.html";
		}
	}
}
