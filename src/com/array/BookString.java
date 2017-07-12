package com.array;

public class BookString {
	public static void main(String[] args) {
		boolean flag = IsPalindrome("abcba");
		if(flag == true)
			System.out.println("Palindrome.");
		else
			System.out.println("Not Palindrome.");
		
		returnStringifEnteredNumber(-314);
		returnIntegerifEnterString("-314");
	}

	private static void returnIntegerifEnterString(String string) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i=string.charAt(0) == '-' ? 1 : 0; i<string.length(); i++){
			int digit = string.charAt(i) - '0';
			result = result * 10 + digit;
		}
		
		if(string.charAt(0) == '-'){
			System.out.println(-result);
		}else{
			System.out.println(result);
		}
	}

	private static void returnStringifEnteredNumber(int number) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		if(number < 0)
			flag = true;
			
		while(number != 0){
			char temp = (char)('0' + Math.abs(number % 10));
			sb.append(temp);
			number /= 10;
		}
		
		if(flag == true)
			sb.append('-');
		
		sb.reverse();
		
		System.out.println(sb);
	}

	private static boolean IsPalindrome(String string) {
		// TODO Auto-generated method stub
		for(int i=0, j=string.length() - 1; i<string.length() && j > i; i++,j--){
			if(string.charAt(i) != string.charAt(j))
				return false;
		}
		return true;
	}
}
