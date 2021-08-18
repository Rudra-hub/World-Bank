package com.reavture.traning.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.pms.model.Customer;
import com.revature.pms.model.Employee;
import com.revature.pms.service.CustomerService;
import com.revature.pms.service.CustomerServiceImpl;
import com.revature.pms.service.EmployeeService;
import com.revature.pms.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String employeeName = request.getParameter("employeeName");
		String employeePassword = request.getParameter("employeePassword");
		String branch = request.getParameter("branch");
		String mobileNumber = request.getParameter("mobileNumber");
		String email = request.getParameter("email");
		
		Employee employee = new Employee(0, employeeName, employeePassword, branch, mobileNumber, email, new Date());
		
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.createAccount(employee);
		response.setContentType("text/html");
		response.getWriter().println("<h1>"+employeeName + ", congrats you have successfully create an employee account in our bank and your Branch name is : "+branch);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
