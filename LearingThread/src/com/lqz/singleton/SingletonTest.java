package com.lqz.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		EagerInitialization.getEager();
		LazyInitialization.getLazy();
	}
}
