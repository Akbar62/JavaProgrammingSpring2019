package review_vasyl3;

import java.util.*;

public class SuperHero {

	// it's an instance variable
	public String[] superheroes = { "Spiderman", "Iron man", "Hulk", "Wonder Woman", "Thor", "Batman", "Hellboy",
			"Superman", "Flash", "Captain America", "Ant-Man", "Aquaman" };

	public static void main(String[] args) {
		String[] arr1 = { "word" };
		String[] arr2 = new String[2];
		String[] arr3 = new String[] { "apple", "kiwi" };
		arr2[0] = "word";
		arr2[0] = "new word";
		arr2[1] = "one more new word";
		// array is not resizeable
		// System.out.println(Arrays.toString(arr2));
		String[] superheroes = { "Spiderman", "Iron man", "Hulk", "Wonder Woman", "Thor", "Batman", "Hellboy",
				"Superman", "Flash", "Captain America", "Ant-Man", "Aquaman" };
		// how many superheroes we have with space in the name
		// let's print all of them, and their count
		int count = 0;
		String heroesWithSpace = "";
		for (String s : superheroes) {
			if (s.contains(" ")) {
				System.out.println(s);
				heroesWithSpace = heroesWithSpace + s + ", ";
				count++;
			}
		}
		System.out.println("Count of superheroes with space: " + count);
		System.out.println(heroesWithSpace.substring(0, heroesWithSpace.length() - 2));
		String[] newHeroes = heroesWithSpace.split(", ");
		System.out.println(Arrays.toString(newHeroes));
		String[] newHeroes2 = new String[count];
		for (int i = 0, j = 0; i < superheroes.length; i++) {
			if (superheroes[i].contains(" ")) {
				newHeroes2[j] = superheroes[i];
				j++;
			}
			System.out.println("int i: " + i + " int j: " + j);
		}
		System.out.println(Arrays.toString(newHeroes));
		// BREAK TILL 2:43

	}
}
