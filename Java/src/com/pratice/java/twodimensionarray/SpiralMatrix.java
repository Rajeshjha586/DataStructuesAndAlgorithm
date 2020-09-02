package com.pratice.java.twodimensionarray;

import java.util.Scanner;

public class SpiralMatrix {

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

		int minr = 0;
		int minc = 0;
		int maxr = r - 1;
		int maxc = c - 1;

		int noe = r * c;
		int count = 0;
		while (count < noe) {
			// Left wall
			for (int i = minr, j = minc; i <= maxr && count < noe; i++) {
				System.out.print(a[i][j] + " ");
				count++;
			}
			minc++;

			// Bottom wall
			for (int i = maxr, j = minc; j <= maxc && count < noe; j++) {
				System.out.print(a[i][j] + " ");
				count++;
			}
			maxr--;

			// Right wall
			for (int i = maxr, j = maxc; i >= minr && count < noe; i--) {
				System.out.print(a[i][j] + " ");
				count++;
			}
			maxc--;

			// Top wall
			for (int i = minr, j = maxc; j >= minc && count < noe; j--) {
				System.out.print(a[i][j] + " ");
				count++;
			}
			minr++;

			scn.close();
		}

	}

}
