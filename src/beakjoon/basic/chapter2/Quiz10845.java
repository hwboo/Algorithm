package beakjoon.basic.chapter2;

import java.util.LinkedList;
import java.util.Scanner;

public class Quiz10845 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		Queue queue = new Queue();
		for (int i = 0; i < num; i++) {
			String[] command = scanner.nextLine().split(" ");
			switch (command[0]) {
			case "push":
				queue.push(command[1]);
				break;
			case "pop":
				System.out.println(queue.pop());
				break;
			case "size":
				System.out.println(queue.getSize());
				break;
			case "empty":
				System.out.println(queue.isEmpty());
				break;
			case "front":
				System.out.println(queue.getFront());
				break;
			case "back":
				System.out.println(queue.getBack());
				break;
			default:
				break;
			}
		}
	}

	private static class Queue {
		private LinkedList<Integer> list = new LinkedList<Integer>();

		public void push(String val) {
			list.push(Integer.valueOf(val));
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
//			return list.size() == 0 ? -1 : list.getFirst();
			return list.size() == 0 ? -1 : list.getLast();
		}

		public int getBack() {
//			return list.size() == 0 ? -1 : list.getLast();
			return list.size() == 0 ? -1 : list.getFirst();
		}
	}
}
