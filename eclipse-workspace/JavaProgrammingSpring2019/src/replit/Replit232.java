package replit;

import java.util.Arrays;

public class Replit232 {

	// Write a method countLetters that can count letters in a given string and
	// return a new string in the given format:

	public static void main(String[] args) {
		System.out.println(countLetters("aaabbbcccc"));

	}

	// number of letters + letter
	// input: countLetters("aaabbcccc");
	// output: "3a2b4c"
	// Because, there are 3 a's, 2 b's and 4 c's

	public static String countLetters(String str) {

		String result = "";
		char[] chary = str.toCharArray();
		Arrays.sort(chary);

		int counter = 0;
		for (int i = 0; i <= chary.length - 2; i++) {
			if (chary[i] == chary[i + 1]) {
				counter++;
//					 result += counter + "" + chary[i];
			} 
			
			result += counter + "" + chary[i];
		}

//		 for(int i = 0; i <= chary.length - 1; i++) {
//			 int counter = 0;
//			 for(int j = 0; j <= chary.length; j++) {
//				 
//			 }
//		 }

		return result;
	}

}
