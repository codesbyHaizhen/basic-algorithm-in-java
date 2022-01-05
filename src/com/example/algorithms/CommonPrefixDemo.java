package com.example.algorithms;

import java.util.Arrays;

public class CommonPrefixDemo {

	public static void main(String[] args) {
		String[] strs = {"abcd","abcgmh", "abctee","abcgeti","abghi","age"};
		
		String result = CommonPrefix.getLongestCommonPrefix(strs);
		
		System.out.println("the String array is: " + Arrays.toString(strs));
		System.out.println("the longest common prefix of the strings in this string array is: " + result);

	}

}
