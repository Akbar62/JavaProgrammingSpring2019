package replit;

import java.util.*;

public class Replit194 {
	public static boolean isPalindrome(String check) {
		check = check.replaceAll(" ", "");
		String palidrome = "";
		char[] chars = check.toLowerCase().toCharArray();
		int length = chars.length - 1;
		char[] chary = new char[length];
		int count = 0;
		for (int i = length; i >= 0; i--) {
			chary[i] = chars[count];
			count++;
		}

		if (Arrays.equals(chars, chary)) {
			return true;
		}
		return false;
		// Arrays.sort(chars);
		// palidrome = Arrays.toString(chars);
		// if(palidrome.equals(check)) {
		// return true;
		// }
		// return false;
	}

}
