package replit;

import java.util.*;

public class Replit135 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}

		// Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes 
		//{2, 5, 3, 6}. You may modify and print the given array, or print a new array.
		
		// WRITE YOUR CODE HERE
		
		int temp = 0;

		for (int i = 0; i < nums.length-1; i++) {
			temp = nums[i];
			nums[i] = nums[i+1];
			nums[i+1] = temp;
		}
		
		System.out.println(Arrays.toString(nums));

	}
	

}
