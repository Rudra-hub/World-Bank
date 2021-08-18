 package com.revature.pms.service;

import java.util.List;

import com.revature.pms.dao.CustomerDAO;
import com.revature.pms.dao.CustomerDAOImpl;
import com.revature.pms.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	CustomerDAO customerDAO = new CustomerDAOImpl();
	public int createAccount(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.createAccount(customer);
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}

	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomerById(customerId);
	}

	public boolean isCustomerExist(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.isCustomerExist(customerId);
	}

	public int viewBalance(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.viewBalance(customerId);
	}

	public void depositMoney(int customerId,int amount) {
		customerDAO.depositMoney(customerId, amount);
		// TODO Auto-generated method stub
		return ;
	}

	public void withdrawMoney(int customerId,int amount) {
		// TODO Auto-generated method stub
		customerDAO.withdrawMoney(customerId, amount);
		return;
	}

	public void transferMoney(int senderId, int receiverId, int amount) {
		// TODO Auto-generated method stub
		customerDAO.transferMoney(senderId, receiverId, amount);
		return;
	}

	@Override
	public boolean validateUser(int customerId, String customerPassword) {
		// TODO Auto-generated method stub
		return customerDAO.validateUser(customerId, customerPassword);
	}

}
