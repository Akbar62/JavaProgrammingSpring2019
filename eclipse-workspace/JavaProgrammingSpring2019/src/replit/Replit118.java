package replit;

import java.util.*;

public class Replit118 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

//		Given an array nums with 7 integers already assigned, write code to reverse it.
//		Do not use any additional arrays or Strings.

//		nums -> [4, 3, 2, 44, 1, 100, 55]
//				change it to:
//		nums -> [55, 100, 1, 44, 2, 3, 4]

		// TODO: write your code below
		//int counter = 1;

//		for (int i = 0; i < nums.length ; i++) {
//
//			int temp = nums[i];
//			nums[i] = nums[nums.length -1];
//			nums[nums.length -1] = temp;
////			nums[i+1] = nums[nums.length - 2];
////			nums[nums.length - 2] = temp;
//		}
		
		for(int i = 0; i < nums.length / 2; i++)
		{
		    int temp = nums[i];
		    nums[i] = nums[nums.length - i - 1];
		    nums[nums.length - i - 1] = temp;
		}

		// Do not change below statement:
		System.out.println(Arrays.toString(nums));

	}

}
