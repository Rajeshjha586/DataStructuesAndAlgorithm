package com.practice.java.pattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sp = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			sp++;
			System.out.print("\n");
		}
		scn.close();
	}

}
