import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompareTriplets {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		long alicePoints = 0, bobPoints = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < 3; i++) {
			if (arr1[i] > arr2[i]) {
				alicePoints++;
			} else if (arr1[i] < arr2[i]) {
				bobPoints++;
			}
		}
		System.out.print(alicePoints + " ");
		System.out.print(bobPoints + " ");
	}
}
