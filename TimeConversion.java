import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TimeConversion {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] arr = str.toCharArray();
		StringBuffer hour = new StringBuffer();
		if (arr[8] == 'P') {
			hour.append(arr[0]);
			hour.append(arr[1]);
			int hourNum = Integer.parseInt(hour.toString());
			if (hourNum == 12) {
				for (int i = 0; i < 8; i++) {
					System.out.print(arr[i]);
				}
			} else {
				hourNum = hourNum + 12;
				System.out.print(hourNum);
				for (int i = 2; i < 8; i++) {
					System.out.print(arr[i]);
				}
			}

		} else {
			if (arr[0] == '1' && arr[1] == '2') {
				System.out.print("00");
			} else {
				System.out.print(arr[0]);
				System.out.print(arr[1]);
			}
			for (int i = 2; i < 8; i++) {
				System.out.print(arr[i]);
			}
		}
	}

}
