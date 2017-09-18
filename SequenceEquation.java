import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SequenceEquation {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] result = new int[n+1];
		for (int i = 0; i < n; i++) {
			int x = arr[arr[i] - 1];
			result[x] = i + 1;
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(result[i]);
		}
	}

}
