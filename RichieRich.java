import java.util.*;

public class RichieRich {

	static String richieRich(String s, int n, int k) {
		boolean[] mark = new boolean[n];
		char[] arr = s.toCharArray();
		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			int temp1 = Integer.parseInt(arr[i] + "");
			int temp2 = Integer.parseInt(arr[j] + "");
			if (temp1 != temp2) {
				if (temp1 > temp2) {
					arr[j] = arr[i];
					mark[j] = true;
				} else {
					arr[i] = arr[j];
					mark[i] = true;
				}
				k--;
			}
		}
		if (k < 0) {
			return "-1";
		}
		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			if (i == j) {
				if (arr[i] < '9' && k >= 1)
					arr[i] = '9';
				break;
			}
			if (arr[i] < '9') {
				if (!mark[i] && !mark[j] && k >= 2) // not touch befoje
				{
					k -= 2;
					arr[i] = arr[j] = '9';
				} else if ((mark[i] || mark[j]) && k >= 1) {
					k -= 1;
					arr[i] = arr[j] = '9';
				}
			}
		}
		return new String(arr);

	}
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		BufferedReader br = null;
//		FileReader fr = null;
//
//		try {
//
//			fr = new FileReader("C:\\Users\\I325046\\PracticeWorkspace\\HackerEarthPractice\\src\\input.txt");
//
//			br = new BufferedReader(fr);
//
//			String sCurrentLine;
//
//			while ((sCurrentLine = br.readLine()) != null) {
//				sb.append(sCurrentLine);
//			}
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//
//		} finally {
//
//			try {
//
//				if (br != null)
//					br.close();
//
//				if (fr != null)
//					fr.close();
//
//			} catch (IOException ex) {
//
//				ex.printStackTrace();
//
//			}
//		}
//		String[] arr = sb.toString().split(" ");
// 		int n = Integer.parseInt(arr[0]);
// 		int k = Integer.parseInt(arr[1]);
//		String s = arr[2];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String s = in.next();
		String result = richieRich(s, n, k);
		System.out.println(result);
	}
}

//-------------------------------------------------------------------------------------------------- Other solutions


//static String richieRich(String s, int n, int k) {
//int unmatchedPairs = 0;
//if (s.length() == 1 && k >= 1) {
//	return "9";
//}
//char[] arr = s.toCharArray();
//for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//	int temp1 = Integer.parseInt(arr[i] + "");
//	int temp2 = Integer.parseInt(arr[j] + "");
//	if (temp1 != temp2) {
//		unmatchedPairs++;
//	}
//}
//if (unmatchedPairs > k) {
//	return "-1";
//}
//int changeBoth = k - unmatchedPairs;
//int i = 0;
//int j = arr.length - 1;
//for (; i <= j; i++, j--) {
//    if (arr[i] != arr[j]) {
//        char maxChar = (char) Math.max(arr[i], arr[j]);
//        if (maxChar != '9' && changeBoth - 1 >= 0) {
//            arr[i] = '9';
//            arr[j] = '9';
//            changeBoth--;
//        } else {
//            arr[i] = maxChar;
//            arr[j] = maxChar;
//            unmatchedPairs--;
//        }
//    } else {
//        char maxChar = (char) Math.max(arr[i], arr[j]);
//        if (maxChar != '9' && changeBoth - 2 >= 0) {
//            arr[i] = '9';
//            arr[j] = '9';
//            changeBoth -= 2;
//        }
//    }
//}
//if (changeBoth != 0 && i - 1 == j + 1) {
//    arr[i - 1] = '9';
//}
//String palindrome = new String(arr);
//return palindrome;
////int p = k;
////int i, j;
////for (i = 0, j = arr.length - 1; i < j; i++, j--) {
////	int temp1 = Integer.parseInt(arr[i] + "");
////	int temp2 = Integer.parseInt(arr[j] + "");
////	if (temp1 != temp2) {
////		if (k - 2 >= unmatchedPairs - 1) {
////			if (arr[i] == '9') {
////				arr[j] = '9';
////				changes--;
////				unmatchedPairs--;
////				k--;
////			} else if (arr[j] == '9') {
////				arr[i] = '9';
////				changes--;
////				unmatchedPairs--;
////				k--;
////			} else {
////				arr[i] = '9';
////				arr[j] = '9';
////				changes = changes + 2;
////				unmatchedPairs--;
////				k = k - 2;
////			}
////		} else {
////			if (temp1 >= temp2) {
////				arr[j] = arr[i];
////			} else {
////				arr[i] = arr[j];
////			}
////			changes++;
////			k--;
////			unmatchedPairs--;
////		}
////	}
////}
////if (changes > p) {
////	return "-1";
////}
////else {
////	for (i = 0, j = arr.length - 1; i < j; i++, j--) {
////		if (changes >= p) {
////			break;
////		}
////		if (arr[i] != '9' && arr[j] != '9') {
////			arr[i] = '9';
////			arr[j] = '9';
////			changes = changes + 2;
////		}
////	}
////	if (changes < p && i - 1 == j + 1) {
////        arr[i - 1] = '9';
////    }
////}
////return new String(arr);
//
//}
