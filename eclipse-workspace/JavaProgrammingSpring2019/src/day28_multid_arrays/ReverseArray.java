package day28_multid_arrays;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

		// TODO: write your code below
		int temp = nums[0];

//	    1. Take values at index 0 and last index and swap them
//	    2. Take values at index 0+1 and last index-1 and swap them
//	    3. Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)

		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[nums.length - 1];
			nums[nums.length - 1] = temp;
		}

		// Do not change below statement:
		System.out.println(Arrays.toString(nums));

	}

}
