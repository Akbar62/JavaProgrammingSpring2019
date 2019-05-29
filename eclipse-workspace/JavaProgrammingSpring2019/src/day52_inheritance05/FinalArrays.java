package day52_inheritance05;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		final int[] TEAMS = { 11, 11 };
		System.out.println("Team 1: " + TEAMS[0]);
		System.out.println("Team 2: " + TEAMS[0]);

		TEAMS[0] = 10;
		TEAMS[1] = 9;

		System.out.println("Team 1: " + TEAMS[0]);
		System.out.println("Team 2: " + TEAMS[0]);

		// TEAMS = new int[] {10, 10, 10};
		// cant re-initialize it

		int[] nums = new int[] { 22, 55, 35543 };
		System.out.println(Arrays.toString(nums));

		nums = new int[] { 23423, 45645, 2, 24, 23, 4665, 1 };
		System.out.println(Arrays.toString(nums));

		final int[] finalNums = { 23, 66, 44, 11 };
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 34567;
		System.out.println(Arrays.toString(finalNums));

		// finalNums = new int[] {22, 44, 56, 1123, 345};
		final double[] PRICES = new double[3];
		PRICES[0] = 85.5;
		PRICES[1] = 99.99;
		PRICES[2] = 99.98;

		System.out.println(Arrays.toString(PRICES));

		// will not work
		// PRICES = new double[3];
	}

}
