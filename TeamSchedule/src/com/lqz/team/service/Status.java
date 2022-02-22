package com.lqz.team.service;
/**
 * @Author lqz
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 22, 2022 10:34:39 AM
 * @Description Show team members status. Similar to Singleton.(Tripleton)
 */
public class Status {
	private final String NAME;
	private Status(String name) {
		this.NAME = name;
	}
	public String getNAME() {
		return NAME;
	}
	public static final Status FREE = new Status("FREE");
	public static final Status INTEAM = new Status("INTEAM");
	public static final Status UNAVAILABLE = new Status("UNAVAILABLE");
}
