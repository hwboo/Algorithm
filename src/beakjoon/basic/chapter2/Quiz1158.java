package beakjoon.basic.chapter2;

import java.util.LinkedList;
import java.util.Scanner;

public class Quiz1158 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1158
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		Queue queue = new Queue();

		for (int i = 1; i <= n; i++) {
			queue.push(i);
		}

		while (queue.getSize() != 0) {
			for (int i = 0; i < m - 1; i++) {
				int val = queue.pop();
				queue.push(val);
			}
			sb.append(queue.pop());
			if (queue.getSize() > 0) {
				sb.append(", ");
			}
		}
		sb.append(">");
		System.out.print(sb);
	}

	private static class Queue {
		private LinkedList<Integer> list = new LinkedList<Integer>();

		public void push(int val) {
			list.push(val);
		}

		public int pop() {
			return list.size() == 0 ? -1 : list.removeLast();
		}

		public int getSize() {
			return list.size();
		}

		public int isEmpty() {
			return list.size() == 0 ? 1 : 0;
		}

		public int getFront() {
			return list.size() == 0 ? -1 : list.getLast();
		}

		public int getBack() {
			return list.size() == 0 ? -1 : list.getFirst();
		}
	}
}
