package com.collabera;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void init(ServletConfig config) {
		System.out.println("AddServlet is initialized");
	}
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		calc(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		calc(req, res);
	}
	
	public void calc(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		System.out.println("result is : " + (i+j));
		res.getWriter().println("result is : " + (i+j));
	}

	
	
	/*
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		System.out.println("result is : " + (i+j));
		res.getWriter().println("result is : " + (i+j));
	}
	*/
	

	
}
