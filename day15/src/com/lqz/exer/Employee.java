package com.lqz.exer;

public abstract class Employee {
	private String name;
	private int number;
	private MyDate birthday;
	
	public abstract double earnings();
	
	public Employee(String name, int number, MyDate birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return "name: "+name+
				"\nnumber: "+number+
				"\nbirthday: "+birthday.toDateString();
	}
}
