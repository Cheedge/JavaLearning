package com.lqz.exercise;

public class YangHui {
	public static void main(String[] args) {
		// 1. 声明初始化
		int[][] yangHui = new int[10][];
		// 2. 赋值
		for (int i=0; i<yangHui.length; i++) {
			yangHui[i] = new int[i+1];
			yangHui[i][0] = 1;
			yangHui[i][i] = 1;
			for (int j=1; j<i; j++) {
				yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
			}
		}
		// 3. 遍历
		for (int i=0; i<yangHui.length; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print(yangHui[i][j] + "\t"); 
			}
			System.out.println();
		}
	}
}
