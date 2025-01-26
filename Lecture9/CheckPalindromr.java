package Lecture9;

public class CheckPalindromr {

	public static void main(String[] args) {
		String str = "nitin";
		String ans = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			ans = ans + ch;
		}
		System.out.println(str.equals(ans));

	}

}
