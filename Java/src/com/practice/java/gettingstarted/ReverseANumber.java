package com.practice.java.gettingstarted;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int firstDigit = 1;
		if (n < 0) {
			firstDigit = -1;
			n = n * firstDigit;
		}
		int temp = n;
		int nod = 0;
		while (temp != 0) {
			temp = temp / 10;
			nod++;
		}

		int reversedInteger = 0;
		int pow = nod;
		while (n > 0) {
			int dig = n % 10;
			/* Method 1 : Using Math Function with Number of digits */
			reversedInteger += dig * (int) Math.pow(10, pow - 1);

			/* Method 2: Using Alternate approach */
			reversedInteger = reversedInteger * 10 + dig;
			n = n / 10;
			pow--;
			// System.out.print(dig);
		}

		System.out.println(reversedInteger * firstDigit);
		scn.close();

	}

}
