package com.lqz.singleton;
/**
 * 饿汉先new；唯一obj；外部不可造obj
 * @Author lqz
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 26, 2022 10:01:33 AM
 * @Description
 */

public class EagerInitialization {
	// 共享数据在方法外不需要同步
	private static EagerInitialization eager = new EagerInitialization();
	
	private EagerInitialization() {
		System.out.println("Eager Init");
	}

	public static EagerInitialization getEager() {
		return eager;
	}
	
}
