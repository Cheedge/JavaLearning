package com.lqz.java;
/*
 * f(n)=f(n-1)+f(n-2)
 */
public class Fabonacci {
	public static void main(String[] args) {
		Fabonacci fab = new Fabonacci();
		System.out.println(fab.calculation(30));
	}
	public int calculation(int k) {
		int res;
		if(k==1) {
			res = 1;
		}else if(k==2) {
			res = 1;
		}else {
			res = calculation(k-1)+calculation(k-2);
		}
		return res;
	}
}
