package com.lqz.synchronize;

public class SynThreadTest {
	public static void main(String[] args) {
//		SynSubThread sst1 = new SynSubThread();
//		sst1.start();
//		SynSubThread sst2 = new SynSubThread();
//		sst2.start();
		SynImplementRunnable sir = new SynImplementRunnable();
		
		Thread thr1 = new Thread(sir, "***1***");
		Thread thr2 = new Thread(sir, "+++2+++");
		Thread thr3 = new Thread(sir, "$$$3$$$");
		
		thr1.start();
		thr1.setPriority(Thread.MIN_PRIORITY);
		thr2.start();
		thr3.start();
	}
	
}
