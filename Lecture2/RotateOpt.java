package Lecture2;

import java.util.Arrays;

public class RotateOpt {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		reverse(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		reverse(arr, 0, k-1);
		System.out.println(Arrays.toString(arr));
		reverse(arr, k,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	private static void reverse(int[] arr, int st , int ed) {
		int start = st;
		int end = ed;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
