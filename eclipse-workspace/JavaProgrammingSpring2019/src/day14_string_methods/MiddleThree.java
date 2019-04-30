package day14_string_methods;
import java.util.*;
public class MiddleThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		
		/* You have a word, do the following:

	If the word has odd number of characters
	and has 5 or more characters, print the middle three 
	characters of the word. 

	Otherwise print "invalid".
	
	*/ 
	
		int wordLength = word.length();
		if(wordLength % 2 !=0) {
			if (wordLength > 5) {
				String middleThree = word.substring(wordLength/2 -1, wordLength/2 +2);
				System.out.println(middleThree);
			}
		} else {
			System.out.println("invalid");
		}
		
			
		
	}

}
