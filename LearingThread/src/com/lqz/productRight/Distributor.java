package com.lqz.productRight;
/**
 * Distributor 
 * @Author lqz//sharma
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 27, 2022 10:31:05 PM
 * @Description Distributor的存在，使得producer和consumer可以
 * 				调用distributor的produce和consume方法，而在这里
 * 				produce和consume方法中进行同步（可以保证使用看门狗
 * 				与wait()的owner一致（皆为distributor））。
 */
public class Distributor{
	private Distributor() {
		
	}
	// Singleton造单例，使在producer和consumer
	// 中调用时为同一object，进而看门狗也一致。
	private static Distributor distr=null;
	public static Distributor getInstance() {
		if(distr==null) {			
			distr = new Distributor();
		}
		return distr;
	}
	
	public static int commodityNum = 0;
	public synchronized void produce() {
		if (commodityNum>20) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			try {
				Thread.sleep((int) Math.random() * 5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			commodityNum++;	
			System.out.println(Thread.currentThread().getName()+": "+
					commodityNum);
			notifyAll();
		}
	}
	public synchronized void consume() {
		if(commodityNum<=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			try {
				Thread.sleep((int) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			commodityNum--;
			System.out.println(Thread.currentThread().getName()+": "+
					commodityNum);
			notifyAll();
			}
		}
	}
