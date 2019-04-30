package day34_methods06;

import java.util.*;

public class VarArgs {

	public static void main(String... args) {

		printWords("red", "blue", "yellow"); // 3 values
		printWords("grey"); // 1 value
		printWords(); // empty, so it will be an empty array
		System.out.println();
		String[] myWords = {"cat", "horse", "dog", "goat"};
		printWords(myWords);
		System.out.println();

		System.out.println(sum(3, 5, 10));
		System.out.println(sum(87564, 545, 879844, 55, 33232, 54545432, 2344, 2345));
		int budget = 200;
		if (sum(10, 45, 110, 30) <= budget) {
			System.out.println("Within budget");
		} else {
			System.out.println("Broke");
		}

		cook("pizza", "dough", "cheese", "sauce");
		System.out.println();
		shoppingList(1000, "Avocado Toast", "Swatch watch watch Watch", "Shoes", "Jacket");

	}

	public static void printWords(String... words) {
		// Handle it like an array
		for (String w : words) {
			System.out.println(w);
		}
	}

	public static int sum(int... nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;

	}

	public static void cook(String name, String... ings) {
		System.out.print("Food: " + name);
		System.out.print(Arrays.toString(ings));
	}

	public static void shoppingList(int totalPrice, String... items) {
		System.out.print("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
	}

}
