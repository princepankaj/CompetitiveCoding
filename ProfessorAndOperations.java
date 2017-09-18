import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProfessorAndOperations {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		boolean[] swapArr = new boolean[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			int firstIndex = Integer.parseInt(st.nextToken());
			int lastIndex = Integer.parseInt(st.nextToken());
			for (int j = firstIndex - 1; j < lastIndex; j++) {
				swapArr[j] = !swapArr[j];
			}
		}
		for (int i = 0; i < n; i++) {
			if (swapArr[i]) {
				swap(arr, i, n - i - 1);
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
