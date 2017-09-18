package hiringchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkAndATM {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			int max = 0;

			for (int k = 1; k < Math.sqrt(num); k++) {
				if (num % k == 0) {
					// System.out.println("k: " + k);
					int val = fun(num, k);
					// System.out.println("val: " + val);
					if (val > max) {
						max = val;
					}
				}
			}
			System.out.println(max);
		}
	}

	private static int fun(int N, int PIN) {
		if (N % PIN != 0)
			return 0;

		int M = N / PIN;
		int value = 0;
		for (int i = 1; i <= M; i++) {
			if (M % i == 0)
				value++;
		}

		if (isPowerof2(value))
			return value;
		else
			return 0;
	}

	/*
	 * // Function to return gcd of a and b private static int gcd(int a, int b)
	 * { if (a == 0) return b; return gcd(b % a, a); }
	 */

	private static boolean isPowerof2(int x) {
		return (x != 0 && (x & (x - 1)) == 0);
	}
}
