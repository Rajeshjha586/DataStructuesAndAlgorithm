package com.practice.java.functionsandarrays;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int max = getMax(arr);
		for (int floor = max; floor >= 1; floor--) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= floor) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		scn.close();
	}

	public static int getMax(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
