package com.lqz.java;

import java.util.ArrayList;

public class FebSubThread extends Thread {
	private static int num = 100;
	@Override
	public void run() {
		ArrayList<Integer> primeNumber = PrimeNumberCls.fastCalPrimeNumber(num);
		System.out.println(Thread.currentThread().getName()
				+primeNumber.toString());
	}
}
