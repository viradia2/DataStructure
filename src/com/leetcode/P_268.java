package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class P_268 {
	public static void main(String[] args) {
		int[] array = {0,1,3};
		int[] arr = {1,3,5,6};
		missingNumber(array);
		reverseStringII("abcdefg", 2);
		AttendanceReward("LPLLP");
		happyNumber(3);
		powerOfTwo(27);
		powerOfThree(64);
		searchInsertPortion(arr, 7);
		numberOf1sBits(5);
		uglyNumber(8);
		reverseVowelsOfString("leetcode");
		powerOfFour(15);
	}

	private static void powerOfFour(int num) {
		// TODO Auto-generated method stub
		
		while(num != 1){
			if(num % 4 != 0)
				break;
			num /= 4;
		}
		if(num == 1)
			System.out.println("Power Of Four: Yes");
		else
			System.out.println("No");
	}

	private static void reverseVowelsOfString(String string) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		for(int i=0; i<string.length(); i++){
			if(string.charAt(i) == 'a' || string.charAt(i) == 'e'
			   || string.charAt(i) == 'i' || string.charAt(i) == 'o'
			   || string.charAt(i) == 'u' || string.charAt(i) == 'A' 
			   || string.charAt(i) == 'E' || string.charAt(i) == 'I' 
			   || string.charAt(i) == 'O' || string.charAt(i) == 'U')
			{
				sb.append(string.charAt(i));
			}
		}
		sb.reverse();
		int count = 0;
		for(int i=0; i<string.length(); i++){
			if(string.charAt(i) == 'a' || string.charAt(i) == 'e'
			   || string.charAt(i) == 'i' || string.charAt(i) == 'o'
			   || string.charAt(i) == 'u' || string.charAt(i) == 'A' 
			   || string.charAt(i) == 'E' || string.charAt(i) == 'I' 
			   || string.charAt(i) == 'O' || string.charAt(i) == 'U')
			{
				sb1.append(sb.charAt(count));
				count++;
			}else{
				sb1.append(string.charAt(i));
			}
		}
		System.out.println(sb1.toString());
	}

	private static void uglyNumber(int num) {
		// TODO Auto-generated method stub
		if(num==1) 
			System.out.println("Ugly");
	    if(num==0) 
	    	System.out.println("N Ugly");
		while(num%2==0) 
			num=num>>1;
		while(num%3==0) 
			num=num/3;
		while(num%5==0) 
			num=num/5;
		
	    if(num==1)
	    	System.out.println("Ugly");
	    else
	    	System.out.println("N Ugly");
	}

	private static void numberOf1sBits(int num) {
		// TODO Auto-generated method stub
		String bin = Integer.toBinaryString(num);
		int ones = 0;
		for(int i=0; i<bin.length(); i++){
			if(bin.charAt(i) == '1'){
				ones++;
			}
		}
		System.out.println("No of Ones: " + ones);
	}

	private static void searchInsertPortion(int[] arr, int target) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int countA=0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] == target){
				System.out.println("Index: " + i);
				flag = false;
			}
		}
		while(flag && countA < arr.length){
			if(arr[countA] < target){
				countA++;
			}else{
				flag = false;
				System.out.println("index: " + countA);
			}
		}
		if(countA == arr.length){
			System.out.println("index: " + arr.length);
		}
	}

	private static void powerOfThree(int num) {
		// TODO Auto-generated method stub
		while((num % 3 == 0) && num > 1){
			num /= 3;
		}
		if(num == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static void powerOfTwo(int num) {
		// TODO Auto-generated method stub
		while((num % 2 == 0) && num > 1){
			num /= 2;
		}
		if(num == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean happyNumber(int num) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		int i = num;
		while(num > 0){
			int n = num % 10;
			num = num / 10;
			list.add(n);
		}
		int sum=0, fsum=0;
		for(int j=0; j<list.size(); j++){
			sum += list.get(j) * list.get(j);
			if(sum == num * num)
				fsum = sum;
		}
		
		boolean flag = true;
		if(sum == 1){
			flag = true;
		}else{
            if(sum == 4){
                flag = false;
            }else{
            	flag = happyNumber(sum);
            }
		}
//        System.out.println(flag);
       return flag;
	}

	private static void AttendanceReward(String string) {
		// TODO Auto-generated method stub
		int countA = 0, countL = 0;
		int[] array = new int[string.length()];
		
		for(int i=0; i<string.length(); i++){
			if(string.charAt(i) == 'A'){
				countA++;
				if(countL <= 2)
					countL = 0;
			}else if(string.charAt(i) == 'P'){
				if(countL <= 2)
					countL = 0;
			}
			else if(string.charAt(i) == 'L'){
				array[countL] = i;
				countL++;
			}
		}
		
		if(countA > 1){
			System.out.println("False");
		}else if(countL > 2){
				System.out.println("False");
		}else{
			System.out.println("True");
		}
	}

	private static void reverseStringII(String string, int k) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<k; i++){
			sb.append(string.charAt(i));
		}
		sb.reverse();
		
		for(int i=k; i<string.length();i++){
			sb.append(string.charAt(i));
		}
		System.out.println(sb);
	}

	private static void missingNumber(int[] array) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i : array)
			sum += i;
		int value = (array.length * (array.length + 1) / 2) - sum;
	}
}
