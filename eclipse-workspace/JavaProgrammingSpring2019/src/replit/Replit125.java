package replit;

import java.util.*;

public class Replit125 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		// WRITE YOUR CODE HERE

		// Given an int array, print a new array with double the length where its last
		// element is the same as the original array, and all the other elements are 0.
		// The original array will be length 1 or more. Note: by default, a new int
		// array contains all 0's.

		
		int[] newArr = new int[size*2];
		
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = 0;
		}
		
		newArr[newArr.length-1] = nums[nums.length-1];
		
		System.out.println(Arrays.toString(newArr));
		
		
	}

}
