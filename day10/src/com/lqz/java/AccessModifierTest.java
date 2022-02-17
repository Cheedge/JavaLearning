package com.lqz.java;

public class AccessModifierTest {
	public static void main(String[] args) {
		AccessModifier test = new AccessModifier();
		test.defaultInt = 9;
		test.publicInt = 99;
//		test.privateInt not possible out of class
		
		test.defaultMethod();
		test.publicMethod();
	}
}
