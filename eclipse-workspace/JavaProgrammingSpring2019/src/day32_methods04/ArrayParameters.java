package day32_methods04;

import java.util.Arrays;

public class ArrayParameters {

	/*
	 * Print an array
	 * 
	 */

	public static void main(String[] args) {
		int[] myArray = { 44, 22, 66, 11 };
		printArray(myArray);
		printArray(new int[] { 33, 45, 5, 7 });
		int[] myNums = new int[] { 3, 4, 5, 6, 7, 8 };
		printArray(myNums);
		System.out.println();
		print2ArraysV2(myArray, myNums);
		System.out.println();
		
		int[] one = {10, 2, 3};
		int[] two = {3, 1};
		print2ArraysV2(one, two);
		System.out.println();
		
		print2Arrays(one, two);
		

	}

	public static void printArray(int[] nums) {
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	/*
	 * Print 2 arrays 
	 * Prints the larger array followed by the smaller one
	 */
	
	public static void print2Arrays(int[] nums1, int[] nums2) {
		if(nums1.length > nums2.length) {
			System.out.println(Arrays.toString(nums1));
			System.out.println(Arrays.toString(nums2));
		} else {
			System.out.println(Arrays.toString(nums2));
			System.out.println(Arrays.toString(nums1));
		}
	}
	
	public static void print2ArraysV2(int[] nums1, int[] nums2) {
		
		if(nums1.length > nums2.length) {
			printArray(nums1);
			printArray(nums2);
		} else {
			printArray(nums2);
			printArray(nums1);
		}
	}

}
