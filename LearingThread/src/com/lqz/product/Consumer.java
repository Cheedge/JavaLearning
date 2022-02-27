package com.lqz.product;
/**
 * Wrong example
 * @Author lqz
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 26, 2022 3:35:12 PM
 * @Description 1. 看门狗和wait一致；
				2. 但wait的owner要和需运行的thread一致；
				3. 所以，看门狗，wait‘s obj，一致（最好当前所在类obj）
 */
public class Consumer implements Runnable{
	Dog dog;
//	public int commodityNum = 0;
//	public Consumer(int commodity) {
//		this.commodityNum = commodity;
//	}
	public Consumer() {
		
	}
	public Consumer(Dog dog) {
		this.dog = dog;
	}
	public static int commodityNum=0;
//	public void consume() {
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		commodityNum--;
//	}
//	public void produce() {
//		commodityNum++;
//	}
	@Override
	public void run() {
		while (true) {
			synchronized (dog) {
//				System.out.println(Thread.currentThread().getName()+
//						commodityNum+ dog.getClass());
				if (commodityNum < 0) {
					try {
						System.out.println(Thread.currentThread().getName());
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					commodityNum--;
					System.out.println(Thread.currentThread().getName() + 
							": " + commodityNum);
					notifyAll();
				}
			}
		}
	}
	
//	@Override
//	public synchronized void run() {
//		while(true) {
//			notify();
//			if(commodityNum>0) {
//				consume();
//				System.out.println(Thread.currentThread().getName()+": "+commodityNum);
//			}else if (commodityNum<=0) {
//				produce();
//				System.out.println(Thread.currentThread().getName()+": "+commodityNum);
//			}
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
}
