package com.leetcode;

public class P_136 {
	public static void main(String[] args) {
		int[] array = {1,1,2,2,3,3,4,4,5,6,6,7,7,8,8};
		singleNumber(array);
	}

	private static void singleNumber(int[] array) {
		// TODO Auto-generated method stub
		int value = 0;
		/* 
		 * XOR implementation here
		 * 0 ^ N = N;
		 * N ^ N = 0;
		 */
		for(int i=0; i<array.length; i++){
			value ^= array[i];
		}
		System.out.println(value);
	}
}
