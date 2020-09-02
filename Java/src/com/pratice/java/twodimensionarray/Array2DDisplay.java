package com.pratice.java.twodimensionarray;

import java.util.Scanner;

public class Array2DDisplay {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int[][] a = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				a[i][j] = scn.nextInt();
			}
		}

		for (int i = 0; i < x; i++) {
			for (int val : a[i]) {
				System.out.print(val + "\t");
			}
			System.out.println();
		}

		scn.close();
	}

}
