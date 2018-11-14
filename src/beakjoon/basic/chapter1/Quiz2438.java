package beakjoon.basic.chapter1;

import java.util.Scanner;

public class Quiz2438 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2438
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		StringBuffer stars = new StringBuffer();
		StringBuffer res = new StringBuffer();
		
		for (int i = 0; i < num; i++) {
			stars.append("*");
			res.append(stars).append("\n");
		}
		 System.out.println(res);
	}
}
