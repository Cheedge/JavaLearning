package com.lqz.java;

public class Person {
	private int id;
	String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(int id, String name) {
		super();
		this.setId(id);
		this.name = name;
	}

	public void say() {
		System.out.println("Person named "+name);
	}
	
	public void getInfo() {
		System.out.println("this is Person");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
}
