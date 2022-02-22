package com.lqz.team.domain;

public class MOUNT implements Equipment {
	private String model;
	private String effect;

	public MOUNT(String model, String effect) {
		super();
		this.model = model;
		this.effect = effect;
	}

	@Override
	public String getDescription() {
		return model+"("+effect+")";
	}

}
