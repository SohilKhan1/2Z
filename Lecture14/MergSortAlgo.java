package Lecture15;

import java.util.Arrays;

public class MergSortAlgo {
	public static void main(String[] args) {
		int[] arr = { 60, 50, 40, 30, 20 };
		int[] ans = mergSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] mergSort(int[] arr, int st, int ed) {
		if (st == ed) {
			int[] b = new int[1];
			b[0] = arr[st];
			return b;
		}

		int mid = (st + ed) / 2;
		int[] fa = mergSort(arr, st, mid);
		int[] sa = mergSort(arr, mid + 1, ed);
		return merg(fa, sa);

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
