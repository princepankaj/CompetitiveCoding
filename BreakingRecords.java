import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakingRecords {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int min = arr[0], max = arr[0], scoreInrease = 0, scoreDecrease = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				scoreInrease++;
				max = arr[i];
			} else if (arr[i] < min) {
				scoreDecrease++;
				min = arr[i];
			}
		}
		System.out.print(scoreInrease + " ");
		System.out.print(scoreDecrease);
	}
}
