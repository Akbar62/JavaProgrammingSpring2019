package replit;

import java.util.*;

public class Replit212 {
	public static String reverseLetters(String word) {
		// TODO
		// char array
		char[] chars = word.toCharArray();
		int charsL = chars.length - 1;
		String reverse = "";
		for (int i = charsL; i >= 0; i--) {
			if (Character.isLetter(chars[i])) {
				reverse += "" + chars[i];
			}
		}

		return reverse;
	}

}
