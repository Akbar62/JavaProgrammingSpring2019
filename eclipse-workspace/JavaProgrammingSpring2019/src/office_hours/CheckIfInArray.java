package office_hours;

public class CheckIfInArray {

	public static void main(String[] args) {

		int n = 55;
		int nums[] = { 22, 33, 55, 22, 11, 90 };


		checkIfNumArray(n, nums);

	}

	public static void checkIfNumArray(int n, int[] nums) {
		boolean present = false;

		for (int inty : nums) {
			if (inty == n) {
				present = true;
				break;
			}
		}

		System.out.println("Is " + n + " present in the array? " + present);
	}

}
