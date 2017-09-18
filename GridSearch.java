import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GridSearch {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int index = 0; index < N; index++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int arr[][] = new int[m][n];
			for (int i = 0; i < m; i++) {
				String temp = br.readLine();
				for (int j = 0; j < n; j++) {
					arr[i][j] = temp.charAt(j) - '0';
				}
			}
			st = new StringTokenizer(br.readLine());
			int m1 = Integer.parseInt(st.nextToken());
			int n1 = Integer.parseInt(st.nextToken());
			int arr1[][] = new int[m1][n1];
			for (int i = 0; i < m1; i++) {
				String temp = br.readLine();
				for (int j = 0; j < n1; j++) {
					arr1[i][j] = temp.charAt(j) - '0';
				}
			}
			
			boolean isFound = false;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] == arr1[0][0]) {
						if ((m < m1 + i) || (n < j + n1)) {
							isFound = false;
						} else {
							int noOfMatches = 0;
							int x = i, y = j;
							for (int p = 0; p < m1; p++) {
								y = j;
								isFound = true;
								for (int q = 0; q < n1; q++) {
									if (arr1[p][q] != arr[x][y]) {
										isFound = false;
										break;
									} else {
										noOfMatches++;
									}
									y++;
								}
								if (!isFound) {
									break;
								}
								x++;
							}
							if (noOfMatches == m1 * n1) {
								isFound = true;
								break;
							}
						}
					}
				}
				if (isFound) {
					break;
				}
			}
			if (isFound) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
