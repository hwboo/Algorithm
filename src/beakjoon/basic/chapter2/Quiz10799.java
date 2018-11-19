package beakjoon.basic.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class Quiz10799 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/10799
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int num = Integer.parseInt(br.readLine());
		Stack<Character> leftStack = new Stack<Character>();
		Stack<Character> rightStack = new Stack<Character>();
		// 초기값 설정
		for (int i = 0; i < str.length; i++) {
			leftStack.push(str[i]);
		}

		// 명령 수행
		for (int i = 0; i < num; i++) {
			String line = br.readLine();
			char command = line.charAt(0);
			if (command == 'L') { // 커서 왼쪽 이동
				if (!leftStack.empty()) {
					rightStack.push(leftStack.pop());
				}
			} else if (command == 'D') { // 커서 오른쪽 이동
				if (!rightStack.empty()) {
					leftStack.push(rightStack.pop());
				}
			} else if (command == 'B') { // 삭제
				if (!leftStack.empty()) {
					leftStack.pop();
				}
			} else if (command == 'P') { // 추가
				leftStack.push(line.charAt(2));
			}
		}
		int leftSize = leftStack.size();
		for (int i = 0; i < leftSize; i++) {
			rightStack.push(leftStack.pop());
		}
		StringBuffer sb = new StringBuffer();
		int rightSize = rightStack.size();
		for (int i = 0; i < rightSize; i++) {
			sb.append(rightStack.pop());
		}
		System.out.print(sb);
		br.close();
	}

	private void test() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Character> list = new LinkedList<Character>();
		char[] str = br.readLine().toCharArray();
		int cursor = str.length;
		int num = Integer.parseInt(br.readLine());
		// 초기값 설정
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}

		// 명령 수행
		for (int i = 0; i < num; i++) {
			String line = br.readLine();
			char command = line.charAt(0);
			if (command == 'L') { // 커서 왼쪽 이동
				cursor = cursor == 0 ? 0 : cursor - 1;
			} else if (command == 'D') { // 커서 오른쪽 이동
				cursor = cursor == list.size() ? cursor : cursor + 1;
			} else if (command == 'B') { // 삭제
				if (cursor > 0) {
					list.remove(cursor - 1);
					cursor = cursor == 0 ? 0 : cursor - 1;
				}
			} else if (command == 'P') { // 추가
				list.add(cursor, line.charAt(2));
				cursor++;
			}
		}
		StringBuilder sb = new StringBuilder();
		int size = list.size();
		for (int i = 0; i < size; i++) {
			sb.append(list.pop());
		}
		System.out.print(sb);
		br.close();
	}
}
