package com.lqz.java;

import java.util.Arrays;

/*
 * Given an integer array nums,
 * move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
public class Leetcode283 {
	public static void main(String[] args) {
		int[] nums = new int[]{0,1,0,3,12};
//		moveZeros(nums);
		twoPointer(nums);
		System.out.println("nums: "+ Arrays.toString(nums));
	}
	// two pointer method
	private static void twoPointer(int[] nums) {
		int wPointer = 0;
		for(int rPointer = 0; rPointer<nums.length; rPointer++) {
			System.out.println("r: "+rPointer+"\t"+nums[rPointer]+
					"\nw: "+wPointer+"\t"+nums[wPointer]+"\n");
			if(nums[rPointer]!=0) {
				int tmp = nums[rPointer];
				nums[rPointer] = nums[wPointer];
				nums[wPointer] = tmp;
				wPointer++;
			}
		}
 	}
	// remove and append
	public static void moveZeros(int[] nums) {
		int numZeros = 0;
		for (int i=0; i<nums.length; i++) {
			if(nums[i]==0) {
				numZeros += 1;
			}
		}
		int j = 0;
		for (int i=0; i<nums.length; i++) {
			if(nums[i]!=0) {
				nums[j] = nums[i];
				j++;
				System.out.println(nums[j]+","+nums[i]+","+numZeros);
			}
		}
		for (int i=nums.length-numZeros; i<nums.length; i++) {
			nums[i] = 0;
		}
	}
}
