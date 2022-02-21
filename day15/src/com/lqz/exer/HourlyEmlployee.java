package com.lqz.exer;

public class HourlyEmlployee extends Employee {
	public HourlyEmlployee(String name, int number, MyDate birthday, int hour, double wage) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
		// TODO Auto-generated constructor stub
	}

	private double wage;
	private int hour;
	
	
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return wage * hour;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hourly Employee: "+super.toString();
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

}
