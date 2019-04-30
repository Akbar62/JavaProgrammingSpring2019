package replit;

import java.util.*;

public class Replit136 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };

		int result = 0;
		int sum1 = 0;
		int sum2 = 0;

		// Find out how get diagonal value for both sides
		// Add both those sides together
		// Subtract both to find the difference between the 2

//		for (int row = 0; row < matrix.length; row++) {
//			for (int col = 0; col < matrix[row].length; col++) {
				sum1 += matrix[0][0];
				sum1 += matrix[1][1];
				sum1 += matrix[2][2];
				sum2 += matrix[0][2];
				sum2 += matrix[1][1];
				sum2 += matrix[2][0];
//			}
//		}

		if(sum1 > sum2) {
			result = sum1 - sum2;
		}else if(sum1 < sum2) {
			result = sum2 - sum1;
		}
		
		System.out.println(Math.abs(result));

	}

}
