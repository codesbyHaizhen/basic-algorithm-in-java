package com.example.algorithms;

public class SumTwoIntVersion2 {

	// use two points algorithm to resolve the leetcode problem 1: twoSum 
	static int[] getIndexes(int[] nums, int target) {
		
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
