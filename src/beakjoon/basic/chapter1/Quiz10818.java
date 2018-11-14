package beakjoon.basic.chapter1;

import java.util.Scanner;

public class Quiz10818 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10818
		
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int min = scanner.nextInt();
		int max = min;
		for (int i = 1; i < total; i++) {
			int input = scanner.nextInt();
			if (input < min) {
				min = input;
			} else if (input > max) {
				max = input;
			}
		}
		System.out.print(min + " " + max);
	}
}
