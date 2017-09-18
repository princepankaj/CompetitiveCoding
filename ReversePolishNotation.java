import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ReversePolishNotation {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> operators = new HashMap<>();
		operators.put('+', 1);
		operators.put('-', 2);
		operators.put('*', 3);
		operators.put('/', 4);
		operators.put('^', 5);
		int nl = Integer.parseInt(br.readLine());
		for (int i = 0; i < nl; i++) {
			char s[] = br.readLine().toCharArray();
			Stack<Character> stack = new Stack<>();
			for (i = 0; i < s.length; i++) {
				if (operators.containsKey(s[i])) {
					// If token is an operator (x) [S3]
					while (!stack.empty() && operators.containsKey(stack.peek())) {
						// [S4]
						if (operators.get(s[i]) <= operators.get(stack.peek())) {
							System.out.print(stack.pop()); // [S5] [S6]
							continue;
						}
						break;
					}
					// Push the new operator on the stack [S7]
					stack.push(s[i]);
				} else if (s[i] == '(') {
					stack.push(s[i]); // [S8]
				} else if (s[i] == ')') {
					// [S9]
					while (!stack.empty() && ! (stack.peek() == '(')) {
						System.out.print(stack.pop()); // [S10]
					}
					stack.pop();
				} else {
					System.out.print(s[i]); // [S12]
				}
			}
			while (!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
			System.out.println();
		}
	}
}
