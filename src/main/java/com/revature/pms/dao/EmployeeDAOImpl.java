
package com.revature.pms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.revature.pms.model.Customer;
import com.revature.pms.model.Employee;
import com.revature.pms.util.HibernateUtil;


public class EmployeeDAOImpl implements EmployeeDAO {

	SessionFactory sessionFactory=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session =sessionFactory.openSession();
	public boolean createAccount(Employee employee) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		return true;
	}

	public boolean isEmployeeExist(int employeeId) {
		// TODO Auto-generated method stub
		Employee employee = (Employee) session.get(Employee.class, employeeId);
		if(employee == null) {
			return false;
		}
		else
			return true;
	}

	public boolean deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		session.delete(employee);
		transaction.commit();
		return true;
	}

	public boolean deleteCustomer(int customerId) {
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		return true;
	}

	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.update(employee);
		transaction.commit();
		return true;
	}

	@Override
	public List<Customer> getAllCustomers() {
		Query query = session.createQuery("from com.revature.pms.model.Customer");
		List<Customer> customers = query.list();
		System.out.println(customers);
		return customers;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Query query = session.createQuery("from com.revature.pms.model.Employee");
		List<Employee> employee = query.list();
		return employee;
	}

	@Override
	public boolean validateUser(int employeeId, String employeePassword) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Employee where employeeId = "+employeeId+ " and employeePassword = '"+employeePassword + "'");
		if(query.list().size() == 0) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		Employee employee = (Employee) session.load(Employee.class, employeeId);
		return employee;
	}
	
	
	

}