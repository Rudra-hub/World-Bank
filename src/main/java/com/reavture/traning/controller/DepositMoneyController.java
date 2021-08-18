package com.reavture.traning.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pms.dao.CustomerDAO;
import com.revature.pms.dao.CustomerDAOImpl;
import com.revature.pms.service.CustomerService;
import com.revature.pms.service.CustomerServiceImpl;

/**
 * Servlet implementation class DepositMoneyController
 */
public class DepositMoneyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositMoneyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		int customerId = (int) session.getAttribute("CustomerId");
		int amount = Integer.parseInt(request.getParameter("amount"));

		CustomerService customerService = new CustomerServiceImpl();
		customerService.depositMoney(customerId, amount);
		out.println("<html><head><link rel='stylesheet'href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'></head><body bgcolor='#8b949e'>");
		out.println("<div class='Card text-white bg-dark' style='max-width: 60rem;'>");
		out.println("<h1> Your Money is Deposit in CUSTOMER ID :" + customerId);
		out.println("<h1> Your Updated Balance is :" + customerService.viewBalance(customerId));
		out.println("<button><a href=Home.html>Home</a><button>");
		out.println("</div>");
		
		out.println("</body></html>");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
