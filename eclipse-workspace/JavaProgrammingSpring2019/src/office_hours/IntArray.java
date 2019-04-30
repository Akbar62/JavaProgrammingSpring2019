package office_hours;

import java.util.Arrays;

public class IntArray {

	public static void main(String[] args) {

		int[] nums = { 30, 20, 10, 15, 25 };
		System.out.println(Arrays.toString(nums));
		// Print everything using a for each loop

		for (int n : nums) {
			if (n > 17) {
				System.out.println(n);
			}

		}
		
		//Calculate sum using a for loop
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		System.out.println("Sum: "+sum);
		
		// Print middle number
		int m = nums[nums.length / 2];
		int l = nums[nums.length - 1];
		
		System.out.println();
		
		// Find the lowest value
		int lowest = nums[0];
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < lowest) {
				lowest = nums[i];
			}
		}
		
		
	}

}
