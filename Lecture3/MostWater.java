package Lecture3;

public class MostWater {
	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		waterHold(arr);
	}

	private static void waterHold(int[] arr) {

		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int w = j - i;
				int h = Math.min(arr[i], arr[j]);
				int water = h * w;
				ans = Math.max(ans, water);
			}
		}

		System.out.println(ans);

	}

}
