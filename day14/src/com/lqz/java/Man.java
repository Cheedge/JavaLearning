package com.lqz.java;

public class Man extends Person {
	//属性
	boolean isWorking;
	boolean isPlaying;
	static int workinghour;
	int playinghour;
	// isWorking = true; # Wrong! 
	//代码块
	static {
		//isWorking = true;//static代码块只可调static属性
		workinghour = 8;
		System.out.println("static Block in Man");
	}
	{
		isWorking = true;
		isPlaying = false;
		workinghour = 9;//normal代码块可调static属性
		playinghour = 9;
		System.out.println("normal Block in Man");
	}
	// 构造器
	public Man() {
		System.out.println("Constructor in Man");
	}
	public Man(boolean isWorking, boolean isPlaying, int playinghour) {
		super();
		this.isWorking = isWorking;
		this.isPlaying = isPlaying;
		this.playinghour = playinghour;
	}


	//方法
	public static void workForLiving() {
		System.out.println("Man work for living");
	}
}
