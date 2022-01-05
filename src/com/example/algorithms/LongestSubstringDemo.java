package com.example.algorithms;

public class LongestSubstringDemo {
	public static void main(String[] args) {
		
		String str = "abvfghiaopbg";
		
		int len = LongestSubstring.getLengthOfLongestSubstring(str);
		
		System.out.println("the length of the longest substring without repeating character of string \"" + str + "\" is: " + len);
	}
	
}
