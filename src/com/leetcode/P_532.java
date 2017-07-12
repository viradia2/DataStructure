package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class P_532 {
	
	static int kil = 1;
	
	
	public static void main(String[] args) {
		int[] array = {3,1,4,1,5};
		kDiffMainPair(array, 2);
		PascalTriangle(5);//It's not done yet
		IsPerfectSquare(16);
		NumberOfSegmenInString("Hello, How Are You");
		ArrangingCoins(8);//It's not done yet
		IsPalindrome(2);
		PerfectNumber(999992);
		validParanthesis("(){}(){");
		wordPattern("abba", "dog ca cat dog");
		P_532 p = new P_532();
		p.dPrint();
	}
	
	public void print(int i){
		i = 5;
		System.out.println("Hi kil : "+ i);
	}
	
	public void dPrint(){
		int i = 6;
		print(i);
		System.out.println("Hi DP: " + i);
	}

	private static void wordPattern(String pattern, String str) {
		// TODO Auto-generated method stub
		String[] words = str.split(" ");
		boolean flag = true;
		Map has = new HashMap<>();
		
		if(words.length != pattern.length())
			flag = false;
		
		for(Integer i=0; i<words.length; i++){
			if(has.put(pattern.charAt(i), i) != has.put(words[i], i))
				flag = false;
		}
		
		if(flag)
			System.out.println("Similar Pattern");
		else
			System.out.println("Not Similar Pattern");
	}

	private static void validParanthesis(String s) {
		// TODO Auto-generated method stub
		 Stack<Character> stack = new Stack<Character>();
		 boolean flag = true;
		 for(char c : s.toCharArray()){
			 if(c == '{')
				 stack.push('}');
			 else if(c == '[')
				 stack.push(']');
			 else if(c == '(')
				 stack.push(')');
			 else if(stack.isEmpty() || stack.pop() != c)
				 flag = false;
		 }
		 if(stack.isEmpty())
			 System.out.println("Valid Parentheses");
		 else
			 System.out.println("Not valid Parentheses");
	}

	private static void PerfectNumber(int num) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<num; i++){
			 if(num % i == 0){
	            list.add(i);
			 }
		}
		int sum = 0;
		for(int j=0; j<list.size(); j++){
			if(list.get(j) != num)
				sum += list.get(j);
		}
		
		if(sum == num)
			System.out.println("Perfect");
		else
			System.out.println("Not Perfect");
	}

	private static void IsPalindrome(int num) {
		// TODO Auto-generated method stub
		String s = Integer.toString(num);
		int end = s.length() - 1;
		boolean flag = true;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == s.charAt(end)){
				end--;
				flag = true;
			}else{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("IsPalindrome(P)");
		else
			System.out.println("NOpe");
	}

	private static void ArrangingCoins(int n) {
		// TODO Auto-generated method stub
		int count = 1, stairCount = 0;
		List<Integer> list = new ArrayList<>();
		
		System.out.println("s: " + stairCount);
	}

	private static void NumberOfSegmenInString(String string) {
		// TODO Auto-generated method stub
		int spaceCount = 0;
		String t = string.trim();
		System.out.println(t.length());
		// " \\s+ " repeat whitespace character one or more times
		System.out.println(t.split("\\s+").length);
	}

	private static void IsPerfectSquare(int num) {
		// TODO Auto-generated method stub
		int i = 1;
	     while (num > 0) {
	         num -= i;
	         i += 2;
	     }
	     if(num == 0)
	    	 System.out.println("Yes");
	     else
	    	 System.out.println("No");
	}

	private static void PascalTriangle(int i) {
		// TODO Auto-generated method stub
		
	}

	private static void kDiffMainPair(int[] array, int k) {
		// TODO Auto-generated method stub
		int count = 0, valueA = 0, valueB = 0;
		for(int i=0; i<array.length; i++){
			for(int j=i+1; j<array.length; j++){
				if(Math.abs(array[i] - array[j]) == k){
					if((valueA == array[i] && valueB == array[j])
					    || (valueB == array[i] && valueA == array[j])){
						valueA = array[i];
						valueB = array[j];
						if(count <= 0)
							count++;
					}else{
						valueA = array[i];
						valueB = array[j];
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
