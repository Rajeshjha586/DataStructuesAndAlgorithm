package com.practice.java.functionsandarrays;

import java.util.Scanner;

public class MultiplicationOfNumberOfBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int subtraction = 0;
		int c = 0;
		int p = 1;
		while (n1 > 0 || n2 > 0 || c > 0) {

			int d1 = n1 % 10;
			n1 = n1 / 10;
			int d2 = n2 % 10;
			n2 = n2 / 10;

			d2 = d2 + c;

			int d = 0;
			if (d2 < d1) {
				c = -1;
				d = (b + d2) - d1;
			} else {
				c = 0;
				d = d2 - d1;
			}

			subtraction += d * p;
			p *= 10;
		}

		System.out.println(subtraction);
		scn.close();
	}

}
