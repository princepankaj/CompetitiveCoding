import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SockPairs {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> count = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (count.containsKey(temp)) {
				count.put(temp, count.get(temp) + 1);
			} else {
				count.put(temp, 1);
			}
		}
		int totalPairs = 0;
		for (Integer key : count.keySet()) {
			totalPairs = totalPairs + (int) Math.floor(count.get(key) / 2);
		}
		System.out.println(totalPairs);
	}
}
