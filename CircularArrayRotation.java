import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CircularArrayRotation {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int k = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		k = k % n;
		for (int i = 0; i < q; i++) {
			int temp = Integer.parseInt(br.readLine());
			int index = (temp + 1) - k;
			if (index <= 0) {
				index = n + index;
			}
			System.out.println(arr[index - 1]);
		}
	}
}
