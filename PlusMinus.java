import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class PlusMinus {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int totalNegatives = 0, totalPositives = 0, totalZeros = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (temp > 0) {
				totalPositives++;
			} else if (temp < 0) {
				totalNegatives++;
			} else {
				totalZeros++;
			}
		}
		DecimalFormat decimalFormat = new DecimalFormat("0.000000");
		System.out.println(decimalFormat.format(totalPositives / (double) n));
		System.out.println(decimalFormat.format(totalNegatives / (double) n));
		System.out.println(decimalFormat.format(totalZeros / (double) n));
	}
}
