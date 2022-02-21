package com.lqz.exer;

public class BankAccount {
	private int id;
	private String passWd;
	private double balance;
	private static double interestRate;
	private static double minBalance;
	
	private static int init=1000;// need id= init++, id++都是1001没有意义
	
	// constructor
	public BankAccount() {
		this.id=++init;
	}

	
	public BankAccount(String passWd, double balance) {
		super();
		this.id=++init;
		this.passWd = passWd;
		this.balance = balance;
	}


	// getter/setter
	public String getPassWd() {
		return passWd;
	}
	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
	public int getId() {
		return id;
	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		BankAccount.interestRate = interestRate;
	}
	public static double getMinBalance() {
		return minBalance;
	}
	public static void setMinBalance(double minBalance) {
		BankAccount.minBalance = minBalance;
	}
	
	// main
	public static void main(String[] args) {
		BankAccount[] account = new BankAccount[3];
		account[0] = new BankAccount();
		account[1] = new BankAccount("123abc", 2000);
		account[2] = new BankAccount("lily", 2000);
		for(int i=0; i<account.length; i++) {
			System.out.println("id: "+account[i].id+
				"\npassword: "+ account[i].getPassWd()+
				"\nbalance: "+account[i].balance+
				"\nrate: "+ BankAccount.interestRate+
				"\nmin balance: "+BankAccount.minBalance+
				"\n*****************");
		}
		
	}
	

}
