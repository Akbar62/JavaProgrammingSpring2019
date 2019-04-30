package day30_methods02;

public class EtsySearch {

	public static void main(String[] args) {

		navigateToEtsy();
		searchForWoodenSpoon();
		printResults();

	}

	public static void navigateToEtsy() {
		System.out.println("Open up Google Chrome and go to etsy.com");
	}

	public static void searchForWoodenSpoon() {
		System.out.println("Type in wooden spoon in the search bar");
		System.out.println("Click on the search button");

	}

	public static void printResults() {
		System.out.println("There are 14,448 results");
	}
}
