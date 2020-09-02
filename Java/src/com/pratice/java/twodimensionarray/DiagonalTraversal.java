package com.pratice.java.twodimensionarray;

import java.util.Scanner;

public class DiagonalTraversal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scn.nextInt();
			}
		}

		for (int g = 0; g < a.length; g++) {
			for (int i = 0; i < a.length; i++) {
				for (int j = g; j < a[0].length; j++) {
					System.out.print(a[i][j] + "\t");
				}
			}
		}

		scn.close();
	}

}
