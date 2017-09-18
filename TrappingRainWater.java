
public class TrappingRainWater {

	public static void main(String args[]) {
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int sum = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (isNoLeft(i, arr) || isNoRight(i, arr)) {
				sum = sum + 0;
			} else {
				int leftMax = findLeftMax(arr, i);
				int rightMax = findRightMax(arr, i);
				int max = leftMax < rightMax ? leftMax : rightMax;
				//System.out.println("Element:: " + arr[i]);
				//System.out.println("leftMax:: " + leftMax);
				//System.out.println("rightMax:: " + rightMax);
				//System.out.println("max:: " + (max - arr[i]));
				sum = sum + (max - arr[i]);
			}
		}
		System.out.println(sum);
	}

	private static boolean isNoLeft(int i, int[] arr) {
		for (int j = i - 1; j >= 0; j--) {
			if (arr[j] > arr[i]) {
				return false;
			}
		}
		return true;
	}

	private static boolean isNoRight(int i, int[] arr) {
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] > arr[i]) {
				return false;
			}
		}
		return true;
	}

	private static int findLeftMax(int[] arr, int i) {
		int leftMax = arr[i];
		for (int j = i - 1; j >= 0; j--) {
			if (arr[j] > leftMax) {
				leftMax = arr[j];
			}
		}
		return leftMax;
	}

	private static int findRightMax(int[] arr, int i) {
		int rightMax = arr[i + 1];
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] > rightMax) {
				rightMax = arr[j];
			}
		}
		return rightMax;
	}
}
