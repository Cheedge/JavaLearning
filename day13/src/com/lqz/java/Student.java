package com.lqz.java;

public class Student extends Person {
	String n = name;
//	int i = id;Error:The field Person.id is not visible
//	说明子类可以继承父类private但由于private封装不可见
	
	
	@Override
	public void say() {
		System.out.println("Student named "+n);
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	public void goSchool() {
		System.out.println("only students go to school");
	}
}
