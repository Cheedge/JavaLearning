package com.lqz.bandaccount.java;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		// add a customer
		bank.addCoustomer("hua", "xiao");
		// give customer a account with init_balance 2000
		bank.getCustomer(0).setAccount(new Account(2000));
		// show his account, withdraw 500
		bank.getCustomer(0).getAccount().withdraw(500);
		// get his balance
		double balance = bank.getCustomer(0).getAccount().getBalance();
		System.out.println(bank.getCustomer(0).getFirstName()+
				bank.getCustomer(0).getLastName()+" Account balance is "
				+balance+" total number of customers is: "+
				bank.getNumOfCustomers());
	}
}
