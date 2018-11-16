package beakjoon.basic.chapter1;

import java.util.Scanner;

public class Quiz2441 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2441
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		char[] stars = new char[num];
		StringBuffer res = new StringBuffer();
		for (int i = 0; i < num; i++) {
			stars[i] = '*';
		}
		for (int i = 0; i < num; i++) {
			res.append(stars).append("\n");
			stars[i] = ' ';
		}
		System.out.print(res);
	}
}
