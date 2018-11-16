package beakjoon.basic.chapter2;

import java.util.Scanner;

public class Quiz9012 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/9012
		
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		StringBuffer res = new StringBuffer();
		for (int i = 0; i < num; i++) {
			char[] line = scanner.nextLine().toCharArray();
			int cnt = 0;
			for (int j = 0; j < line.length; j++) {
				if (line[j] == '(') {
					cnt++;
				} else {
					cnt--;
				}
				if (cnt < 0)
					break;
			}
			res.append(cnt == 0 ? "YES" : "NO");
			if (i != num - 1) {
				res.append("\n");
			}
		}
		System.out.println(res);
	}
}
