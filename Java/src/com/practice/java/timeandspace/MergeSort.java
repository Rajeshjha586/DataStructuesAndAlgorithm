package com.practice.java.timeandspace;

import java.util.Scanner;

public class MergeSort {

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] bres = new int[1];
			bres[0] = arr[lo];
			return bres;
		}

		int mid = (lo + hi) / 2;
		int[] lpart = mergeSort(arr, lo, mid);
		int[] rpart = mergeSort(arr, mid + 1, hi);
		int[] fsa = mergeTwoSortedArrays(lpart, rpart);
		return fsa;
	}

	public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
		int[] fsa = new int[a.length + b.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				fsa[k] = a[i];
				k++;
				i++;
			} else {
				fsa[k] = b[j];
				k++;
				j++;
			}
		}

		while (i < a.length) {
			fsa[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			fsa[k] = b[j];
			k++;
			j++;
		}
		return fsa;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		int m = scn.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = scn.nextInt();
		}
		int[] mergedArray = mergeTwoSortedArrays(a, b);
		print(mergedArray);
		scn.close();
	}

}
