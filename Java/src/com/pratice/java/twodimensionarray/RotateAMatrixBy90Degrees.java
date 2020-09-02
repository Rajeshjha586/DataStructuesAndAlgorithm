package com.pratice.java.twodimensionarray;

import java.util.Scanner;

public class RotateAMatrixBy90Degrees {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = scn.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a[0].length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

		for (int i = 0; i < a.length; i++) {
			int left = 0;
			int right = a[i].length - 1;

			while (left < right) {
				int temp = a[i][left];
				a[i][left] = a[i][right];
				a[i][right] = temp;
				
				left++;
				right--;
			}
		}

		display(a);
		scn.close();
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
