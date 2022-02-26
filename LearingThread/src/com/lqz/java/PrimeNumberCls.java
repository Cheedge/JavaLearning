package com.lqz.java;


import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PrimeNumberCls {
	@Test
	public void primeNumTest() {
		int n=100;
		ArrayList<Integer> res1 = calPrimeNumber(n);
		ArrayList<Integer> res2 = fastCalPrimeNumber(n);
//		for (int i=0; i<n; i++) {}
		System.out.println(res1.toString()+"\n"+res2.toString());
	}
	public static ArrayList<Integer> calPrimeNumber(int num) {
		// TODO Auto-generated method stub
//		int k=1;
		ArrayList<Integer> res=new ArrayList<Integer>();
		res.add(1);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(1);
		for (int i=2; i<=num; i++) {
			int j;
			for (j=2; j<i; j++) {
				if (i%j==0) {
					break;
				}
			}
//			System.out.println(k+"j "+j+"i "+i);
			if (j==i) res.add(i);
//			if (j==i) ans.add(i);
		}
		return res;
//		return ans;
	}
	
	public static ArrayList<Integer> fastCalPrimeNumber(int num){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashSet<Integer> excludeNums = new HashSet<Integer>();
		ans.add(1);
		excludeNums.add(1);
		for (int i=2; i<=num; i++) {
			if(excludeNums.contains(i)) continue;
			ans.add(i);
			int k=1, a=i;
			while(a<=num) {
				excludeNums.add(a);
				k++;
				a = i*k;
			}
//			System.out.println("***"+excludeNums.toString());
		}
		return ans;
	}
}
