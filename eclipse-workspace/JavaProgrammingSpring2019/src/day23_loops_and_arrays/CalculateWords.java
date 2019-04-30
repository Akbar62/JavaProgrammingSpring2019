package day23_loops_and_arrays;

import java.util.*;

public class CalculateWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String totalWords = "";

		for (int i = 0; i <= 6; i++) {
			System.out.println("Enter in a word");
			String str = scan.next();
			if (str.contentEquals("java")) {
				continue;
			}
			totalWords += str + ",";
		}

		System.out.println(totalWords);

	}

}
