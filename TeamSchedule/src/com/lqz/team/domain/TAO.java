package com.lqz.team.domain;

public class TAO implements Equipment {
	private  String model;
	private String effect;
	public TAO(String model, String effect) {
		super();
		this.model = model;
		this.effect = effect;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return model+"("+effect+")";
	}

}
