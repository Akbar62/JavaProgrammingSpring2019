package review_vasyl3;
import java.util.*;

//public String[] superheroes = { "Spiderman", "Iron man", "Hulk", "Wonder Woman", "Thor", "Batman", "Hellboy",
//		"Superman", "Flash", "Captain America", "Ant-Man", "Aquaman" };

public class ArrayListOfSuperHeroes {
	public static void main(String[] args) {
		ArrayList<String> superheroes = new ArrayList<>();
		superheroes.add("Spiderman");
		// it takes 2 params
		// first is position, second is value to set
		// there aren't 2 elements, so we cannot set it
		// superheroes.add(1, "Iron man");
		superheroes.add("Iron man");
		superheroes.add("Hulk");
		superheroes.add("Wonder Woman");
		superheroes.add("Thor");
		superheroes.add("Batman");
		superheroes.add("Hellboy");
		superheroes.add("Superman");
		superheroes.add("Flash");
		superheroes.add("Captain America");
		superheroes.add("Ant-Man");
		superheroes.add("Aquaman");
		System.out.println(superheroes);
		// lets create an ArrayList that will store superheroes that have space in the name
		
		ArrayList<String> superheroesWithSpace = new ArrayList<>();
		String longestName = "";
		for(String hero: superheroes) {
			// this one checks if name contains space
			// if so, add it to the collection
			if(hero.contains(" ")) {
				superheroesWithSpace.add(hero);
			}
			if(hero.length() > longestName.length()) {
				longestName = hero;
			}
		}
		System.out.println(superheroesWithSpace);
		System.out.println("The longest name is "+ longestName);
		
 	}

}
