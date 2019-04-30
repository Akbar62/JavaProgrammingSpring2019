package day16_string_manipulation;
import java.util.*;
public class WithoutEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in a word");
		String word = scan.next();
		
		if(word.length()>=2) {
			//int wordLength = word.length();
			String wordy =word.substring(1 , word.length()-1);
			System.out.println(wordy);
		}

	}

}
