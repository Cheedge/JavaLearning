package com.lqz.java;

public class StaticCaseTest {
	public static void main(String[] args) {
		Man m = new Man();
		System.out.println("**************************");
		Person p = new Man();
		System.out.println(m.name+"\t"+p.name+"\n");
		System.out.println(Man.name+"\t"+Person.name+"\n");
	}
}
