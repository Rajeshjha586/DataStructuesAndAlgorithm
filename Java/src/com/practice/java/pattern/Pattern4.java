package com.practice.java.pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int sp = 0;
		int st = n;
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*\t");
			}
			st--;
			sp++;
			System.out.print("\n");
		}
		scn.close();
	}

}
