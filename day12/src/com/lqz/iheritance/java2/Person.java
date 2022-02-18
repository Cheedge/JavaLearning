package com.lqz.iheritance.java2;
/*
 * 1. super 构造器
 * 在子类的构造器中显式的使用(必须声明在子类构造器的首行)
 * "super(形参列表)"的方式，调用父类中声明的指定的构造器
 * "this(形参列表)"或"super(形参列表)"只能二选一
 * 默认调用super()
 * 2. Override vs. Overload
 */
public class Person {
	String name;
	int id=666, age;
	// constructor
	public Person() {
		System.out.println("super person!!!");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//method
	public void howOldAreYou(int age) {
		System.out.println("I'm a "+ this.age+"years Person.");
	}
	public void whatIsYourId() {
		System.out.println("My Person Id is "+id);
	}
	public void whatIsYourName(String name) {
		System.out.println("My Name is "+this.name);
	}
}
