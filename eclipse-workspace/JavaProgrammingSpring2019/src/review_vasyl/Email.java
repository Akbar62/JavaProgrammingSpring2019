package review_vasyl;

public class Email {

	public static void main(String[] args) {
		String email = generateEmail("James", "Bark");
		String email2 = generateEmail("Peter", "Foster", "cybertekschool");
//	      System.out.println(email);
//	      System.out.println(email2);
		/////
		String[] characters = { "Savannah Daniel", "Abby Green", "Velma Griffin", "Veronica Cooper",
				"Milly Fitzpatrick" };
		for (String str : characters) {
			String name = str.split(" ")[0];
			String lastName = str.split(" ")[1];
			System.out.println(generateEmail(name, lastName));
		}
	}

	// this method takes only 2 parameters
	public static String generateEmail(String firstName, String lastName) {
		return firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@gmail.com";
	}

	/// this method takes 3 parameters
	public static String generateEmail(String firstName, String lastName, String domain) {
		return firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@" + domain + ".com";
	}

}
