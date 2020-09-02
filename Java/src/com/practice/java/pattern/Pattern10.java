package com.practice.java.pattern;

import java.util.Scanner;

/***
 * 
 * Print Hollow Diamond
 * 
 * @author parpatid
 *
 */
public class Pattern10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int os = n / 2; // Outer Space
		int is = -1; // Inner Space
		for (int i = 1; i <= n; i++) {
			/* Print outer space */
			for (int j = 1; j <= os; j++) {
				System.out.print("\t");
			}
			/* Print Start */
			System.out.print("*\t");
			/* Print Inner Space */
			for (int j = 1; j <= is; j++) {
				System.out.print("\t");
			}

			if (i > 1 && i < n) {
				System.out.print("*\t");
			}

			/* Till n/2 outer spaces are decreasing and inner spaces are increasing */
			if (i <= n / 2) {
				os--;
				is += 2;
			} else {
				os++;
				is -= 2;
			}
			System.out.print("\n");
		}
		scn.close();
	}

}
