package com.tom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DirectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String s = req.getServletContext().getInitParameter("ctx-1");
		res.getWriter().println(s);
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init called");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
		super.destroy();
	}

}
