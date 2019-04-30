package day16_string_manipulation;

public class CapitalCity {

	public static void main(String[] args) {
		String str = "Moscow is the capitol of Russia";
		
		System.out.println(str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan"));
		
		String email = "akbarkaker@gmail.com";
		String company = "capitalone";
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);
		
		
	}

}
