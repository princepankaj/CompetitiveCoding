import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CatMouse {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int catA = Integer.parseInt(st.nextToken());
			int catB = Integer.parseInt(st.nextToken());
			int mouse = Integer.parseInt(st.nextToken());
			int distanceA = 0, distanceB = 0;
			distanceA = Math.abs(catA - mouse);
			distanceB = Math.abs(catB - mouse);
			if (distanceA == distanceB) {
				System.out.println("Mouse C");
			} else if (distanceA < distanceB) {
				System.out.println("Cat A");
			} else {
				System.out.println("Cat B");
			}
		}
	}
}
