package com.lqz.team.service;

public class TeamException extends RuntimeException {
	static final long serialVersionUID = 1308633332806353L;
//	private int id;
//	private String str;
	public TeamException(String message) {
		super(message);
	}
	
//	public TeamException(String msg) {
//		super(msg);
//		this.str = msg;
//	}
}
