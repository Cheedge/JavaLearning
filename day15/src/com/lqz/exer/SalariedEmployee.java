package com.lqz.exer;

public class SalariedEmployee extends Employee{
	private double monthlySalary;
	public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
		// TODO Auto-generated constructor stub
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return super.toString();
//		return "name: "+name+"num: "+number+"birthday: "+birthday;
	}

}
