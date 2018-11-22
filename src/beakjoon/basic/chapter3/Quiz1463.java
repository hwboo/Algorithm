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
	
	private static int getDownUp(int n) {
		memo[0] = 1;
		memo[1] = 1;
		for (int i = 2; i <= n; i++) {
			memo[i] = memo[i - 1] + 1;
			if (i % 2 == 0 && memo[i] > memo[i / 2] + 1) {
				memo[i] = memo[i / 2] + 1;
			}
			if (i % 3 == 0 && memo[i] > memo[i / 3] + 1) {
				memo[i] = memo[i / 3] + 1;
			}
		}
		return memo[n];
	}
}
