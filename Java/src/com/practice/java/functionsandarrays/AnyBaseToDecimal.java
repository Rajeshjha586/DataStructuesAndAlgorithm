package com.practice.java.functionsandarrays;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();

		int count = 0;
		int newNumber = 0;
		while (n != 0) {
			int rem = n % 10;
			newNumber += (rem * (int) Math.pow(b, count));
			n = n / 10;
			count++;
		}

		System.out.println(newNumber);
		scn.close();
	}

}
