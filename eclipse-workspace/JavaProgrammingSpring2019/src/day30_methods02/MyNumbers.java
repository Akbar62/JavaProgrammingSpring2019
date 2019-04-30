package day30_methods02;

import java.util.*;

public class MyNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();

		System.out.println();
		doPushUps();

		System.out.println();
		rangePrint();

	}

	public static void showMe5Numbers() {

		// Printing a random number from 0-1001
		int num = 0;
		Random random = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.print(random.nextInt(1001) + " ");
		}

		System.out.println();
	}

	public static void doPushUps() {

		for (int j = 1; j <= 10; j++) {
			System.out.println("Pushup - " + j);
		}

		System.out.println("Time to rest");

	}

	public static void rangePrint() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else if (num1 > num2) {
			for (int j = num1; j >= num2; j--) {
				System.out.print(j + " ");
			}
		} else {
			System.out.println(num1);
		}
		System.out.println();

	}

}
