package com.lqz.java;

import java.util.HashMap;

/*
 * 3. Longest Substring Without Repeating Characters
 * s = "abcabcbb" Output: 3
Explanation: The answer is "abc", with the length of 3.
 * s = "bbbbb" Output: 1
 * s = "pwwkew" Output: 3
 */
public class Leetcode3 {
	String[] testCase = new String[] {"abcabcbb","bbbbb",
			"pwwkew","auw"," ", "aab", "abba", "cdd","ohomm"};
	//"cdd", "abca", "abcb"
	/*
	 * example1: abcab
	 * |a|bcab -> |ab|cab -> |abc|ab -> abc|a|b -> abc|ab|
	 * {a:0}->{a:0,b=1}->{a:0,b:1,c:2}->{a:3,b:1,c:2}->{a:3,b:4,c:2}
	 * 1	->	2	->		3	->			3			->	3
	 * 
	 * example2: ohomm
	 * |o|homm -> |oh|omm -> o|ho|mm -> o|hom|m -> ohom|m|
	 */
//	String[] testCase = new String[] {"abba"};
	public static void main(String[] args) {
		Leetcode3 ltc3 = new Leetcode3();
		for (int i=0; i<ltc3.testCase.length; i++) {
			String str = ltc3.testCase[i];
			int num = ltc3.lengthOfLongestSubstring(str);
			System.out.println("Input: "+str
					+ "\nOutput: "+ num);
		}
	}
	public int lengthOfLongestSubstring(String str) {
		HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
		//左右指针
		int left = 0, right = 0, length = 0;
		//滑动窗口
		while(right<str.length()) {
			if(dict.containsKey(str.charAt(right))) {
				//记录下标
				left = Math.max(dict.replace(str.charAt(right), right)+1, left);
			}
			//记录下标
			dict.put(str.charAt(right), right);
//			System.out.println("left: "+left+"\tright: "+right);
			right++;
			//比较长度
			if(right-left>length) {
				length = right-left;
//				System.out.println("left: "+left+"\tright: "+right+
//						"\tlen: "+length);
			}
			System.out.println(dict+"-----------------------------"
					+ "--------------------");
		}
		return length;	
	}
}
