package com.legit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "session", urlPatterns = { "*.sess" })
public class SessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession();
		resp.getWriter()
				.print("the user is: " + sess.getAttribute("username")
						+ " and to be ultra insecure, their password is: " + sess.getAttribute("pass") + " id is: "
						+ sess.getId());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession();
		switch (req.getRequestURI()) {
		case "/BootWebService/login.sess":
			sess.setAttribute("username", req.getParameter("username"));
			sess.setAttribute("pass", req.getParameter("password"));
			break;
		case "/BootWebService/invalidate.sess":
			sess.invalidate();
		}
	}

}
