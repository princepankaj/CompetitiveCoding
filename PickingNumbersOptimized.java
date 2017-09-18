import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PickingNumbersOptimized {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] frequency = new int[100];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			frequency[temp]++;
		}
		int max = 0;
        for (int i = 1; i < n; i++) {
            int count = frequency[i] + frequency[i - 1];
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
	}
}
