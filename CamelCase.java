import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CamelCase {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		reduceString(str);

	}

	public static void reduceString(String str) {
		char s[] = str.toCharArray();
		int count = 0;
		if (str.length() == 0) {
			System.out.println(count);
			return;
		}
		count++;
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 65 && s[i] <= 91) {
				count++;
			}
		}
		System.out.println(count);
	}
}
