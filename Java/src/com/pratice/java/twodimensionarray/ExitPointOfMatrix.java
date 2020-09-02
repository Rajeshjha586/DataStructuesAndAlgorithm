package com.pratice.java.twodimensionarray;

import java.util.Scanner;

public class ExitPointOfMatrix {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] a = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = scn.nextInt();
			}
		}

		int i = 0;
		int j = 0;
		int dir = 0;

		while (true) {

			dir = (dir + a[i][j]) % 4;

			if (dir == 0) {
				j++;
			} else if (dir == 1) {
				i++;
			} else if (dir == 2) {
				j--;
			} else if (dir == 3) {
				i--;
			}

			if (i < 0) {
				i++;
				break;
			} else if (j < 0) {
				j++;
				break;
			} else if (i == a.length) {
				i--;
				break;
			} else if (j == a[0].length) {
				j--;
				break;
			}
		}
		scn.close();
		System.out.println(i + "\n" + j);

	}
}
