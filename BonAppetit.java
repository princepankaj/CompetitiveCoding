import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BonAppetit {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		long sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum = sum + arr[i];
		}
		long total = Long.parseLong(br.readLine());
		long diff = sum - arr[k];
		if (diff / 2 == total) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(total - (diff / 2));
		}
	}
}
