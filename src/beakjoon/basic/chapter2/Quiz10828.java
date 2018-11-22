package beakjoon.basic.chapter2;

import java.util.Scanner;

public class Quiz10828 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10828
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Stack stack = new Stack(num);

		while (num >= 0) {
			String[] command = scanner.nextLine().split(" ");
			switch (command[0]) {
			case "push":
				stack.push(Integer.parseInt(command[1]));
				break;
			case "pop":
				System.out.println(stack.pop());
				break;
			case "size":
				System.out.println(stack.getSize());
				break;
			case "empty":
				System.out.println(stack.isEmpty());
				break;
			case "top":
				System.out.println(stack.getTop());
				break;
			default:
				break;
			}
			num--;
		}
	}

	private static class Stack {
		private int[] values = null;
		private int size = 0;

		public Stack(int max) {
			values = new int[max];
		}

		public void push(int val) {
			values[size] = val;
			size++;
		}

		public int pop() {
			int val = getTop();
			if (val != -1) {
				size--;
			}
			return val;
		}

		public int getSize() {
			return size;
		}

		public int isEmpty() {
			return size == 0 ? 1 : 0;
		}

		public int getTop() {
			if (isEmpty() == 1) {
				return -1;
			}
			return values[size - 1];
		}
	}
}
