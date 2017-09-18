import java.util.Scanner;

public class Kangaroo {

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
		long p1 = x1 + v1, p2 = x2 + v2;
		if (p1 > p2 && v1 > v2) {
			System.out.println("NO");
			return;
		}
		if (p2 > p1 && v2 > v1) {
			System.out.println("NO");
			return;
		}
		while (true) {
			if (p1 == p2) {
				System.out.println("YES");
				break;
			}
			if (p1 > p2) {
				System.out.println("NO");
				break;
			}
			p1 = p1 + v1;
			p2 = p2 + v2;
		}
	}
}
