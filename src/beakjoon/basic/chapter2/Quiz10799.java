package beakjoon.basic.chapter2;

import java.util.Scanner;
import java.util.Stack;

public class Quiz10799 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] line = scanner.nextLine().toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		int cnt = 0;
		for (int i = 0; i < line.length; i++) {
			char c = line[i];
			if (c == '(') {
				stack.push(i);
			} else if (c == ')') {
				int gap = i - stack.pop();
				if(gap == 1) {
					cnt += stack.size();
				} else if(gap > 1) {
					cnt += 1;
				}
			}
		}
		System.out.print(cnt);
	}
}
