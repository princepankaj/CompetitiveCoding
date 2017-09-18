import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class HoneywellChallengeOptimized {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int q = Integer.parseInt(br.readLine());
		int[] index = new int[n];
		for (int i = 0; i < q; i++) {
			StringTokenizer stq = new StringTokenizer(br.readLine());
			int firstIndex = Integer.parseInt(stq.nextToken());
			int lastIndex = Integer.parseInt(stq.nextToken());
			for (int j = firstIndex; j <= lastIndex; j++) {
				int swapIndex = (n - j + 1) - 1;
				index[j - 1] = swapIndex - 1;
				index[swapIndex - 1] = j - 1;
			}
		}
		for (int i = 0; i < n; i++) {
			if (i != index[i]) {
				swap(arr, i, index[i]);
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
