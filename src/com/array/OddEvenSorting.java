package com.array;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSorting {
	public static void main(String[] args) {
		int[] array = {12,20,32,41,61,71,81,91,100,110};
		sortOddEvenLeftRight(array);
		int[] array1 = {12,20,32,41,61,71,81,91,100,110};
		sortOddEvenLeftRightArray(array1);
		int[] array2 = {12,20,32,41,61,71,81,91,100,110};
		sortOddEvenLeftRightWithOneArray(array2);
		
	}

	private static void sortOddEvenLeftRightWithOneArray(int[] array) {
		// TODO Auto-generated method stub
		int length = array.length;
		int mid = length/2;
		int sum = mid;
		int count = 0;
		int i = 0;
		
		while(i < length && mid < length && i < sum){
			if(array[i] % 2 == 0){
				array[count] = array[i];
				count++;
				i++;
			}else{
				int temp = array[mid];
				array[mid] = array[i];
				array[i] = temp;
				mid++;
				arraySort(array);
			}
		}
		System.out.println("Sorted Array: ");
		for(int j=0; j<length; j++){
			System.out.print(array[j] + ",");
		}
	}
	
	public static int[] arraySort(int[] array){
		
		for(int i=0; i<array.length/2; i++){
			for(int j=i + 1; j<array.length/2; j++){
				if(array[i] > array[j]){
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		for(int j=0; j<array.length; j++){
			System.out.print(array[j] + ",");
		}
		System.out.println();
		return array;
	}

	private static void sortOddEvenLeftRightArray(int[] array) {
		// TODO Auto-generated method stub
		int length = array.length;
		int[] sortedArray = new int[length];
		int mid = length/2;
		int count = 0;
		for(int i=0; i<length; i++){
			if(array[i] % 2 == 0){
				sortedArray[count] = array[i];
				count++;
			}else{
				sortedArray[mid] = array[i];
				mid++;
			}
		}
		
		System.out.println("Sorted Array: ");
		for(int i=0; i<length; i++){
			System.out.print(sortedArray[i] + ",");
		}
		System.out.println();
	}

	private static void sortOddEvenLeftRight(int[] array) {
		// TODO Auto-generated method stub
		int length = array.length;
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		
		for(int i=0; i<length; i++){
			if(array[i] % 2 == 0)
				odd.add(array[i]);
			else
				even.add(array[i]);
		}
		int count = 0;
		for(int i=0; i<odd.size(); i++){
			array[i] = odd.get(i);
			count++;
		}
		for(int i=0; i<even.size(); i++){
			array[count] = even.get(i);
			count++;
		}
		
		System.out.println("Sorted Array by using different List (Simplest Solution): ");
		for(int i=0; i<length; i++){
			System.out.print(array[i] + ",");
		}
		System.out.println();
	}
}
