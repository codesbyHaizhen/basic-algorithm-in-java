package com.example.algorithms;

public class Hanoi {

	// use recursion to resolve hanoi problem
	static void hanoiMove(int num, char start, char mid, char end) {
		
		if (num > 0) {
			hanoiMove(num-1, start, end, mid);
			System.out.println("Move disc " + num + " from " + start + " to " + end);
			hanoiMove(num-1, mid, start, end);
			}
	}
}
