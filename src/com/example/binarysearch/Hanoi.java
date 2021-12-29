package com.example.binarysearch;

public class Hanoi {

	public static void main(String[] args) {
		
		hanoiMove(5,'A','B','C');

	}

	// use recursion to resolve hanoi problem
	private static void hanoiMove(int n, char start, char mid, char end) {
		
		if (n > 0) {
			hanoiMove(n-1, start, end, mid);
			System.out.println("Move disc " + n + " from " + start + " to " + end);
			hanoiMove(n-1, mid, start, end);
			}
	}
}
