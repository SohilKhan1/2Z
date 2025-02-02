package Lecture13;

public class Subsequence {
	public static void main(String[] args) {
		String str = "abc";
		print(str, "");
	}

	private static void print(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		print(str.substring(1), ans);
		print(str.substring(1), ans + ch);

	}

}
