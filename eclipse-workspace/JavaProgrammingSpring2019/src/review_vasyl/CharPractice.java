package review_vasyl;

import java.util.*;

public class CharPractice {

	public static void main(String[] args) {

		String phoneNumber = "(240) 567 7834";
		// toCharArray() - it will convert any string into array of chars
		char[] chars = phoneNumber.toCharArray();
		System.out.println(Arrays.toString(chars));
		int digitCounter = 0;
		// isDigit() method returns true, if given char is digit
		for (char value : chars) {
			if (Character.isDigit(value)) {
				digitCounter++;
			}
		}

		String name = "Mike";
		// Character.isAlphabetic(codePoint) --> to verify if name is valid
		boolean isValid = false;
		// we can use a for each loop only with collections of data
		// since name is a string, we need to use the method .toCharArray() that will
		// convert a string into an array of chars
		for (int i = 0; i < name.length(); i++) {
			char var = name.charAt(i);
			isValid = Character.isAlphabetic(var);
			if (isValid) {
				System.out.println(var + " : letter");
			} else {
				System.out.println(var + " : not letter");
			}
		}

	}

}
