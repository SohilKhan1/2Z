package Lecture12;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		int ans = fact(n);
		System.out.println(ans);
	}

	private static int fact(int n) {

		if (n == 1) {
			return 1;
		}

		int sp = fact(n - 1);
		int bp = sp * n;
		return bp;

	}

}
