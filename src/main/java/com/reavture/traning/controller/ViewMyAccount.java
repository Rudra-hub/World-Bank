package com.reavture.traning.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pms.model.Customer;
import com.revature.pms.service.CustomerService;
import com.revature.pms.service.CustomerServiceImpl;
import com.revature.pms.service.EmployeeService;
import com.revature.pms.service.EmployeeServiceImpl;

/**
 * Servlet implementation class ViewMyAccount
 */
public class ViewMyAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewMyAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int customerId = (int) session.getAttribute("CustomerId");
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = customerService.getCustomerById(customerId);
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer);
		session.setAttribute("allCustomers", customers);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewCustomerAccount.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
