package com.leetcode;

public class P_557 {
	public static void main(String[] args) {
		reverseString("Let's take LeetCode contest");
	}

	private static void reverseString(String string) {
		// TODO Auto-generated method stub
		String[] reverse = string.split(" ");
		String reve = "";
		
		for(int i=0; i<reverse.length; i++){
			StringBuffer sb = new StringBuffer(reverse[i]);
			if(i == reverse.length - 1)
				reve += sb.reverse();
			else
				reve += sb.reverse() + " ";
		}
		System.out.println(reve);
	}
}
