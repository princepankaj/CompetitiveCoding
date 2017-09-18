import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NextPalindrome {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nl = Integer.parseInt(br.readLine());
		for (int i = 0; i < nl; i++) {
			int m = Integer.parseInt(br.readLine());
			printNextPalindrome(m);
		}
	}

	private static void printNextPalindrome(int m) {
	}
}
