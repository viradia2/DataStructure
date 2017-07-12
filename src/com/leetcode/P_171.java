package com.leetcode;

public class P_171 {
	public static void main(String[] args) {
		int i = excelSheetNumber("B");
		System.out.println(i);
	}

	private static int excelSheetNumber(String string) {
		// TODO Auto-generated method stub
		if(string.length() == 1){
			return (int) string.charAt(0);
		}
		
		return 0;
	}
}
