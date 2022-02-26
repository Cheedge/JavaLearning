package com.lqz.singleton;
/**
 * 懒汉后new(方法中)；唯一obj；外部不可造obj
 * @Author lqz
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 26, 2022 10:03:54 AM
 * @Description
 */
public class LazyInitialization {
	
	private LazyInitialization() {
		System.out.println("Lazy Init");
	}
	private static LazyInitialization lazy=null;
	// 方法1:
	//public static synchronized LazyInitialization getLazy() {
	// 方法2:
	public static LazyInitialization getLazy() {
		
		if (lazy==null) {
			synchronized (LazyInitialization.class) {
				if (lazy == null) {
					// 方法中有共享数据需同步, 此时监视器是LazyInitialization.class
					lazy = new LazyInitialization();
				}
			} 
		}
		return lazy;
	}
}
