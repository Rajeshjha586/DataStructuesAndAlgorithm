package com.practice.java.gettingstarted;

import java.util.Scanner;

public class InverseANumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 0;
		int inverse = 0;
		while (n > 0) {
			int dig = n % 10;
			n = n / 10;
			count++;
			inverse += (count * ((int) Math.pow(10, (dig - 1))));
		}
		System.out.println(inverse);
		scn.close();

	}

}
