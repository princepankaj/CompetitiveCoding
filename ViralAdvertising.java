import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ViralAdvertising {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int temp = 2;
		int sum = 2;
		for (int i = 1; i < n; i++) {
			temp = (int) Math.floor((temp * 3) / 2);
			sum = sum + temp;
		}
		System.out.println(sum);
	}
}
