package com.practice.java.functionsandarrays;

import java.util.Scanner;

public class SpanOfArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int span = getSpan(arr);
		System.out.println(span);

		scn.close();
	}

	public static int getSpan(int arr[]) {
		int span;
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Maximum is " + max);
		System.out.println("Manimum is " + min);
		span = max - min;
		return span;
	}

}
