package day24_arrays;

import java.util.*;

public class FirstThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextLine();
			System.out.println(arr[i] + 3);
		}

	}

}
