package Lecture13;

public class CoinToss {

	public static void main(String[] args) {
		int n = 3;
//		String str = "";
//		toss(n,str);
		toss(n, "");
	}

	private static void toss(int n, String str) {
		if (n == 0) {
			System.out.println(str);
			return;
		}
		toss(n - 1, str + "H");
		toss(n - 1, str + "T");
	}

}
