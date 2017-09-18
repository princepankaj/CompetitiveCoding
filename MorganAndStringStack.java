import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class MorganAndStringStack {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String a = br.readLine();
			String b = br.readLine();
			System.out.println(computeLexicographicalString(a, b));
		}
	}

	private static String computeLexicographicalString(String a, String b) {
		int i = 0, j = 0;
		StringBuilder sb = new StringBuilder();
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		if (a.equals(b)) {
			while (i < a1.length && j < b1.length) {
				if (a1[i] <= b1[j]) {
					sb.append(a1[i]);
					i++;
				} else if (a1[i] > b1[j]) {
					sb.append(b1[j]);
					j++;
				}
			}
		} else {
			while (i < a1.length && j < b1.length) {
				if (a1[i] < b1[j]) {
					sb.append(a1[i]);
					i++;
				} else if (a1[i] > b1[j]) {
					sb.append(b1[j]);
					j++;
				} else {
					int x = i, y = j;
					while (x < a1.length && y < b1.length) {
						if (a1[x] != b1[y]) {
							break;
						}
						x++;
						y++;
					}
					if (a1[x] < b1[y]) {
						sb.append(a1[i]);
						i++;
					} else if (a1[x] > b1[y]) {
						sb.append(b1[j]);
						j++;
					}
				}
			}
		}

		while (i < a1.length) {
			sb.append(a1, i , a1.length);
		}
		while (j < b1.length) {
			sb.append(b1, j , b1.length - j );
		}

		return sb.toString();
	}

	

}

// --------------------------------
// char[] temp = new char[stack1.size()];
// int i = 0;
// while (i < temp.length) {
// temp[i++] = stack1.pop();
// }
// Arrays.sort(temp);
// i = 0;
// while (i < temp.length) {
// sb.append(temp[i++]);
// }