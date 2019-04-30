package day23_loops_and_arrays;

import java.util.*;

public class CalculateSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			System.out.println("Enter in a number");
			int num = scan.nextInt();
			if (num <= 0) {
				break;
			}
			sum = sum + num;
		}

		System.out.println("Total sum: " + sum);

	}

}
