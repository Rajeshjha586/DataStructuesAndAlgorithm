package com.practice.java.functionsandarrays;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();

		int count = 0;
		int newNumber = 0;
		while (n != 0) {
			int rem = n % b;
			newNumber += (rem * (int) Math.pow(10, count));
			n = n / b;
			count++;
		}

		System.out.println(newNumber);
		scn.close();
	}

}
