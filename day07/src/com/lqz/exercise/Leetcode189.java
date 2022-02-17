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
		int k = 3;
//		rotate(nums, k);
//		inplaceRotate(nums, k);
		useReverseRotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}
	
	/**
	 * 
	 * @Author li
	 * @Date Feb 15, 20221:05:06 PM
	 * @Description
	 * [1,2,3,4|5,6,7] reverse-> [7,6,5|4,3,2,1]
	 * reverse-> [5,6,7|4,3,2,1] reverse-> [5,6,7|1,2,3,4]
	 */
	public static void useReverseRotate(int[] nums, int k) {
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
	}
	public static void reverse(int[] nums, int left, int right) {
		while(left<right) {
			int tmp = nums[right];
			nums[right] = nums[left];
			nums[left] = tmp;
			left++;
			right--;
		}
		System.out.print("reversed arr: "+Arrays.toString(nums)+"\n");
	}
	
	// in-place rotate: O(n^2)
	public static void inplaceRotate(int[] nums, int k) {
		for (int i=0; i<k; i++) {
			int tmp = nums[nums.length-1];
			for (int j=nums.length-1; j>0; j--) {
				//System.out.print(j);
				nums[j] = nums[j-1];
			}
			nums[0] = tmp;
		}
	}
	
	// complex way: O(n)
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
