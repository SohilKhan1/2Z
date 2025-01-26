package Lecture9;

public class ReverseString {
	public static void main(String[] args) {
		String str = "nitin";
		String ans = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.println(ch);
			ans = ans + ch;
		}

		System.out.println(ans);
		System.out.println(str.equals(ans));

	}

}
