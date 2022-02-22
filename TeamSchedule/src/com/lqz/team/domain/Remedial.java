package com.lqz.team.domain;

public class Remedial extends Warrior{
	private double logistics;
	public Remedial() {}
	public Remedial(int id, String name, int age, double hp, Equipment equipment, double logistics) {
		super(id, name, age, hp, equipment);
		this.setLogistics(logistics);
	}
	public double getLogistics() {
		return logistics;
	}
	public void setLogistics(double logistics) {
		this.logistics = logistics;
	}
}
