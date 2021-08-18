package com.revature.pms.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.pms.dao.EmployeeDAO;
import com.revature.pms.dao.EmployeeDAOImpl;
import com.revature.pms.model.Employee;

public class EmployeeServiceImplTest {

	EmployeeService employeeService;
	EmployeeDAO employeeDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		employeeService = new EmployeeServiceImpl();
		employeeDAO = new EmployeeDAOImpl();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateAccount() {
		Employee employee = new Employee(101,"Ketan","Pass@1233","Mumbai","986762","ketan@123", new Date());
		assertEquals(true, employeeService.createAccount(employee));
	}

	@Test
	public void testIsEmployeeExist() {
		int employeeId = 1;
		employeeService.isEmployeeExist(employeeId);
	}

	@Test
	public void testDeleteEmployee() {
		int employeeId = 4;
		assertEquals(true, employeeService.deleteEmployee(employeeId));
	}

	@Test
	public void testUpdateEmployee() {
		int employeeId = 11;
		Employee employee = new Employee(employeeId,"Mayuresh","Pass@1233","Mumbai","9867627705","mayur@123",new Date());
		employee.setEmployeeId(employeeId);
		assertEquals(true, employeeService.updateEmployee(employee));
	}
	@Test
	public void testGetAllCustomers() {
		employeeService.getAllCustomers();
	}

	@Test
	public void testDeleteCustomer() {
		int customerId = 10;
		employeeService.deleteCustomer(customerId);
		
	}

	@Test
	public void testGetAllEmployee() {
		employeeService.getAllEmployee();
	}

	@Test
	public void testValidateUser() {
		int employeeId=12;
		String employeePassword="123456";
		employeeService.validateUser(employeeId, employeePassword);
		
	}

	@Test
	public void testGetEmployeeById() {
		int employeeId=12;
		employeeService.isEmployeeExist(employeeId);
	}
}
