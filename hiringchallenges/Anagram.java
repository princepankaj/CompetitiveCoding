package hiringchallenges;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Anagram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int nth = Integer.parseInt(st.nextToken());
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			s = String.valueOf(arr);
			Set<String> list = new HashSet<>();
			permute(s, 0 , s.length() - 1, list);
			ArrayList<String> sortedList = new ArrayList<>(list); 
			Collections.sort(sortedList);
			for (String s1 : list) {
				System.out.println(s1);
			}
			System.out.println(sortedList.get(nth - 1));
		}
	}
	
	private static void permute(String arr, int l, int r, Set<String> list) {
		if (l == r) {
			//System.out.println(arr);
			list.add(arr);
		}
		
		for (int  i = l; i <= r ; i++) {
			arr = swap (arr, l, i);
			permute(arr, l+1, r, list);
			arr = swap (arr, l, i);
		}
		
	}

	private static String swap(String arr, int i, int j) {
		char temp;
		char[] str = arr.toCharArray();
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		return String.valueOf(str);
	}
}
