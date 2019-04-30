package day19_loops;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String reversed = "";
		int chars = word.length() - 1;

		while (chars >= 0) {
			reversed = reversed + word.charAt(chars);
			chars--;
		}
		
		System.out.println(reversed);
		
		if(reversed.equalsIgnoreCase(word)) {
			System.out.println("This word is a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

}
