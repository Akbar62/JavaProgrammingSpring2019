package review_vasyl;

public class ArraysMethods {

	public static void main(String[] args) {

		int[] numbers = { 421, 235, 435, 64, 547, 63, 54, 845, 4 };
		double[] doubleNumbers = { 324.124, 1232.234, 234.23, 234, 234 };
		int m = findMin(numbers);
		double m2 = findMin(doubleNumbers);
		System.out.println(m);
	}

	public static double findMin(double[] doubleNumbers) {
		double min = doubleNumbers[0];
		for (double i : doubleNumbers) {
			if (i < min) {
				min = i;
			}
		}
		return min;

	}

	public static int findMin(int[] arr) {
		int min = arr[0];

		for (int i : arr) {
			if (i < min) {
				min = i;
			}
		}
		return min;

	}

}
