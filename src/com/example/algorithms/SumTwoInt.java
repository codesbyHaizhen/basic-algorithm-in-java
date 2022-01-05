package com.example.algorithms;

import java.util.Map;
import java.util.HashMap;

public class SumTwoInt {
	
	// to solve the leetcode problem 1 (twoSum): with HashMap
	static int[] getIndexes(int[] nums, int target) {
		
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

}
