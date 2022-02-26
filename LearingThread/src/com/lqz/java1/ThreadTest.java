package com.lqz.java1;

class Thread0 extends Thread{
	private static int num = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (; num>0; num--) {
			System.out.println(Thread.currentThread().getName()+
					": "+ num);
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		Thread0 thr1 = new Thread0();
		thr1.setName("********");
		Thread0 thr2 = new Thread0();
		thr2.setName("========================");
		
		thr1.start();
		thr2.start();
	}
}
