package day42_customclasses_encapsulation;

import java.util.Arrays;

public class Burger7 {

	public static void main(String[] args) {
		Burger burger1 = new Burger();
		burger1.name = "Cowboy";
		String[] ings = {"onion crisps", "american cheese" , "pickles" , "lettuce" , "b7 sauce"};
		burger1.ingredients = ings;
		
		System.out.println(burger1.name);
		System.out.println(Arrays.toString(burger1.ingredients));
		// print first element
		System.out.println((burger1.ingredients[0]));
		// print all ingredients with a loop
		for(String burgers: burger1.ingredients) {
			System.out.println(burgers);
		}

	}

}
