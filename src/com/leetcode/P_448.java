package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.crypto.MacSpi;

public class P_448 {
	public static void main(String[] args) {
		int[] array = {4,3,2,7,8,2,3,1};
		disapperaednumber(array);
		findthedifferenceP_389("a", "aa");
		addtwonumberP_258(19);
		String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2 = {"KFC", "Shogun", "Burger King"};
		findRestaurantsP_599(list1, list2);
	}

	private static String[] findRestaurantsP_599(String[] list1, String[] list2) {
		// TODO Auto-generated method stub
		List<String> list = null;
		int min = Integer.MAX_VALUE;
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		
		for(int i=0; i<list1.length; i++)
			map1.put(list1[i], i);
		for(int i=0; i<list2.length; i++)
			map2.put(list2[i], i);
		for(int i=0; i<list1.length; i++){
			if(map2.containsKey(list1[i])){
				int sum = map1.get(list1[i]) + map2.get(list1[i]);
				if(sum < min){
					min = sum;
                    list = new ArrayList<String>();
                    list.add(list1[i]);
                }else if (sum == min) {
                    list.add(list1[i]);
                }
			}
		}
		String[] res = new String[list.size()];
	    for (int i = 0; i < list.size(); i++) {
	    	res[i] = list.get(i);
	    }
		return res;
	}

	private static void addtwonumberP_258(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(num > 0){
			int digit = num % 10;
			num = num / 10;
			sum += digit;
		}
		if(sum >= 10){
			addtwonumberP_258(sum);
		}else{
			System.out.println(sum);
		}
	}

	private static void findthedifferenceP_389(String s, String t) {
		// TODO Auto-generated method stub
		 // Initialize variables to store sum of ASCII codes for 
        // each string
        int charCodeS = 0, charCodeT = 0;
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) charCodeS += (int)s.charAt(i);
        for (int i = 0; i < t.length(); ++i) charCodeT += (int)t.charAt(i);
        // Return the difference between 2 strings as char
        char c = (char)(charCodeT - charCodeS);
        System.out.println(c);
	}

	private static void disapperaednumber(int[] array) {
		// TODO Auto-generated method stub

	}
}
