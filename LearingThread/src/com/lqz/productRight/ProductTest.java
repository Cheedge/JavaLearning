package com.lqz.productRight;

public class ProductTest {
//	Distributor distributor = new Distributor();
	public static void main(String[] args) {
		Producer prod = new Producer();
		Consumer cons = new Consumer();
		
		Thread thr0 = new Thread(prod, "Producer Thread");
		Thread thr1 = new Thread(cons, "Consumer1 Thread");
		Thread thr2 = new Thread(cons, "Consumer2 Thread");
		System.out.println("start");
		thr0.setPriority(Thread.NORM_PRIORITY);
		thr1.setPriority(Thread.MAX_PRIORITY);
		thr2.setPriority(Thread.MIN_PRIORITY);
		thr0.start();
		thr1.start();
		thr2.start();
		
	}
	
}
