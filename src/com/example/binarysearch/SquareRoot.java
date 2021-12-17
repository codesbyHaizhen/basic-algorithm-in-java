package com.example.binarysearch;

public class SquareRoot {
	
	// make use of binary search algorithms to find out the squrare root of a number
	public int getSquareRoot(int number) {
			
		if (number < 0) {
			return -1;
		} else if (number == 0) {
			return 0;
		} else if (number == 1) {
			return 1;
		}
			
		int start = 1;
		int end = number;
			
		while (start <= end) {
				
			int mid = start + (end - start)/2;
			int temp = number / mid;
				
			if (temp == mid) {
				return mid;	
			} else if (temp < mid ) {
				end = mid - 1;
			} else if (temp > mid) {
				if ((number / (mid + 1)) < (mid + 1)) {
					return mid;
				} else {
				start = mid + 1;
				}
			} 
				
		}
			
		return -2;
	}
}
