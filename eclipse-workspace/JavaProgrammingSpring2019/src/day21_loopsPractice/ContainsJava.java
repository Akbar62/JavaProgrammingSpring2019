package day21_loopsPractice;

import java.util.*;

public class ContainsJava {

	public static void main(String[] args) {

		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		if(word.charAt(0) != 'j' || word.charAt(1) != 'j') {
			System.out.println(false);
		}
		
		if (word.length() > 2) {
			if (word.charAt(0) == 'j' || word.charAt(1) == 'j') {
				System.out.println(true);
			}
		} else if (word.length() > 2) {
			if (word.charAt(0) != 'j' && word.charAt(1) != 'j') {
				System.out.println(false);
			}
		//} else if (word.length() < 2) {
		//	System.out.println(false);
		}

	}

}
