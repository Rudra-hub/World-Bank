package com.revature.pms.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.pms.dao.CustomerDAO;
import com.revature.pms.dao.CustomerDAOImpl;
import com.revature.pms.model.Customer;

public class CustomerServiceImplTest {

	CustomerService customerService;
	CustomerDAO customerDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		customerService = new CustomerServiceImpl();
		customerDAO = new CustomerDAOImpl();
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testCreateAccount() {
//		Customer customer = new Customer(12,"9867627705","Ketan","Ketan@1234","Savings",21,"Mumbai",5000,new Date());
//		assertEquals(true, customerService.createAccount(customer));
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateCustomer() {
		Customer customer = new Customer(12,"9867627705","Ketan Shinde","123456","Savings",21,"Paris",5000,new Date());
		assertEquals(true, customerService.updateCustomer(customer));
	}

	@Test
	public void testGetCustomerById() {
		int customerId=9;
		customerDAO.getCustomerById(customerId);
	}

	@Test
	public void testIsCustomerExist() {
		int customerId=9;
		customerDAO.isCustomerExist(customerId);
	}

	@Test
	public void testViewBalance() {
		int customerId=12;
		customerService.viewBalance(customerId);
	}

	@Test
	public void testDepositMoney() {
		customerDAO.depositMoney(4, 100);
	}

	@Test
	public void testWithdrawMoney() {
		customerDAO.withdrawMoney(11, 100);
	}

	@Test
	public void testTransferMoney() {
		customerDAO.transferMoney(13, 14, 100);
	}

}
