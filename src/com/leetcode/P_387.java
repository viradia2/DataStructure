package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P_387 {
	public static void main(String[] args) {
		int i = firstUniqueLetter("loveleetcode");
		System.out.println(i);
		System.out.println(53 / 10);
		isPalindrome(-1);
		int[] array = {1,2,3,4,5,6,7,8};
		evenFirstOddLast(array);
	}

	private static void evenFirstOddLast(int[] array) {
		// TODO Auto-generated method stub
		int nextEven = 0, newxtOdd = array.length -1;
		while(nextEven < newxtOdd){
			if(array[nextEven] % 2 == 0){
				nextEven++;
			}else{
				int temp = array[nextEven];
				array[nextEven] = array[newxtOdd];
				array[newxtOdd] = temp;
				newxtOdd--;
			}
		}
		
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + ",");
		}
	}

	private static void isPalindrome(int i) {
		// TODO Auto-generated method stub
		int remain = Math.abs(i);
		int result = 0;
		while(remain != 0){
			result = result * 10 + remain % 10;
			remain /= 10;
		}
		
		if(result == i){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not P.");
		}
	}

	private static int firstUniqueLetter(String string) {
		// TODO Auto-generated method stub
		char[] a = string.toCharArray();
		
		 /*************************************************************
	     *string.indexof returns the first occurrence of the letter
	     *string.lastIndexOf returns the last occurrence of the index
	     **************************************************************/
		
		for(int i=0; i<a.length;i++){
			if(string.indexOf(a[i])==string.lastIndexOf(a[i])){
				return i;
			}
		}
		return -1;
	}
}
