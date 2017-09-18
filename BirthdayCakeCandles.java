import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BirthdayCakeCandles {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for (int  i = 0; i < n ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max = arr[0];
		for (int  i = 1; i < n ;i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int count = 0;
		for (int  i = 0; i < n ;i++) {
			if (arr[i] == max) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
