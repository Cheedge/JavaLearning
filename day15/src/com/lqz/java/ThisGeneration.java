package com.lqz.java;

public abstract class ThisGeneration extends Ancestor{
	private String generationName="奇";
	String generationLastName;
	public ThisGeneration(){
//		Ancestor A = new Ancestor(); Notice:abstract class不能实例化
		generationLastName = super.getLastName()+generationName;
	}
	public String getGenerationName() {
		return generationName;
	}
}