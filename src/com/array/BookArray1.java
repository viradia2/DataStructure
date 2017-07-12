package com.array;

public class BookArray1 {
	public static void main(String[] args) {
		int[] array = {1,2,9,5,9};
		Oneplus(array);
	}

	private static void Oneplus(int[] array) {
		// TODO Auto-generated method stub
		int length = array.length;
		int sum = 0, count = length - 1;
		for(int i=0; i<length; i++){
			sum = sum * 10 + array[i];
		}
		sum = sum + 1;
		while(count >= 0){
			int sum1 = sum % 10;
			array[count] = sum1;
			sum /= 10;
			count--;
		}
		for(int i=0; i<length; i++){
			System.out.println(array[i]);
		}
	}
}
