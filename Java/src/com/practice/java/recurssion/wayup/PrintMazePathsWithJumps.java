package com.practice.java.recurssion.wayup;

import java.util.Scanner;

public class PrintMazePathsWithJumps {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		printMazePaths(1, 1, n, m, "");
		scn.close();
	}

	// sr - source row
	// sc - source column
	// dr - destination row
	// dc - destination column
	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}

		for (int ms = 1; ms <= dc - sc; ms++) {
			printMazePaths(sr, sc + ms, dr, dc, "h" + ms + psf);
		}
		for (int ms = 1; ms <= dr - sr; ms++) {
			printMazePaths(sr + ms, sc, dr, dc, "v" + ms + psf);
		}

		for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
			printMazePaths(sr + ms, sc + ms, dr, dc, "d" + ms + psf);
		}
	}

}
