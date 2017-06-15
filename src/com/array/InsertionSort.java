package com.array;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {5,8,1,3,9,6};
		
		for(int i=1; i<arr.length; i++){
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && key < arr[j]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + ",");
		}
	}
}
