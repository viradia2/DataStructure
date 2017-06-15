package com.leetcode;

public class P_485 {
	public static void main(String[] args) {
		int[] array = {1,1,1,1,0,0,0,0,0,1};
		maxConsecutiveOnes(array);
	}

	private static void maxConsecutiveOnes(int[] array) {
		// TODO Auto-generated method stub
		int prev1 = 0;
		int one = 0;
		for(int i=0; i<array.length; i++){
			if(array[i] == 1){
				one++;
				prev1 = (one > prev1) ? one : prev1;
			}else{
				one = 0;
			}
		}
		System.out.println(prev1);
	}
}
