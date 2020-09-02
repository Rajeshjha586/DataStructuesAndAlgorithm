package com.practice.java.pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sp = 2 * n - 3;
		int st = 1;
		int val = 1;
		for (int i = 1; i <= n; i++) {
			int val1 = val;
			for (int k = 1; k <= st; k++) {
				System.out.print(val1 + "\t");
				val1++;
			}
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			if (i == n) {
				st--;
				val1--;
			}
			for (int k = 1; k <= st; k++) {
				val1--;
				System.out.print(val1 + "\t");
			}
			sp -= 2;
			st++;
			System.out.println();
		}
		scn.close();
	}

}
