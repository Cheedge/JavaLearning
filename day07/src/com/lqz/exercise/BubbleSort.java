package com.lqz.exercise;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = new int[] {32, 94, 32, 20, 0, -2, -35};
		//若序列中有 n 个元素,通常进行 n - 1 趟。
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums.length-i-1; j++) {
				if(nums[j]>nums[j+1]) {
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
