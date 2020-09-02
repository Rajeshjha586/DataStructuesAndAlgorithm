package com.practice.java.recurssion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int f = factorial(n);
		System.out.println(f);
		scn.close();
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		int fact = n * factorial(n - 1);
		return fact;
	}

}