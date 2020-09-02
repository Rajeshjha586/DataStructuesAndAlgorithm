package com.practice.java.recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<String> paths = getPaths(n);
		System.out.println(paths);
		scn.close();
	}

	public static ArrayList<String> getPaths(int n) {

		if (n == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		} else if (n < 0) {
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}

		ArrayList<String> paths1 = getPaths(n - 1); // getPaths(2) [ 111, 1 2]
		ArrayList<String> paths2 = getPaths(n - 2); // getPaths(1) [ 21 ]
		ArrayList<String> paths3 = getPaths(n - 3); // [3]
		ArrayList<String> paths = new ArrayList<>();
		
		for (String val : paths1) {
			paths.add(1 + val);
		}
		for (String val : paths2) {
			paths.add(2 + val);

		}
		for (String val : paths3) {
			paths.add(3 + val);

		}
		return paths;
	}

}
