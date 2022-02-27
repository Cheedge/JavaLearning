package com.lqz.product;
/**
 * Exception in thread "Producer" java.lang.IllegalMonitorStateException: 
 * current thread is not owner
 * @Author lqz
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 27, 2022 2:16:37 PM
 * @Description This is a wrong example.
 */
public class ProductTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		Producer prod = Producer.getProducer(dog);
		Consumer cons = new Consumer(dog);
		
		Thread t0 = new Thread(prod, "Producer");
		Thread t1 = new Thread(cons, "Consumer1");
		Thread t2 = new Thread(cons, "Consumer2");
//		public int num=0;
		
		System.out.println("begin");
		t0.start();
		t1.start();
		t2.start();
		System.out.println("finish");
	}
}
class Dog{
	
}