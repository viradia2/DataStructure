package com.leetcode;

import java.lang.reflect.Array;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] array = {1,5,7,8,12,16,29,31,75,85,88,90,93,97};
		int op = binarysearch(0, array.length - 1, 97, array);
		if(op == -1){
			System.out.println("Value Not Found..!");
		}else{
			System.out.println("Index is: " + op);
		}
	}

	private static int binarysearch(int first, int last, int value, int[] array) {
		// TODO Auto-generated method stub
		
			int mid = first + (last - first)/ 2;
			
			if(last < first)
				return -1;
			
			if(array[mid] == value)
				return mid;
			else if(value > array[mid])
				return binarysearch(mid + 1, last, value, array);
			else if(value < array[mid])
				return binarysearch(first, mid - 1, value, array);
			
			return -1;
	}
}
