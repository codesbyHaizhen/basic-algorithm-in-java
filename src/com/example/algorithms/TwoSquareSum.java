package com.example.algorithms;

public class TwoSquareSum {
	public static void main(String[] args) {
		
		boolean judge = new TwoSquareSum().judgeSquareSum(65);
		System.out.println(judge);

	}
	
	// use two points algorithm to resolve the leetcode problem 633: 
	// given a non-negative integer, decide whether there're two integers a and b such that a2 + b2 = c 
	private boolean judgeSquareSum(int target) {
		
		if (target <= 0) {
			return false;
		}
		
		int start = 0;
		int end = (int) Math.sqrt(target);
		
		while (start <= end) {
			int sum = start * start + end * end;
			if (sum == target) {
				System.out.println("the two integers are: " + start + " and " + end);
				return true;
			} else if (sum < target) {
				start ++;
			} else {
				end --;
			}
		}
		return false;
	}
}
