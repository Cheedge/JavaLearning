package com.lqz.java;

public abstract class Ancestor {
	private String lastName="李";
	public abstract void callMyName();
	public Ancestor() {
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
