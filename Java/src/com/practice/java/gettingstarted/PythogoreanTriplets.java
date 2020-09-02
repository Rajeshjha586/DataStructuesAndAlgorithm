package com.practice.java.gettingstarted;

import java.util.Scanner;

public class PythogoreanTriplets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		// Find out the biggest number
		int max = a;
		if (b >= max) {
			max = b;
		}
		if (c >= max) {
			max = c;
		}
		// Check for Pythogorean triplet ex (3,4,5)
		boolean flag;
		if (max == a) {
			flag = (a * a == (b * b + c * c));
		} else if (max == b) {
			flag = (b * b == (a * a + c * c));
		} else {
			flag = (c * c == (b * b + a * a));
		}
		System.out.println(flag);
		scn.close();

	}

}
