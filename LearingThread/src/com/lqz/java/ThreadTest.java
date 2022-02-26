package com.lqz.java;

public class ThreadTest {
	public static void main(String[] args) {
//		FebSubThread threadPrime = new FebSubThread();
//		threadPrime.setName("PRIME");
//		System.out.println(FebSubThread.currentThread().getName());
//		threadPrime.start();
//		FebSubThread threadNonPrime = new FebSubThread();
//		threadNonPrime.setName("NonPrime");
//		threadNonPrime.start();
//		System.out.println(FebSubThread.currentThread().getName());
		

		loopOddThread lot = new loopOddThread();
		lot.setName("odd Thread A");
		lot.start();
		System.out.println(loopOddThread.currentThread().getName());
//		loopEvenThread let = new loopEvenThread();
//		let.setName("even Thread");
//		let.start();
//		System.out.println(loopEvenThread.currentThread().getName());
		loopOddThread lot1 = new loopOddThread();
		lot1.setName("odd Thread B");
		lot1.start();
		
		
	}
}
