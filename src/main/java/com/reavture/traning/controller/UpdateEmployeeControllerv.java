package com.reavture.traning.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pms.model.Employee;
import com.revature.pms.service.EmployeeService;
import com.revature.pms.service.EmployeeServiceImpl;

/**
 * Servlet implementation class UpdateEmployeeControllerv
 */
public class UpdateEmployeeControllerv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployeeControllerv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int employeeId = (int) session.getAttribute("EmployeeId");
		String employeeName = request.getParameter("employeeName");
		String employeePassword = request.getParameter("employeePassword");
		String branch = request.getParameter("branch");
		String mobileNumber = request.getParameter("mobileNumber");
		String email = request.getParameter("email");
		
		Employee employee = new Employee(employeeId, employeeName, employeePassword, branch, mobileNumber, email, new Date());
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.updateEmployee(employee);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ViewEmployeeAccount.jsp");

		dispatcher.forward(request, response);
	}

}
