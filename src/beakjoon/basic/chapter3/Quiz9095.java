package beakjoon.basic.chapter3;

import java.util.Scanner;

public class Quiz9095 {
	private static int[] memo = null;

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/9095
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			int n = scanner.nextInt();
			memo = new int[n + 1];
			int val = getTopDown(n);
			System.out.println(val);
		}
	}

	private static int getTopDown(int n) {
		if (n <= 2) {
			return n;
		}
		if (n == 3) {
			return 4;
		}
		if (memo[n] > 0) {
			return memo[n];
		}
		memo[n] = getTopDown(n - 1) + getTopDown(n - 2) + getTopDown(n - 3);
		return memo[n];
	}
}
