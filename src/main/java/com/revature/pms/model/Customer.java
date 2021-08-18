package com.revature.pms.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new_customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	@Column
	private String accountNumber;
	@Column
	private String customerName;
	@Column
	private String customerPassword;
	
	private String accountType;
	@Column
	private int age;
	@Column
	private String address;
	@Column
	private int currentBalance;
	@Column
	private Date issueDate;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	
	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Customer(int customerId, String accountNumber, String customerName, String customerPassword,
			String accountType, int age, String address, int currentBalance, Date issueDate) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.accountType = accountType;
		this.age = age;
		this.address = address;
		this.currentBalance = currentBalance;
		this.issueDate = issueDate;
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public int getAge() {
		return age;
	}

	public void setAge(Date dateOfBirth) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, accountType, address, age, currentBalance, customerId, customerName,
				customerPassword, issueDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(accountNumber, other.accountNumber) && Objects.equals(accountType, other.accountType)
				&& Objects.equals(address, other.address) && age == other.age && currentBalance == other.currentBalance
				&& customerId == other.customerId && Objects.equals(customerName, other.customerName)
				&& Objects.equals(customerPassword, other.customerPassword)
				&& Objects.equals(issueDate, other.issueDate);
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", accountNumber=" + accountNumber + ", customerName="
				+ customerName + ", customerPassword=" + customerPassword + ", accountType=" + accountType + ", age="
				+ age + ", address=" + address + ", currentBalance=" + currentBalance + ", issueDate=" + issueDate
				+ "]";
	}
	
	
}
