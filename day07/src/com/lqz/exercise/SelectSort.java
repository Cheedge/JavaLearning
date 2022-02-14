package com.lqz.exercise;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] nums = new int[] {32, 94, 32, 20, 0, -2, -35};
		for (int i=0; i<nums.length; i++) {
			for (int j=i; j<nums.length; j++) {
				if(nums[j]<nums[i]) {
					int tmp = nums[j];
					nums[j] = nums[i];
					nums[i] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
