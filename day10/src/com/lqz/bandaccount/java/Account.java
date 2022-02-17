package com.lqz.bandaccount.java;

public class Account {
	private double balance;
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public void deposit(double amt) {
		if(amt>0) {
			this.balance += amt;
			System.out.println("Successfully deposit!");
		}
	}
	public void withdraw(double amt) {
		if(balance>=amt) {
			this.balance -= amt;
			System.out.println("Successfully withdraw!!");
			
		}
	}
}
