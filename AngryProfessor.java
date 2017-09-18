import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AngryProfessor {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int arrived = 0;
			for (int j = 0; j < m; j++) {
				int temp = Integer.parseInt(st.nextToken());
				if (temp <= 0) {
					arrived++;
				}
			}
			if (arrived >= k) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}
