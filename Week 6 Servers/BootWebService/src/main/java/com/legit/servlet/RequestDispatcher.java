package com.legit.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legit.controller.AuthController;
import com.legit.controller.UserController;

public class RequestDispatcher {

	public static void dataRetriever(HttpServletRequest req, HttpServletResponse res) {
		System.out.println(req.getRequestURI());
		switch (req.getRequestURI()) {
		case "/BootWebService/user.json":
			new UserController().findAllUsers(req, res);
			break;
		case "/BootWebService/login.json":
			new AuthController().login(req, res);
		}
	}

	public static String retrievePage(HttpServletRequest req) {
		switch (req.getRequestURI()) {
		case "/BootWebService/home.app":
			return "html/index.html";
		case "/BootWebService/session.app":
			return "html/session.html";
		default:
			return "html/404-page.html";
		}
	}

}
