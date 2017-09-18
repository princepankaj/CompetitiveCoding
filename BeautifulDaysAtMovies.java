import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeautifulDaysAtMovies {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int count = 0;
		for (int i = start; i <= end; i++) {
			StringBuffer rev = new StringBuffer(String.valueOf(i));
			int revNum = Integer.parseInt(rev.reverse().toString());
			int diff = Math.abs(i - revNum);
			if (diff % k == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
