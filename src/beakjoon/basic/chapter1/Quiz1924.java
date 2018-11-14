package beakjoon.basic.chapter1;

import java.util.Scanner;

public class Quiz1924 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1924
		String[] week = new String[] { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int[] lastDays = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt() - 1;
		int day = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i < month; i++) {
			sum += lastDays[i];
		}
		sum += day;
		
		System.out.print(week[sum % 7]);
	}
}
