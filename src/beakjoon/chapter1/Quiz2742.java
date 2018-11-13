package beakjoon.chapter1;

import java.util.Scanner;

public class Quiz2742 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2742
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = num; i > 0; i--) {
			sb.append(i).append("\n");
//			System.out.println(i);
		}
		System.out.println(sb);
	}
}
