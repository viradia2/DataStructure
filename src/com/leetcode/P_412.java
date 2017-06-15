package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class P_412 {
	public static void main(String[] args) {
		fizzbuzz(15);
	}

	private static void fizzbuzz(int n) {
		// TODO Auto-generated method stub
		String[] s = new String[n]; 
		List<String> str = new ArrayList<String>();
		int counter = 1;
		for(int i=0; i<n; i++){
			if(counter % 3 == 0 && counter % 5 == 0)
//				s[i] = "FizzBuzz";
				str.add("FizzBuzz");
			else if(counter % 3 == 0)
//				s[i] = "Fizz";
				str.add("Fizz");
			else if(counter % 5 == 0)
//				s[i] = "Buzz";
				str.add("Buzz");
			else
//				s[i] = Integer.toString(counter);
				str.add(Integer.toString(counter));
			
			counter++;
		}
		
//		for(int j=0; j<s.length; j++){
			System.out.println(str);
//		}
	}
}
