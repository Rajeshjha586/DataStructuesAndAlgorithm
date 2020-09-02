package com.practice.java.gettingstarted;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int div = 2; div * div <= n; div++) {
			while (n % div == 0) {
				n = n / div;
				System.out.print(div + " ");
			}
		}
		//Special cases such as 46  
		if (n != 1) {
			System.out.print(n);
		}
		scn.close();
	}

}
