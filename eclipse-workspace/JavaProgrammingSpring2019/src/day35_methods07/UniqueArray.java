package day35_methods07;

import java.util.*;

public class UniqueArray {

	static public void main(String... strings) {
		int[] nums = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };
		System.out.println(Arrays.toString(nums));

		findUnique(nums);
		int[] unique = getUniqueArray(nums);

	}

	// decalre empty string
	// find unique numbers and add to that string
	// split that string by space
	// declare new int array and assign each number from split
	// return the int array
	public static int[] getUniqueArrayCheapV2(int[] nums) {

		String unique = "";
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i]; // get a number
			int counter = 0;
			// String unique = "";
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if (counter == 0) {// is it still 0. then it is unique
				unique += temp + " ";
			}

		}

		String[] arr = unique.split(" ");

		int[] numbs = new int[arr.length];

		for (int k = 0; k < arr.length; k++) {
			numbs[k] = Integer.parseInt(arr[k]);
		}

		return numbs;

	}

	public static void findUnique(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if (counter == 0) {// is it still 0. then it is unique
				System.out.println(temp);
			}

		}
	}

	// find out how many unique numbers
	// declare new array with that size
	// loop through again and assign unique numbers
	// return the array
	public static int[] getUniqueArray(int[] nums) {
		// find out how many unique numbers
		int uniqueCount = 0;
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if (counter == 0) {// is it still 0. then it is unique
				uniqueCount++;
			}

		}

		// declare a new array with that size
		// int[] uniqueArray = new int[uniqueCount];
		int[] uniqueArray = new int[uniqueCount];
		int idx = 0;
		// and loop through again and assign unique numbers
		for (int i = 0; i < nums.length; i++) {// outer loop

			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {// inner/nested loop
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if (counter == 0) {// is it still 0. then it is unique
				uniqueArray[idx] = temp;
				idx++;
			}
		}

		// return the array
		return uniqueArray;

	}

}
