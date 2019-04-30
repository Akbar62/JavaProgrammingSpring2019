package day26_arrays;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		String[] wordsArray =words.split(",");
		System.out.println("Word count is "+wordsArray.length);
		
		System.out.println(Arrays.toString(wordsArray));
		
		for(String word: wordsArray) {
			System.out.println(word);
		}
		
		String diceResult = "1 - 20 of 1,461 positions";
		String[] dice = diceResult.split(" ");
		System.out.println(dice[4]);
		
		String [] diceArray2 = diceResult.split(" of ");
		System.out.println(diceArray2[0]);
		System.out.println(diceArray2[1]);
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] ISplit = sentence.split("I");
		
//		System.out.println(Arrays.toString(allWords));
//		System.out.println(Arrays.toString(happySplit));
//		System.out.println(Arrays.toString(ISplit));
		
		for(String w: allWords) {
			System.out.println(w);
		}
		
		System.out.println("After happy split");
		
		for(String h: happySplit) {
			System.out.println(h);
		}
		
		System.out.println();
		
		String word = "java";
		char[] charsArray = word.toCharArray();
		
		for(char ch: charsArray) {
			System.out.println(ch);
		}
	}

}
