import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LargeFactorial {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] res = new int[1000];
		res[0] = 1;
		int resSize = 1;
		int carry = 0, x;
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < resSize; j++) {
				x = res[j] * i + carry;
				res[j] = x % 10;
				carry = x / 10;
			}
			while (carry > 0) {
				res[resSize] = carry % 10;
				carry = carry / 10;
				resSize++;
			}
		}
		for (int i = resSize - 1; i >= 0; i--) {
			System.out.print(res[i]);
		}
	}
}
