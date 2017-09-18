package hiringchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class AmazingPalindrome {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder temp = new StringBuilder();
		Set<String> palindromes = new HashSet<>();
		long sum = str.length();
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				temp = new StringBuilder(str.substring(i, j));
				if (palindromes.contains(temp.toString())) {
					//System.out.println("from set");
					sum++;
				} else {
					if (temp.length() > 1) {
						String original = temp.toString();
						//System.out.println("temp:: " + temp);
						StringBuilder newTemp = new StringBuilder(temp.toString());
						StringBuilder reverse = newTemp.reverse();
						if (original.equals(reverse.toString())) {
							palindromes.add(original);
							sum++;
						} else {
							StringBuilder compressed = new StringBuilder();
							compressed.append(temp.charAt(0));
							char lastChar = temp.charAt(0);
							for (int p = 1; p < temp.length(); p++) {
								if (lastChar != temp.charAt(p)) {
									compressed.append(temp.charAt(p));
									lastChar = temp.charAt(p);
								}
							}
							original = compressed.toString();
							//System.out.println("compressed:: " + compressed);
							reverse = compressed.reverse();
							if (palindromes.contains(compressed.toString())) {
								//System.out.println("from set");
								sum++;
							} else if (original.equals(reverse.toString())) {
								palindromes.add(original);
								sum++;
							}
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
