package beakjoon.basic.chapter3;

public class Quiz11052 {
	private static int[] price = new int[] { 0, 1, 5, 6, 7 };
	private static int[] memo = new int[4 + 1];

	public static void main(String[] args) {
		System.out.print(getTopDown(4));
	}

	private static int getTopDown(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return price[0];
		}
		if (memo[n] > 0) {
			return memo[n];
		}
		memo[n] = 0;
		for (int i = 1; i <= price.length; i++) {
			int temp = getTopDown(n - i) + price[i];
			if (temp > memo[n]) {
				memo[n] = temp;
			}
		}
		return memo[n];
	}
}
