package day28_multid_arrays;

import java.util.*;

public class LongestWordInArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {

			words[i] = input.nextLine();

		}

		for(int i = 0; i <= words.length-1; i++) {
			if(words[i].length() > words[i+1].length()) {
				System.out.println(words[i]);
				return;
			}else if(words[i+1].length() > words[i+2].length()) {
				System.out.println(words[i+1]);
				return;
			}else if(words[i+2].length() > words[i+3].length()) {
				System.out.println(words[i+2]);
				return;
			}else if(words[i+3].length() > words[i+4].length()) {
				System.out.println(words[i+3]);
				return;
			}
		}
		
	}

}
