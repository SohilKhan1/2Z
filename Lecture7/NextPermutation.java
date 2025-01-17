package Lecture7;

import java.util.Arrays;

public class NextPermutation {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 2, 1 };

		int p = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}

		int q = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}

		}

//		System.out.println(p);
//		System.out.println(q);

		if (p == q) {
			reverse(arr, 0, arr.length - 1);
			System.out.println(Arrays.toString(arr));
		} else {
			int temp = arr[p];
			arr[p] = arr[q];
			arr[q] = temp;
			System.out.println(Arrays.toString(arr));
			reverse(arr, p + 1, arr.length - 1);
			System.out.println(Arrays.toString(arr));
		}
	}
	private static void reverse(int[] arr, int i, int j) {
		int st = i;
		int ed = j;
		while (st < ed) {
			int temp = arr[st];
			arr[st] = arr[ed];
			arr[ed] = temp;
			st++;
			ed--;
		}

	}
}
