package com.pratice.java.twodimensionarray;

import java.util.Scanner;

public class ShellRotate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] a = new int[r][c];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = scn.nextInt();
			}
		}

		int s = scn.nextInt();
		int rt = scn.nextInt();

		rotate(a, s, rt);
		display(a);
		scn.close();
	}

	private static void rotate(int[][] a, int s, int rt) {

		int[] oned = fillOnedShell(a, s);
		rotateOnedArray(oned, rt);
		fillShellWithOned(a, s, oned);
	}

	private static void rotateOnedArray(int[] oned, int rt) {

		rt = rt % oned.length;
		if (rt < 0) {
			rt += oned.length;
		}

		reverse(oned, 0, oned.length - rt - 1);
		reverse(oned, oned.length - rt, oned.length - 1);
		reverse(oned, 0, oned.length - 1);
	}

	private static void reverse(int[] oned, int i, int j) {
		int left = i;
		int right = j;
		while (left < right) {
			int temp = oned[left];
			oned[left] = oned[right];
			oned[right] = temp;
			left++;
			right--;
		}
	}

	private static void fillShellWithOned(int[][] a, int s, int[] oned) {
		int minr = s - 1;
		int minc = s - 1;
		int maxr = a.length - s;
		int maxc = a[0].length - s;
		int index = 0;

		// Left wall
		for (int i = minr, j = minc; i <= maxr; i++) {
			a[i][j] = oned[index];
			index++;
		}

		// Bottom wall
		for (int i = maxr, j = minc + 1; j <= maxc; j++) {
			a[i][j] = oned[index];
			index++;
		}

		// Right wall
		for (int i = maxr - 1, j = maxc; i >= minr; i--) {
			a[i][j] = oned[index];
			index++;
		}

		// Top wall
		for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
			a[i][j] = oned[index];
			index++;
		}
	}

	private static int[] fillOnedShell(int[][] a, int s) {
		int minr = s - 1;
		int minc = s - 1;
		int maxr = a.length - s;
		int maxc = a[0].length - s;

		int size = 2 * ((maxr - minr) + (maxc - minc));
		int oned[] = new int[size];
		int index = 0;

		// Left wall
		for (int i = minr, j = minc; i <= maxr; i++) {
			oned[index] = a[i][j];
			index++;
		}

		// Bottom wall
		for (int i = maxr, j = minc + 1; j <= maxc; j++) {
			oned[index] = a[i][j];
			index++;
		}

		// Right wall
		for (int i = maxr - 1, j = maxc; i >= minr; i--) {
			oned[index] = a[i][j];
			index++;
		}

		// Top wall
		for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
			oned[index] = a[i][j];
			index++;
		}

		return oned;
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
