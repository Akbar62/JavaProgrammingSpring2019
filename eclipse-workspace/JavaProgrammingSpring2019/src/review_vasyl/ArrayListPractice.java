package review_vasyl;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		int[] nums = new int[4];
		nums[0] = 23;
		System.out.println(Arrays.toString(nums));
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(23);
		nums2.add(47);
		nums2.add(95);
		nums2.add(2, 69); // 2 means position, 69 is the value that will be in 
						  // that position
		System.out.println(nums2);
		System.out.println("There are "+nums2.size()+" items in the array");
		// auto boxing helps us convert a primitive into an object
		// if we enter a number into remove, it will remove that index position
		Integer numToDelete = 600;
		nums2.remove(numToDelete);
		System.out.println(nums2);
		

	}

}
