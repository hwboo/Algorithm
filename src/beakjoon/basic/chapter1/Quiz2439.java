package beakjoon.basic.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2439 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2439
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		char[] stars = new char[num];
		StringBuffer res = new StringBuffer();
		 for (int i = 0; i < num; i++) {
			stars[i] = ' ';
		}
		for (int i = 0; i < num; i++) {
			stars[num - i - 1] = '*';
			res.append(stars).append('\n');
		}
		System.out.print(res);
	}
}
