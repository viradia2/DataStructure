package com.leetcode;

public class P_520 {
	public static void main(String[] args) {
		boolean flag = detectCapital("g");
		System.out.println(flag);
	}

	private static boolean detectCapital(String string) {
		// TODO Auto-generated method stub
		int count = 0;
		boolean flag = false;
		for(int i=0; i<string.length(); i++){
			if(Character.isUpperCase(string.charAt(i)))
				count++;
		}
		 if (count == 1) 
			 return Character.isUpperCase(string.charAt(0));
		 
	     return count == 0 || count == string.length();

	}
}
