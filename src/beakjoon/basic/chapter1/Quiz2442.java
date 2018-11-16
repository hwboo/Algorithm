package beakjoon.basic.chapter1;

import java.util.Scanner;

public class Quiz2442 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		char[] leftStars = new char[num - 1];
		for(int i = 0; i < leftStars.length; i++) {
			leftStars[i] = ' ';
		}
		StringBuffer rightStars = new StringBuffer();
		StringBuffer res = new StringBuffer();
		res.append(leftStars).append('*').append(rightStars).append("\n");
		for (int i = 0; i < num - 1; i++) {
			leftStars[num - 2 - i] = '*';
			rightStars.append('*');
			res.append(leftStars).append('*').append(rightStars).append("\n");
		}
		System.out.print(res);
	}
}
