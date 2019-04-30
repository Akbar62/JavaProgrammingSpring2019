package day17_stringpool_whileloop;

import java.util.*;

public class WithoutX {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.startsWith("x") && word.endsWith("X")) {
			String word1 = word.substring(1,word.length()-1);
			System.out.println(word1);
		} else if (word.startsWith("X") && word.endsWith("x")) {
			String word4 = word.substring(1,word.length()-1);
			System.out.println(word4);
		} else if (word.contains("x") && word.contains("x")) {
			String word2 = word.replace("x", "");
			System.out.println(word2);
		} else if (word.contains("X")&& word.contains("X")) {
			String word3 = word.replace("X", "");
			System.out.println(word3);
		} 
		
		

	}

}
