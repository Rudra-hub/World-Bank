package com.reavture.traning.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Welcome() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname=request.getParameter("username");
		String password = request.getParameter("password");
		out.println("<html><bod>");
		out.println("<h2>Welcome, "+uname+ "<br>");
		out.println("<h2> Your Username is : "+ uname);
		out.println("<h2> Your password is : "+ password);
		out.println("</body></html>");	
		
		out.println("<br><br><a href=Form.html>Add Product</a>");
	}

}
