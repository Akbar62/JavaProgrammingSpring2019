package day34_methods06;

public class CountArray {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 4, 5, 5, 5, 6, 6, 7, 5, 5, 12 };
		int fives = findOccurences(nums, 5);
		int sixes = findOccurences(nums, 6);
		System.out.println(fives);
		System.out.println(sixes);
		if (findOccurences(nums, 5) > 0) {
			System.out.println("The number 5 is present");
		}

	}

	public static int findOccurences(int[] nums, int num1) {

		int counter = 0;

		for (int number : nums) {
			if (number == num1) {
				counter++;
			}

		}
		return counter;
	}

}
