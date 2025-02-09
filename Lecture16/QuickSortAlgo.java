package Lecture17;
public class QuickSortAlgo {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 9, 4, 8, 12, 7 };
		quickSort(arr, 0, arr.length - 1);
		for (int k : arr) {
			System.out.print(k + " ");
		}

	}

	private static void quickSort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return;
		}
		int pi = findpivot(arr, si, ei);
		quickSort(arr, si, pi - 1);
		quickSort(arr, pi + 1, ei);

	}

	private static int findpivot(int[] arr, int si, int ei) {
		int pivot = arr[ei];
		int pi = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] <= pivot) {
				int t = arr[i];
				arr[i] = arr[pi];
				arr[pi] = t;
				pi++;
			}
		}

		int t = arr[pi];
		arr[pi] = arr[ei];
		arr[ei] = t;

		return pi;
	}

}