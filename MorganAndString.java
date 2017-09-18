import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class MorganAndString {

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
		boolean isDuplicate = a.equals(b);
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		for (int i = a.length() - 1; i >= 0; i--) {
			stack1.push(a.charAt(i));
		}
		for (int i = b.length() - 1; i >= 0; i--) {
			stack2.push(b.charAt(i));
		}
		StringBuilder sb = new StringBuilder();

		while (stack1.isEmpty() == false && stack2.isEmpty() == false) {
			char temp1 = stack1.peek();
			char temp2 = stack2.peek();
			if (isDuplicate) {
				if (temp1 < temp2) {
					sb.append(temp1);
					stack1.pop();
				} else {
					sb.append(temp2);
					stack2.pop();
				}
			} else {
				if (temp1 == temp2) {
					chooseStack(stack1, stack2, sb);
				} else if (temp1 < temp2) {
					sb.append(temp1);
					stack1.pop();
				} else {
					sb.append(temp2);
					stack2.pop();
				}
			}
		}
		while (stack1.isEmpty() == false) {
			sb.append(stack1.pop());
		}
		while (stack2.isEmpty() == false) {
			sb.append(stack2.pop());
		}
		return sb.toString();
	}

	private static void chooseStack(Stack<Character> stack1, Stack<Character> stack2, StringBuilder sb) {
		boolean useStack1 = false, useStack2 = false;
		boolean isFound = false;
		ArrayList<Character> poppedElementsStack1 = new ArrayList<>();
		ArrayList<Character> poppedElementsStack2 = new ArrayList<>();
		while (!isFound && stack1.isEmpty() == false && stack2.isEmpty() == false) {
			char temp1 = stack1.pop();
			char temp2 = stack2.pop();
			poppedElementsStack1.add(temp1);
			poppedElementsStack2.add(temp2);
			if (temp1 < temp2) {
				useStack1 = true;
				isFound = true;
			} else if (temp2 < temp1) {
				useStack2 = true;
				isFound = true;
			}
		}
		int i = 0, j = 0;
		if (useStack1) {
			sb.append(poppedElementsStack1.get(0));
			i = 1;
		} else if (useStack2) {
			sb.append(poppedElementsStack2.get(0));
			j = 1;
		}
		for (; i < poppedElementsStack1.size(); i++) {
			stack1.push(poppedElementsStack1.get(i));
		}
		for (; j < poppedElementsStack2.size(); j++) {
			stack2.push(poppedElementsStack2.get(j));
		}
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