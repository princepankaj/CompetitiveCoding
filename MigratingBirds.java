import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MigratingBirds {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arr[temp - 1]++;
		}
		int maxIndex = 0, max = arr[0];
		for (int i = 1; i < 5; i++) {
			if (arr[i] > max) {
				maxIndex = i;
				max = arr[i];
			}
		}
		System.out.println(maxIndex + 1);
	}
}
