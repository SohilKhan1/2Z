package Lecture13;

public class ClimbStairs {
	public static void main(String[] args) {
		int n = 4;

		climb(n, "");
	}

	private static void climb(int n, String str) {

		if (n == 0) {
			System.out.println(str);
			return;
		}

		//if (n >= 1) {
			climb(n - 1, str + "1");
		//}
		//if (n >= 2) {
			climb(n - 2, str + "2");
		//}

	}

}
