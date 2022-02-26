package com.lqz.synchronize;

import org.junit.Test;

public class SynSubThread extends Thread {
	// 共享static
	private static int tickets=100;
	public SynSubThread() {
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(; tickets>0; tickets--) {
			System.out.println(currentThread().getName()+": "+tickets);
		}
	}
	
	@Test
	public void synSubThreadTest() {
		SynSubThread sst1 = new SynSubThread();
		sst1.setName("***1***");
		sst1.start();
		SynSubThread sst2 = new SynSubThread();
		sst2.setName("+++2+++");
		sst2.start();
		SynSubThread sst3 = new SynSubThread();
		sst3.setName("===3===");
		sst3.start();
	}
}
