import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PickingNumbers {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> ans1 = new ArrayList<>();
			ArrayList<Integer> ans2 = new ArrayList<>();
			ans1.add(arr[i]);
			ans2.add(arr[i]);
			for (int j = i + 1; j < n; j++) {
				if (arr[j] == arr[i]) {
					ans1.add(arr[j]);
					ans2.add(arr[j]);
				} else if (arr[j] == arr[i] + 1) {
					ans2.add(arr[j]);
				} else if (arr[j] == arr[i] - 1) {
					ans1.add(arr[j]);
				}
			}
			int temp = ans2.size() > ans1.size() ? ans2.size() : ans1.size();
			if (temp > max) {
				max = temp;
			}
		}
		System.out.println(max);
	}
}
