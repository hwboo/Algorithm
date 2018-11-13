package beakjoon.chapter1;

import java.util.Scanner;

public class Quiz2739 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2739
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= 9; i++) {
			sb.append(num + " * " + i + " = " + (num * i)).append("\n");
		}
		System.out.print(sb);
	}

}
