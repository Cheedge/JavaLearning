package com.lqz.java;

import java.util.Arrays;

public class FormatVariable {
	public static void main(String[] args) {
		String[] s = new String[]{"o","l","l","e","h"};
		String[] sAfter=change(s);
		System.out.println(
				"s will not change: "+Arrays.toString(s)
				+"\nbut sAfter will change: "+ Arrays.toString(sAfter));
	}
	private static String[] change(String[] sBefore) {
		sBefore = new String[] {"H","i"};
		System.out.println("change: "+Arrays.toString(sBefore));
		return sBefore;
	}
}
