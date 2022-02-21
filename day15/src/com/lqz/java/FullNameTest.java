package com.lqz.java;

public class FullNameTest {
	public static void main(String[] args) {
		ThisGuy guyName = new ThisGuy("智");
		System.out.println("This guy is "+guyName.fullName);
		guyName.callMyName();
	}
}
