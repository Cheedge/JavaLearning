package com.lqz.iheritance.java2;

public class superOverrideTest {
	public static void main(String[] args) {
		Son s = new Son();
		s.howOldAreYou(40);
		s.whatIsYourId();
		s.whatIsYourName("Lily");
		
		Son s1 = new Son("Li", "lily", 33);
		s1.howOldAreYou(11);
		s1.whatIsYourId();
		s1.whatIsYourName("zhang3");
	}
}
