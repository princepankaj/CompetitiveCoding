import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TimeConversionSimple {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] arr = str.toCharArray();
		int hh = (arr[0] - '0') * 10 + arr[1] - '0';
		int mm = (arr[3] - '0') * 10 + arr[4] - '0';
		int ss = (arr[6] - '0') * 10 + arr[7] - '0';
		if (hh < 12 && arr[8] == 'P') {
			hh += 12;
		} else if (hh == 12 && arr[8] == 'A') {
			hh = 0;
		}
		System.out.printf("%02d:%02d:%02d\n", hh, mm, ss);
	}
}
