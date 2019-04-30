package office_hours;

public class ArrayOrder {

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 1, 4, 6, 7, 12 };
		int[] nums2 = new int[] { 1, 4, 6, 3, 7, 12 };
		int[] nums3 = new int[] { 433, 12, 5};

		isArraySorted(nums);
		isArraySorted(nums2);
		isArraySorted(nums3);

	}

	public static void isArraySorted(int[] nums) {

		boolean sorted = true;
		// Local variable inside this method

		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println(nums[i] + " " + nums[i + 1]);
			if (nums[i] > nums[i + 1]) {
				sorted = false;
				break; // Exit the loop
			}
		}

		System.out.println("Is the array sorted? - " + sorted);
	}

}
