package com.lqz.java;

public class Person {
	int age;
	String name;
	/*
	 * sex:1 man
	 * sex:0 woman
	 */
	int sex;
	
	public void study() {
		System.out.println(name + " is studying");
	}
	
	public void showAge() {
		System.out.println("age is: "+age);
	}
	
	public int addAge(int i) {
		age += i;
		return age;
	}
}
