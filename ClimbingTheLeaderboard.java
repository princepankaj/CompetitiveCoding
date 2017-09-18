import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ClimbingTheLeaderboard {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] rank = new int[n];
		rank[0] = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] == arr[i]) {
				rank[i] = rank[i - 1];
			} else {
				rank[i] = rank[i - 1] + 1;
			}
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int k = n - 1;
		for (int i = 0; i < m; i++) {
			int score = Integer.parseInt(st.nextToken());
			if (score >= arr[0]) {
				System.out.println("1");
			} else {
				for (int j = k; j >= 0; j--) {
					if (arr[j] > score) {
						k = j;
						System.out.println(rank[j] + 1);
						break;
					} else if (arr[j] == score) {
						k = j;
						System.out.println(rank[j]);
						break;
					}
				}
			}
		}
	}
}
