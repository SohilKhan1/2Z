package Lecture6;

public class Subarrays {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };

		//subarray(arr);
		subarraySum(arr);

	}

	private static void subarraySum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int k = i; k < arr.length; k++) {
				sum = sum + arr[k];
				System.out.println(sum);
			}
		}
	}

	private static void subarray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + arr[k];
					// System.out.print(arr[k] + " ");
				}
				System.out.println(" sum = " + sum);
			}
		}

	}

}
