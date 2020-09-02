package com.practice.java.functionsandarrays;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();

		@SuppressWarnings("unused")
		int nod = 0;
		int temp = n;
		while (temp != 0) {
			temp = temp / 10;
			nod++;
		}
		int count = 0;
		while (n != 0) {
			int r = n % 10;
			n = n / 10;
			nod--;
			if (r == d) {
				count++;
			}
		}
		System.out.print(count);
		scn.close();
	}

}
