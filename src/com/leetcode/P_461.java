package com.leetcode;

public class P_461 {
	public static void main(String[] args) {
		P_461 p = new P_461();
		int d = p.hammingDistance2(1, 4);
		System.out.println(d);
		d = p.hammingDistance2(4, 1);
		System.out.println(d);
		d = p.hammingDistance2(40, 1);
		System.out.println(d);
		d = p.hammingDistance(4, 1);
		System.out.println(d);
		d = p.hammingDistance(1, 1);
		System.out.println(d);

	}
	
	public int hammingDistance(int x, int y) {
		int distance = 0;
		String binary1 = Integer.toString(x, 2);
		String binary2 = Integer.toString(y, 2);
		System.out.println("Bina1: " + binary1);
		System.out.println("Bina2: " + binary2);
		
		String minstring = (binary1.length() < binary2.length()) ? binary1 : binary2;
		String maxString = (binary2.length() > binary1.length()) ? binary2 : binary1;
		
		for(int i= maxString.length() - 1,j=minstring.length() - 1; i>=0; i--, j--){
			try{
				if(maxString.charAt(i) == minstring.charAt(j))
					continue;
				else
					distance++;
			}catch(Exception e){
				if(maxString.charAt(i) == '0')
					continue;
				else
					distance++;
			}
		}
		return distance;
    }
	
	public int hammingDistance2(int x, int y) {
		int distance = 0;
		String binary1 = Integer.toString(x, 2);
		String binary2 = Integer.toString(y, 2);
		
		int min = (binary1.length() < binary2.length()) ? binary1.length() : binary2.length();
		int max = (binary2.length() > binary1.length()) ? binary2.length() : binary1.length();
		
		String minstring = (binary1.length() < binary2.length()) ? binary1 : binary2;
		String maxString = (binary2.length() > binary1.length()) ? binary2 : binary1;
		StringBuffer sb = new StringBuffer(minstring);
		for(int i=0; i<max - min; i++){
			sb.insert(i, '0');
		}
		System.out.println("Binary1: " + sb);
		System.out.println("Binary2: " + maxString);
		for(int j=0; j<maxString.length(); j++){
			if(maxString.charAt(j) == sb.charAt(j))
				continue;
			else
				distance++;
		}
		return distance;
    }
}
