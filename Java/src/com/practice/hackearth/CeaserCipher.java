package com.practice.hackearth;

import java.util.Scanner;

public class CeaserCipher {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.next());
		String[] orgStr = new String[n];
		String[] encStr = new String[n];
		for (int i = 0; i < n; i++) {
			String org = scn.next();
			orgStr[i] = org;
			String enc = scn.next();
			encStr[i] = enc;
		}
		scn.close();

		// Iterate for each test case
		for (int j = 0; j < n; j++) {

			String org = orgStr[j]; // ABC
			String enc = encStr[j]; // DEF
			// Shift for first character
			int offset = (enc.charAt(0) - org.charAt(0)) % 26;
			// iterate over rest of string
			for (int k = 1; k < org.length(); k++) {

				char o = org.charAt(k);
				char e = enc.charAt(k);
				if ((e - o) % 26 != offset) {
					offset = -1;
					break;
				}
			}
			if (offset < 0) {
				offset += 26;
			}
			System.out.println(offset);
		}

	}

}
