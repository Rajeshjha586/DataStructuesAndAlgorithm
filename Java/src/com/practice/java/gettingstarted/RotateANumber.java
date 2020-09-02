package com.practice.java.gettingstarted;

import java.util.Scanner;

public class RotateANumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		// Calculate number of digits
		int temp = n;
		int nod = 0;
		while (temp != 0) {
			temp = temp / 10;
			nod++;
		}

		// If k is greater than nod
		k = k % nod;

		// If k is negative
		if (k < 0) {
			k = k + nod;
		}

		// Calculate divsor and multiplier
		int div = 1;
		int multi = 1;
		for (int i = 1; i <= nod; i++) {
			if (i <= k) {
				div *= 10;
			} else {
				multi *= 10;
			}
		}

		// Calculate rotated number
		int q = n / div;
		int r = n % div;
		int rotatedNumber = (r * multi) + q;
		System.out.println(rotatedNumber);

		scn.close();

	}

}
