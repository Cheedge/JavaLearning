package com.lqz.iheritance.java2;

import com.lqz.iheritance.java2.Person;

public class Son extends Person {
	int id=2;
	String lastName;
	
	public Son() {
	}
	public Son(String lastName, String name, int age) {
		super(name, age);
		this.lastName = lastName;
	}
	@Override
	public void whatIsYourName(String name) {
		// TODO Auto-generated method stub
//		super.whatIsYourName(name);
		System.out.println("My Name is "+this.lastName+
				" "+ super.name);
	}
	@Override
	public void whatIsYourId() {
		// TODO Auto-generated method stub
//		super.whatIsYourId(id);
		System.out.println("My Person Id is "+this.id);
	}
	@Override
	public void howOldAreYou(int age) {
		// TODO Auto-generated method stub
//		super.howOldAreYou(age);
		System.out.println("I'm a "+ this.age+"years Person's Son.");
	}
}
