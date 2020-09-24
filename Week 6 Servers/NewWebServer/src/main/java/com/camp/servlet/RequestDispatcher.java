package com.camp.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.camp.controller.UserController;

public class RequestDispatcher {

	public static String routes(HttpServletRequest req) {
		switch(req.getRequestURI()) {
		case "/NewWebServer/home.app":
			return "html/login.html";
		case "/NewWebServer/login.app":
			return new UserController().login(req);
		case "/NewWebServer/logout.app":
			return new UserController().logout(req);
		default:
			return "html/login.html";
		}
	}
	
	public static void data(HttpServletRequest req, HttpServletResponse res) {
		switch(req.getRequestURI()) {
		case "/NewWebServer/user.data":
			new UserController().sendData(req, res);
			return;
		case "/NewWebServer/create.data":
			new UserController().create(req, res);
			return;
		}
	}
}
