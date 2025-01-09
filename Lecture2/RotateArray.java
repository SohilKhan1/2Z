package Lecture2;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotate(arr, k);
	
	}

	private static void rotate(int[] arr, int k) {

		while (k > 0) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = temp;
			System.out.println(Arrays.toString(arr));
			k--;
		}

	}

}
