import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuperReducedString {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder(br.readLine());
		reduceString(str);

	}

	public static void reduceString(StringBuilder str) {
		boolean isNotReduced = true;
		do {
			isNotReduced = true;
			char s[] = str.toString().toCharArray();
			for (int i = 0; i < s.length - 1; i++) {
				if (s[i] == s[i + 1]) {
					str.deleteCharAt(i);
					str.deleteCharAt(i);
					isNotReduced = false;
					break;
				}
			}
		} while (!isNotReduced);
		if (str == null || str.length() == 0) {
			System.out.println("Empty String");
		} else {
			System.out.println(str);
		}
	}
}
