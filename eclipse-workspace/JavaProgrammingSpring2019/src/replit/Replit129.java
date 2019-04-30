package replit;

import java.util.*;

public class Replit129 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} // end for cols
		} // end for rwos

		// your code here
		// Find a way to loop through both arrays using a nested loop
		// Compare side by side values to see if there are 2 consecutive matches
		// See if it is equal with the number next to it
		// For every instance of a match, add one to matches

		int matches = 0;

		for (int row = 0; row <= arr.length-2; row++) {
			for (int col = 0; col <= arr[row].length-2; col++) {

				if (arr[row][col] == arr[row][col + 1]) {
					matches++;
				}
			}
		}

		System.out.print("matches: " + matches);

	}

}
