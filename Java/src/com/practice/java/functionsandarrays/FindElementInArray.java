package com.practice.java.functionsandarrays;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int d = scn.nextInt();

		int index = getIndex(arr, d);
		System.out.println(index);

		scn.close();
	}

	public static int getIndex(int arr[], int d) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (d == arr[i]) {
				index = i;
				break;
			} else {
				index = -1;
			}
		}
		return index;
	}

}
