import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMaxSum {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum = sum + arr[i];
		}
		long minSum = sum, maxSum = arr[0];
		for (int i = 0; i < 5; i++) {
			long tempSum = 0;
			for (int j = 0; j < 5; j++) {
				if (i != j) {
					tempSum = tempSum + arr[j];
				}
			}
			if (tempSum > maxSum) {
				maxSum = tempSum;
			}
			if (tempSum < minSum) {
				minSum = tempSum;
			}

		}
		System.out.print(minSum + " ");
		System.out.print(maxSum);
	}

}
