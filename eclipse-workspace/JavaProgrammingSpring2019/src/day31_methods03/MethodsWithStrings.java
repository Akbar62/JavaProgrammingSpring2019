package day31_methods03;

import java.util.Arrays;

public class MethodsWithStrings {

	public static void main(String[] args) {
		// countWords("the last one");
		googleSearchResults("About 121,000,000 results (0.75 seconds)");

	}

	public static void countWords(String sentence) {
		String[] arr = sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Number of words is " + arr.length);
	}

	public static void googleSearchResults(String results) {
		// System.out.println("Results count:
		// "+results.substring(results.indexOf("About"+2), results.indexOf("res")));
		String[] arr = results.split(" ");
		System.out.println("Results count: " + (arr[1]).replace(",", ""));
		System.out.println("Time in seconds: " + results.substring(results.indexOf("("), results.lastIndexOf(")") + 1));

	}

}
