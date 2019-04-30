package day14_string_methods;

public class StringSize {

	public static void main(String[] args) {
		String str1 = "Good Morning";
		// check if it matches "Good Morning" and print match or not match
		
		//Convert to All uppercase and print
		
		if(str1.contentEquals("Good Morning")) {
			System.out.println("Good Morning");
		} else {
			System.out.println("Not a match");
		}
		
		if(str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - Ignore case");
		} else {
			System.out.println("Not match - Ignore case");
		}
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1); // It stays as old value, does not change
		str1 = str1.toUpperCase();
		System.out.println(str1);
		
		if(str1.toLowerCase().contentEquals("good morning")) {
			System.out.println("Chained methods: match");
		} else {
			System.out.println("Chained methods: do not match");
		}
		
		//Find out how many characters are in a string
		String myName = "Akbar";
		
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My name is "+length+" characters");
		
		String userName = "password";
		if(userName.length()==8) {
			System.out.println("Valid username");
		} else {
			System.out.println("invalid username");
		}
		String password = "password";
		if(password.length()>=6){
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password");
		}
		
		
		
	}

}
