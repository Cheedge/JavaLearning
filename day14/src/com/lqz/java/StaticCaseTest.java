package com.lqz.java;
//总结：由父及子，静态先行
public class StaticCaseTest {
	public static void main(String[] args) {
		Man m = new Man();
		System.out.println("**************************");
		Person p = new Man();
		System.out.println(m.name+"\t"+p.name+"\n");
		System.out.println(Man.name+"\t"+Person.name+"\n");
	}
}
