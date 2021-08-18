package com.revature.pms.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.revature.pms.model.Customer;
import com.revature.pms.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO {

private static Logger logger = Logger.getLogger("CustomerDAOImpl");
	
	SessionFactory sessionFactory=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	public int createAccount(Customer customer) {
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		int customerId = customer.getCustomerId();
		transaction.commit();
		return customerId;
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		return true;
	}

	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		Customer customer = (Customer) session.load(Customer.class, customerId);
		return customer;
	}

	public boolean isCustomerExist(int customerId) {
		Customer customer =  (Customer) session.get(Customer.class, customerId);
		if(customer ==null)
			return false;
		else
			return true;
	}

	public int viewBalance(int customerId) {
		Query query = session.createQuery("select currentBalance from com.revature.pms.model.Customer where customerId = "+customerId);
		int balance = (int) query.list().get(0);
		logger.info("The balance for :"+customerId + " is "+balance);
		return balance;
	}

	public void depositMoney(int customerId,int amount) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, customerId);
		customer.setCurrentBalance(customer.getCurrentBalance() + amount);
		session.update(customer);
		transaction.commit();
		
	}

	public void withdrawMoney(int customerId,int amount) {
		Transaction transaction = session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, customerId);
		customer.setCurrentBalance(customer.getCurrentBalance() - amount);
		session.update(customer);
		transaction.commit();
	}

	public void transferMoney(int senderId, int receiverId, int amount) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, senderId);
		customer.setCurrentBalance(customer.getCurrentBalance() - amount);
		Customer cust = (Customer) session.get(Customer.class, receiverId);
		cust.setCurrentBalance(cust.getCurrentBalance() + amount);
		session.update(customer);
		session.update(cust);
		transaction.commit();
	}

	@Override
	public boolean validateUser(int customerId, String customerPassword) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Customer where customerId = "+customerId+ " and customerPassword = '"+customerPassword + "'");
		if(query.list().size() == 0) {
			return false;
		}
		else {
			return true;
		}
	}

}
