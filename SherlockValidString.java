
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockValidString {

	static String isValid(String s) {
		if (s.length() < 2) {
			return "YES";
		}
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			count[temp - 'a']++;
		}
		Arrays.sort(count);
		int startIndex = -1;
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				startIndex = i;
				break;
			}
		}
		if (count[startIndex] == count[25]) {
			return "YES";
		} else if (count[25] > count[24]) {
			if (count[startIndex] == count[24] && count[25] - count[24] == 1) {
				return "YES";
			} else {
				return "NO";
			}
		} else {
			if (count[startIndex] == 1 && count[startIndex + 1] > count[startIndex]
					&& count[startIndex + 1] == count[25]) {
				return "YES";
			} else {
				return "NO";
			}
		}
		// Map<Integer, Integer> countMap = new HashMap<>();
		// for (int i = startIndex; i < count.length; i++) {
		// if (countMap.get(count[i]) == null) {
		// countMap.put(count[i], 1);
		// } else {
		// int temp = countMap.get(count[i]);
		// countMap.put(count[i], ++temp);
		// }
		// }
		// if (countMap == null) {
		// return "YES";
		// }
		// if (countMap.size() > 2) {
		// return "NO";
		// } else if (countMap.size() == 1) {
		// return "YES";
		// } else {
		// int key[] = new int[2];
		// int value[] = new int[2];
		// Iterator itr = countMap.entrySet().iterator();
		// int i = 0;
		// while (itr.hasNext()) {
		// Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) itr.next();
		// value[i] = entry.getValue();
		// key[i] = entry.getKey();
		// i++;
		// }
		// if (Math.abs(key[1] - key[0]) == 1) {
		// if (value[1] == 1 || value[0] == 1) {
		// return "YES";
		// } else {
		// return "NO";
		// }
		// }
		// if (countMap.get(1) != null && countMap.get(1) == 1) {
		// return "YES";
		// } else {
		// return "NO";
		// }
		// }
	}

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// String s = in.next();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader("C:\\Users\\I325046\\PracticeWorkspace\\HackerEarthPractice\\src\\input.txt");

			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				sb.append(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}

		String result = isValid(sb.toString());
		System.out.println(result);
	}
}
