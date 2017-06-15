package com.book;

public class ConvertIntToString {
	public static void main(String[] args) {
		convertintostring("562323");
		reverseString("Alice likes Bob");
	}

	private static void reverseString(String string) {
		// TODO Auto-generated method stub
		String output = "";
		String[] array = string.split(" ");
		for(int i = array.length - 1; i>=0; i--){
			output += array[i];
			if(i != 0)
				output += " ";
		}
		System.out.println(output);
	}

	private static void convertintostring(String string) {
		// TODO Auto-generated method stub
		int j = 0;
		int factor = 1;
		for(int i=string.length()-1; i>=0; i--){
			if(string.charAt(i) == '-'){
				break;
			}else{
				j = j + (string.charAt(i) - '0') * factor;
				factor = factor * 10;
			}
		}
		System.out.println("interger: " + j);
	}
}
