package hiringchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class AnagramOptimized {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int nth = Integer.parseInt(st.nextToken());
			char[] arr = s.toCharArray();
			permute(arr, nth);

		}

	}

	private static void permute(char[] arr, int nth ) {
		int size = arr.length;
		Arrays.sort(arr);
		boolean flag = false;
		LinkedHashSet<String> set = new LinkedHashSet<>();
		int count = 0;
		while (!flag) {
			count++;
			System.out.println(arr);
			set.add(String.valueOf(arr));
			int i;
			for (i = size - 2; i >= 0; --i) {
				if (arr[i] < arr[i + 1]) {
					break;
				}
			}
			if (i == -1 || count == nth) {
				//System.out.println(arr);
				flag = true;
				break;
			} else {
				int j = size - 1;
				while (j>i+1 && arr[j] < arr[i]) {
					j--;
				}
				swap(arr, i, j);
				reverse(arr, i+1, size - 1);
			}
		}
		int temp = 0;
		for (String s : set) {
			temp++;
			if (temp == nth) {
				System.out.println(s);
			}
		}
		
	}

	private static void reverse(char[] arr, int i, int j) {
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}

	private static void swap(char[] str, int i, int j) {
		char temp;
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

	private static int findNextMax(char[] arr, char c, int i, int j) {
		int maxIndex = i;
		for (int index = i + 1; index <= j; index++) {
			if (arr[i] > c && arr[i] < arr[maxIndex]) {
				maxIndex = index;
			}
		}
		return maxIndex;
	}
}
