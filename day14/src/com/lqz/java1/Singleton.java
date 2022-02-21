package com.lqz.java1;

import org.junit.jupiter.api.Test;

/*
 * Singleton:单例模式(只能存在一个对象实例)
 * 单例 -> 不能在类外new -> private类 -> 外部只能调用该类的某个静态方法 ->
 * 静态方法只能访问类中的静态成员变量 -> 该类对象的变量也必须定义成静态的
 * 
 */
public class Singleton {
	private static String name;
	private int num;
	// 1.私有化构造器
	private Singleton() {
		this.num = 1;
		Singleton.name = "lily";
	}
	// 2.内部提供一个当前类的实例
	// 4.此实例也必须静态化
	private static Singleton s = new Singleton();
	// 3.提供公共的静态的方法,返回当前类的对象
	public static Singleton getInstance() {
		return s;
	}
	public static int getInstanceNumber() {
		return s.num;
	}
	
	public static void method() {
		System.out.println("inside method");
	}
//	public int getNum() {
//		return this.num;
//	}
//	public void setNum(int num) {
//		this.num = num;
//	}
//	public String getName() {
//		return Singleton.name;
//	}
//	public void setName(String name) {
//		Singleton.name = name;
//	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Singleton.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	@Test
	public void test() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1==s2);
		s1.getNum();
		Singleton.method();
		Singleton.getInstanceNumber();
	}
}
