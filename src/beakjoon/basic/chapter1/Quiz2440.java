package beakjoon.basic.chapter1;

import java.util.Scanner;

public class Quiz2440 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2440
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		StringBuffer stars = new StringBuffer();
		StringBuffer res = new StringBuffer();
		for (int i = 0; i < num; i++) {
			stars.append('*');
			res.insert(0, "\n").insert(0, stars);
		}
		System.out.print(res);
	}
}
