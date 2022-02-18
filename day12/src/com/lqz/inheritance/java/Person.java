package com.lqz.inheritance.java;

public class Person {
	private String privateName;
	String defaultName;
	protected String protectedName;
	public String publicName;
	
	private void privateAge() {
		privateName = "privateName";
		defaultName = "defaultName";
		protectedName = "protectedName";
		publicName = "publicName";
	}
	void defaultAge() {
		privateName = "privateName";
		defaultName = "defaultName";
		protectedName = "protectedName";
		publicName = "publicName";
	}
	protected void protectedAge() {
		privateName = "privateName";
		defaultName = "defaultName";
		protectedName = "protectedName";
		publicName = "publicName";
	}
	public void publicAge() {
		privateName = "privateName";
		defaultName = "defaultName";
		protectedName = "protectedName";
		publicName = "publicName";
	}
	public String getPrivateName() {
		return privateName;
	}
	public void setPrivateName(String privateName) {
		this.privateName = privateName;
	}
}
