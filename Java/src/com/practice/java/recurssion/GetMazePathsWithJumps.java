package com.practice.java.recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJumps {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		ArrayList<String> paths = getMazePaths(1, 1, n, m);
		System.out.println(paths);
		scn.close();
	}

	// sr - source row
	// sc - source column
	// dr - destination row
	// dc - destination column
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

		if (sr == dr && sc == dc) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}

		ArrayList<String> paths = new ArrayList<>();

		for (int ms = 1; ms <= dc - sc; ms++) {
			ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);
			for (String hval : hpaths) {
				paths.add("h" + ms + hval);
			}
		}
		for (int ms = 1; ms <= dr - sr; ms++) {
			ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);
			for (String vval : vpaths) {
				paths.add("v" + ms + vval);
			}
		}

		for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
			ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);
			for (String dval : dpaths) {
				paths.add("d" + ms + dval);
			}
		}
		return paths;
	}

}
