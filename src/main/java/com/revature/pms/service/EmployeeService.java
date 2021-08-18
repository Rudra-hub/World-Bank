package com.revature.pms.service;

import java.util.List;

import com.revature.pms.model.Customer;
import com.revature.pms.model.Employee;

public interface EmployeeService {
	public boolean createAccount(Employee employee);
	public List<Customer> getAllCustomers();
	public List<Employee> getAllEmployee();
	public boolean isEmployeeExist(int employeeId);
	public boolean deleteEmployee(int employeeId);
	public boolean deleteCustomer(int customerId);
	public boolean updateEmployee(Employee employee);
	public boolean validateUser(int employeeId,String employeePassword);
	public Employee getEmployeeById(int employeeId);
}