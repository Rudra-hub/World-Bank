package com.revature.pms.dao;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.pms.model.Employee;

public class EmployeeDAOImplTest {

	EmployeeDAO employeeDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		employeeDAO = new EmployeeDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		employeeDAO = null;
	}

	@Test
	public void testCreateAccount() {
		Employee employee = new Employee(101,"Ketan","Pass@1233","Mumbai","986762","ketan@123", new Date());
		assertEquals(true, employeeDAO.createAccount(employee));
		
	}

	@Test
	public void testIsEmployeeExist() {
		int enployeeId = 1;
		assertEquals(true, employeeDAO.isEmployeeExist(enployeeId));
	}

	@Test
	public void testDeleteEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateEmployee() {
		int employeeId = 1;
		Employee employee = new Employee(employeeId,"Mayuresh","Pass@1233","Mumbai","986762","ketan@123",new Date());
		employee.setEmployeeId(employeeId);
		assertEquals(true, employeeDAO.updateEmployee(employee));
	}

}
