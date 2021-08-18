package com.reavture.traning.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pms.model.Customer;
import com.revature.pms.service.CustomerService;
import com.revature.pms.service.CustomerServiceImpl;


/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accountNumber = request.getParameter("accountNumber");
		String customerName = request.getParameter("customerName");
		String customerPassword = request.getParameter("customerPassword");
		String accountType = request.getParameter("accountType");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		int currentBalance = Integer.parseInt(request.getParameter("currentBalance"));
		
		Customer customer = new Customer(currentBalance, accountNumber, customerName, customerPassword, accountType, age, address, currentBalance, new Date());
		
		CustomerService customerService = new CustomerServiceImpl();
		int customerId = customerService.createAccount(customer);
		HttpSession session = request.getSession();
		session.setAttribute("AccountType", accountType);
		session.setAttribute("CurrentBalance", currentBalance);
		session.setAttribute("Age", age);
		response.setContentType("text/html");
		response.getWriter().println("<h1>"+customerName + ", congrats you have successfully opened an account in our bank with balance of INR "+currentBalance);
		response.getWriter().println("<h1> Please note your  customer id for future logins :"+customerId);
		response.getWriter().println("<h1> <br/><br/><br/><a href=Login.jsp>Login</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
