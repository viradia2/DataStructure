package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class P_492 {
	public static void main(String[] args) {
		int[] res = constructRectangle(15);
		for(int i=0; i<res.length; i++){
			System.out.println(res[i]);
		}
		
		int[] array = {2,7,5,8};
		teosumIIP_167(array, 9);
	}

	private static void teosumIIP_167(int[] array, int target) {
		// TODO Auto-generated method stub
		int length = array.length;
		int count = 0, a=0, b=0;
		for(int i=0; i<length; i++){
			for(int j=0; j<length; j++){
				if(array[i] == array[j] && i == j){
					break;
				}else if(array[i] + array[j] == target){
					b = i + 1;
					a = j + 1;
				}
			}
		}
		 int left = 0, right = array.length - 1;
		    while (left < right) {
		        int v = array[left] + array[right];
		        if (v == target) {
		            a = left + 1;
		            b = right + 1;
		            break;
		        } else if (v > target) {
		            right --;
		        } else {
		            left ++;
		        }
		    }
		System.out.println("a: " + a + " b: " + b);
	}

	private static int[] constructRectangle(int area) {
		// TODO Auto-generated method stub
		int[] result = new int[2];
        if(area == 0){
            return result;
        }
        int a = (int)Math.sqrt(area);
        while(area%a != 0){
            a--;
        }
        int b = area/a;
        result[0] = b;
        result[1] = a;
        return result;
	}
}
