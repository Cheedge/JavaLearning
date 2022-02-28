package com.lqz.execr;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.jupiter.api.Test;
//import org.w3c.dom.css.Counter;

/**
 * five problems.
 * @Author lqz
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 28, 2022 11:56:21 AM
 * @Description
 * 
 * 1.模拟一个trim方法，去除字符串两端的空格。
 * 
 * 2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
 * 
 * 3.获取一个字符串在另一个字符串中出现的次数。
 *    比如：获取“ab”在 “cdabkkcadkabkebfkabkskab”中出现的次数
 *
 * 4.获取两个字符串中最大相同子串。比如：
 * 		str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"//10
 * 		提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 * 
 * 5.对字符串中字符进行自然顺序排序。"abcwerthelloyuiodef"
 * 	提示：
 * 		1）字符串变成字符数组。
 * 		2）对数组排序，选择，冒泡，Arrays.sort(str.toCharArray());
 * 		3）将排序后的数组变成字符串。
 * 
 */
public class StringMethodsTests {
	
	// 1. simulate a method as String.trim() to 
	// remove empty space at head and tail.
	@Test
	public void Problem1() {
		System.out.println("****************P1******************");
		String str = "  Hello World! ";
		int i = 0, j = str.length()-1;
		int start = i, end = j;
		// 首次索引位置不是空格的位置的索引
		while(str.charAt(i)==' ') {
			i++;
			start = i;
		}
		// 首次索引位置是空格的位置的索引
		while(str.charAt(j)==' ') {
			j--;
			end = j;
		}
		System.out.println(str.substring(start, end+1)+" : "+str.trim());
//		return str.substring(start, end+1);
	}
	
	// 2.reverse charArray of a string
	@Test
	public void Problem2() {
		System.out.println("****************P2******************");
		String str = "hello world";
		int left=2, right=6;
		String str1 = reverse1(str, left, right);
		System.out.println(str1);
	}
	public String reverse1(String str, int left, int right) {
		char[] charArray = str.toCharArray();
		for(int i=left, j=right; i<j; i++, j--) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		// Notice toString()
		return new String (charArray);
	}
	public String reverse2(String str, int left, int right) {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append(str.substring(0, left));
		for (int i = right; i>=left; i--) {
			strBuff.append(str.charAt(i));
		}
		strBuff.append(str.substring(right));
		return strBuff.toString();
	}
	
	// 3. count appearance of a string in another string.
	@Test
	public void Problem3() {
		System.out.println("****************P3******************");
		String s0 = "ab";
		String str = "cdabkkcadkabkebfkabkskab";
//		int count = 0;
//		String temp;
//		if(temp.contains(s0)) {
//			count++;
//		}
		String[] newStr = str.split(s0);
		for(int i=0; i<newStr.length; i++) {
			System.out.println(newStr[i]);
		}
//		char[] charArray = str.toCharArray();
//		for (int i=0; i<charArray.length; i++) {
//			if(charArray[i]=='a'&&charArray[i+1]=='b') {
//				count++;
//			}
//		}
	}
	
	// 4. find largest substring.
	@Test
	public void Problem4() {
		System.out.println("****************P4******************");
		String str1 = "abcwerthelloyuiodef";
		String str2 = "cvhellobnm";
//		char[] charArray = str2.toCharArray();
//		String maxStr = (str1.length()>str2.length())? str1:str2;
		String maxStr, minStr;
		if(str1.length()>str2.length()) {
			maxStr = str1;
			minStr = str2;
		}else {
			maxStr = str2;
			minStr = str1;
		}
//		boolean containFlag = false;
//		int count=0;
		int len = minStr.length();
		String longestSubStr = new String();
		HashMap<String, Integer> record = new HashMap<String, Integer>();
		for(int i=0; i<len; i++) {
			for (int j=len-1; j>i; j--) {
				if(maxStr.contains(minStr.substring(i, j))) {
					if(longestSubStr.length()<minStr.substring(i, j).length()) {
						longestSubStr = minStr.substring(i, j);
						if(record.containsKey(longestSubStr)) {
							record.put(longestSubStr, record.get(longestSubStr)+1);
						}else {
							record.put(longestSubStr, 1);
						}
					}
				}	
			}
		}
		System.out.println(longestSubStr+": "+record);
	}
	
	// 5. sort a string.
	@Test
	public void Problem5() {
		String str = "abcwerthelloyuiodef";
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println("****************P5******************");
		System.out.println(new String(charArray));
	}
}
