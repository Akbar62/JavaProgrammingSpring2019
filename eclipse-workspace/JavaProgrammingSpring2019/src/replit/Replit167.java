package replit;

import java.util.*;

public class Replit167 {

	public static void main(String[] args) {
		// test your code
		System.out.println(uniqueChars("mama"));
	}

	public static String uniqueChars(String str) {
		// TODO: write your below

		String unique = "";
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			counter = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					counter++;
				}
			}
			if (counter == 1) {
				unique = unique + "" + str.charAt(i);

			}
			
			

		}
		return unique;

	}

}
