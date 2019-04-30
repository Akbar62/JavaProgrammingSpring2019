package day24_arrays;

import java.util.*;

public class FirstAndLastArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };
		String first = "";
		// String splitter = "";

		// TODO: Write your code below
		for (int i = 0; i < words.length; i++) {
			first = Arrays.toString(words)+first.split(", ");;
			// String splitter = ;
			System.out.println(first.charAt(i + 1) + first.substring(first.length() - 2).replaceAll("]", ""));
			
		}

	}

}
