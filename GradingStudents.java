import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GradingStudents {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (temp < 38) {
				System.out.println(temp);
			} else {
				int diff = 5 - (temp % 5);
				if (diff < 3) {
					System.out.println(temp + diff);
				} else {
					System.out.println(temp);
				}
			}
		}
	}
}
