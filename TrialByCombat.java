import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TrialByCombat {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int index = 0; index < n; index++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int hours = Integer.parseInt(st.nextToken());
			int arr[] = new int[m];
			st = new StringTokenizer(br.readLine());
			int countOnes = 0;
			for (int i = 0; i < m; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if (arr[i] == 1) {
					countOnes++;
				}
			}
			boolean isAlternate = true;
			for (int i = 0; i < m - 1; i++) {
				if (arr[i] == arr[i+1]) {
					isAlternate = false;
					break;
				}
			}
			if (isAlternate) {
				hours = hours%2;
			}
			if (countOnes != arr.length) {

				for (int i = 0; i < hours; i++) {
					int temp[] = new int[m];
					int countZeros = 0;
					for (int j = 0; j < m; j++) {
						if (j - 1 < 0) {
							if (arr[j + 1] == 1) {
								temp[j] = 1;
							}
						} else if (j + 1 == m) {
							if (arr[j - 1] == 1) {
								temp[j] = 1;
							}
						} else {
							if (arr[j - 1] == 1 && arr[j + 1] == 1) {
								temp[j] = 1;
							}
						}
					}
					boolean isSame = true;
					for (int j = 0; j < m; j++) {
						if (temp[j] != arr[j]) {
							isSame = false;
							break;
						}
					}
					if (isSame) {
						break;
					}
					for (int j = 0; j < m; j++) {
						if (temp[j] == 0) {
							countZeros++;
						}
						arr[j] = temp[j];
					}
					
					if (countZeros == temp.length) {
						break;
					}
				}
			}
			for (int j = 0; j < m; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}

	}
}
