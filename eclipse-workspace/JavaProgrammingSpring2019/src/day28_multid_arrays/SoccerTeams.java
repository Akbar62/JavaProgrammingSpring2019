package day28_multid_arrays;

import java.util.Arrays;

public class SoccerTeams {

	public static void main(String[] args) {

		String[][] teams = new String[2][6];

		// Declare Multi D array with 2 columns and 6 rows
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";

		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitry";

		System.out.println("First player of first team ");
		System.out.println(teams[0][0]);
		System.out.println("Second player of second team ");
		System.out.println(teams[1][0]);

		// Print how many rows/teams/arrays
		System.out.println("Number of rows: " + teams.length);
		System.out.println("Number of people in first team: " + teams[0].length);
		System.out.println("Number of people in the second team: " + teams[1].length);

		System.out.println(Arrays.deepToString(teams));

		int[][] nums = new int[3][4];

		nums[0][0] = 100;
		nums[0][1] = 65456;
		nums[0][2] = 146;
		nums[0][3] = 9604;

		nums[1][0] = 12;
		nums[1][1] = 2342;
		nums[1][2] = 35432;
		nums[1][3] = 10;

		nums[2][0] = 124211;
		nums[2][1] = 167;
		nums[2][2] = 1098043;
		nums[2][3] = 12;

		System.out.println(Arrays.deepToString(nums));

		System.out.println(Arrays.toString(nums[0]));

		int[][] scores = { { 3, 5, 10 }, { 6, 4, 2, 10 } };

		System.out.println("Days played/Number of arrays " + scores.length);
		System.out.println("Number of values in 1: " + scores[0].length);
		System.out.println("Number of values in 2: " + scores[1].length);

		int[][] values = new int[4][];
		values[0] = new int[] { 34, 23, 5 };
		values[1] = new int[] { 34, 45, 6, 5, 34, 2, 2, 43, 45, 56, 567, 3 };

		values[2] = new int[2];
		values[2][0] = 55;
		values[2][1] = 88;

		values[3] = new int[] { 5, 12, 45, 77, 34 };
		
		

	}

}
