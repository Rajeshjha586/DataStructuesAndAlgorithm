package com.practice.java.functionsandarrays;

import java.util.Scanner;

public class FirstIndexAndLstIndex {

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

		int firstIdx = getFirstIndex(a, l, h, d);
		int lastIdx = getLastIndex(a, l, h, d);
		System.out.print(firstIdx + "\n" + lastIdx);
		scn.close();
	}

	public static int getFirstIndex(int[] a, int l, int h, int d) {
		int firstIdx = -1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (d < a[m]) {
				h = m - 1;
			} else if (d > a[m]) {
				l = m + 1;
			} else {
				firstIdx = m;
				h = m - 1;
			}
		}
		return firstIdx;
	}

	public static int getLastIndex(int[] a, int l, int h, int d) {
		int lastIdx = -1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (d < a[m]) {
				h = m - 1;
			} else if (d > a[m]) {
				l = m + 1;
			} else {
				lastIdx = m;
				l = m + 1;
			}
		}
		return lastIdx;
	}

}
