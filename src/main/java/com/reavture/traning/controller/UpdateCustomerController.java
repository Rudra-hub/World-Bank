package com.reavture.traning.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pms.model.Customer;
import com.revature.pms.service.CustomerService;
import com.revature.pms.service.CustomerServiceImpl;


/**
 * Servlet implementation class UpdateCustomerController
 */
public class UpdateCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int customerId = (int) session.getAttribute("CustomerId");
		String accountNumber = request.getParameter("accountNumber");
		String customerName = request.getParameter("customerName");
		String customerPassword = request.getParameter("customerPassword");
		String accountType = (String) session.getAttribute("AccountType");
		int age = (int) session.getAttribute("Age");
		String address = request.getParameter("address");
		int currentBalance = (int) session.getAttribute("CurrentBalance");
		
		
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer.setAccountNumber(accountNumber);
		customer.setCustomerName(customerName);
		customer.setCustomerPassword(customerPassword);
		customer.setAccountType(accountType);
		customer.setAge(age);
		customer.setAddress(address);
		customer.setCurrentBalance(currentBalance);
		
		CustomerService customerService = new CustomerServiceImpl();
		customerService.updateCustomer(customer);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("displayCustomerDetails.jsp");

		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
