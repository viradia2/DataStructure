package com.leetcode;

import java.util.Arrays;

public class P_506 {
	public static void main(String[] args) {
		int[] array = {10,3,8,9,4};
		relativeRanks(array);
	}

	private static void relativeRanks(int[] array) {
		// TODO Auto-generated method stub
		int length = array.length;
		String array1 = Arrays.toString(array);
		int[] sortedArray = array.clone();
		Arrays.sort(sortedArray);
		int count = 0;
		String[] reward = {"Gold Medal", "Silver Medal", "Bronze Medal"};
		for(int i=0; i<length; i++){
			for(int j=length - 1; j>=length - 3; j--){
				if(array[i] == sortedArray[j]){
					array[i] = Integer.parseInt(reward[count]);
					count++;
				}
			}
		}
		for(int i=0; i<length; i++){
			System.out.println(array[i]);
		}
	}
}
