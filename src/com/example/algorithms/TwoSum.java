package com.example.algorithms;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
	
	// to solve the leetcode problem 1: with HashMap
	public int[] getTwoSum(int[] nums, int target) {
		
		Map<Integer,Integer> map = new HashMap<>();
		int[] results = new int[2];
		
		for (int i=0; i<nums.length; i++) {
			
			if (map.containsKey(nums[i])) {
				results[0] = map.get(nums[i]);
				results[1] = i;
				return results;
			}
			
			map.put(target-nums[i], i);
		}
		
		return results;
		
	}
	
	public static void main(String... args) {
		
		TwoSum twoSum = new TwoSum();
		int[] nums = {1,3,5,6,8,9,10,34,45,56,67,68,69,74,99,109,120};
		int target = 48;
		
		int[] results = twoSum.getTwoSum(nums, target);
		System.out.println(Arrays.toString(results));
	}

}
