package day32_methods04;

public class Cooking {

	public static void main(String[] args) {

//		add("mushrooms");
//		add("onions");
//		add("oil");
//		mix(30);
//		fry(60);
//		boil(15);
		makePancakes();
		System.out.println();
		makePasta();
		System.out.println();
		cook("Omlette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");

	}

	public static void cook(String dish, String ingredients) {
		System.out.println("~~" + dish.toUpperCase() + " RECIPE~~");
		add(ingredients);
		System.out.println("Cook until it is ready");
		System.out.println("~~" + dish.toUpperCase() + " IS READY!~~");

	}

	public static void add(String ingredient) {
		System.out.println("Add some " + ingredient);
	}

	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}

	public static void fry(int seconds) {
		System.out.println("Fry it for " + seconds + " seconds");
	}

	public static void boil(int minutes) {
		System.out.println("Boil it for " + minutes + " minutes");
	}

	public static void makePancakes() {
		System.out.println("~~Pancake recipe~~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("Enjoy your pancakes");
	}

	public static void makePasta() {
		System.out.println("~~Italian Pasta Recipe~~");
		add("water, salt, olive oil, ");
		boil(2);
		add("Spaghetti");
		boil(9);
		mix(60);
		add("parmesan cheese, marinara sauce");
		System.out.println("Enjoy your pasta");
	}

}
