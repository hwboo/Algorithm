package beakjoon.chapter1;

import java.util.Scanner;

public class Quiz1924 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1924
		int[] endDays = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
		int[] offset = new int[12];
		for (int i = 0; i < 12; i++) {
			if (i == 0) {
				offset[i] = 0;
			} else {
				offset[i] = endDays[i] + offset[i - 1];
			}
		}
		String[] week = new String[] { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int temp = (offset[month - 1] + day) % 7;
		System.out.print(week[temp]);
	}
}
