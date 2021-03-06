package com.lqz.team.domain;

public class Employee {
	private int id;
	private String name;
	private int age;
	private double hp;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int age, double hp) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.hp = hp;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"\t"+name+"\t"+age+"\t"+hp;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}
	
}
