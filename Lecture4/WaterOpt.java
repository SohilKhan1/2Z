package Lecture4;

public class WaterOpt {
	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		waterHold(arr);
	}

	private static void waterHold(int[] arr) {
		int st = 0;
		int ed = arr.length - 1;
		int ans = 0;
		while (st < ed) {
			int w = ed - st;
			int h = Math.min(arr[st], arr[ed]);
			int water = h * w;
			ans = Math.max(ans, water);

			if (arr[st] < arr[ed]) {
				st++;
			} else {
				ed--;
			}
		}
		System.out.println(ans);

	}

}
