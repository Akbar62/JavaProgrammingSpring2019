package review_vasyl3;
import java.util.*;

public class SuperHeroList {

	public static void main(String[] args) {
		//we created an object of SuperHero class.
        //Why?
        //because we want to get instance variables superheroes, 
        //that stores array of strings with superheroes names.
        SuperHero object = new SuperHero();
        // we created an ArrayList of strings
        ArrayList<String> superheroes = new ArrayList<>();
        // addAll method allows to add whole ArrayList/List
        superheroes.addAll(Arrays.asList(object.superheroes));
		

	}

}
