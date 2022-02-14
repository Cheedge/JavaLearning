package com.lqz.exercise;

import java.util.Arrays;

/*
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number
 * sorted in non-decreasing order.
 * 
Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

 */

public class Leetcode977 {
	public static void main(String[] args) {
		int[] nums = new int[]{-7,-3,2,3,11};
		//int[] res = sortedSquares1(nums);
		int[] ans = twoPointer(nums);
		System.out.println(Arrays.toString(ans));
	}
	
	// O(n)
	public static int[] sortedSquares1(int[] nums) {
		int[] sortedNums = new int[nums.length];
		for (int i=0; i<nums.length; i++) {
			sortedNums[i] = nums[i]*nums[i];
		}
		System.out.println("unsortedNum: "+Arrays.toString(sortedNums));
		Arrays.sort(sortedNums);
		return sortedNums;
	}
	
	//O(n)
	public static int[] twoPointer(int[] nums) {
		int[] sortedNums = new int[nums.length];
		int left=0, right=nums.length-1;
		while(left<=right) {
			if(Math.abs(nums[right])<Math.abs(nums[left])) {
				sortedNums[right-left] = nums[left]*nums[left];
				System.out.println("left: "+left);
				left++;
			}else {
				sortedNums[right-left] = nums[right]*nums[right];
				System.out.println("right: "+right);
				right--;
			}
		}
		return sortedNums;
	}
	
}
