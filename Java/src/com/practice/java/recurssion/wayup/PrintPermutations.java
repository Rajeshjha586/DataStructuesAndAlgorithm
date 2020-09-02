package com.practice.java.recurssion.wayup;

import java.util.Scanner;

public class PrintPermutations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		printPermutations(str, "");
		scn.close();
	}

	private static void printPermutations(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String lpart = ques.substring(0, i);
			String rpart = ques.substring(i + 1);
			String roq = lpart + rpart;
			printPermutations(roq, ans + ch);
		}
	}

}
