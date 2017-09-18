import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class PrimeNumerGenerator {
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
		boolean isPrime[] = new boolean[n + 1];
		for (int i = m; i <= n; i++) {
			isPrime[i] = true;
		}
		if (isPrime(m)) {
			isPrime[m] = true;
		} else {
			isPrime[m] = false;
		}
		for (int i = m; i * i <= n; i++) {
			if (isPrime[i] == true) {
				for (int j = i * i; j <= n; j += i)
					isPrime[j] = false;
			}
		}
		for (int i = m; i <= n; i++) {
			if (isPrime[i]) {
				System.out.println(i);
			}
		}

	}

	private static boolean isPrime(int m) {
		if (m == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(m); i++) {
			if (m % i == 0) {
				return false;
			}
		}
		return true;
	}
}