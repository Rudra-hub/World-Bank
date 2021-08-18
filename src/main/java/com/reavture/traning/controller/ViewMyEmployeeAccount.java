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

import com.revature.pms.model.Employee;
import com.revature.pms.service.EmployeeService;
import com.revature.pms.service.EmployeeServiceImpl;

/**
 * Servlet implementation class ViewMyEmployeeAccount
 */
public class ViewMyEmployeeAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewMyEmployeeAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int employeeId = (int) session.getAttribute("EmployeeId");
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.getEmployeeById(employeeId);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		session.setAttribute("allEmployee", employees);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewEmployeeAccount.jsp");
		requestDispatcher.forward(request, response);
		
	}
}
