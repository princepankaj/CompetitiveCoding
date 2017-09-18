import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class TwoCharacters {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder(br.readLine());
		reduceString(str);

	}

	public static void reduceString(StringBuilder str) {
		int maxLen = 0;
		char s[] = str.toString().toCharArray();
		Set<Character> chars = new HashSet<>();
		for (int i = 0; i < s.length - 1; i++) {
			chars.add(s[i]);
		}
	}
}
