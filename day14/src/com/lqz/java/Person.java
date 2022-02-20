package com.lqz.java;
/*
 * static: 属性、方法、代码块、内部类
 * 
 */
public class Person {
	// 属性
	private static int id;
	int age;
	public static String name;
	public int total;
	
	// 代码块
	static{
		id = 1001;
		//age = 11;
		name = "static Block Person name";
		//total = 0;
		System.out.println("static Block in Person");
	}
	{
		id = 1002;
		age = 2;
		name = "normal Block Person name";
		total = 0;
		System.out.println("normal Block in Person");
	}
	// 构造器
	public Person(){
		System.out.println("Constructor in Person");
	}
	public Person(int age, int total) {//static属性不可做非static方法形参
		super();
		this.age = age;
		this.total = total;
	}
	
	// 方法
	public static void call() {//static方法只可调static属性
		System.out.println("Person name is "+name);
	}
	public void addTotal() {
		total++;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Person.id = id;
	}
}
