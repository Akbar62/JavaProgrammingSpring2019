package day24_arrays;

import java.util.Arrays;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		// Create an array of integers with length 3
		int[] numbers = new int[3];
		// First value in the array
		numbers[0] = 5;
		// Second value in the array
		numbers[1] = 10;
		// Third value in the array
		numbers[2] = 20;
		// If you print now its just a hashcode
		System.out.println(numbers);
		// toString() from Arrays class can help us print an array as a string
		System.out.println(Arrays.toString(numbers));

		int sum = 0;

		for (int i = 0; i <= numbers.length - 1; i++) {
			sum = sum + numbers[i];
		}

		System.out.println(sum);

		// Find the largest value in the array
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		System.out.println(max);
		
		int min = Integer.MAX_VALUE;
		for (int k = 0; k < numbers.length; k++) {
			if (numbers[k] < min) {
				min = numbers[k];
			}
		}
		
		System.out.println(min);
	}

}
