package hiringchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValidSqaure {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int k = 0; k < t; k++) {
			int n = Integer.parseInt(br.readLine());
			int arr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			long totalValidSquare = n * n;
			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n - 1; j++) {
					int temp = 2;
					int check = arr[i][j];
					while (i + temp <= n &&  j + temp <= n) {
						boolean flag = true;
						//System.out.println("------------------------------------------------------------");
						for (int p = i; p < i + temp; p++) {
							for (int q = j; q < j + temp; q++) {
								//System.out.print(arr[p][q] + "\t");
								if(arr[p][q] != check) {
									flag = false;
									break;
								}
							}
							if(!flag) {
								break;
							}
							//System.out.println();
						}
						temp++;
						if(flag) {
							totalValidSquare++;
						}
					}
				}
			}
			System.out.println(totalValidSquare);
		}
	}
}
