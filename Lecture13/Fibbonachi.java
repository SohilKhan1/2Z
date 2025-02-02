package Lecture13;

public class Fibbonachi {
	public static void main(String[] args) {
		int n = 3;
		int ans = fibb(n);
		System.out.println(ans);
	}

	private static int fibb(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int a = fibb(n - 1);
		int b = fibb(n - 2);
		return a + b;

	}

}
