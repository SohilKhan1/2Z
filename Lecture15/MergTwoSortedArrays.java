package Lecture16;

import java.util.Arrays;

public class MergTwoSortedArrays {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 8, 10, 12 };
		int[] b = { 2, 4, 6 };
		int[] ans = merg(a, b);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] merg(int[] a, int[] b) {
		int[] ans = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				ans[k] = a[i];
				i++;
				k++;
			} else {
				ans[k] = b[j];
				j++;
				k++;
			}
		}

		while (i < a.length) {
			ans[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			ans[k] = b[j];
			j++;
			k++;
		}

		return ans;
	}

}
