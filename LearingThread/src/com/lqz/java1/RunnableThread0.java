package com.lqz.java1;


public class RunnableThread0 implements Runnable{
	
	private int ticket=100;
	
	//子类中重写Runnable接口中的run方法
	@Override
	public void run() {
		//
//		int ticket=100;
		for (; ticket>0; ticket--) {
			System.out.println(
					Thread.currentThread().getName()+": "+ticket);
		}
	}
}
