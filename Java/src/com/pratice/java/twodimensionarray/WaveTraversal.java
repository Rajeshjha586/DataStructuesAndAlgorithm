package com.pratice.java.twodimensionarray;

import java.util.Scanner;

public class WaveTraversal {

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

		for (int i = 0; i < c; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < r; j++) {
					System.out.print(a[j][i] + "\t");
				}
			}
			if (i % 2 != 0) {
				for (int j = r - 1; j >= 0; j--) {
					System.out.print(a[j][i] + "\t");
				}
			}
		}

		scn.close();
	}

}
