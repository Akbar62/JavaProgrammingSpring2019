package day30_methods02;

import java.util.*;

public class ArraysLargestNumber2 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} // end for cols
		} // end for rows

		// TODO write your code below

		// Iterate through every value in the array
		// Find the largest value
		// Replace every value in the array with the largest value

		int maximum = 0;
//		    for(int num: arr) {
//		      if(num >= max) {
//		        max = num;
//		      }
//		    }

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j] > maximum) {
					maximum = arr[i][j];
				}

			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = maximum;
			}
		}

		// FINAL PRINT
		System.out.println(Arrays.deepToString(arr));

	}

}
