package hiringchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class AllPossibleSubstrings {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "abaa";
		String temp = null;
		Set<String> palindromes = new HashSet<>();
		long sum = str.length();
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 2; j <= str.length(); j++) {
				temp = str.substring(i, j);
				System.out.println(temp);
			}
		}
	}
}
