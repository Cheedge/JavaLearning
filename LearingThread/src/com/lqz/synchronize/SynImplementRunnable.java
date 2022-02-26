package com.lqz.synchronize;

import org.junit.Test;
/**
 *  存在问题：
	重票：100，100，99，99 。。。
	漏票：100， 99， 99， 97
	错票：0， －1
	由于线程同时进入，处理共享数据， 导致问题出现
	
 *  方式一：同步代码块
 *
 *   synchronized(同步监视器){
 *      //需要被同步的代码
 *   }
 *  
 *  说明：1.操作共享数据的代码(需要被同步的代码)
 *       2.共享数据：多个线程共同操作的变量。比如：ticket就是共享数据。static
 *       3.同步监视器: 任何一个类的对象 静态方法(类名.class)、非静态方法(this)
 *          要求：多个线程必须要共用**同一**把锁。
 *
 *  方式二：同步方法。
 *  eg:
 *  	public synchronized void method(){
 *     }
 */
public class SynImplementRunnable implements Runnable {
	private int tickets=100;
	@Override
	public void run() {
//		synchronized (this) {
			for (; tickets > 0; tickets--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ": " + tickets);
			}
//		}
	}

	@Test
	public void synImpleRunTest() {
		SynImplementRunnable sir = new SynImplementRunnable();
		
		Thread thr1 = new Thread(sir, "***1***");
		Thread thr2 = new Thread(sir, "+++2+++");
		Thread thr3 = new Thread(sir, "$$$3$$$");
		
		thr1.start();
		thr2.start();
		thr3.start();
		
	}
}
