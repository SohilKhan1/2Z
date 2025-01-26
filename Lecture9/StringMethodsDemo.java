package Lecture9;

import java.util.Arrays;

public class StringMethodsDemo {
	public static void main(String[] args) {
		String str = "hello";

		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf('h'));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		char[] charr = str.toCharArray();
		System.out.println(Arrays.toString(charr));
		System.out.println(str.substring(0));
		System.out.println(str.substring(1,4));
		System.out.println(str.substring(1,6));

		

	}

}
