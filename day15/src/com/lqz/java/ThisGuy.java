package com.lqz.java;

public class ThisGuy extends ThisGeneration{
	private String firstName;//="智";
	String fullName;
	String callName;
	public ThisGuy() {
	}
	public ThisGuy(String firstName) {
		super();
		this.setFirstName(firstName);
		fullName = super.generationLastName+this.getFirstName();
		callName = super.getGenerationName()+this.getFirstName();
	}
	@Override
	public void callMyName() {
		// TODO Auto-generated method stub
		System.out.println("Please call me "+callName);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
