package Lecture1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);
		int[] arr1 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println(Arrays.toString(arr));

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));

	}

}
