package day62_exceptions;

public class TryCatch2 {
	public static void main(String[] args) {
		int[] nums = { 34, 6, 34, 12 };
		// handle if any issues with the line below
		// if any exceptions happen, print "Wrong index"

		try {
			System.out.println(nums[6]);

		} catch (Exception e) {
			System.out.println("Wrong index");
		}

		System.out.println("Some code after array");

		try {
			int j = 100;
			int n = j / 0;
			System.out.println(n);
		} catch (Exception e) {
			System.out.println("Cannot print by 0");
			e.printStackTrace();
		}
		

	}

}
