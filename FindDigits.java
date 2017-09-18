import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindDigits {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			int finalNum = num;
			int count = 0;
			while (num > 0) {
				int j = num % 10;
				num = num / 10;
				if (j != 0) {
					if (finalNum % j == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
