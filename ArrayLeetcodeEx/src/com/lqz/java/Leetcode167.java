package com.lqz.java;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 167. Two Sum II - Input Array Is Sorted
 * Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9.
Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6.
Therefore index1 = 1, index2 = 3. We return [1, 3].

[3,24,50,79,88,150,345]
200
 */
public class Leetcode167 {
	public static void main(String[] args) {
		//start time
		Instant startTime = Instant.now();
		
		int[] nums = new int[]{3,24,50,79,88,150,345,356,456,556,666,777,800};
		int target = 780;
//		Scanner scan = new Scanner(System.in);
//		int target = scan.nextInt();
		int[] ans = twoSum(nums, target);
//		int[] ans = twoPointer(nums, target);
		
		// end time
		Instant endTime = Instant.now();
		System.out.println("Time cost: "+ Duration.between(startTime, endTime));
		System.out.println(Arrays.toString(ans));
	}
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        while(i<numbers.length-1){
            int j = i+1;
            while(j<numbers.length){
                if(numbers[i]+numbers[j]==target) return new int[]{i+1, j+1};
                if(target-numbers[i]<numbers[i]) break;
                if(numbers[i]+numbers[j]>target) break;
                j++;
            }
            i++;
        }
        return new int[] {0,0};
    }
    private static int[] twoPointer(int[] numbers, int target) {
    	int left = 0, right = numbers.length - 1;
    	while(left<right) {
    		if(numbers[left]+numbers[right]==target) {
    			return new int[] {left+1, right+1};
    		}else if(numbers[left]+numbers[right]<target) {
    			left++;
    		}else {
    			right--;
    		}
    	}
    	return new int[1];
    }
}
