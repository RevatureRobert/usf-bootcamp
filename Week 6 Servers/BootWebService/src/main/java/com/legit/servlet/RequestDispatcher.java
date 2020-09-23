package com.legit.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legit.controller.AuthController;
import com.legit.controller.SessionController;
import com.legit.controller.UserController;

public class RequestDispatcher {

	public static void dataRetriever(HttpServletRequest req, HttpServletResponse res) {
		System.out.println(req.getRequestURI());
		switch (req.getRequestURI()) {
		case "/BootWebService/user.json":
			new UserController().findAllUsers(req, res);
			break;
		}
	}

	public static String retrievePage(HttpServletRequest req) {
		switch (req.getRequestURI()) {
		case "/BootWebService/home.app":
			return "html/index.html";
		case "/BootWebService/session.app":
			return "html/session.html";
		case "/BootWebService/landing.app":
			return "html/landing.html";
		case "/BootWebService/login.app":
			return new AuthController().login(req);
		case "/BootWebService/error.app":
			return "html/error.html";
		case "/BootWebService/dashboard.app":
			return new SessionController().authorizePageEntry(req, "html/dashboard.html");
		case "/BootWebService/logout.app":
			new SessionController().logout(req);
			return "landing.app";
		default:
			return "html/404-page.html";
		}
	}

}
