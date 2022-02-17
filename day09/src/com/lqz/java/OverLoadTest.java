package com.lqz.java;
/*
 * 两同一不同:1. 同一类, 同一名
 * 			2. 参数不同: 个数, 类型, 顺序
 */
public class OverLoadTest {
	public static void main(String[] args) {
		OverLoadTest test = new OverLoadTest();
		test.mOL(2);
		test.mOL(3,4);
		test.mOL("here is...");
	}
	public void mOL(int i) {
		System.out.println(i*i);
	}
	public void mOL(int i, int j) {
		System.out.println(i*j);
	}
	public void mOL(String s) {
		System.out.println(s);
	}
}
