package com.lqz.java;

public class AccessModifier {
	private int privateInt;
	int defaultInt;
	public int publicInt;
	
	private void privateMethod() {
		privateInt = 1;
		defaultInt = 2;
		publicInt = 3;
	}
	
	void defaultMethod() {
		privateInt = 11;
		defaultInt = 22;
		publicInt = 33;
	}
	
	public void publicMethod() {
		privateInt = 111;
		defaultInt = 222;
		publicInt = 333;
	}	
}
