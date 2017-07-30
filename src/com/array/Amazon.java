package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Amazon {
	public static void main(String[] args) {
		String[][] isAssociation = {{"item1","item2"},
							{"item3","item4"},
							{"item4","item5"}};
		
		longestItemAssociation(isAssociation);
		implicitCasting();
		explicitCasting();
		
		getAnagramPositionNumber("bbbababaaabbbb", "abb");
	}
	
	private static void explicitCasting() {
		// TODO Auto-generated method stub
		double d = 4;
		int i = (int) d;
		System.out.println("d(explicit Casting can not be done by JVM; User has to do): " + d);
	}

	private static void implicitCasting() {
		// TODO Auto-generated method stub
		int i = 4;
		double d = i;
		System.out.println("d(implicit Casting done by JVM): " + d);
	}

	private static void longestItemAssociation(String[][] isAssociation) {
		// TODO Auto-generated method stub
		HashMap<String, String> association = new HashMap<>();
		int len = isAssociation.length;
		
		for(int i=0; i<len; i++){
			
		}
	}

	public static List<Integer> getAnagramPositionNumber(String haystack, String needle){
		
		List<Integer> numbers = new ArrayList<>();
		String isAnagram = "";
		for(int i=0; i<haystack.length(); i++){
			
			isAnagram += haystack.charAt(i)+"";
			
			if(isAnagram.length() == needle.length()){
				boolean flag = isAnagramEqual(isAnagram,needle);
			
				if(flag){
					numbers.add(i - needle.length()+1);
				}else{
					i = i - needle.length() + 1;
				}
				isAnagram = "";
			}
		}
		System.out.println(haystack);
		System.out.println(numbers);
		
		return numbers;
	}

	private static boolean isAnagramEqual(String isAnagram, String needle) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<isAnagram.length();i++){
			String chars = needle.charAt(i) + "";
			if(!isAnagram.contains(chars)){
				return false;
			}
		}
		return true;
	}
}
