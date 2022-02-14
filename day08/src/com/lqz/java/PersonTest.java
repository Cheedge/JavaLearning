package com.lqz.java;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Jeo";
		p1.age = 32;
		p1.sex = 1;
		
		p1.study();
		p1.showAge();
		int newAge = p1.addAge(3);
		System.out.println("new age is: "+newAge);
	}
	
}
