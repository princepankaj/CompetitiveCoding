import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumberGeneratorSimple {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nl = Integer.parseInt(br.readLine());
		for (int i = 0; i < nl; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			printPrimeNumbers(m, n);
		}
	}

	private static void printPrimeNumbers(int m, int n) {
		for (int i = m; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int m) {
		if (m == 1) {
			return false;
		}
		if (m == 2 || m == 3) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(m); i++) {
			if (m % i == 0) {
				return false;
			}
		}
		return true;
	}
}