package com.array;

import java.util.ArrayList;
import java.util.List;

public class ReverseAndAdd {
	
	public static int i = 0;
	
	public static void main(String[] args) {
		int number = 196;
		reverseAndAddAndCheckIfPlaindromeOrNot(number);
		commonFactor(10,15);
	}

	private static void commonFactor(int num1, int num2) {
		// TODO Auto-generated method stub
		int div = num1/2;
		int div2 = num2/2;
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		
		for(int i=1; i<=div && i<div2; i++){
			if(num1 % i == 0)
				list.add(i);
			if(num2 % i == 0)
				list1.add(i);
		}
		
		System.out.println(list + " And " + list1);
	}

	private static void reverseAndAddAndCheckIfPlaindromeOrNot(int number) {
		// TODO Auto-generated method stub
		int reverse = 0;
		int originalNum = number;
		while(number > 0){
			reverse = (reverse * 10) + (number % 10);
			number = number/10;
		}
		int sum = originalNum + reverse;
		checkIfSumIsPlaindrom(sum);
	}

	private static void checkIfSumIsPlaindrom(int sum) {
		// TODO Auto-generated method stub
		int rev = 0;
		int oriSum = sum;
		
		while(sum > 0){
			rev = (rev * 10) + (sum % 10);
			sum = sum/10;
		}
		i++;
		
		if(rev == oriSum)
			System.out.println(i + " " + rev);
		else if(i > 100)
			System.out.println("Not Found");
		else
			reverseAndAddAndCheckIfPlaindromeOrNot(oriSum);
	}
}
