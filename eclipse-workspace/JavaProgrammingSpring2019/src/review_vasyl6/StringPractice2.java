package review_vasyl6;

import java.util.Arrays;

public class StringPractice2 {
	public static void main(String[] args) {
		String sentence = "What We Know About Iran Shooting Down a U.S. Drone";
		String[] arrayOfWords = sentence.split(" ");
		System.out.println(Arrays.toString(arrayOfWords));
		
		//String reverse = "";
		
		
		String[] reverseArray = new String[arrayOfWords.length];
		int counter = 0;
		
		for(int i = arrayOfWords.length - 1; i >= 0; i--) {
			reverseArray[counter] = arrayOfWords[i];
			counter++;
		}
		
		System.out.println(Arrays.deepToString(reverseArray));
	}
	
	// I can reverse it into an array and print that
	// Or I turn that array into a String
	// 2 different way of doing it

}
