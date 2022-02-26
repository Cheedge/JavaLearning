package com.lqz.java1;

public class RunnableTest {
	public static void main(String[] args) {
		//通过Thread类含参构造器创建线程对象
		RunnableThread0 w = new RunnableThread0();
		
		Thread thr1 = new Thread(w, "runnable thread 1****");
		Thread thr2 = new Thread(w, "runnable thread 2++++++++++");
		Thread thr3 = new Thread(w, "runnable thread 3==================");
		
		int minpriority=1;
		int maxpriority=10;
		int midpriority=5;
		thr1.start();
		thr1.setPriority(minpriority);
		thr2.start();
		thr2.setPriority(midpriority);
		thr3.start();
		thr3.setPriority(maxpriority);
	}
}
