package com.lqz.exercise;

import java.util.Arrays;

/*
 * 创建一个长度为6的int型数组,要求数组元素的值都在1-30之间,且是随机赋值。同时,要求
元素的值各不相同
 */
public class ArrEx04 {
	public static void main(String[] args) {
		int[] nums = new int[6];
		int rang = 30 - 1 +1 + 1;
		for (int i=0; i<6; i++) {
			nums[i] = (int)(Math.random() * rang);
			for (int j=0; j<i; j++) {
				if (nums[i]==nums[j]) {
					i -= 1;
					break;
				}
			}
			//System.out.println(nums[i]);
		}
		System.out.println(Arrays.toString(nums));
	}
}
