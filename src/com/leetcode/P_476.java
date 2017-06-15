package com.leetcode;

public class P_476 {
	public static void main(String[] args) {
		findComplement(1);
	}

	private static void findComplement(int num) {
		// TODO Auto-generated method stub
		String number = Integer.toBinaryString(num);
		String sb = "";
		for(int i=0; i<number.length(); i++){
			if(number.charAt(i) == '0'){
				sb = sb + '1';
			}else{
				sb = sb + '0';
			}
		}
		int value = Integer.parseInt(sb, 2);
		System.out.println(value);
	}

}
