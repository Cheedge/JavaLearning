package com.lqz.bandaccount.java;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;
	public Bank() {
		customers = new Customer[10];
	}
	public void addCoustomer(String f, String l) {
		Customer cust = new Customer(f, l);
		this.customers[numberOfCustomer] = cust;
		this.numberOfCustomer++;
	}
	public int getNumOfCustomers() {
		return numberOfCustomer;
	}
	public Customer getCustomer(int index) {
		if(index >= 0 && index < numberOfCustomer) {
			return customers[index];
		}
		return null;
	}
}
