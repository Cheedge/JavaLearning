package com.lqz.java;

import java.util.Arrays;

public class StringStoreInConstantPool {
	public static void main(String[] args) {
		String s = "Hallo";
		int[] arr = new int[] {1,2,3};
		int n = 100;
		
		System.out.println("ORIGNAL\n String: "+s+"\n arr: "+
		Arrays.toString(arr)+"\n n: "+n+"\n");
		
		StringStoreInConstantPool test = new StringStoreInConstantPool();
		test.transfer(s, arr, n);
		System.out.println("AFTER TRANSFER\n String: "+s+"\n arr: "+
		Arrays.toString(arr)+"\n n: "+n);
	}
	public void transfer(String s, int[] arr, int n) {
		s = "Hola";
		arr = new int[] {4,5,6,7,8};
		arr[0] = 99;
		n = 9;
	}
}