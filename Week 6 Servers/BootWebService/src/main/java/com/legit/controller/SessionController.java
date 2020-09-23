package com.legit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionController {
	
	public void CreateSession(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("username", req.getParameter("username"));
		session.setAttribute("password", req.getParameter("password"));
	}
	
	public void logout(HttpServletRequest req) {
		System.out.println("oog a boog a boo");
		HttpSession session = req.getSession();
		System.out.println(session.getAttribute("username"));
		session.setAttribute("username", null);
		session.setAttribute("password", null);
		session.invalidate();
	}
	
	public String authorizePageEntry(HttpServletRequest req, String pagePath) {
		HttpSession session = req.getSession();
		String user = (String) session.getAttribute("username");
		System.out.println(user);
		return user!=null? pagePath: "landing.app";
	}

}
