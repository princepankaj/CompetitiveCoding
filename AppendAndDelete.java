import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AppendAndDelete {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		String input2 = br.readLine();
		int k = Integer.parseInt(br.readLine());
		char[] str1 = input1.toCharArray();
		char[] str2 = input2.toCharArray();
		int matchUpto = -1;
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] != str2[i]) {
				matchUpto = i - 1;
				break;
			}
		}
		int operationDel = 0, operationAdd = 0, totalOperation = 0;
		operationDel = str1.length - (matchUpto + 1);
		operationAdd = str2.length - (matchUpto + 1);
		totalOperation = operationAdd + operationDel;
		if (k >= totalOperation) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
