import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DesignPdfViewer {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		char[] str = br.readLine().toCharArray();
		int max = arr[str[0] - 'a'];
		for (int i = 1; i < str.length; i++) {
			int temp = arr[str[i] - 'a'];
			if (temp > max) {
				max = temp;
			}
		}
		System.out.print(str.length * max);
	}
}
