package com.leetcode;

import java.util.stream.Stream;

public class P_500 {
	public static void main(String[] args) {
		String[] input = {"Hello", "Alaska", "Dad", "Peace"};
		String[] s = keyboardRow(input);
		for(int i=0; i<s.length; i++){
			System.out.println(s[i]);
		}
		s = keyboardRow(input);
		for(int i=0; i<s.length; i++){
			System.out.println(s[i]);
		}
	}

	private static String[] keyboardRow(String[] input) {
		// TODO Auto-generated method stub
		 return Stream.of(input).filter(i -> i.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
	}
	
	public static String[] findWords(String[] words) {
	        String keyboardRegex = "[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*";
	        return Stream.of(words)
	            .filter(word -> word.toLowerCase().matches(keyboardRegex))
	            .toArray(String[]::new);
	    }
}
