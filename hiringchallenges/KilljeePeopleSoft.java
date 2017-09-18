package hiringchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KilljeePeopleSoft {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int[n];
		for (int j = 0; j < n; j++) {
			num[j] = Integer.parseInt(st.nextToken());
		}
		printCountOfSetBits(num);

	}

	private static void printCountOfSetBits(int[] num) {
		long count = 0;
		int index = 0;
		for (int k : num) {
			if (((k >> index) & 1) == 1) {
				count++;
			}
			index++;
		}
		System.out.println((int) (count % (Math.pow(10, 10) + 11)));
	}
}
