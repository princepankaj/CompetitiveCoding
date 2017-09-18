import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JumpingOnTheCloudsRevisited {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int energy = 100;
		int nextIndex = k % n;
		while (nextIndex != 0) {
			if (arr[nextIndex] == 1) {
				energy = energy - 2;
			}
			energy--;
			nextIndex = (nextIndex + k) % n;
		}
		if (arr[0] == 1) {
			energy = energy - 2;
		}
		energy--;
		System.out.println(energy);
	}
}
