package day12_switch_ternary;

import java.util.*;

public class Practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quarters, dimes, nickels;
		System.out.println("Enter your price in cents:");
		int itemPrice = scan.nextInt();
		int change = 100 - itemPrice;
		quarters = (change % 25) / 25;
		dimes = (change % 25 % 10) / 10;
		nickels = (change % 25 % 10 % 5) / 5;

		if (itemPrice < 25 || itemPrice > 100) {
			if (itemPrice<25)
			System.out.println("Invalid price1!");
			else
				System.out.println("Invalid price2!");
		} else if (itemPrice % 5 == 0) {
			System.out.println("Invalid price!");
		} else {

		}

		System.out
				.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");

	}
}