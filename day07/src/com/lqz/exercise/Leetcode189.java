package com.lqz.exercise;

import java.util.Arrays;

/*
 * Given an array, rotate the array to the right by k steps,
 * where k is non-negative.
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class Leetcode189 {
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6,7};
		rotate(nums, 3);
		System.out.println(Arrays.toString(nums));
	}
	
	// in-place rotate
	public static void inplaceRotate(int[] nums, int k) {
		int[] rotNums = new int[nums.length];
		
	}
	
	// complex way
    public static void rotate(int[] nums, int k) {
        int[] rotNums = new int[nums.length];
        int n=0;
        for (int i=0; i<nums.length; i++){
            if(i<nums.length-k){
                rotNums[k+i] = nums[i];
            }else{
                rotNums[n] = nums[nums.length-k+n];
                n++;
            }
        }
        System.out.println("rotate: "+Arrays.toString(rotNums));
        for (int i=0; i<nums.length; i++) {
        	nums[i] = rotNums[i];
        }
    }
}
