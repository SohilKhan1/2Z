package Lecture17;
import java.util.Arrays;

public class PartitionIndex {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 9, 4, 8, 12, 7 };
		int targetIndex = 6;
		int k = index(arr, targetIndex);
		System.out.println(k);
		System.out.println(Arrays.toString(arr));
	}

	private static int index(int[] arr, int k) {
		int pi = 0;
		int si = 0;

		for (int i = si; i < k; i++) {

			if (arr[i] < arr[k]) {
				int temp = arr[pi];
				arr[pi] = arr[i];
				arr[i] = temp;
				pi++;
			}
		}
		int temp = arr[pi];
		arr[pi] = arr[k];
		arr[k] = temp;

		return pi;
	}

}
