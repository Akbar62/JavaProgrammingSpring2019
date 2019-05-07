package day40_customclasses_methods;

import java.util.*;

public class WarmUpList {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("hello");
		words.add("hello");
		words.add("hello");
		String str = "hello";
		System.out.println(countOccurances(words, str));
		int count = countOccurances(words, str);
		
		
	}

	public static int countOccurances(ArrayList<String> arr, String word) {

		int counter = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.contains(word)) {
				counter++;
			}
		}
		return counter;
	}

}
