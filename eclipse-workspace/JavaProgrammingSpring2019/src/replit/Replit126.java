package replit;

import java.util.*;

public class Replit126 {

	public static void main(String[] args) {
		// Given two arrays of ints sorted in increasing order, outer and inner, print
		// out true if all of the numbers in inner appear in outer. Take advantage of
		// the fact that both arrays are already in sorted order.

//		input (outer): 1, 2, 4, 6
//		input (inner): 2, 4
//		output: true

		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for (int i = 0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for (int j = 0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		// WRITE YOUR CODE HERE

		int counter = 0;

		for (int i = 0; i < inner.length - 1; i++) {
			counter = 0;
			for (int j = 0; j < outer.length - 1; j++) {
				if (i == j) {
					counter++;
					System.out.println(true);
					break;
				}
			}
			
			if(counter == 0) {
				System.out.println(false);
			}
		}

	}

}
