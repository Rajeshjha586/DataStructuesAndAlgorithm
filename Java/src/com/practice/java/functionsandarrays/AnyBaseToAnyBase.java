package com.practice.java.functionsandarrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b1 = scn.nextInt();
		int b2 = scn.nextInt();

		int count = 0;
		int newNumber = 0;
		while (n != 0) {
			int rem = n % b2;
			newNumber += (rem * (int) Math.pow(b1, count));
			n = n / b2;
			count++;
		}

		System.out.println(newNumber);
		scn.close();
	}

}
