package com.leetcode;

import java.util.Set;

public class Hackersrank {
	public static void main(String[] args) {
		String note = "anargram";
		String mag = "gramanar";
//		returnIndexOfString(input);
		createRansomeNote(note, mag);
		boolean flag = isAnagram(note, mag);
	}
	
	 private static void countMove(int[] array) {
		// TODO Auto-generated method stub
		
	}

	public static boolean isAnagram(String s, String t) {
	        if(s.length()!=t.length()){
	            return false;
	        }
	        int[] count = new int[26];
	        for(int i=0;i<s.length();i++){
	            count[s.charAt(i)-'a']++;
	            count[t.charAt(i)-'a']--;
	        }
	        for(int i:count){
	            if(i!=0){
	                return false;
	            }
	        }
	        return true;
	    }
	private static void createRansomeNote(String note, String mag) {
		// TODO Auto-generated method stub
		int maglength = mag.length();
		int notelength = note.length();
		int lengthM = 0, lengthN = 0;
		if(mag.equals(note)){
			System.out.println("Yes");
		}
		
		if(note.length() > mag.length()){
			System.out.println("No");
		}
		StringBuilder sb = new StringBuilder();
		
		while(lengthN < notelength && lengthM < maglength){
			if(note.charAt(lengthN) == mag.charAt(lengthM)){
				sb.append(note.charAt(lengthN));
				lengthN++;
				lengthM++;
			}else{
				lengthM++;
			}
//			String note = "bjaajgea";
//			String mag = "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec";
		}
		
		if(note.equals(sb.toString())){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

	private static void returnIndexOfString(String input) {
		// TODO Auto-generated method stub
		
	}
}
