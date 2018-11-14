package beakjoon.basic.chapter1;

import java.util.Scanner;

public class Quiz8393 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/8393
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.print(num * (num + 1) / 2);
	}
}
