package com.lqz.java;

public class loopEvenThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int n=100;
		for (int i=0;i<n; i++) {
			if(i%2==0)System.out.println(Thread.currentThread().getName()+
					": "+i);
		}
	}
}
