package replit;

import java.util.*;

public class Replit167 {

	public static void main(String[] args) {
		// test your code
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {
		// TODO: write your below
		String result = "";
		
		String[] letters = str.split("");
		
		for(String letter: letters) {
			if(!result.contains(letter)) {
				result += letter;
			}
		}

		return result;
	}
	

}
