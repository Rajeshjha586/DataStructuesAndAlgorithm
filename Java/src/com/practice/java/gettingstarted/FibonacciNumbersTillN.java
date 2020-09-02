package com.practice.java.gettingstarted;

import java.util.Scanner;

public class FibonacciNumbersTillN {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int first = 0;
		int second = 1;
		System.out.println(first + "\n" + second);
		for (int i = 1; i <= n - 2; i++) {
			int next = first + second;
			System.out.println(next);
			first = second;
			second = next;
		}
		scn.close();
	}

}
