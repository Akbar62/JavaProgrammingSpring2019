package day21_loopsPractice;
import java.util.*;
public class UniqueChars {

	public static void main(String[] args) {
		
		//Given a string, print out unique characters from the word
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in a word");
		String word = scan.nextLine();
		String unique = "";
		char ch = word.charAt(0);
		
		for(int i = 0; i < word.length(); i++) {
			//System.out.println(unique.contains(""+ch));
			char letter = word.charAt(i);
			if(!unique.contains(""+letter)) {
				unique += letter;
			}
		}
		
		System.out.println("The unique characters in the word are: "+unique);
	}

}
