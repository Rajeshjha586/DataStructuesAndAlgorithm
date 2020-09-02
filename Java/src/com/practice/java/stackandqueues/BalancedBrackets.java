package com.practice.java.stackandqueues;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		scn.close();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ')' || ch == '}' || ch == ']') {
				if (st.peek() == '(' || st.peek() == '{' || st.peek() == '[') {
					System.out.println(false);
					return;
				} else {
					while (st.peek() == '(' || st.peek() == '{' || st.peek() == '[') {
						st.pop();
					}
					st.pop();
				}
			} else {
				st.push(ch);
			}
		}
		System.out.println(true);

	}

}
