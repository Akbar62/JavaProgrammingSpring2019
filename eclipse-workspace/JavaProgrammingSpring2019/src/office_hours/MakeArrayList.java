package office_hours;

import java.util.*;

public class MakeArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> input = new ArrayList<>();
		List<String> masked = new ArrayList<>();
		List<Integer> lengthList = new ArrayList<>();

		String answer = "";
		do {

			System.out.println("Enter word");
			String word = scan.next();
			input.add(word);
			masked.add(maskWord(word));
			lengthList.add(word.length());
			System.out.println("You want to add another word?");
			answer = scan.next();
		} while (answer.equalsIgnoreCase("yes"));

		System.out.println(input.toString());
		System.out.println(masked.toString());
		System.out.println(lengthList.toString());

	}

	// convert each character into a "*" in the word and return a string
	public static String maskWord(String word) {
		String mask = "";
		for (int i = 1; i <= word.length(); i++) {
			mask += "*";
		}
		return mask;
	}

}
