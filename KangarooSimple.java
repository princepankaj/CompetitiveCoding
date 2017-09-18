import java.util.Scanner;

public class KangarooSimple {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		in.close();
		if (x1 < x2 && v1 <= v2) {
			System.out.println("NO");
			return;
		}
		if ((x2 - x1 % v1 - v2) == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
