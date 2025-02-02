package Lecture11;

public class PrintInc {
	public static void main(String[] args) {
		int n = 1;
		print(n);
	}

	private static void print(int n) {
		if (n > 5) {
			return;
		}
		System.out.println(n);
		print(n + 1);
		System.out.println(n);

	}

}
