package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class P_496 {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,4,5,8,12};
		int[] nums2 = {2,5,6,7,8,9,10,11,12};
		nextgreaterelement(nums1, nums2);
		commonelements(nums1, nums2);
	}

	private static void commonelements(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		//Running Time N^2
		for(int i=0; i<nums1.length; i++){
			for(int j=0; j<nums2.length; j++){
				if(nums1[i] == nums2[j])
					list.add(nums1[i]);
			}
		}
		System.out.println(list);
		/***************
		 * 1234
		 * 25678
		 * ***********************/
		int a = 0, b = 0, counter = 0;;
		int max = (nums1.length > nums2.length) ? nums1.length : nums2.length;
		while(counter < max){
			if(nums1[a] == nums2[b]){
				list.add(nums1[a]);
				a++;
				b++;
			}else if(nums1[a] > nums2[b]){
				b++;
			}else if(nums1[b] > nums2[a]){
				a++;
			}
			counter++;
		}
		System.out.println(list);
		
		
	}

	private static void nextgreaterelement(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		int[] array = new int[nums1.length];
		int counter = 0;
		for(int i=0; i<nums1.length; i++){
			for(int j=0; j<nums2.length; j++){
				if(nums1[i] == nums2[j] && j != nums2.length - 1){
					if(nums2[j + 1] > nums1[i]){
						array[counter] = nums2[j+1];
						counter++;
					}else{
						array[counter] = -1;
						counter++;
					}
				}
				else if(nums1[i] == nums2[j]){
					array[counter] = -1;
					counter++;
				}
			}
		}
		
		for(int k=0; k<array.length; k++){
			System.out.println(array[k]);
		}
	}
}
