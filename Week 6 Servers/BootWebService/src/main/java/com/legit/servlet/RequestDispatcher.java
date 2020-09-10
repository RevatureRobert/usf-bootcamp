package com.legit.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legit.controller.UserController;

public class RequestDispatcher {
	
	public static void dataRetriever(HttpServletRequest req, HttpServletResponse res) {
		switch(req.getRequestURI()) {
		case "/BootWebService/user.json":
			new UserController().findAllUsers(req, res);
		}
	}

}
