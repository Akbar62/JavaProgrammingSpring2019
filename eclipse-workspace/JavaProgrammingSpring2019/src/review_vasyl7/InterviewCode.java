package review_vasyl7;

public class InterviewCode {
	public static void main(String[] args) {
		// write a method that will calculate sum of all digits
		int num = 435;
		// remainder divided by 10 will always return the last digit
//		System.out.println(435%10);
//		System.out.println(435/10%10);
//		System.out.println(435/10/10%10);
		System.out.println(sumDigits(435));
		System.out.println(reverseInteger(1234));

	}

	/**
	 * 
	 * calculate the sum of digits
	 * 
	 * @param num
	 * @return sum of digits
	 */

	public static int sumDigits(int num) {

		int sum = 0;
		while (num > 0) {
			sum += num % 10; // to get last digit
			num = num / 10; // get rid of last digit
		}
		return sum;
	}

	// reverse an integer
	public static int reverseInteger(int num) {

		int reverse = 0;
		int remainder = 0;
		while (num > 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}

		return reverse;

	}

	// write a method that can add number
	// array under specific position

	public static int[] addItemIntoArray(int[] arr, int num, int position) {

		int[] newArr = new int[arr.length + 1];
		int idx = 0;
		for (int i = 0; i < newArr.length; i++) {
			if (i == position) {
				newArr[i] = num;
			} else {
				newArr[i] = arr[idx];
				idx++;
			}
		}

		return null;
	}

}
