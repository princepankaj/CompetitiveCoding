import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class SumPairs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for (int  i = 0; i < n ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int count = 0;
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int diff = arr[i] - k;
			int diff2 = k + arr[i];
			if (countMap.get(diff) != null) {
				count = count + countMap.get(diff);
			}
			if (countMap.get(diff2) != null) {
				count = count + countMap.get(diff2);
			}
			if (countMap.get(arr[i]) == null) {
				countMap.put(arr[i], 1);
			}
		}
		System.out.println(count);
	}

}
