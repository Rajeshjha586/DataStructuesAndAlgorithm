package com.practice.java.functionsandarrays;

import java.util.Scanner;

public class CeilAndFloor {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		int d = scn.nextInt();
		int l = 0;
		int h = a.length - 1;

		int ceil = 0;
		int floor = 0;
		while (l <= h) {
			int m = (l + h) / 2;

			if (d < a[m]) {
				ceil = a[m];
				h = m - 1;
			} else if (d > a[m]) {
				floor = a[m];
				l = m + 1;
			} else {
				break;
			}
		}
		System.out.print(ceil + "\n" + floor);
		scn.close();
	}

}
