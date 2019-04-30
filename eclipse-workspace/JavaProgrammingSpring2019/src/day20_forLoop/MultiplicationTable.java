package day20_forLoop;

import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();

		if (num <= 10 && num >= 1) {
			System.out.println("Number is valid");

		} else {
			System.out.println("Invalid input");
			return;
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(num +" x "+ i +" = "+(num*i));
		}

	}

}
