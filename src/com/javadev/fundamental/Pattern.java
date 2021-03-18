package com.javadev.fundamental;

import java.util.Scanner;

public class Pattern {

	static void printPascal(int n) {

		for (int line = 0; line < n; line++) {
			
			for (int i = 0; i <= line; i++) {
				System.out.print(print(line, i) + " ");
			}
			System.out.println();
		}
	}

	static int print(int n, int k) {
		int res = 1;

		if (k > n - k)
			k = n - k;

		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

	public static void main(String args[]) {
		System.out.println("Enter no of rows ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		int n = Integer.parseInt(input);
		printPascal(n);
	}
}
