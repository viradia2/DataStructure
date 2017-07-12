package com.leetcode;

public class Hamming {
	public static void main(String[] args) {
		makesamesize("abcd", "ab");
	}

	private static void makesamesize(String string, String string2) {
		// TODO Auto-generated method stub
		int size1 = string.length();
		int size2 = string2.length();
		int min = (size1 < size2) ? size1 : size2;
		int max = (size1 > size2) ? size1 : size2;
		
		String minstring = (size1 < size2) ? string : string2;
		StringBuffer sb = new StringBuffer(minstring);
		for(int i=0; i<max - min; i++){
			sb.insert(i, 'x');
		}
		System.out.println(sb);
	}
	
	
}
