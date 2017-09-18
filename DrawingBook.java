import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DrawingBook {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		int fromStart = (int) Math.floor(p  / 2);
		if (n % 2 == 0) {
			n++;
		}
		int fromEnd = (int) Math.floor((n - p) / 2);
		if (fromStart <= fromEnd) {
			System.out.println(fromStart);
		} else {
			System.out.println(fromEnd);
		}
	}
}
