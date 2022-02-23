package com.lqz.team.domain;

public class Commander extends Remedial{
	private double strategy;
	public Commander() {}

	public Commander(int id, String name, int age, double hp, Equipment equipment, double logistics, double strategy) {
		super(id, name, age, hp, equipment, logistics);
		this.strategy = strategy;
	}

	public double getStrategy() {
		return strategy;
	}
	public void setStrategy(double strategy) {
		this.strategy = strategy;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getId()+"\t"+super.getName()+"\t"+super.getAge()+"\t"+
				getHp()+"\t\tCommander\t"+getStatus().getNAME()+
				"\t\t"+getLogistics()+"\t"+strategy+
				"\t"+getEquipment().getDescription();
	}
	@Override
	public String getTeamString() {
		// TODO Auto-generated method stub
		return super.getMemberId()+"\t"+super.getName()+"\t"+super.getAge()+"\t"+
				getHp()+"\t\tCommander\t"+getStatus().getNAME()+
				"\t\t"+getLogistics()+"\t"+strategy+
				"\t"+getEquipment().getDescription();
	}
}
