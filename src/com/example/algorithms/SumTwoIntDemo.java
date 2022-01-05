package com.example.algorithms;

import java.util.Arrays;

public class SumTwoIntDemo {

	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6,8,9,10,34,45,56,67,68,69,74,99,109,120};
		int target = 48;
		
		System.out.println("the int array is: " + Arrays.toString(nums));
		
		int[] result = SumTwoInt.getIndexes(nums, target);
		System.out.println("The sum of two number in this array is " + target + ", the indexes of this two numbers are: " + Arrays.toString(result));
		
		int[] resultUseVersion2 = SumTwoIntVersion2.getIndexes(nums, target);
		System.out.println("The sum of two number in this array is " + target + ", the indexes of this two numbers are: " + Arrays.toString(resultUseVersion2));
	
	}

}
