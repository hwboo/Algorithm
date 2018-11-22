package beakjoon.basic.chapter2;

import java.util.Scanner;

public class Quiz9012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean isFirst = true;
		while (num >= 0) {
			String line = scanner.nextLine();
			if (isFirst) {
				isFirst = false;
			} else {
				int cnt = line.split("\\(").length - 1;
				if (cnt * 2 == line.length()) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
			num--;
		}
	}
}
