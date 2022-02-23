package com.lqz.team.domain;

import com.lqz.team.service.Status;

public class Warrior extends Employee {
	private int memberId;
	private Status status=Status.FREE;
	private Equipment equipment;
	public Warrior() {}
	public Warrior(int id, String name, int age, double hp, Equipment equipment) {
		super(id, name, age, hp);
		this.setEquipment(equipment);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId()+"\t"+super.getName()+"\t"+super.getAge()+"\t"+
				getHp()+"\t\tWarrior\t\t"+status.getNAME()+
				"\t\t\t\t"+equipment.getDescription();
	}
	
	public String getTeamString() {
		// TODO Auto-generated method stub
		return memberId+"\t"+super.getName()+"\t"+super.getAge()+"\t"+
				getHp()+"\t\tWarrior\t\t"+status.getNAME()+
				"\t\t\t\t"+equipment.getDescription();
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
