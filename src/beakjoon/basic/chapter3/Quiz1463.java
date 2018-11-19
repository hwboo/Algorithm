package beakjoon.basic.chapter3;

import java.util.Scanner;

public class Quiz1463 {
	private static int[] memo = null;

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1463
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		memo = new int[n + 1];
		int val = getTopDown(n);
		System.out.print(val);
	}

	private static int getDownUp(int n) {
		return 0;
	}

	private static int getTopDown(int n) {
		if (n == 1) {
			return 0;
		}
		if (memo[n] > 0) {
			return memo[n];
		}
		memo[n] = getTopDown(n - 1) + 1;
		if (n % 2 == 0) {
			int temp = getTopDown(n / 2) + 1;
			if (temp < memo[n]) {
				memo[n] = temp;
			}
		}
		if (n % 3 == 0) {
			int temp = getTopDown(n / 3) + 1;
			if (temp < memo[n]) {
				memo[n] = temp;
			}
		}
		return memo[n];
	}
}
