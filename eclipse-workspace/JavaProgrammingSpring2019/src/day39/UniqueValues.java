package day39;

import java.util.*;

public class UniqueValues {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(8);
		nums.add(3);
		nums.add(4);
		nums.add(8);

		System.out.println(nums);
		// find non-duplicate values

		ArrayList<Integer> unique1 = new ArrayList<>();
		for (Integer num : nums) {
			if (!unique1.contains(num)) {
				unique1.add(num);
			}
		}
		System.out.println(unique1.toString());

		// find values that appear only once

		ArrayList<Integer> unique2 = new ArrayList<>();
		int counter = 0;
		for (int i = 0; i < nums.size(); i++) {
			counter = 0;
			Integer value = nums.get(i);
			for (int k = 0; k < nums.size(); k++) {
				if (nums.get(k) == value && i != k) {
					counter++;
					break;
				}
			}
			if (counter == 0) {
				unique2.add(value);
			}
		}

		System.out.println(unique2);

	}

}
