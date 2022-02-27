package com.lqz.product;
/**
 * Wrong example.
 * @Author lqz
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 26, 2022 8:15:20 PM
 * @Description Notice:
 * 				1. dog should same as the thread obj.
 * 				2. wait() is obj.wait(), so wait()'s owner obj should be thread obj.
 * 					here is dog.
 */
public class Producer implements Runnable{
	Dog dog;
	public Producer(Dog dog) {
		this.dog = dog;
	}
	public static int commodityNum = 0;

	private static Producer prod = null;
	public static Producer getProducer(Dog dog) {
		if (prod == null) {
			prod = new Producer(dog);
		}
		return prod; 
	}
//	public void createProducts() {
//		}
	@Override
	public void run() {
		while(true) {
			synchronized (dog) {
//				System.out.println(Thread.currentThread().getName() + dog.getClass());
				if (commodityNum>20) {
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
						commodityNum++;
						System.out.println(Thread.currentThread().getName() + 
								": " + commodityNum);
						notifyAll();
					}
				}
			}
		}
	}
