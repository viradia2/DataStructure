package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class P_575 {
	public static void main(String[] args) {
		int[] candies = {1000,1,1,1};
		int total = differentcandies(candies);
		System.out.println("Sister has "+ total + " candies.");
	}

	private static int differentcandies(int[] candies) {
		// TODO Auto-generated method stub
		/*************************************************
		 * Don't worry about how much candies kids will get.
		 * Calculate how much unique candies are there.
		 * Then check if those candies total is greater than
		 * half of the total candies then return kinds size.
		 *************************************************/
		int total = candies.length;
		Set<Integer> kinds = new HashSet<Integer>();
		for (int i = 0; i < total; i++) {
			kinds.add(candies[i]);
		}
		if (kinds.size() > total / 2) {
			return total / 2;
		} else {
			return kinds.size();
		}
	}
}
