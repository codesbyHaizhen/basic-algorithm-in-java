package com.example.algorithms;

import java.util.Arrays;

public class TwoSum2 {

	public static void main(String[] args) {
		
		TwoSum2 twoSum2 = new TwoSum2();
		int[] nums = {1,3,5,6,8,9,10,34,45,56,67,68,69,74,99,109,120};
		int target = 62;
		
		int[] results = twoSum2.getTwoSum2(nums, target);
		
		System.out.println(Arrays.toString(results));
	}
	
	// use two points algorithm to resolve the leetcode problem 1: twoSum 
	public int[] getTwoSum2(int[] nums, int target) {
		
		int start = 0;
		int end = nums.length - 1;
		
		while (start < end) {
			int sum = nums[start] + nums[end];
			if (sum == target) {
				return new int[] {start, end};
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}
		}
		return null;
	}

}
