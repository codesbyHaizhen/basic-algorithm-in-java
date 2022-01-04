package com.example.algorithms;

import java.util.HashMap;

public class LengthOfLongestSubstring {
	
	public static void main(String[] args) {
		
		String str = "abvfghiaopbg";
		
		LengthOfLongestSubstring lols = new LengthOfLongestSubstring();
		int len = lols.getLengthOfLongestSubstring(str);
		
		System.out.println(len);
	}
	
	// leetcode 3: given a String, return the length of the longest substring without repeating character
	private int getLengthOfLongestSubstring (String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		int start = 0;
		int len = 0;
		int lengthOfStr = str.length();
		
		for (int i=0; i<lengthOfStr; i++) {
			char tempChar = str.charAt(i);
			
			if (map.containsKey(tempChar)) {
				start = Math.max(start, map.get(tempChar)+1);
			}
			
			map.put(tempChar, i);
			len = Math.max(len, i+1-start);
		}
		return len;
	}
}
