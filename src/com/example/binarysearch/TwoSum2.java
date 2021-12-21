package com.example.binarysearch;

import java.util.Arrays;

public class TwoSum2 {

	public static void main(String[] args) {
		
		TwoSum2 twoSum2 = new TwoSum2();
		int[] nums = {1,3,5,6,8,9,10,34,45,56,67,68,69,74,99,109,120};
		int target = 62;
		
		int[] results = twoSum2.getTwoSum2(nums, target);
		
		System.out.println(Arrays.toString(results));
	}
	
	// use binary search algorithm to resolve the leetcode problem 1: twoSum
	public int[] getTwoSum2(int[] nums, int target) {
		
		int[] results = {0,0};
		for (int i=0; i<nums.length-1; i++) {
			int start = i + 1;
			int end = nums.length - 1;
			if (nums[i] + nums[end] < target) {
				continue;
			}
			
			while (start <= end) {
				int m = start + (end - start) / 2;
				
				if (nums[i] + nums[m] == target) {
					results[0] = i;
					results[1] = m;
					return results;
				} else if (nums[i] + nums[m] < target) {
					start = m + 1;
				} else {
					end = m - 1;
				}
			}
			
		}
		return results;
	}

}
