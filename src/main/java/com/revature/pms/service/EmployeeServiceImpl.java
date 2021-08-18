package com.revature.pms.service;

import java.util.List;

import com.revature.pms.dao.EmployeeDAO;
import com.revature.pms.dao.EmployeeDAOImpl;
import com.revature.pms.model.Customer;
import com.revature.pms.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	
	public boolean createAccount(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.createAccount(employee);
	}

	public boolean isEmployeeExist(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.isEmployeeExist(employeeId);
	}
	public boolean deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.deleteEmployee(employeeId);
	}

	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllCustomers();
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return employeeDAO.deleteCustomer(customerId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployee();
	}

	@Override
	public boolean validateUser(int employeeId, String employeePassword) {
		// TODO Auto-generated method stub
		return employeeDAO.validateUser(employeeId, employeePassword);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(employeeId);
	}

}
