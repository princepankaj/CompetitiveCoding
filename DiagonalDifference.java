import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DiagonalDifference {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		long leftToRightSum = 0, rightToLeftSum = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (i == j) {
					leftToRightSum = leftToRightSum + arr[i][j];
				}
			}
		}
		int i = 0;
		for (int j = n - 1; j >= 0; j--, i++) {
			rightToLeftSum = rightToLeftSum + arr[i][j];
		}
		System.out.println(Math.abs(leftToRightSum - rightToLeftSum));
	}
}
