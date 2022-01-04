package com.example.algorithms;

public class Hanoi {

	// use recursion to resolve hanoi problem
	static void hanoiMove(int n, char start, char mid, char end) {
		
		if (n > 0) {
			hanoiMove(n-1, start, end, mid);
			System.out.println("Move disc " + n + " from " + start + " to " + end);
			hanoiMove(n-1, mid, start, end);
			}
	}
}
