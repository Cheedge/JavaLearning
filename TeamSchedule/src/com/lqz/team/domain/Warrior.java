package com.lqz.team.domain;

import com.lqz.team.service.Status;

public class Warrior extends Employee {
	private int memberId;
	private Status status;
	private Equipment equipment;
	public Warrior() {}
	public Warrior(int id, String name, int age, double hp, Equipment equipment) {
		super(id, name, age, hp);
		this.setEquipment(equipment);
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	
	
	
	
}
