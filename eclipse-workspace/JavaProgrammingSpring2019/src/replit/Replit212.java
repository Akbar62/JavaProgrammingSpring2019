package replit;

import java.util.*;

public class Replit212 {
	public static String reverseLetters(String word) {
		// TODO
		// create new string with reversed characters
		// do not reverse special characters
		// create another string to return
		// loop through String word
		// if(word.charAt(i) is not a characters dont add
		
		String reverse1 = "";
		String reverse2 = "";
		int counter = 0;
		
		for(int i = word.length() - 1; i >= 0; i--) {
			if(Character.isLetter(word.charAt(i))) {
				reverse1 += "" + word.charAt(i);
			}
		}
		
		for(int j = 0; j <= word.length() -1 ; j++) {
			if(!Character.isLetter(word.charAt(j)) && !Character.isDigit(word.charAt(j))) {
				reverse2 += word.charAt(j);
			} else {
				reverse2 += reverse1.charAt(counter);
				counter++;
			}
		}
		

		//return reverse;
				
		return reverse2;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseLetters("$loo&*p"));
	}
	
	
	
	

}
