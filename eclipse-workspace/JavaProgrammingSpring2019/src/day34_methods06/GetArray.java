package day34_methods06;

import java.util.*;

public class GetArray {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(GetArray.getArray()));
		// GetArray is not needed, you can call this method from different classes
		System.out.println(Arrays.toString(getRandomArray(5)));
		
		
		System.out.println(Arrays.toString(getRandomArray(20)));

	}

	public static int[] getArray() {
		int[] arr = { 1, 3, 2, 3, 5, 6 };
		return arr;
	}

	public static int[] getRandomArray(int size) {
		int[] arr = new int[size];

		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}

		return arr;
	}

}
