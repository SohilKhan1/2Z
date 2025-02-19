package Lecture17;

public class CoinChange {
	static int n = Integer.MAX_VALUE;
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5 };
		int amount = 11;
		change(arr, amount, "");
		change2(arr, amount, "");
		System.out.println(n);
	}

	private static void change(int[] arr, int amount, String ans) {

		if (amount == 0) {
			//System.out.println(ans);
			if(ans.length()<n) {
				n=ans.length();
			}
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (amount - arr[i] >= 0) {
				amount = amount - arr[i]; // change
				change(arr, amount, ans + arr[i]);
				amount = amount + arr[i]; // undo
			}
		}

	}

	private static void change2(int[] arr, int amount, String ans) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (amount - arr[i] >= 0) {
				change(arr, amount - arr[i], ans + arr[i]);
			}
		}

	}

}
