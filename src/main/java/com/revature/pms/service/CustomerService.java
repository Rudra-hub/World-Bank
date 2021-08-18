package com.revature.pms.service;

import java.util.List;

import com.revature.pms.model.Customer;

public interface CustomerService {
	public int createAccount(Customer customer);
	public boolean updateCustomer(Customer customer);
	public Customer getCustomerById(int customerId);
	public boolean isCustomerExist(int customerId);
	public int viewBalance(int customerId);
	public void depositMoney(int customerId,int amount);
	public void withdrawMoney(int customerId,int amount);
	public void transferMoney(int senderId,int receiverId,int amount);
	public boolean validateUser(int customerId,String customerPassword);

}
