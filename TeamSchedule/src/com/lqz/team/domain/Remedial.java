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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getId()+"\t"+super.getName()+"\t"+super.getAge()+"\t"+
				getHp()+"\t\tRemedial\t"+getStatus().getNAME()+"\t\t"+logistics+
				"\t\t"+getEquipment().getDescription();
	}
	@Override
	public String getTeamString() {
		// TODO Auto-generated method stub
		return super.getMemberId()+"\t"+super.getName()+"\t"+super.getAge()+"\t"+
				getHp()+"\t\tRemedial\t"+getStatus().getNAME()+"\t\t"+logistics+
				"\t\t"+getEquipment().getDescription();
	}
}
